package chap5;

import java.util.Scanner;

/*
 * ���� ���߱� ����
 * �ý����� 4�ڸ��� ���� �ٸ� ���� ������ �� ����ڰ� 
 * ����� ���� ���ߴ� ����
 * 		�ڸ����� �´� ��� �� ��Ʈ����ũ
 * 		�ڸ����� Ʋ������ ���ڰ������ϸ� : ��
 * 		4��Ʈ����ũ�� �Ǹ� ����
 * 	�˰���
 * 	1. �ý����� ���� ����(Random�Լ� ���) �ߺ� ����
 * 	2. ȭ�����κ��� 4�ڸ� ������ �Է�
 * 	3. �ý����� ���� �Էµ� ���� ���Ͽ� ��Ʈ����ũ�� ���� ����, ȭ�� ���
 * 	4. 4��Ʈ����ũ�� �� ������ 2,3�� ��� ����
 * 	5. ������ �� ��� ������� ������ ������� �Է�Ƚ���� ȭ�鿡 ����ϱ�
 * 
 */
public class ArrayEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base[] = new int[4];
		int ran[] = {0,1,2,3,4,5,6,7,8,9};
		int imp[] = new int[4];
		int cnt = 0, mok =0;
		//int im1=0;
		int strike=0, ball=0;
		
		for(int i=0; i<1000;i++){
			int index = (int)(Math.random()*10);
			int temp = ran[0];
			ran[0] = ran[index];
			ran[index] = temp;
		}
		for(int i=0; i<4;i++){
			base[i] = ran[i];
		}
		for(int i=0; i<4; i++)
		System.out.print(base[i]);
		//System.out.print("\n���� �ٸ� 4�ڸ� ���� �Է��ϼ���");
		System.out.println();
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("���� �ٸ� 4�ڸ� ���� �Է��ϼ���");
			int num = scan.nextInt();
			cnt++;
			imp[0] = num /1000;
			imp[1] = (num%1000) /100;
			imp[2] = (num%100)/10;
			imp[3] = num%10;
			strike = 0;
			ball = 0;
			for(int i =0; i<4;i++){
				for(int j=0; j<4;j++){
					if(imp[i]==base[j]){
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
				(String.format("%04d", num)+ " : " + strike + "��Ʈ����ũ, " + ball + "��\n");
			
		}
		/*int im= scan.nextInt();
		int op = im;
		for(int i=3; i<0; i--){
			imp[i]= im%10;
			im/=10;
		}
		for(int i=0; i<4; i++ ){
			if(base[i]==imp[i]){
				cnt1++;
			}
		}
		for(int i=0; i<1; i++){
			
			if(base[i]%10==im%10){
				cnt1++;
				mok=base[i]%10;
				im1=im;
			}
			if(mok%10== im1%10)cnt1++;{
				cnt1++;
				mok=base[i]%10;
				im1=im;
			}
			if(mok%10== im1%10)cnt1++;{
				cnt1++;
				mok=base[i]%10;
				im1=im;
			}
		
			
				/*if()
				for(int j=0; j<2; j++){
				if(base[j]%100== )
				}
		}
	System.out.println(cnt1);*/
			
	}

}
