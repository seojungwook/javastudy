package chap5;

/*
 * �߱�����
 */
import java.util.Scanner;

public class ArrayEx7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numarr[]={0,1,2,3,4,5,6,7,8,9};
		int answer[] = new int[4]; //��������
		int rcvData[] = new int[4]; //������Է�����
		int strike,ball,cnt=0;
		//�ý����� ���� ���� : answer �� ����
		for(int i=0; i<10000;i++){
			int index = (int)(Math.random()*10);
			int temp= numarr[0];
			numarr[0]=numarr[index];
			numarr[index]=temp;
		}
		for(int i=0;i<4;i++)
			answer[i]=numarr[i];
		
//		  for(int a : answer)
//		  System.out.print(a);
//		  System.out.println();
		 
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("���� �ٸ� 4�ڸ� ���� �Է��ϼ���");
			int num = scan.nextInt();
			cnt++; //�Է½��� �� 
			rcvData[0] = num /1000;
			rcvData[1] = (num%1000) /100;
			rcvData[2] = (num%100)/10;
			rcvData[3] = num%10;
			//3. ��Ʈ����ũ ��, �� ���� ����
			strike = 0;
			ball = 0;
			for(int i =0; i<4;i++){
				for(int j=0; j<4;j++){
					if(rcvData[i]==answer[j]){
						if(i==j)strike++;
						else ball++;
						break;
					}
				}
			}
			if(strike==4){
				System.out.println(num+"�����Դϴ�.");
				System.out.println(cnt +"������ ���߼̽��ϴ�. ������ �����մϴ�.");
				break;
			} else
				System.out.println
				//ù��° �ڸ����� 0���� ������ �ϱ� ����
				//%04d 4�ڸ� ���ε� num�� 4�ڸ��� �ȵǸ� �տ� 0�� ä����
				(String.format("%04d", num)+ " : " + strike + "��Ʈ����ũ, " + ball + "��\n");
		}
	}
}
				
		
			
		
	


