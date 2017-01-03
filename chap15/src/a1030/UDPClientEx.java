package a1030;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 * UDP Client 예제
 */
public class UDPClientEx {
	public static void main(String[] args) throws IOException {
		//서버가 아니기에 포트입력 안해, 임시로 포트를 사용
		DatagramSocket dataSocket = new DatagramSocket();
		//서버의 주소 설정
		InetAddress serverIP = InetAddress.getByName("127.0.0.1");
		byte[] msg = new byte[100];
		//DatagramPacket : UDP로 전송/수신되는 데이터
		DatagramPacket inPacket = new DatagramPacket(msg,msg.length);
		//msg(비어있음),1(시간보내줘,별 필요없는 내용),127.0.0.1, 7000포트
		DatagramPacket outPacket = new DatagramPacket(msg,1,serverIP,7000);
		//서버로 outPacket을 전송(서버의 inPacket으로)
		dataSocket.send(outPacket);
		//서버에서 데이터를 수신해서 inPacket에 저장
		dataSocket.receive(inPacket);
		//서버의 주소, 포트번호
		System.out.println(inPacket.getAddress() + "," + inPacket.getPort());
		//서버가 만들어준 데이터(시간)
		System.out.println("서버의 현재 시간 : " + new String(inPacket.getData()));
		dataSocket.close();
		
	}
}
