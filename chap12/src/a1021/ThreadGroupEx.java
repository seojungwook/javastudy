package a1021;
/*
 * ������ �׷� ���� : �����ִ� Thread�� �׷쿡 ����
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
		//Thread.currentThread() : ���� �������� Thread ��ü ����(���⼭�� main Thread)
		Thread t4 = new MyThread(Thread.currentThread().getThreadGroup(),"Four");
		t1.start();t2.start();t3.start();t4.start();
		tg.list(); //tg ������׷쿡 ���� ������ ���
		try{
			Thread.sleep(1000); //1��
		}catch(InterruptedException e){}
		tg.stop(); //tg ������׷��� �����带 ���� ����
	}
}
