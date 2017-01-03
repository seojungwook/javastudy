package a1020;
/*
 * ���� 1���� 1000������ ���� ���ϴ� Thread�� �����ϱ�
 * Thread Ŭ������ ��ӹ޾� SumThread �� �����ϱ�.
 * SumThreadŬ����
 * 		��� ���� : startNum, endNum, sum
 * 		����޼��� : run()
 * 			  ��� : startNum, endNum ���� ���ϴ� ���
 *  ���� Ŭ�������� 
 *  	ù��° SumThread ��ü�� 1~ 200 ������ ��
 *  	�ι�° SumThread ��ü�� 201~400������ ��
 *  	����° SumThread ��ü�� 401~600������ ��
 *  	�׹�° SumThread ��ü�� 601~800������ ��
 *  	�ټ���° SumThread ��ü�� 801~1000������ ��
 *  
 *  	main�� ���������� 5���� Thread�� ���� ���
 *  	join() �޼��� ����ϱ� : 
 *  		t1.join() :t1 �����尡 ����ñ��� main�޼��尡 ���
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
		System.out.println(startNum + "����" + endNum +"������ �� : " +sum);
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
		s1.start();s1.join(); //s1.start �����ϰ� ���
		s2.start();s2.join();
		s3.start();s3.join();
		s4.start();s4.join();
		s5.start();s5.join();
			
		System.out.println("���� : "+ (s1.sum + s2.sum+ s3.sum+ s4.sum + s5.sum));
		
		SumThread[] t= new SumThread[5];
		for(int i=0;i<t.length;i++){
			t[i] = new SumThread(i*200+1, (i+1)*200);
			t[i].start();
		}
		for(int i=0; i<t.length;i++)
			t[i].join();
		System.out.print("1~1000������ �� : ");
		int sum = 0;
		for(int i=0; i<t.length; i++)
			sum +=t[i].sum;
		System.out.println(sum);
	}
}
