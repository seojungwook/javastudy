package a1028;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * ������ ������ �����
 */
public class SimpleWebServer2 {
	public static void main(String[] args) {
		try{
			//ServerSocket(port) : binding : �ش���Ʈ��ȣ�� OS�κ��� �Ҵ� ����
			ServerSocket server = new ServerSocket(8000);
			while(true){
				System.out.println("���� ��� ��~~");
				//server.accept() : Client�� �����
				//client : client�� Socket�� ������ü
				Socket client = server.accept(); // ���Ἲ����.
				System.out.println("������ ����");
				HttpThread1 ht = new HttpThread1(client); //�����忡 ���ϳѰ���
				ht.start(); //�����̱⿡ �ٸ� Ŭ���̾�Ʈ ��ٸ�����
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
class HttpThread1 extends Thread{
	private Socket client;
	BufferedReader br;
	//PrintWriter pw;
	OutputStream pw;
	HttpThread1(Socket client){
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
			String line = br.readLine();
			System.out.println("Http Header :" + line);
			int start = line.indexOf("/") + 1;
			int end = line.lastIndexOf("HTTP") - 1;
			String fileName = line.substring(start, end);
			if (fileName.equals("")) {
				fileName = "index.html";
			}
			System.out.println("����� ��û ���� : " + fileName);
			fbr = new BufferedInputStream(new FileInputStream(fileName));
		//	String fileLine = null;
			byte[] buf = new byte[10240];
			int cnt = 0;
			while ((cnt = fbr.read(buf)) != -1) {
				pw.write(buf,0,cnt);
				pw.flush();
			}
//			FileInputStream fis = new FileInputStream(fileName);
//			int data =0;
//			byte[] buf = new byte[fis.available()];
//			while((data = fis.read(buf))!=-1){
//				pw.write(data);
//				pw.println(data);
//				pw.flush();
//			}
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