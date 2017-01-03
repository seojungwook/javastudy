package a1012;
/*
 * switch 구문 조건값으로 사용가능한 자료형
 * 
 * byte     ==>  Byte
 * short	==>  Short
 * int		==>  Integer
 * char		==>  Character
 * String
 * 
 * Collection에서 가장 많이 사용
 */
public class WrapperEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = 1;
		switch(b){
			case 1 : System.out.println("성공"); break;
			default : System.out.println("실패");
		}
	}
}
