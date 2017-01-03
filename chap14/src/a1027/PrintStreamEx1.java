package a1027;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/*
 * PrintStream ����
 *  => ���� ��Ʈ���� print����� �߰��� ��Ʈ��.
 *  => ����ó���� �����ʾƵ� ��.
 *  
 *  System.out(ǥ�����), System.err(ǥ�ؿ���)�� �ڷ����̴�.
 */
public class PrintStreamEx1 {
	public static void main(String[] args) throws IOException {
		//,true : append ����@(�߰�)
		FileOutputStream fos = new FileOutputStream("printstream.txt",true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		//,true : auto flush ��� �߰�
		PrintStream ps = new PrintStream(bos, true);
		ps.println("ȫ�浿");
		ps.println(1234);
		ps.println(true);
		ps.println('a');
		PrintStream ps2 = new PrintStream("text.txt"/*,true*/); //true �Ұ�, �뵵������ �ٸ��Ի��
		ps2.println("PrintStream�� �̿��� ���� ����1");
		ps2.println("PrintStream�� �̿��� ���� ����2");
		
	}
}
