package a1021;
/*
 * ������ �켱���� : �����ٷ����� ���� ������ ����
 * �켱���� : 1 ~ 10���� ���� ����
 * 			 10 : �ְ� �켱����
 * 			 1  : ���� �켱����
 */
class ThreadPriority extends Thread {
	ThreadPriority () {}
	ThreadPriority (int p) {
		setPriority(p); //�켱����
	}
	public void run() {
		for(int i=0; i<50; i++){
			System.out.println(this.toString()); //Thread�� �ִ� toString �޼��� ȣ��
			/*
			 * Thread[Thread-1,10,main] : Thread ���ǵ� toString() ���
			 * Thread-1 : ������ �̸�
			 * 		10  : �켱����
			 * 	   main : ������ �׷�
			 */
			try{
				sleep(100);
			}catch (InterruptedException e){}
		}
	}
}
public class PriorityEx {
	public static void main(String[] args) {
		System.out.println("�ּҿ켱����:" + Thread.MIN_PRIORITY);
		System.out.println("�ִ�켱����:" + Thread.MAX_PRIORITY);
		System.out.println("�⺻�켱����:" + Thread.NORM_PRIORITY);
		System.out.println();
		Thread t1 = new ThreadPriority(); //5 - �⺻
		Thread t2 = new ThreadPriority(10); //10 - �ְ�
		Thread t3 = new ThreadPriority(2); //2 - ����
		t1.start(); t2.start(); t3.start();
		
		
	}
}
