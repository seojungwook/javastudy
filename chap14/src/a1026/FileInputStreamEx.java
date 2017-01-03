package a1026;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * FileInputStream ����
 * File�� ������ �о� ȭ�鿡 ����ϱ�
 * 1. int read() : 1����Ʈ ������ �о �� ���� ����
 * 2. int read(byte[] buf) : bufũ�⸸ŭ �о ���� ������ buf�� �����ϰ�, 
 * 							������ ���� ���� ũ�⸦ ���� 
 * 3. int read(byte[] buf, int startindex, int length) : ���� ������ buf�� startindex���� length��ŭ �����ϰ�,
 * 														������ ���� ���� ũ�⸦ ����(start������ �ٲ㼭 �ɰ��� �����ü� �ִ�)
 */
public class FileInputStreamEx {
	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("src/a1026/InputStreamEx2.java");
			int data = 0;
			//fis.read() : 1����Ʈ������ �д´�.
//			while((data= fis.read())!= -1){ //�ѹ���Ʈ�� �о // EOF(end of file)���̸� -1��
//				System.out.print((char)data);
//			}
			//�Ѳ����� �б�(�ѱ� �������ʰ�) 1
			//fis.available() : �б� ���� ����Ʈ ��
			byte[] buf = new byte[fis.available()];
//			//data = fis.read(buf) : buf�� ũ�⸸ŭ �о buf�� ��������
//			//						data : ���� ���� ����Ʈ�� ����
//			while((data = fis.read(buf))!=-1){
//			//new String(buf,0,data) : buf�� ������ ���ڿ��� ����
//			//  					   0���ε������� data�� ��������
//				System.out.println(new String(buf,0,data));
//			}
			//�Ѳ����� �б� 2
			//data=fis.read(buf,0,buf.length)
			//���� ������ buf�� 0���ε������� buf.length��ŭ �о �д� ������ buf�� ����
			//data : ������ ���� ����Ʈ���� ����
			while((data=fis.read(buf,0,buf.length))!=-1){
				System.out.println(new String(buf,0,data));
			}
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}
