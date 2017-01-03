package chap3;

import java.util.Scanner;

/*
 * 키보드로부터 초를 입력받아 몇시간 몇분 며초에 해당하는지 출력하기
 * 3751초 : 1시간 2분 31초 출력
 */
public class OpEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("시간입력 : ");
		//System.in : 표준입력객체
		//			  키보드에서 입력된 내용을 저장
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int h = num/3600;
		int m = (num%3600)/60;
		int s = num%60;
	
		System.out.println(h +"시간" + m + "분"+ s+"초" );
	}

}
