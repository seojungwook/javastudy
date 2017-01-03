package a1027;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * FilterInputStream, FilterOutputStream ����
 * 		������ ��Ʈ�� ����� �߰��Ͽ� ��Ʈ���� ������ �� �ִ� ��Ʈ��
 * 		�����ڿ� ��Ʈ���� �Է¹޴´�.
 * 
 * 		DataOutputStream : �����͸� @�⺻������ �� �� �ִ� ��Ʈ��
 * 			=> DataInputStream���� �о�� �Ѵ�.
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
			System.out.println(dos.size() + "����Ʈ");
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
}
