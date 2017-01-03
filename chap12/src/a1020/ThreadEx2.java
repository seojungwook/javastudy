package a1020;
/*
 * Tread 생성 2
 * 2. Runnable 인터페이스를 구현하여 생성하기
 * 	=> 구현클래스는 Thread 클래스가 아님.
 * 		Thread 객체를 생성할 때, 구현클래스객체를 생성자에 전달
 * 		=> Thread는 구현클래스의 run()메서드를 Thread의 run메서드로 결정함.
 */
class Runnable1 implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<5; i++){
			//Thread.currentThread() : 현재 실행중인 Thread 객체를 리턴(우리한테 넘겨줌)
			System.out.println(i + "="+ Thread.currentThread().getName());
			try{
				Thread.sleep(1000); //클래스메서드, Threadex1은 Thread를 상속받아서 안씀
			} catch(InterruptedException e){}
		}
	}
	
}
public class ThreadEx2 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Runnable1 r = new Runnable1();
		Thread t1 = new Thread(r,"First"); //New 상태 , 스레드 객체를 만들어주는 상태
		Thread t2 = new Thread(r,"Second"); //New 상태
		t1.start(); t2.start();
		System.out.println("Main 메서드 종료");
	}
}
