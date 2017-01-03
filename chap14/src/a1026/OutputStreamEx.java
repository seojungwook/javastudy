package a1026;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/*
 * OutputStream 예제
 * OutputStreamWriter 클래스를 사용하기
 * PrintStream System.out : 표준출력 : 화면출력
 * OutputStream > PrintStream(하위클래스)
 */
public class OutputStreamEx {
	public static void main(String[] args) throws IOException{
		OutputStream out = System.out;
		Writer writer = new OutputStreamWriter(out);
		out.write('a'); out.write('b'); out.write('c');
		out.write('1'); out.write('2'); out.write('3');
		writer.write('가'); writer.write('나'); writer.write('다');
	//writer.flush() : 버퍼의 내용을 목적지로 전송
	//  			   버퍼를 비운다.
	//wirter.close() : 스트림을 닫는다.
		writer.flush(); writer.close();
		
	}
}
