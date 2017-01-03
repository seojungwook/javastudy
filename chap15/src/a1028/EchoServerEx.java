package a1028;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*연결됐을때
 * server:ServerSocket[addr=0.0.0.0/0.0.0.0,localport=5000]
getLocalPort : 5000

connected to :/172.16.1.25
connected port : 52856
echo : 656
echo : 2
 */
public class EchoServerEx {
	public static void main(String[] args) {
		int port = 5000;
		Socket client = null;
		ServerSocket server= null;
		try{
			server = new ServerSocket(port); //binding port 연결
			client = server.accept(); //대기
			System.out.println("server:" + server);
			System.out.println("getLocalPort : " + server.getLocalPort());
			System.out.println();
			System.out.println("connected to :" + client.getInetAddress()); //클라이언트가 누구냐?
			System.out.println("connected port : " + client.getPort());
		}catch (IOException e){
			e.printStackTrace();
			return;
		}
		try{
			PrintWriter out = new PrintWriter(client.getOutputStream(),true);
			BufferedReader in = new BufferedReader
					(new InputStreamReader(client.getInputStream()));
			String input;
			while((input=in.readLine())!=null){
				out.println(input);
				out.flush();
				System.out.println("echo : " + input);
			}
			in.close();
			out.close();
			client.close();
			server.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
