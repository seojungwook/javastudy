package a1026;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx2 {
	public static void main(String[] args) throws IOException {
		Properties pr = new Properties();
		FileReader fr = new FileReader("name.txt");
		//pr.load(fr):fr파일을 Properties 객체로 생성
		pr.load(fr);
		System.out.println(pr);
		pr.list(System.out);
	}
}
