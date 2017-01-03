package a1030;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *	UDP : Packet 사용하여 전송 
 */
public class UDPServerEx {
	public static void main(String[] args) throws IOException {
		//7000번포트 binding, os에게 할당받고 이포트받으면 나한테보내
		DatagramSocket socket = new DatagramSocket(7000);
		DatagramPacket inPacket,outPacket;
		byte[] inMsg = new byte[10];
		byte[] outMsg = null;
		while(true){
			inPacket = new DatagramPacket(inMsg,inMsg.length);
			//데이터 수신 : inPacket에 데이터 저장
			socket.receive(inPacket);
			//클라이언트의 IP주소값 확인
			InetAddress addr = inPacket.getAddress();
			//클라이언트의 port값 확인
			int port = inPacket.getPort();
			System.out.println(addr + "," + port);
			SimpleDateFormat sdf = new SimpleDateFormat("[HH:mm:ss]");
			String time = sdf.format(new Date());
			outMsg = time.getBytes(); //(시간)문자열을 바이트형 Array로 바꿔
			//전송데이터를 저장,(클라이언트의 inPacket으로)
			outPacket= new DatagramPacket(outMsg,outMsg.length,addr,port);
			//데이터를 클라이언트에 전송
			socket.send(outPacket);
		}
	}
}
