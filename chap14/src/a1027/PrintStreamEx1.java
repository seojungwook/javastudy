package a1027;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/*
 * PrintStream 예제
 *  => 기존 스트림에 print기능을 추가한 스트림.
 *  => 예외처리를 하지않아도 됨.
 *  
 *  System.out(표준출력), System.err(표준오류)의 자료형이다.
 */
public class PrintStreamEx1 {
	public static void main(String[] args) throws IOException {
		//,true : append 가능@(추가)
		FileOutputStream fos = new FileOutputStream("printstream.txt",true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		//,true : auto flush 기능 추가
		PrintStream ps = new PrintStream(bos, true);
		ps.println("홍길동");
		ps.println(1234);
		ps.println(true);
		ps.println('a');
		PrintStream ps2 = new PrintStream("text.txt"/*,true*/); //true 불가, 용도에따라 다르게사용
		ps2.println("PrintStream을 이용한 파일 생성1");
		ps2.println("PrintStream을 이용한 파일 생성2");
		
	}
}
