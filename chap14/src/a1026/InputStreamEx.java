package a1026;

import java.io.IOException;
import java.io.InputStream;

/*
 * InputStream ���� 802p
 */
public class InputStreamEx {
	public static void main(String[] args) throws IOException{
		/*
		 * InputStream System.in : 
		 * 		ǥ���Է½�Ʈ�� : Ű����κ��� �Էµ� ������ ����
		 * InputStream : ����Ʈ�� �Է� ��Ʈ���� �ֻ��� Ŭ���� 
		 * 				 �߻�Ŭ������.
		 * 				 read() ������ 1����Ʈ ������.
		 */
		InputStream in = System.in;
		int data = 0;
		while((data = in.read()) != -1){
			System.out.print((char)data); //1����Ʈ �����̱⿡ �ѱ��� ����
		}
	}
}
