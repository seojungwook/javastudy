package chap4;

import java.util.Scanner;

/*
 * switch ������ �̿��Ͽ� �ý��۰� ���������������ϱ�
 * 
 */
public class switchEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int srp; //�ý����� ���� ����������
		//����(1), ����(2), ��(3) ������ ���� �����
		/*
		 * ������ �� ����(���� �߻� �޼���)
		 * 		0 <= Math.random()   < 1.0
		 * 		0 <= Math.random()*3 < 3.0 
		 * 		0 <= (int)Math.random()*3 < 3    ���� �����༭ ������ ���� 0,1,2 
		 * 	+1 ���༭ srp : 1,2,3�� ���� ���´�.
		 * 
		 */
		srp = (int)(Math.random() * 3) + 1;
		System.out.println("����(1), ����(2), ��(3)�� ���ڷ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int mySrp = scan.nextInt();
		boolean win = false; //true���� ���� �¸�
		System.out.print("�ý��� : " + srp + ", �� : " + mySrp);
		
		if(mySrp == srp)
			System.out.println(" \t�����ϴ�");
		else{
			switch(srp){
			case 1 : 
				if(mySrp==2) win = true; break;
			case 2 : 
				if(mySrp==3) win = true; break;
			case 3 : 
				if(mySrp==1) win = true; break;
			}
			
			if (win)
				System.out.println(" \t���� �¸�!");
			else
				System.out.println(" \t�ý��� �¸�");
			
		}
	}

}
