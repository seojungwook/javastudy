package a1030;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 * UDP 방식으로 Echo 프로그램 작성하기
 */
public class UDPEchoServerEx {
	public static void main(String[] args) throws IOException {
		DatagramSocket socket = new DatagramSocket(9500);
		DatagramPacket inPacket, outPacket;
		byte[] inMsg = new byte[1024];
		byte[] outMsg = null;
		while(true){
			inMsg = new byte[1024];
		//	System.out.println("");
			inPacket = new DatagramPacket(inMsg, inMsg.length);
			socket.receive(inPacket);
			System.out.println("클라이언트 메시지 : " + new String(inPacket.getData()));
			InetAddress address = inPacket.getAddress();
			int port = inPacket.getPort();
			System.out.println("클라이언트 IP주소 : " + address);
			System.out.println("클라이언트 PORT주소 : " + port);
			outMsg = inPacket.getData();
			outPacket = new DatagramPacket(outMsg,outMsg.length,address,port);
			socket.send(outPacket);
		}
	}
}
