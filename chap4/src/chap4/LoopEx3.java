package chap4;

import java.util.Scanner;

/*
 * 키보드로부터 점수를 입력 받아 점수의 합계와 평균을 출력
 * 입력된 점수가 999수가 입력되면 합계와 평균을 출력 한 후 프로그램 종료
 */
public class LoopEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0, tot= 0, cnt= 0;
		double avg= 0;
		System.out.println("점수를 입력하세요, 종료(999) : ");
		Scanner scan = new Scanner(System.in);
		while(score !=999){
			score = scan.nextInt();
			if(score!=999){
			tot += score;
			cnt++;
			}
		}
		//평균구하기
		avg = (double)tot/cnt;
		System.out.println("합계 : " + tot);
		System.out.println("평균 : " + avg);
	}

}
