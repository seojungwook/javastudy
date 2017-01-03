package a1020;
/*
 * Thread �����ϱ�
 * 1. Thread Ŭ������ ��ӹ޾� ����
 * 
 */
class Thread1 extends Thread{
	Thread1(String name){
		super(name); //������ �̸� ����
	}
	public void run(){ //Running ���� : �츮�� �ϴ°� �ƴϰ� Scheduler�� ����
		for(int i=0; i<5; i++){
			//getName() : ������ �̸��� ����
			System.out.println(i+ "=" +getName());
			try{
				sleep(1000); //1�ʰ� ������ ���� //Blocked(���) ����
			}catch(InterruptedException e){}
		}
	} // run �޼��� ���� : Dead ����
}
public class ThreadEx1 {
	public static void main(String[] args) { //main�� ���������� Thread
		Thread1 t1 = new Thread1("First"); //New ����
		Thread1 t2 = new Thread1("Second"); //New ����
		t1.start(); //Runnable ����
		t2.start(); //Runnable ����
		/*
		 * 1. ������ ����ȭ ��Ŵ(������ ����)
		 * 2. run() ȣ��
		 */
	//	t1.run(); //������ ���������� ������ȯ���� �ƴ�
		System.out.println("Main �޼��� ����");
	}
}
