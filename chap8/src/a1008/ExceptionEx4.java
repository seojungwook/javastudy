package a1008;
/*
 * throw : 예외 발생
 * 	try 구문은 예외처리( 제거 ) 기능이고, 
 * 	throw는 예외 발생시키는 기능을 가진다.
 */
public class ExceptionEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Exception e = new Exception("고의로 예외 발생");//예외객체 발생
			throw e; //JVM 통지
		} catch(Exception e){
			System.out.println("예외메시지 : "+ e.getMessage());
			// 예외 발생 경로 출력
			e. printStackTrace();
		}
		
		System.out.println("프로그램 정상 종료");
	}

}
