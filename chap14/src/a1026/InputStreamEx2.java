package a1026;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*
 * Reader 예제
 * Reader : 문자형 입력스트림
 * 			read() 시 2바이트단위(1char 단위)로 읽는다. 그래서 한글 깨지지않음
 * 
 * 	Reader InputStreamReader(InputStream)(Reader의 하위클래스,끝자리로)
 *  => InputStream 스트림을 Reader로 변경하는 스트림
 *  
 *  ReaderInputStream 스트림은 없다.
 *  바이트형 => 문자형 변경 가능
 *  문자형 => 바이트형 변경 불가능
 *  
 *  스트림 : 데이터의 이동통로.
 *  		 단방향, 버퍼를 가진다.
 *  입력 : 바이트 : InputStream
 *  	   문자형 : Reader
 *  출력 : 바이트 : OutputStream
 *  	   문자형 : Writer
 *  
 *  바이트형 입력스트림 => 문자형 입력스트림
 *  	InputStreamReader 
 *  바이트형 출력스트림 => 문자형 출력스트림
 *  	OutputStreamWriter
 */
public class InputStreamEx2 {
	public static void main(String[] args) throws IOException {
		InputStream in = System.in;
		Reader reader = new InputStreamReader(in);
		int data = 0;
		while((data=reader.read())!=-1){//ctrl+z 하면 시스템종료
			System.out.print((char)data);
		}
	}
}
