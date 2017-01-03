package a1026;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * BufferedReader ���� : Buffer�� ������ �ִ� ������ �Է� ��Ʈ��
 * 	readLine() �޼��带 ����� ����
 */
public class BufferedReaderEx {
	public static void main(String[] args) throws IOException {
		//BufferedReader(Reader) : Reader ��Ʈ���� ���۸� �߰��Ͽ� ��������� ����
		//							readLine()�޼��� - �����бⰡ ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String msg = br.readLine();
			System.out.println(msg);
			if(msg.equals("exit")) break;
		}
		System.out.println("main �޼��� ����");
		br.close();
		//BufferedReader�� �̿��Ͽ� line���� �߰��Ͽ� InputStreamEx2.java�� ȭ�鿡 ����ϱ�
		BufferedReader bt = new BufferedReader(new FileReader("src/a1026/InputStreamEx2.java"));
		int i=0;
		String data;
		while(true){
			if((data=bt.readLine())!=null)
//			String ms = bt.readLine();
//			if(ms == null) break;
			System.out.println(++i + ". " + data);
		}
	//	bt.close();
	}
}
