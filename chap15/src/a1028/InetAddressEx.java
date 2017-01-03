package a1028;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/*
 * InetAddress : IP�ּ� ������ �����ϴ� Ŭ����
 * 				�������� ���������ڰ� (default)
 * 				=> �츮�� ��ü���� �Ұ�
 * ��ü������ ���� 4���� Ŭ���� �޼��带 ������.
 * 1. getByName(String hostname) 	: hostname�� �Է��ϸ� hostname�� IP�ּҸ� ����
 * 2. getAllByName(String hostname) : hostname�� ��� IP�ּҸ� �迭�� ����
 * 3. getByAddress(byte[] ip) 		: ip�ּҸ� �Է��Ͽ� ��ü����
 * 4. getLocalHost()				: ����ǻ���� IP�ּ����� ����
 */
public class InetAddressEx {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress ip = InetAddress.getByName("www.naver.com");
		System.out.println("getHostName() : " + ip.getHostName());
		System.out.println("getHostAddress() : " + ip.getHostAddress());
		//ip.getAddress() : 1����Ʈ�� ���� ����
		byte[] ipAddr = ip.getAddress();
		System.out.println("getAddress() : " + Arrays.toString(ipAddr)); // ����Ʈ���̱⿡ ���̳ʽ� ���� ������
		String result = "";
		System.out.print("2. getAddress() : " );
		for(int i=0; i<ipAddr.length; i++){
			result += (ipAddr[i]<0)?ipAddr[i]+256:ipAddr[i];
			result +=".";
		}
		System.out.println(result);	 // ����Ʈ���� ���� ����
		//getAllByname() : ��� IP�ּ� ����
		InetAddress[] ips = InetAddress.getAllByName("www.google.com");
		for(int i=0; i<ips.length; i++){
			System.out.println("ip �ּ�" + (i+1) + ":" + ips[i]);
		}
		System.out.println();
		//����ǻ���� IP�ּ� ����
		ip = InetAddress.getLocalHost();
		System.out.println("getHostName() : " + ip.getHostName());
		System.out.println("getHostAddress() : " + ip.getHostAddress());
		//getByAddress() �޼��带 �̿��Ͽ� �� �ּ� ���� ��������
		System.out.println();
		// byte�� ����(-128~127)�� �ѱ⶧���� -256�� ��
		byte[] localAddr = {172-256,16,1,24}; 
		ip = InetAddress.getByAddress(localAddr);
		System.out.println("getHostName() : " + ip.getHostName());
		System.out.println("getHostAddress() : " + ip.getHostAddress());
		System.out.println("ip =" + ip);
		
	}
}
