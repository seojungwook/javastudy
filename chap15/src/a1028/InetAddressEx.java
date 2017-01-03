package a1028;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/*
 * InetAddress : IP주소 정보를 관리하는 클래스
 * 				생성자의 접근제어자가 (default)
 * 				=> 우리는 객체생성 불가
 * 객체생성을 위한 4개의 클래스 메서드를 제공함.
 * 1. getByName(String hostname) 	: hostname을 입력하면 hostname인 IP주소를 리턴
 * 2. getAllByName(String hostname) : hostname인 모든 IP주소를 배열로 리턴
 * 3. getByAddress(byte[] ip) 		: ip주소를 입력하여 객체리턴
 * 4. getLocalHost()				: 내컴퓨터의 IP주소정보 리턴
 */
public class InetAddressEx {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress ip = InetAddress.getByName("www.naver.com");
		System.out.println("getHostName() : " + ip.getHostName());
		System.out.println("getHostAddress() : " + ip.getHostAddress());
		//ip.getAddress() : 1바이트씩 정수 리턴
		byte[] ipAddr = ip.getAddress();
		System.out.println("getAddress() : " + Arrays.toString(ipAddr)); // 바이트값이기에 마이너스 나올 수있음
		String result = "";
		System.out.print("2. getAddress() : " );
		for(int i=0; i<ipAddr.length; i++){
			result += (ipAddr[i]<0)?ipAddr[i]+256:ipAddr[i];
			result +=".";
		}
		System.out.println(result);	 // 바이트값의 음수 보정
		//getAllByname() : 모든 IP주소 리턴
		InetAddress[] ips = InetAddress.getAllByName("www.google.com");
		for(int i=0; i<ips.length; i++){
			System.out.println("ip 주소" + (i+1) + ":" + ips[i]);
		}
		System.out.println();
		//내컴퓨터의 IP주소 정보
		ip = InetAddress.getLocalHost();
		System.out.println("getHostName() : " + ip.getHostName());
		System.out.println("getHostAddress() : " + ip.getHostAddress());
		//getByAddress() 메서드를 이용하여 내 주소 정보 가져오기
		System.out.println();
		// byte의 범위(-128~127)를 넘기때문에 -256한 것
		byte[] localAddr = {172-256,16,1,24}; 
		ip = InetAddress.getByAddress(localAddr);
		System.out.println("getHostName() : " + ip.getHostName());
		System.out.println("getHostAddress() : " + ip.getHostAddress());
		System.out.println("ip =" + ip);
		
	}
}
