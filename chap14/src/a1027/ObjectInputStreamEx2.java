package a1027;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object2.ser"));
		 //객체가 외부로 나갔다가 복원시킴, Customer 객체로 형변환
		//ois 스트림으로부터 객체를 읽어서(Object) Customer객체타입으로 형변환함
		UserInfo2 dc1 = (UserInfo2)ois.readObject();
		UserInfo2 dc2 = (UserInfo2)ois.readObject();
		System.out.println("고객 1: " + dc1);
		System.out.println("고객 2: " + dc2);
		
	}
}
