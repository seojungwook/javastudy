package a1029;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

/*
 *  ��Ƽ ä�� ���� ���α׷� ����
 *  1. Ŭ���̾�Ʈ�� ����
 *  2. ������ ����
 *  3. Ŭ���̾�Ʈ�� ������ ��� Ŭ���̾�Ʈ�鿡�� �����ؾ���. => Ŭ���̾�Ʈ(����)�� ����
 *  4. �ӼӸ���� ����
 */
public class ChatServerEx {
	ServerSocket server;
	int port = 6000;
	HashMap<String, ObjectOutputStream> hm;
	public static void main(String[] args) throws IOException {
		ChatServerEx c = new ChatServerEx();
		c.server = new ServerSocket(c.port);
		System.out.println("ä�� ���� ����!");
		c.hm = new HashMap<String, ObjectOutputStream>();
		while(true){
			System.out.println("Ŭ���̾�Ʈ ���� ��� ��");
			Socket client = c.server.accept();
			ChatServerThread chatThread = new ChatServerThread(client,c.hm); //Runnable �������̽��� �����Ϸ���
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
			System.out.println(client.getInetAddress() + "������");
			ois = new ObjectInputStream(client.getInputStream());
			oos = new ObjectOutputStream(client.getOutputStream());
			userId = (String)ois.readObject();
			System.out.println("user_id :" + userId + "������");
			synchronized(hm) {
				hm.put(userId, oos);
			}
			broadcast(userId + "���� �����ϼ̽��ϴ�.");
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
				else if(recvData.startsWith("/to")) //���� �����Ͱ� /to�� �����ϳ�?
					sendMsg(recvData);
				else broadcast(userId + ":" + recvData);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			synchronized (hm){
				hm.remove(userId);
				broadcast(userId+"���� �����ϼ̽��ϴ�.");
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
					oos.writeObject(userId + "���� �ӼӸ� : " + msg);
					oos.flush();
					oos2.writeObject(id + "�Կ��� �ӼӸ� ����: " +msg);
					oos2.flush();
					
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	}
}
