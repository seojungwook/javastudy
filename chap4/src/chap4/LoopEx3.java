package chap4;

import java.util.Scanner;

/*
 * Ű����κ��� ������ �Է� �޾� ������ �հ�� ����� ���
 * �Էµ� ������ 999���� �ԷµǸ� �հ�� ����� ��� �� �� ���α׷� ����
 */
public class LoopEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0, tot= 0, cnt= 0;
		double avg= 0;
		System.out.println("������ �Է��ϼ���, ����(999) : ");
		Scanner scan = new Scanner(System.in);
		while(score !=999){
			score = scan.nextInt();
			if(score!=999){
			tot += score;
			cnt++;
			}
		}
		//��ձ��ϱ�
		avg = (double)tot/cnt;
		System.out.println("�հ� : " + tot);
		System.out.println("��� : " + avg);
	}

}
