package chap5;

import java.util.Scanner;

/*
 *  10�� �л��� ������ Ű����� �Է¹޾�
 *  ���� ��ϰ� ��� ������ ����, ����� ����ϱ�
 */
public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		Scanner scan = new Scanner(System.in);
		int score[] = new int[5];
		for(int i=0; i<score.length; i++){
			System.out.print((i+1)+"�� �л� ����:");
			score[i] = scan.nextInt();
			total += score[i];
			
		}
			System.out.println("���:"+(double)total/score.length);
			System.out.println("================================");
			System.out.print("���� : ");
				for(int i =0;i<score.length; i++){
					System.out.print(score[i]+"\t");
				}
				System.out.println("\n================================");
			System.out.println("����:" + total);
	}

}
