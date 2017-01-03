package a1014;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * List 예제
 * : 추가 순서를 유지함. 인덱스사용으로 위치 저장
 * 	가변배열
 * 	
 * 	jdk5.0 이후에 모든 Collection 객체는 제네릭을 표현해야한다.
 * 
 * 출력
[1, 2, 5, 4, 0, 3]
1
2
5
4
0
3
[2, 5, 4]
[2, 4, 5]
2
4
5

 */
public class ListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
	
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(0);
		list.add(3);
		System.out.println(list);
		for(int i =0; i<list.size();i++){
			System.out.println(list.get(i));
		}
		List<Integer> list2 = new ArrayList<Integer>(list.subList(1,4));
		System.out.println(list2);
		//List 정렬
		//Collection 인터페이스
		//Collections 클래스
		Collections.sort(list2); //list 타입만 들어올수 있다
		System.out.println(list2);
		//개선된 for구문 Collection 사용가능
		for(Object o : list2)
			System.out.println(o);
	}
}
