package chap3;

import java.util.Scanner;

/*
 * �������� 3-2 74p
 * �ֿܼ��� ����� ���� �Է¹޾Ƽ� �ʿ��� �ٱ��� ���� ���ϱ�
 */
public class OpEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("����� ���� �Է��ϼ��� : ");
		//System.in : ǥ���Է°�ü
		//			  Ű���忡�� �Էµ� ������ ����	
		Scanner scan = new Scanner(System.in);
		int numOfApples = scan.nextInt();
		int sizeOfBucket = 10;
		int numOfBucket= (numOfApples / sizeOfBucket) + (((numOfApples % sizeOfBucket)==0)?0:1);
		System.out.println("�ʿ��� �ٱ����� �� :" + numOfBucket);
		
	}

}
