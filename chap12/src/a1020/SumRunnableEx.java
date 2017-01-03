package a1020;
/*
 * SumThreadEx ���α׷��� ������ ���� ����� 
 * Runnable �������̽� ���� ������� �����Ͽ� ����ϱ�
 * SumRunnable Ŭ���� 
 * 		������� : startNum, endNum, sum;
 * 		����޼��� : run()
 * 		  	  ��� : startNum ���� end������ ���� sum ����
 * 	����Ŭ����
 * 		main�� ��� �����尡 ������� ����ϴٰ� 
 * 		��ü���� ����ϱ�
 */
class SumRunnable implements Runnable{
	int startNum, endNum, sum;
	
	SumRunnable(int startNum, int endNum){
		this.startNum = startNum;
		this.endNum = endNum;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=startNum; i<=endNum; i++){
			sum +=i;
		}
	}
	
}
public class SumRunnableEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SumRunnable sr1 = new SumRunnable(1,200);
		SumRunnable sr2 = new SumRunnable(201,400);
		SumRunnable sr3 = new SumRunnable(401,600);
		SumRunnable sr4 = new SumRunnable(601,800);
		SumRunnable sr5 = new SumRunnable(801,1000);
		Thread t1 = new Thread(sr1);
		Thread t2 = new Thread(sr2);
		Thread t3 = new Thread(sr3);
		Thread t4 = new Thread(sr4);
		Thread t5 = new Thread(sr5);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
		
		System.out.println("���� : " +(sr1.sum + sr2.sum + sr3.sum + sr4.sum+ sr5.sum));
	}

}
