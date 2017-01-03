package a1015;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Vector;

/*
 * Iterator 인터페이스
 * 		Collection 객체는 모두 Iterator 객체로 변환이 가능하다.
 * 		hasNext() : 조회대상이 존재해?
 * 		next()    : 조회대상을 가져와
 * 		remove()  : 조회된 객체를 제거
 * 
 * ListIterator : Iterator 인터페이스의 하위 인터페이스
 * 		Iterator는 next()만 조회가능
 * 		ListIterator : 양방향 조회 가능
 * Enumeration 인터페이스 : Iterator의 구버전
 * 							Vector, Hashtable 객체만 사용가능
 * 		hasMoreElement() : 조회대상이 존재?
 * 		nextElement() : 객체 조회
 */
public class IteratorEx1 {
	public static void main(String[] args) {
		Iterator it = null;
		List list = new ArrayList();
		list.add("1");list.add("2");list.add("3");
		list.add("4");list.add("5");list.add("6");
		it = list.iterator();
		while(it.hasNext()){ //존재하냐?
			System.out.print(it.next()); //가져와
			it.remove(); //반드시 next() 메서드 이후에 호출가능
		}
		
		System.out.println();
		System.out.println(list);
		Set set = new HashSet();
		set.add("1");set.add("2");set.add("3");
		set.add("4");set.add("5");set.add("6");
		it = set.iterator();
		while(it.hasNext()){
			System.out.print(it.next());
		}
		System.out.println();
		Enumeration e = null;
		Vector v = new Vector();
		v.add(1);v.add(2);v.add(3);
		e = v.elements();
		while(e.hasMoreElements()){
			System.out.print(e.nextElement());
		}
		System.out.println();
		
		it = v.iterator();
		//it 객체를 사용하여 화면에 출력
		while(it.hasNext()){
			System.out.print(it.next());
		}
		System.out.println();
		
		ListIterator lit = v.listIterator();
		
		while(lit.hasNext())
			System.out.print(lit.next());
		System.out.println();
		while(lit.hasPrevious())
			System.out.print(lit.previous());
		System.out.println();
	}
}
