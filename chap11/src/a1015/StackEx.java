package a1015;

import java.util.Stack;

/*
 * Stack 예제 : Vector의 하위 클래스
 * 				LIFO(Last IN First Out)
 * 	push(Object) : 객체 추가
 * 	pop()		 : 객체를 꺼냄. 스택에서 제거
 * 	peek()		 : 객체 조회
 */
public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		String[] cars = {"소나타", "그랜저", "SM5", "K9"};
		for(Object o : cars)
			stack.push(o);
		System.out.println(stack.peek());
		System.out.println("스택의 크기 : "+ stack.size());
		while(!stack.isEmpty())
			System.out.println(stack.pop());
	}
		
}
