package a1026;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * FileInputStream 예제
 * File의 내용을 읽어 화면에 출력하기
 * 1. int read() : 1바이트 단위로 읽어서 그 값을 리턴
 * 2. int read(byte[] buf) : buf크기만큼 읽어서 읽은 내용은 buf에 저장하고, 
 * 							실제로 읽은 값의 크기를 리턴 
 * 3. int read(byte[] buf, int startindex, int length) : 읽은 내용은 buf에 startindex부터 length만큼 저장하고,
 * 														실제로 읽은 값의 크기를 리턴(start지점을 바꿔서 쪼개서 가져올수 있다)
 */
public class FileInputStreamEx {
	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("src/a1026/InputStreamEx2.java");
			int data = 0;
			//fis.read() : 1바이트단위로 읽는다.
//			while((data= fis.read())!= -1){ //한바이트씩 읽어서 // EOF(end of file)끝이면 -1로
//				System.out.print((char)data);
//			}
			//한꺼번에 읽기(한글 깨지지않게) 1
			//fis.available() : 읽기 가능 바이트 수
			byte[] buf = new byte[fis.available()];
//			//data = fis.read(buf) : buf의 크기만큼 읽어서 buf에 내용저장
//			//						data : 실제 읽은 바이트수 리턴
//			while((data = fis.read(buf))!=-1){
//			//new String(buf,0,data) : buf의 내용을 문자열로 변경
//			//  					   0번인덱스부터 data값 이전까지
//				System.out.println(new String(buf,0,data));
//			}
			//한꺼번에 읽기 2
			//data=fis.read(buf,0,buf.length)
			//읽은 내용을 buf에 0번인덱스부터 buf.length만큼 읽어서 읽는 내용을 buf에 저장
			//data : 실제로 읽은 바이트수를 리턴
			while((data=fis.read(buf,0,buf.length))!=-1){
				System.out.println(new String(buf,0,data));
			}
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}
