package a1030;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *	UDP : Packet ����Ͽ� ���� 
 */
public class UDPServerEx {
	public static void main(String[] args) throws IOException {
		//7000����Ʈ binding, os���� �Ҵ�ް� ����Ʈ������ �����׺���
		DatagramSocket socket = new DatagramSocket(7000);
		DatagramPacket inPacket,outPacket;
		byte[] inMsg = new byte[10];
		byte[] outMsg = null;
		while(true){
			inPacket = new DatagramPacket(inMsg,inMsg.length);
			//������ ���� : inPacket�� ������ ����
			socket.receive(inPacket);
			//Ŭ���̾�Ʈ�� IP�ּҰ� Ȯ��
			InetAddress addr = inPacket.getAddress();
			//Ŭ���̾�Ʈ�� port�� Ȯ��
			int port = inPacket.getPort();
			System.out.println(addr + "," + port);
			SimpleDateFormat sdf = new SimpleDateFormat("[HH:mm:ss]");
			String time = sdf.format(new Date());
			outMsg = time.getBytes(); //(�ð�)���ڿ��� ����Ʈ�� Array�� �ٲ�
			//���۵����͸� ����,(Ŭ���̾�Ʈ�� inPacket����)
			outPacket= new DatagramPacket(outMsg,outMsg.length,addr,port);
			//�����͸� Ŭ���̾�Ʈ�� ����
			socket.send(outPacket);
		}
	}
}
