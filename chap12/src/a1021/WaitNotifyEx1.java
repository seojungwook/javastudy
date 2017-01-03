package a1021;
/*
 * ������ ������, �Һ��� ������
 * wait(), notify(), notifyAll()
 * 1. ����ȭ ���������� ����� ������
 * 2. Object Ŭ������ ��� �޼���
 * 3. wait() : ���� �������� �����带 �����·�.
 * 				�ɷ��ִ� lock�� ������
 * 				notify(), notifyAll() �޼���� �����¿��� ������
 * 	notify() : �������� ������ �� �Ѱ��� ���డ�� ���·�
 * 				�ý��ۿ� ���ؼ� ���� ��� �����尡 ����
 *  notifyAll() : �������� ������ ��θ� ���డ�� ���·�
 * 
 * 
 */
class ATM implements Runnable {
	private long money = 10000;
	public void run(){
		synchronized(this){ //�� ��ü�� lock���� ���°�
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
			System.out.println(Thread.currentThread().getName() + ", �ܾ�:" +money);
		}else {
			System.out.println(Thread.currentThread().getName() + "�ܾ׺���");
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
