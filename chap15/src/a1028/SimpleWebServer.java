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
 * ������ ������ �����
 */
public class SimpleWebServer {
	public static void main(String[] args) {
		try{
			//ServerSocket(port) : binding : �ش���Ʈ��ȣ�� OS�κ��� �Ҵ� ����
			ServerSocket server = new ServerSocket(8800);
			while(true){
				System.out.println("���� ��� ��~~");
				//server.accept() : Client�� �����
				//client : client�� Socket�� ������ü
				Socket client = server.accept(); // ���Ἲ����.
				System.out.println("������ ����");
				HttpThread ht = new HttpThread(client); //�����忡 ���ϳѰ���
				ht.start(); //�����̱⿡ �ٸ� Ŭ���̾�Ʈ ��ٸ�����
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
			System.out.println("����� ��û ���� : " + fileName);
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