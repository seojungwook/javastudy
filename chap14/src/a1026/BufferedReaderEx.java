package a1026;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * BufferedReader 예제 : Buffer를 가지고 있는 문자형 입력 스트림
 * 	readLine() 메서드를 멤버로 가짐
 */
public class BufferedReaderEx {
	public static void main(String[] args) throws IOException {
		//BufferedReader(Reader) : Reader 스트림을 버퍼를 추가하여 성능향상이 가능
		//							readLine()메서드 - 한줄읽기가 가능
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String msg = br.readLine();
			System.out.println(msg);
			if(msg.equals("exit")) break;
		}
		System.out.println("main 메서드 종료");
		br.close();
		//BufferedReader를 이용하여 line수를 추가하여 InputStreamEx2.java를 화면에 출력하기
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
