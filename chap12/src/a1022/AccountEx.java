package a1022;
/*
 *  엄마스레드와 아들스레드가 하나의 계좌를 공유한다.
 *  계좌에 금액이 0이면 아들스레드는 wait() 상태로
 *  엄마스레드에게 입금을 요청합니다.
 *  엄마스레드는 계좌에 금액이 0보다 크면 wait() 상태
 *  돈이 없는 경우에만 돈을 입금한다.
 *  단 엄마스레드와 아들스레드는 불규칙하게 sleep한다.
 *  아들스레드(0 ~ 200) sleep
 *  엄마스레드(0 ~ 3000) sleep
 *  Account 클래스 : 계좌class
 *  	멤버변수 : money;
 *  	멤버메서드 
 *  		1. synchronized void output() :
 *  			아들스레드가 호출하여 돈을 출금함.
 *  			계좌의 모든 금액을 몽땅 출금
 *  		2. synchronized void input() :
 *  			엄마스레드가 호출하여 돈을 입금함.
 *  			10000원이 입금됨.
 *  엄마스레드와 아들스레드를 구현하기
 */
class Account{
	int money;
	synchronized void output(){
		while(money==0){
		try{
			wait();
		}catch(InterruptedException e){}
	}
		System.out.println(Thread.currentThread().getName() + ":"  + money + "원 받았습니다. 감사합니다");
		notify();
		money=0;
//		while(money==0){
//			try{
//				wait();
//			}catch (InterruptedException e){
//				e.printStackTrace();
//			}
//		}
//		notifyAll();
//		System.out.println(Thread.currentThread().getName() + " : " + money + "원 받았습니다 감사합니다.");
//		money=0;
	}
	
	synchronized void input(){
		while(money==10000){
		try{
			wait();
		}catch(InterruptedException e){}
	}
		money=10000;
		System.out.println(Thread.currentThread().getName() + ":" + money + " 받아라");
		notify();
		
	}
}

class Mother extends Thread{
	Account account;
	public Mother(Account account) {
		super("엄마스레드"); //스레드이름 설정
		this.account = account;
	}
	public void run(){
		for(int i=1; i<=10; i++){
			try{
				int sleep = (int)(Math.random()*1000);
				Thread.sleep(sleep); 
			}catch(InterruptedException e){}
			account.input();
		}
	}
	
}
class Son extends Thread{
	Account account;
	public Son(Account account) {
		super("아들스레드");
		this.account = account;
	}
	public void run(){
		for(int i=1; i<=10; i++){
			try{
				int sleep = (int)(Math.random()*1000);
				Thread.sleep(sleep); 
			}catch(InterruptedException e){}
			account.output();
		}
	}
	
}
public class AccountEx {
	public static void main(String[] args) {
		Account account = new Account();
		Thread mother = new Mother(account);
		Thread son = new Son(account);
		mother.start();
		son.start();
		
	}
}
