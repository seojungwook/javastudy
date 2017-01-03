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
		//InputStreamReader로 Reader로 바꾸기 위해서 BufferedReader (바이트형을 문자형으로), 
		BufferedReader sysin = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader sbr = new BufferedReader(new InputStreamReader(s.getInputStream()));
		Writer sw = new OutputStreamWriter(s.getOutputStream());
		while(true){
			System.out.println("4자리의 서로다른 숫자 입력");
			String number = sysin.readLine();
			sw.write(number + "\n");
			sw.flush();
			String data = sbr.readLine(); //서버로부터 ?스트라이크, ?볼 가져오려고
			System.out.println(data);
			if(data.indexOf("종료")>=0) break;
		}
		sysin.close();
		sbr.close();
		sw.close();
		s.close();
	}

}
