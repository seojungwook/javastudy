package a1008;
/*
 * 다중 catch 구문 예제
 * 발생된 예외별로 다른 구문을 실행 할 수 있다.
 * 
 * catch 구문의 순서는 자손Exception  =>  부모Exception 순으로 배치해야 한다.
 * 예외처리에서는 예외처리의 최상위 클래스인 Exception 타입이 최하단에 배치되어야 한다.
 * 
 * Exception 클래스 : 모든 예외클래스의 부모클래스다.
 * 					모든 예외클래스는 Exception 클래스를 상속받는다.
 * 					모든 에외 클래스는 Exception 타입으로 형변환이 가능하다.
 */
public class ExceptionEx2 {
	public static void main(String[] args){
		System.out.println(1);
		try{
			//ArrayIndexOutOfBoundsException 예외발생
			System.out.println(args[0]); // args 에 test 넣어줌
			
			//ArithmeticException 예외발생
			System.out.println(2/1);
			
			//NumberFormatException 예외발생
			System.out.println(Integer.parseInt("g2"));
			String s = null;
			System.out.println(s.trim()); //nullPointerException 예외 발생
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("명령실행시 값을 입력하세요");
		} catch(ArithmeticException e){
			System.out.println("0으로 나누지 마세요");
		} catch(NumberFormatException e){
			System.out.println("숫자만 입력하세요");
		} catch(Exception e){ 					 // 맨 밑에 위치@
			System.out.println("전산부 연락 요망");
		}
		System.out.println(4);
	}
}
