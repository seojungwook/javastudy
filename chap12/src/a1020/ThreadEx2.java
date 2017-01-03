package a1020;
/*
 * Tread ���� 2
 * 2. Runnable �������̽��� �����Ͽ� �����ϱ�
 * 	=> ����Ŭ������ Thread Ŭ������ �ƴ�.
 * 		Thread ��ü�� ������ ��, ����Ŭ������ü�� �����ڿ� ����
 * 		=> Thread�� ����Ŭ������ run()�޼��带 Thread�� run�޼���� ������.
 */
class Runnable1 implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<5; i++){
			//Thread.currentThread() : ���� �������� Thread ��ü�� ����(�츮���� �Ѱ���)
			System.out.println(i + "="+ Thread.currentThread().getName());
			try{
				Thread.sleep(1000); //Ŭ�����޼���, Threadex1�� Thread�� ��ӹ޾Ƽ� �Ⱦ�
			} catch(InterruptedException e){}
		}
	}
	
}
public class ThreadEx2 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Runnable1 r = new Runnable1();
		Thread t1 = new Thread(r,"First"); //New ���� , ������ ��ü�� ������ִ� ����
		Thread t2 = new Thread(r,"Second"); //New ����
		t1.start(); t2.start();
		System.out.println("Main �޼��� ����");
	}
}
