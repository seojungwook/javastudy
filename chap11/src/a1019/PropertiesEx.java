package a1019;

import java.util.Properties;

/*
 * Properties Ŭ����
 * Hashtable Ŭ������ ���� Ŭ������
 * <Key, Value> => <String, String>�� ��ü
 * => IO���� File�� �����. 
 * = IO ���� �ٽ���.
 */
public class PropertiesEx {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("1", "ȫ�浿");
		prop.put("2", "���");
		prop.put("3", "�̸���");
		System.out.println(prop.get("1"));
	}
}
