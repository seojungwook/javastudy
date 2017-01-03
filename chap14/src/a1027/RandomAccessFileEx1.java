package a1027;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * RandomAccessFile
 * 	: 스트림은 아니지만, 파일에 내용을 읽고 쓸 수 있는 기능을 가진 클래스
 */
public class RandomAccessFileEx1 {
	public static void main(String[] args) throws IOException {
		//"rw" : 읽고 쓰기 가능모드
		//"r"  : 읽기 가능 모드
		RandomAccessFile ra = new RandomAccessFile("random.txt", "rw");
		String receive = "hello";
		//ra.seek() : 파일의 위치를 설정
		//ra.length() : ra 파일의 크기(처음엔 0, 두번째는 5)
		ra.seek(ra.length());
		ra.write(receive.getBytes());
		byte buf[] = new byte[(int)ra.length()];
		ra.seek(0);
		ra.read(buf);
		System.out.println("처음 읽은 내용:" + new String(buf));
		ra.seek(0);
		ra.read(buf);
		System.out.println("다시 읽은 내용:" + new String(buf));
		if(ra != null) ra.close();
	}
}
