package chap3;

import java.util.Scanner;

/*
 * �������� 3-4 75p
 * 
 * �������� 3-5 	 
 */
public class OpEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���ڸ� ������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int num =scan.nextInt();
		
		System.out.println((num/100)*100);
		System.out.println(num - (num%100));
		System.out.println("�����ڸ��� 1�� �����ϱ�");
		System.out.println((num/10)*10+1);
	}

}
