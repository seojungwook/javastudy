package a1015;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * Phone 객체가 Comparable 객체가 되도록 클래스 다시 작성
 * Comparable 인터페이스 구현하면 CompareTo()메서드를 이름순으로 정렬하도록 구현
 * 
 * 정렬방식 정하기 : 
 * 		Comparator 객체를 이용해서 정함.
 * 		 가지고 있는 compare 메서드를 호출하여 결과 음수 : 앞순서,
 * 													양수 : 뒤순서
 */
class Phone implements Comparable{
	String name;
	int number;
	Phone(String name, int number){
		this.name = name;
		this.number = number;
	}
	public String toString() {
		return name + ":" + number;
	}
	//
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Phone p = (Phone)o;
		return name.compareTo(p.name);
	}
}
class NameDesc implements Comparator{
	public int compare(Object o1, Object o2) {
		Comparable p1 = (Comparable)o1;
		Comparable p2 = (Comparable)o2;
		return p2.compareTo(p1);
	}
}
//홍길동, 김삿갓, 이몽룡, 임꺼정
//김삿갓, 이몽룡,홍길동
class NumberDesc implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Phone p1 = (Phone)o1;
		Phone p2 = (Phone)o2;
		return p2.number-p1.number; //역순이고, 원래 역순으로 하려면 *-1해야 되는데 그냥 위치를 바꿈
	}
}
class NumberAsc implements Comparator{
//번호 오름차순
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Phone p1 = (Phone)o1;
		Phone p2 = (Phone)o2;
		return p1.number-p2.number;
	}
	
}

public class TreeSetEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet set1 = new TreeSet();
		//set2 객체는 이름순이 아니고 번호순의 역순(내림차순)으로 정렬
		TreeSet set2 = new TreeSet(new NumberDesc());
		set1.add(new Phone("홍길동",1234));
		set1.add(new Phone("김삿갓",2345));
		set1.add(new Phone("이몽룡",3456));
		set1.add(new Phone("임꺽정",4567));
		System.out.println(set1);
		set2.add(new Phone("홍길동",1234));
		set2.add(new Phone("김삿갓",2345));
		set2.add(new Phone("이몽룡",3456));
		set2.add(new Phone("임꺽정",4567));
		System.out.println(set2);
		TreeSet set3 = new TreeSet(new NumberAsc());
		set3.add(new Phone("홍길동",1234));
		set3.add(new Phone("김삿갓",2345));
		set3.add(new Phone("이몽룡",3456));
		set3.add(new Phone("임꺽정",4567));
		System.out.println(set3);
		TreeSet set4 = new TreeSet(new NameDesc());
		set4.add(new Phone("홍길동",1234));
		set4.add(new Phone("김삿갓",2345));
		set4.add(new Phone("이몽룡",3456));
		set4.add(new Phone("임꺽정",4567));
		System.out.println(set4);
	
	}

}
