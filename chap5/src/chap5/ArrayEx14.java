package chap5;

import java.util.Scanner;

/*
 * command line에서 숫자 산술연사자 숫자를 입력받아 결과 산출하기
 * 산술연산자는 +,-,x,/,%만 사용
 * Integer.parseInt("123") => 정수형 123 변환됨
 */
public class ArrayEx14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length != 3){
			System.out.println("다시 실행 하세요");
			return;
		}
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[2]);
		int result=0;
		//args[1]에 의해서 결과를 산출하기
		
		for(String s : args)
			System.out.print(s+" ");
		System.out.print("= ");
		switch(args[1]){
			case"+":
				result=a+b; break;
			case"-":
				result=a+b; break;
			case"x":
				result=a+b; break;
			case"/":
				result=a+b; break;
			case"%":
				result=a+b; break;
		}
		
	
		System.out.println( result);
	}

}
