package a1028;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;

/*
 * URL 클래스 :
 * 		URL 형식정보를 관리하는 클래스
 */
public class URLEx {
	public static void main(String[] args) {
		URL url1 = null, url2 = null;
		try{
	//		url1 = new URL("http://www.naver.com:80/temp/a.html?name=ttt"); //Port번호 80
			url1 = new URL("http://www.goodee.co.kr"); 
			//URL(프로토콜, 호스트, 포트, 파일)
			url2 = new URL("file","",-1,"aaa.txt");
		}catch (MalformedURLException e){
			e.printStackTrace();
		}
		System.out.println("equals : " + url1.equals(url2));
		System.out.println("protocol : " 
						+ url1.getProtocol() + ","
						+ url2.getProtocol());
		System.out.println("host : " 
				+ url1.getHost() + ","
				+ url2.getHost());
		System.out.println("port : " 
				+ url1.getPort() + ","
				+ url2.getPort());
		System.out.println("file : " 
				+ url1.getFile() + ","
				+ url2.getFile());
		System.out.println("ref : " 
				+ url1.getRef() + ","
				+ url2.getRef());
		//URL을 통해서 정보 받기
		int data =0;
		try{
			Reader is = new InputStreamReader(url1.openStream());
			while((data=is.read())!=-1){
				System.out.print((char)data);
			}
			System.out.println();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
