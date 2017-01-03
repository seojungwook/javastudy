package a1008;

public class ExceptionEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
		
	}

	private static void method1() {
		// TODO Auto-generated method stub
		try {
			method2();
		} catch (Exception e) {
			System.out.println("method1() 예외처리");
		}
	}

	private static void method2() throws Exception {
		// TODO Auto-generated method stub
		try {
			throw new Exception("예외 처리 하기");
		} catch (Exception e) {
			System.out.println("method2() 예외처리");
			throw e;  //예외 되던지기
		}
	}

}
