package a1029;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

/*
 *  멀티 채팅 서버 프로그램 예제
 *  1. 클라이언트와 연결
 *  2. 스레드 생성
 *  3. 클라이언트의 내용을 모든 클라이언트들에게 전송해야함. => 클라이언트(소켓)의 집합
 *  4. 귓속말기능 구현
 */
public class ChatServerEx {
	ServerSocket server;
	int port = 6000;
	HashMap<String, ObjectOutputStream> hm;
	public static void main(String[] args) throws IOException {
		ChatServerEx c = new ChatServerEx();
		c.server = new ServerSocket(c.port);
		System.out.println("채팅 서버 시작!");
		c.hm = new HashMap<String, ObjectOutputStream>();
		while(true){
			System.out.println("클라이언트 접속 대기 중");
			Socket client = c.server.accept();
			ChatServerThread chatThread = new ChatServerThread(client,c.hm); //Runnable 인터페이스를 구현하려고
			Thread t = new Thread(chatThread); 
			t.start();
		}
	}
}
class ChatServerThread implements Runnable{
	Socket client;
	ObjectInputStream ois;
	ObjectOutputStream oos;

	String userId;
	HashMap<String, ObjectOutputStream> hm;
	ChatServerThread(Socket client, HashMap<String, ObjectOutputStream> c){
		this.client = client;
		this.hm = c;
		try{
			System.out.println(client.getInetAddress() + "접속함");
			ois = new ObjectInputStream(client.getInputStream());
			oos = new ObjectOutputStream(client.getOutputStream());
			userId = (String)ois.readObject();
			System.out.println("user_id :" + userId + "접속함");
			synchronized(hm) {
				hm.put(userId, oos);
			}
			broadcast(userId + "님이 입장하셨습니다.");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		String recvData;
		try{
			while(true){
				recvData = (String)ois.readObject();
				if(recvData.equals("/bye"))break;
				else if(recvData.startsWith("/to")) //보낸 데이터가 /to로 시작하냐?
					sendMsg(recvData);
				else broadcast(userId + ":" + recvData);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			synchronized (hm){
				hm.remove(userId);
				broadcast(userId+"님이 퇴장하셨습니다.");
				try{
					if(client!=null) client.close();
				}catch(IOException e){}
			}
		}
	}
	private void broadcast(String message) {
		synchronized(hm){
			try{
				for(ObjectOutputStream o : hm.values()){
					o.writeObject(message);
					o.flush();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	private void sendMsg(String message) {
		int begin = message.indexOf(" ") +1;
		int end = message.indexOf(" ", begin);
		if(end != -1){
			String id = message.substring(begin,end);
			String msg = message.substring(end+1);
			ObjectOutputStream oos = hm.get(id);
			ObjectOutputStream oos2 = hm.get(userId);
			if(oos != null){
				try{
					oos.writeObject(userId + "님의 귓속말 : " + msg);
					oos.flush();
					oos2.writeObject(id + "님에게 귓속말 전송: " +msg);
					oos2.flush();
					
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	}
}
