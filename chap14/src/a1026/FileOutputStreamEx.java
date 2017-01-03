package a1026;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * FileOutputStream ����
 */
public class FileOutputStreamEx {
	public static void main(String[] args) {
		try {
			//FileOutputStream : out.txt������ ������ ����
			//					out.txt������ ������ �������Ͽ� ����
			FileOutputStream fos = new FileOutputStream("out.txt"); //FileOutputStream�� FileNotFoundException���ܸ� �� ó���ؾߵ�
																	//������ ������� ��������� ���������� ������ ����� �ִ� ������ ���⶧����
			fos.write('a'); 
			fos.write('b'); 
			fos.write('c');
			//fos.write(byte[] buf)
			fos.write("\n�ȳ��ϼ���".getBytes());
			fos.write("\n�ݰ����ϴ�.".getBytes());
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
