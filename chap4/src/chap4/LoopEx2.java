package chap4;
/*
 *  1���� 100������ ���� ���ϱ�
 */
public class LoopEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for���� �̿��ϱ�
		int i, sum=0;
		System.out.print("for��  : 1~100������ �� : ");
		for(i=1;i<=100;i++){
			sum += i;
		}
		System.out.println(sum);
		sum = 0;
		i=1;
		
		System.out.print("while�� : 1~100������ �� : ");
		while(i<=100){
			sum += i;
			i++;
		}
		System.out.println(sum);
		sum = 0;
		i=1;
		System.out.print("do while�� : 1~100������ �� : ");
		do{
			sum +=i;
			i++;
		}while(i<=100);
		System.out.println(sum);
		
		
		System.out.print("for��  : 1~100������ ¦���� �� : ");
		sum = 0;
		for(i=2;i<=100;i++){
			if(i%2==0){
				sum += i;
			}
		}
		System.out.println(sum);
		
		System.out.print("for��  : 1~100������ Ȧ���� �� : ");
		sum = 0;
		for(i=1;i<=100;i++){
			if(i%2==1){
				sum += i;
			}
		}
		System.out.println(sum);
		//���� : 1���� 100���� �� �� 2�� ����� �ƴϰ� 3�� ����� �ƴ� ���� ��
		System.out.print("1���� 100���� �� �� 2�� ����� �ƴϰ� 3�� ����� �ƴ� ���� �� : ");
		sum =0;
		for(i=1;i<=100;i++){
			if(i%2!=0 && i%3!=0 )
				sum+=i;
		}
		System.out.println(sum);
		
		System.out.print("1���� 100���� �� �� 2�� ����� �ƴϰ� 3�� ����� �ƴ� ���� �� : ");
		sum=0;
		for(i=1;i<=100;i++){
			if(i%2==0) continue;
			if(i%3==0) continue;
			sum+= i;
		}
		System.out.println(sum);
	}
}
		


