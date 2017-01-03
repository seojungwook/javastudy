package a1015;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Queue 인터페이스
 * 		구현클래스가 LinkedList 클래스임.
 * 		Queue 인터페이스의 주요 메서드
 * 			offer(Object) : 큐에 데이터 저장
 * 			poll()		  : 큐에서 데이터를 꺼냄.
 * 							큐에서 데이터가 제거됨.
 * 			peek() 		  : 큐에서 데이터를 조회함.
 */
public class QueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cars[] = {"소나타","그랜저","SM5","K9"};
		Queue queue = new LinkedList();
		for(String c : cars)
			queue.offer(c);
		System.out.println("큐크기 : "+ queue.size());
		Object data = null;
		System.out.println(data = queue.peek());
		while((data=queue.poll()) != null)
			System.out.println(data + "삭제");
		System.out.println("큐크기 : "+ queue.size());
		}
	}

