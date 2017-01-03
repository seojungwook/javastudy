package chap3;

import java.util.Scanner;

/*
 * 연습문제 3-4 75p
 * 
 * 연습문제 3-5 	 
 */
public class OpEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("세자리 정수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num =scan.nextInt();
		
		System.out.println((num/100)*100);
		System.out.println(num - (num%100));
		System.out.println("일의자리를 1로 변경하기");
		System.out.println((num/10)*10+1);
	}

}
