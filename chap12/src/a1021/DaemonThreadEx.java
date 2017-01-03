package a1021;
/*
 * 데몬스레드 : 일반스레드의 보조 역할을 하는 스레드
 * 				일반스레드가 종료하면 데몬스레드도 종료한다.
 * 		가비지콜렉터(대표적)가 데몬스레드
 */
class DaemonThread extends Thread {
	public void run(){
		while(true){
			System.out.println(getName());
			try{
				sleep(100);
			}catch(InterruptedException e){}
		}
	}
}
public class DaemonThreadEx {
	public static void main(String[] args) { //여기서 main이 일반스레드 
		Thread t1 = new DaemonThread();
		Thread t2 = new DaemonThread();
		t1.setDaemon(true); //t1스레드를 데몬스레드 설정
		t2.setDaemon(true);
		t1.start(); t2.start();
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){}
		System.out.println("main 메서드 종료");
	}
}
