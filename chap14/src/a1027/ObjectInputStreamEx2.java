package a1027;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object2.ser"));
		 //��ü�� �ܺη� �����ٰ� ������Ŵ, Customer ��ü�� ����ȯ
		//ois ��Ʈ�����κ��� ��ü�� �о(Object) Customer��üŸ������ ����ȯ��
		UserInfo2 dc1 = (UserInfo2)ois.readObject();
		UserInfo2 dc2 = (UserInfo2)ois.readObject();
		System.out.println("�� 1: " + dc1);
		System.out.println("�� 2: " + dc2);
		
	}
}
