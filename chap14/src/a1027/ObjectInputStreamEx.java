package a1027;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.ser"));
		 //��ü�� �ܺη� �����ٰ� ������Ŵ, Customer ��ü�� ����ȯ
		//ois ��Ʈ�����κ��� ��ü�� �о(Object) Customer��üŸ������ ����ȯ
		Customer dc1 = (Customer)ois.readObject();
		Customer dc2 = (Customer)ois.readObject();
		System.out.println("�� 1: " + dc1);
		System.out.println("�� 2: " + dc2);
		
	}
}
