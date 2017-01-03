package a1026;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
 *  Properties 클래스
 *  	Hashtable의 하위 클래스
 *  	<String, String> 쌍으로 저장되는 Map 클래스
 */
public class PropertiesEx {
	public static void main(String[] args) throws IOException {
		Properties pr = new Properties();
		pr.put("1", "홍길동");
		pr.put("2", "김삿갓");
		pr.put("3", "이몽룡");
		pr.put("4", "임꺽정");
		FileWriter fw = new FileWriter("name.txt"); // "name.properties"는 한글저장x
		//pr객체의 내용을 fw에 저장
		pr.store(fw, "이름 목록");
	}
}
