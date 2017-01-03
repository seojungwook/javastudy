package chap4;
/*
 *  조건문 if 예제
 *  if(조건식){
 *  	문장 <= 조건식의 결과가 참인 경우만 실행
 *  }
 */
public class IfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// score가 60이상인 경우 합격
		int score = 60;
		if(score>=60){ 
			System.out.println("합격을 축하합니다");
		} else {
			System.out.println("불합격");
		}
		//조건연산자로 변경
		System.out.println((score>=60)?"합격을 축하합니다":"불합격");
		System.out.println("프로그램 종료");
	}

}
