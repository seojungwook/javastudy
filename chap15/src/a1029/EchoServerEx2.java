package a1029;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
/*
 * echo 클라이언트 구현하기
 * 1. 소켓을 생성하기
 * 2. 키보드로부터 문자를 입력받기
 * 3. 입력받은 내용을 서버로 전송하기
 * 4. 서버로부터 받은 내용을 화면에 출력하기
 * 5. 2번~4번까지는 "bye"라는 문자를 키보드로부터 입력받으면 클라이언트 종료하기
 */
public class EchoServerEx2 {
	public static void main(String[] args) {
		int port = 5000;
		Socket client = null;
		ServerSocket server= null;
		try{
			server = new ServerSocket(port);
			while(true){
				System.out.println("접속 대기 중~~");
				client = server.accept(); // 연결성공됨.
				System.out.println("server:" + server);
				System.out.println("getLocalPort : " + server.getLocalPort());
				System.out.println();
				System.out.println("connected to :" + client.getInetAddress()); //클라이언트가 누구냐?
				System.out.println("connected port : " + client.getPort());
				System.out.println("스레드 생성");
				Thread2 ht = new Thread2(client); //스레드에 소켓넘겨줌
				ht.start(); //서버이기에 다른 클라이언트 기다리려고
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
class Thread2 extends Thread{
	private Socket client;
	BufferedReader br;
	//PrintWriter pw;
	OutputStream pw;
	Thread2(Socket client){
		this.client=client;
		try{
		br = new BufferedReader(new InputStreamReader(client.getInputStream()));
		pw = client.getOutputStream();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public void run() {
		BufferedInputStream fbr = null; 
		try {
			PrintWriter out = new PrintWriter(client.getOutputStream(),true);
			BufferedReader in = new BufferedReader
					(new InputStreamReader(client.getInputStream()));
			String input;
			while((input=in.readLine())!=null){
				out.println(input);
				out.flush();
				System.out.println("echo : " + input);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fbr != null)
					fbr.close();
				if (br != null)
					br.close();
				if (pw != null)
					pw.close();
				if (client != null)
					client.close();
			} catch (IOException e) {
			}
		}
	}
}

