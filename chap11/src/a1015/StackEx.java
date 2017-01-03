package a1015;

import java.util.Stack;

/*
 * Stack ���� : Vector�� ���� Ŭ����
 * 				LIFO(Last IN First Out)
 * 	push(Object) : ��ü �߰�
 * 	pop()		 : ��ü�� ����. ���ÿ��� ����
 * 	peek()		 : ��ü ��ȸ
 */
public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		String[] cars = {"�ҳ�Ÿ", "�׷���", "SM5", "K9"};
		for(Object o : cars)
			stack.push(o);
		System.out.println(stack.peek());
		System.out.println("������ ũ�� : "+ stack.size());
		while(!stack.isEmpty())
			System.out.println(stack.pop());
	}
		
}
