package a1012;

import java.util.Scanner;

/*
 * �������� ���Ƹ��� �� 1000 ���� �ٸ��� �� 4000 ���ϸ� �����Ͽ� �Է¹޴´�.
 * �ϳ��� ����� ���� �Ŀ��� ��� ���ο� �Է��� �޴ٰ� 0�� �ԷµǸ� ���α׷��� �����Ѵ�
 * 
 * �������� ���Ƹ��� �հ� �ٸ��� ���� �Է¹޾� �������� ���Ƹ��� ���� �� ���������� 
 * ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �������� ���Ƹ��� ���� �� ���������� ����Ѵ�.
 * �־��� �����ͷ� �������� ���� �� ���� ���� "0"�� ����Ѵ�.
 * �������� ũ�Ⱑ �־��� ������ ��� ���� "INPUT ERROR!"�� ����Ѵ�.
 * 
 */
public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum, suml;
		boolean chk = false;
		Scanner scan = new Scanner(System.in);
		while(true){
			chk = false;
			System.out.println("�������� ���Ƹ��� ��");
			sum = scan.nextInt();
			if(sum==0)break;
			if(sum >1000){
				System.out.println("INPUT ERROR!");
				continue;
			}
			System.out.println("�������� ���Ƹ� �ٸ� ��");
			suml = scan.nextInt();
			if(suml==0) break;
			if(suml >4000) {
				System.out.println("INPUT ERROR!");
				continue;
			}
			for(int i=0; i<=sum; i++){
				for(int j=0; j<sum-1; j++){
					if(i+j ==sum){
						if(((i*4)+(j*2))==suml){
							System.out.println("��������:"+i+ "���Ƹ���:"+ j);
							chk=true;
					}
					}
				}
			}
			if(!chk)
				System.out.println("�������� 0, ���Ƹ� 0");
		}
	}

}
