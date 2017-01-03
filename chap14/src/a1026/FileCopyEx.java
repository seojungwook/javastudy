package a1026;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���� :
 * 		InputStreamEx2.java ������
 * 		InputStreamEx2.bak���Ϸ� �����ϱ�.
 */
public class FileCopyEx {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/a1026/InputStreamEx2.java");
		FileOutputStream fos = new FileOutputStream("InputStreamEx2.bak");
		//fis.available() :fis ������ �б� ���� ����Ʈ��
		byte[] buf = new byte[fis.available()];
		int data = 0;
		//data : ������ ���� ����Ʈ�� ����
		while((data = fis.read(buf))!=-1){
			//fos.write(buf,0,data) : buf�� ������ fos ���Ͽ� ����(0���ε������� data -1����)
			fos.write(buf,0,data);
		}
		fos.flush();
		fos.close();
		fis.close();
	}
}
