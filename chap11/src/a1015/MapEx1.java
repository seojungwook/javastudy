package a1015;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map �������̽�
 * 	: (Ű, ��ü)������ ������ ��ü
 * 
 * Map�� ����Ŭ����
 * HashMap	 : ������ �𸥴�. 
 * 			   �����忡	����ȭ �Ǿ����� �ʴ�.
 * 			   null ���� Ű�� ���� �� �ִ�.
 * Hashtable : ������ �𸥴�.
 * 			   �����忡 ����ȭ �Ǿ��ִ�.
 * 			   null ���� Ű�� ���� �� ����.
 * TreeMap   : ���ļ���
 */
public class MapEx1 {

	public static void main(String[] args) {
//		Map<String, Integer> map = new HashMap<String, Integer>(); //HashMap �̶� ���� ����
		Map<String, Integer> map = new Hashtable<String, Integer>();
		String[] names = {"ȫ�浿","���","�̸���","�Ӳ���","���"};
		int[] nums ={1234,4567,2350,9870,7890};  //�ߺ��Ǹ� ��ȣ�� �ٲ�
		for(int i=0; i<names.length;i++)
			map.put(names[i],nums[i]); //names : Ű, nums : ��ü
	//	map.put(null, 123); HashMap���� ������ null �� ����
		System.out.println(map);
		//ȫ�浿�� ��ȭ��ȣ �˻�
		System.out.println("ȫ�浿 ��ȣ : "+ map.get("ȫ�浿"));
		//Map��ü���� key���鸸 ��ȸ�ϱ� : ketSet()
		Set<String> keys = map.keySet();
		for(String k : keys){
			System.out.println(k+ ":"+ map.get(k));
		}
		System.out.println();
		
		//���� ��ȸ ����� ���� ���
		// �� Iterator ��ü ����ϱ�
		Iterator<String> i = keys.iterator();
		while(i.hasNext()){
			String key = i.next();
			System.out.println(key+ ":"+ map.get(key));
		}
		System.out.println();
		//Map��ü���� ��ü�鸸 ��ȸ�ϱ�
		Collection<Integer> values = map.values();
		for(Object o : values)
			System.out.println(o);
		Iterator<Integer> i2 = values.iterator();
		while(i2.hasNext())
			System.out.println(i2.next());
		//Map��ü�� (Ű, ��ü) ������ �̷���� ��ü�� ����
		//(Ű, ��ü) ���ΰ�ü�� Map.Entry Ÿ�԰�ü��
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		for(Map.Entry<String, Integer> o : entry){
		//	Map.Entry e = (Map.Entry)o;
			System.out.println(o.getKey() + ":" + o.getValue());
		}
		System.out.println();
		Iterator<Map.Entry<String, Integer>> i3 = entry.iterator();
		while(i3.hasNext()){
			Map.Entry<String, Integer> key1 = i3.next();
		//	Map.Entry n = (Map.Entry)key1;
			System.out.println(key1.getKey() + ":" + key1.getValue());
//			System.out.println(i3.next());
		}
	}
}
