package a1029;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;
import java.net.UnknownHostException;

public class BaseBallClientEx {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket s = new Socket("127.0.0.1",9000);
		//InputStreamReader�� Reader�� �ٲٱ� ���ؼ� BufferedReader (����Ʈ���� ����������), 
		BufferedReader sysin = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader sbr = new BufferedReader(new InputStreamReader(s.getInputStream()));
		Writer sw = new OutputStreamWriter(s.getOutputStream());
		while(true){
			System.out.println("4�ڸ��� ���δٸ� ���� �Է�");
			String number = sysin.readLine();
			sw.write(number + "\n");
			sw.flush();
			String data = sbr.readLine(); //�����κ��� ?��Ʈ����ũ, ?�� ����������
			System.out.println(data);
			if(data.indexOf("����")>=0) break;
		}
		sysin.close();
		sbr.close();
		sw.close();
		s.close();
	}

}
