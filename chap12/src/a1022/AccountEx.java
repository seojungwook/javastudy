package a1022;
/*
 *  ����������� �Ƶ齺���尡 �ϳ��� ���¸� �����Ѵ�.
 *  ���¿� �ݾ��� 0�̸� �Ƶ齺����� wait() ���·�
 *  ���������忡�� �Ա��� ��û�մϴ�.
 *  ����������� ���¿� �ݾ��� 0���� ũ�� wait() ����
 *  ���� ���� ��쿡�� ���� �Ա��Ѵ�.
 *  �� ����������� �Ƶ齺����� �ұ�Ģ�ϰ� sleep�Ѵ�.
 *  �Ƶ齺����(0 ~ 200) sleep
 *  ����������(0 ~ 3000) sleep
 *  Account Ŭ���� : ����class
 *  	������� : money;
 *  	����޼��� 
 *  		1. synchronized void output() :
 *  			�Ƶ齺���尡 ȣ���Ͽ� ���� �����.
 *  			������ ��� �ݾ��� ���� ���
 *  		2. synchronized void input() :
 *  			���������尡 ȣ���Ͽ� ���� �Ա���.
 *  			10000���� �Աݵ�.
 *  ����������� �Ƶ齺���带 �����ϱ�
 */
class Account{
	int money;
	synchronized void output(){
		while(money==0){
		try{
			wait();
		}catch(InterruptedException e){}
	}
		System.out.println(Thread.currentThread().getName() + ":"  + money + "�� �޾ҽ��ϴ�. �����մϴ�");
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
//		System.out.println(Thread.currentThread().getName() + " : " + money + "�� �޾ҽ��ϴ� �����մϴ�.");
//		money=0;
	}
	
	synchronized void input(){
		while(money==10000){
		try{
			wait();
		}catch(InterruptedException e){}
	}
		money=10000;
		System.out.println(Thread.currentThread().getName() + ":" + money + " �޾ƶ�");
		notify();
		
	}
}

class Mother extends Thread{
	Account account;
	public Mother(Account account) {
		super("����������"); //�������̸� ����
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
		super("�Ƶ齺����");
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
