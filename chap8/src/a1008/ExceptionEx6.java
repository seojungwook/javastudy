package a1008;
/*
 * throws : try 구문 이외의 또 다른 예외처리
 * 			나를 호출한 메서드에 예외 전달( 나를 호출한 놈한테 던져 )
 * 			cf. main 호출은 JVM
 */
public class ExceptionEx6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		method1();
	}

	private static void method1() throws Exception{
		// TODO Auto-generated method stub
		method2();
	}

	private static void method2() throws Exception {
		throw new Exception("throws로 예외처리하기");
	}
}
