package a1015;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Queue �������̽�
 * 		����Ŭ������ LinkedList Ŭ������.
 * 		Queue �������̽��� �ֿ� �޼���
 * 			offer(Object) : ť�� ������ ����
 * 			poll()		  : ť���� �����͸� ����.
 * 							ť���� �����Ͱ� ���ŵ�.
 * 			peek() 		  : ť���� �����͸� ��ȸ��.
 */
public class QueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cars[] = {"�ҳ�Ÿ","�׷���","SM5","K9"};
		Queue queue = new LinkedList();
		for(String c : cars)
			queue.offer(c);
		System.out.println("ťũ�� : "+ queue.size());
		Object data = null;
		System.out.println(data = queue.peek());
		while((data=queue.poll()) != null)
			System.out.println(data + "����");
		System.out.println("ťũ�� : "+ queue.size());
		}
	}

