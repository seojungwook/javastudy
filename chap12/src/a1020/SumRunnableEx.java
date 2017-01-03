package a1020;
/*
 * SumThreadEx 프로그램의 스레드 생성 방식을 
 * Runnable 인터페이스 구현 방식으로 변경하여 출력하기
 * SumRunnable 클래스 
 * 		멤버변수 : startNum, endNum, sum;
 * 		멤버메서드 : run()
 * 		  	  기능 : startNum 부터 end까지의 합을 sum 저장
 * 	구동클래스
 * 		main은 모든 스레드가 종료까지 대기하다가 
 * 		전체합을 출력하기
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
		
		System.out.println("총합 : " +(sr1.sum + sr2.sum + sr3.sum + sr4.sum+ sr5.sum));
	}

}
