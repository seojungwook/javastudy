package a1030;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * UDP 방식의 Echo 프로그램 : 클라이언트
 */
public class UDPEchoClientEx {
	public static void main(String[] args) throws IOException {
		BufferedReader sysin = new BufferedReader(new InputStreamReader(System.in));
		InetAddress serverIP = InetAddress.getByName("127.0.0.1");
		while(true){
			String data = sysin.readLine();
			DatagramSocket dataSocket = new DatagramSocket();
			byte[] msg1 = data.getBytes();
			byte[] msg2 = new byte[msg1.length];
			DatagramPacket outPacket = new DatagramPacket(msg1,msg1.length,serverIP,9500);
			DatagramPacket inPacket = new DatagramPacket(msg2,msg2.length);
			dataSocket.send(outPacket);
			dataSocket.receive(inPacket);
			System.out.println("서버 Echo 메시지 : " + new String(inPacket.getData()));
			dataSocket.close();//소켓을 닫아서 포트번호가 계속 바뀜
		}
	}
}
