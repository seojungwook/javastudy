package a1008;
class MyException2 extends RuntimeException{ //RuntimeException을 상속받아서 예외처리 안하고.
	MyException2(){
		super("내가 만든 예외 객체");
	}
}
public class ExceptionEx10 {
	static boolean isException(){
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
		System.out.println("프로그램 정상 종료");
	}
	private static void method1() {
		// TODO Auto-generated method stub
		if(isException())
			//예외처리안하고 실행 되도록 프로그램 수정
			throw new MyException2();
	}

}
