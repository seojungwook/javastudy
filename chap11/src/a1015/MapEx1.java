package a1015;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map 인터페이스
 * 	: (키, 객체)쌍으로 모으는 객체
 * 
 * Map의 구현클래스
 * HashMap	 : 순서를 모른다. 
 * 			   스레드에	동기화 되어있지 않다.
 * 			   null 값을 키로 가질 수 있다.
 * Hashtable : 순서를 모른다.
 * 			   스레드에 동기화 되어있다.
 * 			   null 값을 키로 가질 수 없다.
 * TreeMap   : 정렬순서
 */
public class MapEx1 {

	public static void main(String[] args) {
//		Map<String, Integer> map = new HashMap<String, Integer>(); //HashMap 이라 순서 몰라
		Map<String, Integer> map = new Hashtable<String, Integer>();
		String[] names = {"홍길동","김삿갓","이몽룡","임꺽정","김삿갓"};
		int[] nums ={1234,4567,2350,9870,7890};  //중복되면 번호를 바꿔
		for(int i=0; i<names.length;i++)
			map.put(names[i],nums[i]); //names : 키, nums : 객체
	//	map.put(null, 123); HashMap으로 했을때 null 값 가능
		System.out.println(map);
		//홍길동의 전화번호 검색
		System.out.println("홍길동 번호 : "+ map.get("홍길동"));
		//Map객체에서 key값들만 조회하기 : ketSet()
		Set<String> keys = map.keySet();
		for(String k : keys){
			System.out.println(k+ ":"+ map.get(k));
		}
		System.out.println();
		
		//위의 조회 내용과 같이 출력
		// 단 Iterator 객체 사용하기
		Iterator<String> i = keys.iterator();
		while(i.hasNext()){
			String key = i.next();
			System.out.println(key+ ":"+ map.get(key));
		}
		System.out.println();
		//Map객체에서 객체들만 조회하기
		Collection<Integer> values = map.values();
		for(Object o : values)
			System.out.println(o);
		Iterator<Integer> i2 = values.iterator();
		while(i2.hasNext())
			System.out.println(i2.next());
		//Map객체는 (키, 객체) 쌍으로 이루어진 객체의 모임
		//(키, 객체) 쌍인객체는 Map.Entry 타입객체임
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
