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
 * echo Ŭ���̾�Ʈ �����ϱ�
 * 1. ������ �����ϱ�
 * 2. Ű����κ��� ���ڸ� �Է¹ޱ�
 * 3. �Է¹��� ������ ������ �����ϱ�
 * 4. �����κ��� ���� ������ ȭ�鿡 ����ϱ�
 * 5. 2��~4�������� "bye"��� ���ڸ� Ű����κ��� �Է¹����� Ŭ���̾�Ʈ �����ϱ�
 */
public class EchoServerEx2 {
	public static void main(String[] args) {
		int port = 5000;
		Socket client = null;
		ServerSocket server= null;
		try{
			server = new ServerSocket(port);
			while(true){
				System.out.println("���� ��� ��~~");
				client = server.accept(); // ���Ἲ����.
				System.out.println("server:" + server);
				System.out.println("getLocalPort : " + server.getLocalPort());
				System.out.println();
				System.out.println("connected to :" + client.getInetAddress()); //Ŭ���̾�Ʈ�� ������?
				System.out.println("connected port : " + client.getPort());
				System.out.println("������ ����");
				Thread2 ht = new Thread2(client); //�����忡 ���ϳѰ���
				ht.start(); //�����̱⿡ �ٸ� Ŭ���̾�Ʈ ��ٸ�����
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

