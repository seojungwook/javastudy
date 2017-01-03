package a1021;
/*
 * ���󽺷��� : �Ϲݽ������� ���� ������ �ϴ� ������
 * 				�Ϲݽ����尡 �����ϸ� ���󽺷��嵵 �����Ѵ�.
 * 		�������ݷ���(��ǥ��)�� ���󽺷���
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
	public static void main(String[] args) { //���⼭ main�� �Ϲݽ����� 
		Thread t1 = new DaemonThread();
		Thread t2 = new DaemonThread();
		t1.setDaemon(true); //t1�����带 ���󽺷��� ����
		t2.setDaemon(true);
		t1.start(); t2.start();
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){}
		System.out.println("main �޼��� ����");
	}
}
