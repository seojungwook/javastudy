package a1021;
/*
 * interrupt() 메서드
 */
class InterruptThread extends Thread{
	public void run(){
		System.out.println("지금부터 자는 중입니다.");
		System.out.println("깨우지 마세요");
		try{
			sleep(1000000);
		}catch(InterruptedException e){
			System.out.println("누구야?");
		}
	}
}
public class InterruptEx {
	public static void main(String[] args) {
		InterruptThread t = new InterruptThread();
		t.start();
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){}
		t.interrupt(); //t스레드는 InterruptedException 예외가 발생
	}
}
