package a1026;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * FileOutputStream 예제
 */
public class FileOutputStreamEx {
	public static void main(String[] args) {
		try {
			//FileOutputStream : out.txt파일이 없으면 생성
			//					out.txt파일이 있으면 기존파일에 쓰기
			FileOutputStream fos = new FileOutputStream("out.txt"); //FileOutputStream는 FileNotFoundException예외를 꼭 처리해야돼
																	//이유는 윈도우는 상관없지만 리눅스에서 파일을 만들수 있는 권한이 없기때문에
			fos.write('a'); 
			fos.write('b'); 
			fos.write('c');
			//fos.write(byte[] buf)
			fos.write("\n안녕하세요".getBytes());
			fos.write("\n반갑습니다.".getBytes());
			fos.flush();
			fos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
