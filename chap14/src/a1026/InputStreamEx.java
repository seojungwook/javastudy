package a1026;

import java.io.IOException;
import java.io.InputStream;

/*
 * InputStream 예제 802p
 */
public class InputStreamEx {
	public static void main(String[] args) throws IOException{
		/*
		 * InputStream System.in : 
		 * 		표준입력스트림 : 키보드로부터 입력된 내용을 저장
		 * InputStream : 바이트형 입력 스트림의 최상위 클래스 
		 * 				 추상클래스임.
		 * 				 read() 단위가 1바이트 단위임.
		 */
		InputStream in = System.in;
		int data = 0;
		while((data = in.read()) != -1){
			System.out.print((char)data); //1바이트 단위이기에 한글이 깨짐
		}
	}
}
