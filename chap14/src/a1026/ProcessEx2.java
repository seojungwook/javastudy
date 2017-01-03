package a1026;

import java.io.IOException;

/*
 * Process가 출력하는 메시지를 읽기
 */
public class ProcessEx2 {
	public static void main(String[] args) throws IOException {
		Process p = Runtime.getRuntime().exec("ping 172.16.1.36");
		byte[] msg = new byte[128];
		int len;
		while((len=p.getInputStream().read(msg)) > 0){
			System.out.println(new String(msg,0,len));
		}
	}
}
