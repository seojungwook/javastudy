package chap3;
/*
 *  삼항 연산자 : 피연산자의 갯수가 세개인 연산자
 *  조건연산자  : (조건식)?참:거짓  =>  조건문으로 변경 가능(if, else)
 */
public class OpEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=100, y=20;
		System.out.println("두수 중 더 큰수는 =" + ((x>y)?x:y));
		System.out.println("두수 중 더 작은 수는 =" + ((x<y)?x:y));
		// 문제 : score 60이상이면 합격, 그렇지 않으면 불합격
		// 단 조건연산자를 사용하기
		int score=50;
		System.out.println((score>=60)?"합격":"불합격");
		// 문제2 : num 값이 양수, 음수, 0 출력하기
		int num = 50;
		System.out.println((num>0)?"양수":(num<0)?"음수":0);
		/* 문제3 : score가 90이상이면 "A학점"
		 * 				80이상이면 "B힉점"
		 * 				70이상이면 "C학점"
		 * 				60이상이면 "D학점"
		 * 				아니면 "F학점"
		 */
		System.out.println((score>=90)?"A학점":(score>=80)?
				"B학점":(score>=70)?"C학점":(score>=60)?"D학점":"F학점");
		
	}

}
