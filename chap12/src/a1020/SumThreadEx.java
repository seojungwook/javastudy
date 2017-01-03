package a1020;
/*
 * 문제 1부터 1000까지의 합을 구하는 Thread를 생성하기
 * Thread 클래스를 상속받아 SumThread 를 생성하기.
 * SumThread클래스
 * 		멤버 변수 : startNum, endNum, sum
 * 		멤버메서드 : run()
 * 			  기능 : startNum, endNum 합을 구하는 기능
 *  구동 클래스에서 
 *  	첫번째 SumThread 객체는 1~ 200 까지의 합
 *  	두번째 SumThread 객체는 201~400까지의 합
 *  	세번째 SumThread 객체는 401~600까지의 합
 *  	네번째 SumThread 객체는 601~800까지의 합
 *  	다섯번째 SumThread 객체는 801~1000까지의 합
 *  
 *  	main은 최종적으로 5개의 Thread의 합을 출력
 *  	join() 메서드 사용하기 : 
 *  		t1.join() :t1 스레드가 종료시까지 main메서드가 대기
 *  
 */
class SumThread extends Thread{
	int startNum;
	int endNum;
	int sum;
	SumThread(int startNum, int endNum){
		this.startNum = startNum;
		this.endNum = endNum;
	}
	public void run(){
		for(int i=startNum; i<=endNum; i++){
			sum += i;
			}
		System.out.println(startNum + "부터" + endNum +"까지의 합 : " +sum);
	} 
}
public class SumThreadEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SumThread s1 = new SumThread(1,200);
		SumThread s2 = new SumThread(201,400);
		SumThread s3 = new SumThread(401,600);
		SumThread s4 = new SumThread(601,800);
		SumThread s5 = new SumThread(801,1000);
		s1.start();s1.join(); //s1.start 실행하고 대기
		s2.start();s2.join();
		s3.start();s3.join();
		s4.start();s4.join();
		s5.start();s5.join();
			
		System.out.println("총합 : "+ (s1.sum + s2.sum+ s3.sum+ s4.sum + s5.sum));
		
		SumThread[] t= new SumThread[5];
		for(int i=0;i<t.length;i++){
			t[i] = new SumThread(i*200+1, (i+1)*200);
			t[i].start();
		}
		for(int i=0; i<t.length;i++)
			t[i].join();
		System.out.print("1~1000까지의 합 : ");
		int sum = 0;
		for(int i=0; i<t.length; i++)
			sum +=t[i].sum;
		System.out.println(sum);
	}
}
