package a1021;
/*
 * 스레드 우선순위 : 스케줄러에게 빠른 선택을 설정
 * 우선순위 : 1 ~ 10까지 값을 가짐
 * 			 10 : 최고 우선순위
 * 			 1  : 최저 우선순위
 */
class ThreadPriority extends Thread {
	ThreadPriority () {}
	ThreadPriority (int p) {
		setPriority(p); //우선설정
	}
	public void run() {
		for(int i=0; i<50; i++){
			System.out.println(this.toString()); //Thread에 있는 toString 메서드 호출
			/*
			 * Thread[Thread-1,10,main] : Thread 정의된 toString() 출력
			 * Thread-1 : 스레드 이름
			 * 		10  : 우선순위
			 * 	   main : 스레드 그룹
			 */
			try{
				sleep(100);
			}catch (InterruptedException e){}
		}
	}
}
public class PriorityEx {
	public static void main(String[] args) {
		System.out.println("최소우선순위:" + Thread.MIN_PRIORITY);
		System.out.println("최대우선순위:" + Thread.MAX_PRIORITY);
		System.out.println("기본우선순위:" + Thread.NORM_PRIORITY);
		System.out.println();
		Thread t1 = new ThreadPriority(); //5 - 기본
		Thread t2 = new ThreadPriority(10); //10 - 최고
		Thread t3 = new ThreadPriority(2); //2 - 최저
		t1.start(); t2.start(); t3.start();
		
		
	}
}
