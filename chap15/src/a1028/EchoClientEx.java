package a1028;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 
 */
public class EchoClientEx {
	public static void main(String[] args) throws IOException {
		int port = 5000;
		String ip = "172.16.1.24";
		Socket client = null;
		PrintWriter out = null;
		BufferedReader in = null;
		try{
			String input;
			BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
			client = new Socket(ip,port);
			in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			out = new PrintWriter(client.getOutputStream());
			System.out.println("connected to" + client.getLocalAddress());
			System.out.println("port : " + client.getPort());
			System.out.println("Local Address :" + client.getLocalAddress());
			System.out.println("Local Port:" + client.getLocalPort());
			System.out.print("입력 : ");
			while((input = stdin.readLine())!= null){
				if(input.equals("bye")){
					break;
				}
				out.println(input);
				out.flush();
				System.out.println("echo:" + in.readLine());
				System.out.print("입력 : ");
			}
			out.close();
			in.close();
			stdin.close();
			client.close();
		}catch (UnknownHostException e){
			e.printStackTrace();
		}catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
