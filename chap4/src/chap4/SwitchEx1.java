package chap4;
/*
 * switch 구문 예제
 * 	switch(조건값){
 * 		case 값1 : 문장1들;
 * 		case 값2 : 문장2들;
 * 		...
 * 		default : 문장n들;
 * }
 * 	break : 해당 switch구문을 벗어남
 * 	조건값으로 사용이 가능한 자료형은 byte, short, int, char, String(jdk 7.0이후) 만 가능하다.
 * 	
 * 	모든 switch 구문은 if문 변경가능하다.
 * 	하지만 모든 if문을 switch 구문으로 변경 되는 것은 아니다.
 */
public class SwitchEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 100;
		switch(score/10){
		case 10:
		case 9 : System.out.println("A학점");
			break;
		case 8 : System.out.println("B학점");
			break;
		case 7 : System.out.println("C학점");
			break;
		case 6 : System.out.println("D학점");
			break;
		default : System.out.println("F학점");
			break;
		}
	}

}
