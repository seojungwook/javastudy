package a1026;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 문제 :
 * 		InputStreamEx2.java 파일을
 * 		InputStreamEx2.bak파일로 복사하기.
 */
public class FileCopyEx {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/a1026/InputStreamEx2.java");
		FileOutputStream fos = new FileOutputStream("InputStreamEx2.bak");
		//fis.available() :fis 파일을 읽기 가능 바이트수
		byte[] buf = new byte[fis.available()];
		int data = 0;
		//data : 실제로 읽은 바이트수 리턴
		while((data = fis.read(buf))!=-1){
			//fos.write(buf,0,data) : buf의 내용을 fos 파일에 쓰기(0번인덱스부터 data -1까지)
			fos.write(buf,0,data);
		}
		fos.flush();
		fos.close();
		fis.close();
	}
}
