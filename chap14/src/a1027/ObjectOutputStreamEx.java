package a1027;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("object.ser")); //��ü��ü�� ����
		Customer sc1 = new Customer("ȫ�浿",25,"111111");
		Customer sc2 = new Customer("���",30,"222222");
		oos.writeObject(sc1);
		oos.writeObject(sc2);
		System.out.println("�� 1 " + sc1);
		System.out.println("�� 2 " + sc2);
	}
}
