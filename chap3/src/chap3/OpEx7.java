package chap3;

import java.util.Scanner;

/*
 * 연습문제 3-2 74p
 * 콘솔에서 사과의 수를 입력받아서 필요한 바구니 수를 구하기
 */
public class OpEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("사과의 수를 입력하세요 : ");
		//System.in : 표준입력객체
		//			  키보드에서 입력된 내용을 저장	
		Scanner scan = new Scanner(System.in);
		int numOfApples = scan.nextInt();
		int sizeOfBucket = 10;
		int numOfBucket= (numOfApples / sizeOfBucket) + (((numOfApples % sizeOfBucket)==0)?0:1);
		System.out.println("필요한 바구니의 수 :" + numOfBucket);
		
	}

}
