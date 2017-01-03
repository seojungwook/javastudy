package chap4;
/*
 * if, else if 구문
 * 
 * 조건식은 반드시 결과가 boolean이어야 한다.
 */

import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//90점 이상이면 A ... 60미만이면 F 출력
		int score = 90;
		if(score>=90) 
			System.out.println("A학점");
		else if(score>=80)
			System.out.println("B학점");
		else if(score>=70)
			System.out.println("C학점");
		else if(score>=60)
			System.out.println("D학점");
		else 
			System.out.println("F학점");
		
		//임의의 문자를 입력받아서 대문자면 대문자입니다.
		//소문자면 소문자입니다.
		//숫자면 숫자입니다.
		//그 외의 문자면 기타문자입니다. 출력
		System.out.println("문자입력");
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
		System.out.print(ch + "는 ");
		
		if(ch>= 'A' && ch<='Z')
			System.out.println("대문자입니다");
		else if(ch>='a' && ch<='z')
			System.out.println("소문자입니다");
		else if(ch>='0' && ch<='9')
			System.out.println("숫자입니다");
		else
			System.out.println("기타문자입니다");
		
	}

}
