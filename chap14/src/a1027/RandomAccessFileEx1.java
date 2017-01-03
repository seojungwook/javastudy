package a1027;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * RandomAccessFile
 * 	: ��Ʈ���� �ƴ�����, ���Ͽ� ������ �а� �� �� �ִ� ����� ���� Ŭ����
 */
public class RandomAccessFileEx1 {
	public static void main(String[] args) throws IOException {
		//"rw" : �а� ���� ���ɸ��
		//"r"  : �б� ���� ���
		RandomAccessFile ra = new RandomAccessFile("random.txt", "rw");
		String receive = "hello";
		//ra.seek() : ������ ��ġ�� ����
		//ra.length() : ra ������ ũ��(ó���� 0, �ι�°�� 5)
		ra.seek(ra.length());
		ra.write(receive.getBytes());
		byte buf[] = new byte[(int)ra.length()];
		ra.seek(0);
		ra.read(buf);
		System.out.println("ó�� ���� ����:" + new String(buf));
		ra.seek(0);
		ra.read(buf);
		System.out.println("�ٽ� ���� ����:" + new String(buf));
		if(ra != null) ra.close();
	}
}
