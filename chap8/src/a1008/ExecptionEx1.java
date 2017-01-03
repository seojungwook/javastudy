package a1008;
/*
 * 예외처리 : 발생된 예외를 제거
 * 	try catch 구문
 * 		try 블럭 : 예외발생할 수 있는 영역
 * 		catch 블럭 : 예외처리 영역( 예외가 발생하지 않는다면 이 블럭은 실행되지 않아)
 * 
 * 기본적으로 자바에서는 예외처리가 필수다.
 * 단 RuntimeException인 경우는 예외처리 생략이 가능
 */
public class ExecptionEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(1);
		try{ // try블럭
	//	System.out.print(2/0); //ArithmeticException 예외객체 발생
		System.out.print(2); //예외객체 발생되지 않으면 1235.
		System.out.print(3);
		} catch (ArithmeticException e){
		System.out.print(4);
		}
		System.out.print(5);
		System.out.println();
	}

}
