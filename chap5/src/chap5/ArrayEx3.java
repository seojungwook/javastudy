package chap5;

import java.util.Scanner;

/*
 *  10명 학생의 점수를 키보드로 입력받아
 *  점수 목록과 모든 점수의 총점, 평균을 출력하기
 */
public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		Scanner scan = new Scanner(System.in);
		int score[] = new int[5];
		for(int i=0; i<score.length; i++){
			System.out.print((i+1)+"번 학생 점수:");
			score[i] = scan.nextInt();
			total += score[i];
			
		}
			System.out.println("평균:"+(double)total/score.length);
			System.out.println("================================");
			System.out.print("점수 : ");
				for(int i =0;i<score.length; i++){
					System.out.print(score[i]+"\t");
				}
				System.out.println("\n================================");
			System.out.println("총점:" + total);
	}

}
