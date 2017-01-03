package a1020;
/*
 * Thread 생성하기
 * 1. Thread 클래스를 상속받아 생성
 * 
 */
class Thread1 extends Thread{
	Thread1(String name){
		super(name); //스레드 이름 지정
	}
	public void run(){ //Running 상태 : 우리가 하는게 아니고 Scheduler의 선택
		for(int i=0; i<5; i++){
			//getName() : 스레드 이름을 리턴
			System.out.println(i+ "=" +getName());
			try{
				sleep(1000); //1초간 스레드 재우기 //Blocked(대기) 상태
			}catch(InterruptedException e){}
		}
	} // run 메서드 종료 : Dead 상태
}
public class ThreadEx1 {
	public static void main(String[] args) { //main도 실제적으로 Thread
		Thread1 t1 = new Thread1("First"); //New 상태
		Thread1 t2 = new Thread1("Second"); //New 상태
		t1.start(); //Runnable 상태
		t2.start(); //Runnable 상태
		/*
		 * 1. 스택을 병렬화 시킴(스택을 나눔)
		 * 2. run() 호출
		 */
	//	t1.run(); //실행은 가능하지만 스레드환경은 아님
		System.out.println("Main 메서드 종료");
	}
}
