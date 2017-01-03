package a1019;

import java.util.Properties;

/*
 * Properties Å¬·¡½º
 * Hashtable Å¬·¡½ºÀÇ ÇÏÀ§ Å¬·¡½ºÀÓ
 * <Key, Value> => <String, String>ÀÎ °´Ã¼
 * => IO¿¡¼­ File¿Í ¿¬°áµÊ. 
 * = IO ¿¹Á¦ ´Ù½ÃÇÔ.
 */
public class PropertiesEx {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("1", "È«±æµ¿");
		prop.put("2", "±è»ñ°«");
		prop.put("3", "ÀÌ¸ù·æ");
		System.out.println(prop.get("1"));
	}
}
