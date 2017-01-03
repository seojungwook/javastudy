package a1028;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 간단한 웹서버 만들기
 */
public class SimpleWebServer {
	public static void main(String[] args) {
		try{
			//ServerSocket(port) : binding : 해당포트번호를 OS로부터 할당 받음
			ServerSocket server = new ServerSocket(8800);
			while(true){
				System.out.println("접속 대기 중~~");
				//server.accept() : Client와 연결됨
				//client : client가 Socket을 생성주체
				Socket client = server.accept(); // 연결성공됨.
				System.out.println("스레드 생성");
				HttpThread ht = new HttpThread(client); //스레드에 소켓넘겨줌
				ht.start(); //서버이기에 다른 클라이언트 기다리려고
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
class HttpThread extends Thread{
	private Socket client;
	BufferedReader br;
	PrintWriter pw;
	HttpThread(Socket client){
		this.client=client;
		try{
		br = new BufferedReader(new InputStreamReader(client.getInputStream()));
		pw = new PrintWriter(client.getOutputStream());
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public void run() {
		BufferedReader fbr = null;
		try {
			String line = br.readLine();
			System.out.println("Http Header :" + line);
			int start = line.indexOf("/") + 1;
			int end = line.lastIndexOf("HTTP") - 1;
			String fileName = line.substring(start, end);
			if (fileName.equals("")) {
				fileName = "index.html";
			}
			System.out.println("사용자 요청 파일 : " + fileName);
			fbr = new BufferedReader(new FileReader(fileName));
			String fileLine = null;
			while ((fileLine = fbr.readLine()) != null) {
				pw.println(fileLine);
				pw.flush();
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