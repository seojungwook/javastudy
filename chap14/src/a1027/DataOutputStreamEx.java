package a1027;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * FilterInputStream, FilterOutputStream 예제
 * 		기존의 스트림 기능을 추가하여 스트림을 변형할 수 있는 스트림
 * 		생성자에 스트림을 입력받는다.
 * 
 * 		DataOutputStream : 데이터를 @기본형으로 쓸 수 있는 스트림
 * 			=> DataInputStream으로 읽어야 한다.
 */
public class DataOutputStreamEx {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try{
			fos = new FileOutputStream("sample.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeBoolean(true);
			dos.writeInt(1234);
			dos.writeChar('A');
			dos.writeDouble(123.45);
			System.out.println(dos.size() + "바이트");
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
}
