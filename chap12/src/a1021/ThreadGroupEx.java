package a1021;
/*
 * 스레드 그룹 예제 : 관련있는 Thread를 그룹에 설정
 */
class MyThread extends Thread {
	MyThread(ThreadGroup tg, String name){
		super(tg,name);
	}
	public void run(){
		while(true){
			try{
				sleep(100);
			}catch(InterruptedException e){}
			System.out.println(getName());
		}
	}
}
public class ThreadGroupEx {
	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("Group1");
		Thread t1 = new MyThread(tg,"First");
		Thread t2 = new MyThread(tg,"Second");
		Thread t3 = new MyThread(tg,"Third");
		//Thread.currentThread() : 현재 실행중인 Thread 객체 리턴(여기서는 main Thread)
		Thread t4 = new MyThread(Thread.currentThread().getThreadGroup(),"Four");
		t1.start();t2.start();t3.start();t4.start();
		tg.list(); //tg 스레드그룹에 속한 스레드 목록
		try{
			Thread.sleep(1000); //1초
		}catch(InterruptedException e){}
		tg.stop(); //tg 스레드그룹의 스레드를 강제 종료
	}
}
