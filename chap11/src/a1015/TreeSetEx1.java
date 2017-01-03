package a1015;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * TreeSet 예제
 * 	: 중복불가, 정렬됨.
 * 
 * 정렬관련 인터페이스
 * Comparator 인터페이스 : 정렬방식지정
 * 			compare(Object obj);
 * Comparable 인터페이스 :
 * 			compareTo() : 음수 : 내가 앞(작은 값)
 * 						  양수 : 내가 뒤(큰 값)
 */
public class TreeSetEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	TreeSet set = new TreeSet();
		//TreeSet 객체 생성시 정렬방식을 지정
		//Comparator 객체여야 함. //Descending은 Comparator인터페이스를 구현해야한다.
		//Descending은 Comparator의 객체여야해
		//TreeSet에 객체가 추가시 Comparator 객체내부의 compare 메서드 호출 
		TreeSet set = new TreeSet(new Descending());
		String from ="bat";
		String to = "d";
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("azz");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("dzzzz");
		set.add("elevator");
		set.add("fan");
		set.add("flower");
		System.out.println(set);
		//subSet 기능
	//	System.out.println("from:" + from + ",to:"+ to);
		System.out.println("from:" + to + ",to:"+ from);
		System.out.println(set.subSet(to, from));
		//System.out.println("from:" + from + ",to:" + to + "zzzz");
		System.out.println("from:" + to + "zzzz" + ",to:" + from );
		System.out.println(set.subSet(to+"zzzz", from ));
		
	}

}
class Descending implements Comparator {
	
	@Override
	public int compare(Object o1, Object o2){ //Comparator를 구현했기에 
											//  Comparator가 가지고 있는 compare 를 오버라이딩해야돼
		Comparable c1 = (Comparable)o1;
		Comparable c2 = (Comparable)o2;
		
		return c1.compareTo(c2)*(-1); //음수를 양수로(반대로 만듦)
		
	}
	
}
