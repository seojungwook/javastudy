package a1026;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/*
 * OutputStream ����
 * OutputStreamWriter Ŭ������ ����ϱ�
 * PrintStream System.out : ǥ����� : ȭ�����
 * OutputStream > PrintStream(����Ŭ����)
 */
public class OutputStreamEx {
	public static void main(String[] args) throws IOException{
		OutputStream out = System.out;
		Writer writer = new OutputStreamWriter(out);
		out.write('a'); out.write('b'); out.write('c');
		out.write('1'); out.write('2'); out.write('3');
		writer.write('��'); writer.write('��'); writer.write('��');
	//writer.flush() : ������ ������ �������� ����
	//  			   ���۸� ����.
	//wirter.close() : ��Ʈ���� �ݴ´�.
		writer.flush(); writer.close();
		
	}
}
