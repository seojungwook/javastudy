package a1021;
/*
 * interrupt() �޼���
 */
class InterruptThread extends Thread{
	public void run(){
		System.out.println("���ݺ��� �ڴ� ���Դϴ�.");
		System.out.println("������ ������");
		try{
			sleep(1000000);
		}catch(InterruptedException e){
			System.out.println("������?");
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
		t.interrupt(); //t������� InterruptedException ���ܰ� �߻�
	}
}
