package a1014;

import java.util.List;
import java.util.Vector;

/*
 * Vector 예제 : List 인터페이스의 구현클래스
 * 		Collection 프레임워크 이전의 클래스
 * 		이전 메서드와, List 메서드가 있다.
 * 
 * List 구현 클래스
 * 	ArrayList : 모든 메서드가 스레드에 동기화 되지 않았다.
 *	 		Thread에 safe하지않다

 * 	Vector    : 모든 메서드가 스레드에 동기화 되어있다
 * 			Thread에 safe하다
 */
public class ListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	List v= new Vector();
		Vector v = new Vector();
		v.add(100.3);
		v.add(3.14);
		v.addElement(1005.0); //List에 없어서 위에 주석처리한게 안돼
		
		for(Object o : v)
			System.out.println(o);
		double search = 1005;
		int index = v.indexOf(search);
		if(index >=0 )
			System.out.println(search + "의 위치:"+index);
		else 
			System.out.println(search +"가 없습니다.");
		double del= 3.14;
		if(v.contains(del)){ //v내부에 del 값 존재?
			v.removeElement(del);
			System.out.println(del + "삭제완료");
		}
		System.out.println(v);
	}

}
