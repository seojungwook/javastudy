package a1026;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
 *  Properties Ŭ����
 *  	Hashtable�� ���� Ŭ����
 *  	<String, String> ������ ����Ǵ� Map Ŭ����
 */
public class PropertiesEx {
	public static void main(String[] args) throws IOException {
		Properties pr = new Properties();
		pr.put("1", "ȫ�浿");
		pr.put("2", "���");
		pr.put("3", "�̸���");
		pr.put("4", "�Ӳ���");
		FileWriter fw = new FileWriter("name.txt"); // "name.properties"�� �ѱ�����x
		//pr��ü�� ������ fw�� ����
		pr.store(fw, "�̸� ���");
	}
}
