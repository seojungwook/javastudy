package a1021;
/*	동기화 방식
 * 1. 동기화 블럭   : 메서드 내에 블럭형태
 * 2. 동기화 메서드 : 메서드자체가 동기화 되어 있다.
 * 동기화를 위한 예약어 : synchronized
 * 
 * 동기화 블럭을 사용한 예제1
 * lock은 반드시 객체여야 함. 기본형 변수는 lock으로 사용할 수 없다.
 * lock으로 사용하는 객체는 프로그램내에 유일해야 한다.(static을 붙임)
 *  => 모든 스레드가 하나의 lock을 공유해야 한다.
 */
class PrintThread2 extends Thread{
	char ch;
//	static Object lock = new Object();
	static Integer lock=0; // Integer는 참조자료형(객체) 이기에 가능, 
							//int형은 기본자료형이기에 불가
	PrintThread2(char ch){
		this.ch = ch;
	}
	public void run(){
	//	synchronized(lock){  //임계영역
		for(int i=1; i<=10;i++){
			synchronized(lock){
			for(int j=1; j<=80; j++){
				System.out.print(ch);
			}
		}//임계영역이 종료되는 순간이 lock 해제
			System.out.println();
	} 
}
}
public class SynchronizedThreadEX1 {
	public static void main(String[] args) {
		PrintThread2 t1 = new PrintThread2('A');
		PrintThread2 t2 = new PrintThread2('B');
		PrintThread2 t3 = new PrintThread2('C');
		t1.start(); t2.start(); t3.start();
	}
}
