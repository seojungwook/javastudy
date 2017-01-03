package a1021;
/*
 * 생산자 스레드, 소비자 스레드
 * wait(), notify(), notifyAll()
 * 1. 동기화 영역에서만 사용이 가능함
 * 2. Object 클래스의 멤버 메서드
 * 3. wait() : 현재 실행중인 스레드를 대기상태로.
 * 				걸려있던 lock도 해제됨
 * 				notify(), notifyAll() 메서드로 대기상태에서 헤제됨
 * 	notify() : 대기상태의 스레드 중 한개를 실행가능 상태로
 * 				시스템에 의해서 해제 대상 스래드가 선택
 *  notifyAll() : 대기상태의 스레드 모두를 실행가능 상태로
 * 
 * 
 */
class ATM implements Runnable {
	private long money = 10000;
	public void run(){
		synchronized(this){ //나 자체를 lock으로 쓰는것
			for(int i=0; i<10; i++){
				if(money<=0) break;
				withDraw(1000);
				if(money == 2000 || money == 4000 || money == 6000 || money == 8000)
					try{
						wait();
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				else notify();
			}
		}
	}
	public void withDraw(int m){
		if(money > 0){
			money -= m;
			System.out.println(Thread.currentThread().getName() + ", 잔액:" +money);
		}else {
			System.out.println(Thread.currentThread().getName() + "잔액부족");
		}
	}
}
public class WaitNotifyEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM atm = new ATM();
		Thread mother = new Thread(atm,"mother");
		Thread son = new Thread(atm,"son");
		mother.start(); son.start();
	}

}
