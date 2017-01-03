package a1030;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 * UDP Client ����
 */
public class UDPClientEx {
	public static void main(String[] args) throws IOException {
		//������ �ƴϱ⿡ ��Ʈ�Է� ����, �ӽ÷� ��Ʈ�� ���
		DatagramSocket dataSocket = new DatagramSocket();
		//������ �ּ� ����
		InetAddress serverIP = InetAddress.getByName("127.0.0.1");
		byte[] msg = new byte[100];
		//DatagramPacket : UDP�� ����/���ŵǴ� ������
		DatagramPacket inPacket = new DatagramPacket(msg,msg.length);
		//msg(�������),1(�ð�������,�� �ʿ���� ����),127.0.0.1, 7000��Ʈ
		DatagramPacket outPacket = new DatagramPacket(msg,1,serverIP,7000);
		//������ outPacket�� ����(������ inPacket����)
		dataSocket.send(outPacket);
		//�������� �����͸� �����ؼ� inPacket�� ����
		dataSocket.receive(inPacket);
		//������ �ּ�, ��Ʈ��ȣ
		System.out.println(inPacket.getAddress() + "," + inPacket.getPort());
		//������ ������� ������(�ð�)
		System.out.println("������ ���� �ð� : " + new String(inPacket.getData()));
		dataSocket.close();
		
	}
}
