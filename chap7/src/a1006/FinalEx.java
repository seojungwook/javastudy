package a1006;
/*
 * final 제어자 예제
 * final class(종단클래스) : 상속불가 클래스
 * 						다른 클래스의 부모클래스가 될 수 없다.
 * final method(종단메서드) : 재정의 불가 메서드
 *    					자손클래스에서 오버라이딩 불가
 * final 변수 : 변경 불가 변수 즉, 상수로 만들어짐
 * 			   한번 생성자에서 변경이 가능하다.  =>  객체별로 다른 상수값을 지정
 * 										단, 명시적 초기화 되어서는 안된다.
 */

//final class FinalClass{
 class FinalClass{
	//final void finalmethod() {
	 void finalmethod() {
		System.out.println("오버라이딩 불가");	
	}
}
class SubClass extends FinalClass{
	final int x = 100;
	void finalmethod(){
//		x = 200;
		System.out.println(x);
	}
}
class FinalVal{
//	final int num =1000; 명시적 초기화 X
	final int num;
	FinalVal(int num){  //상수가 생성자에서 변경되어짐 
		this.num = num; 
	}
	void method(){
	//	num=300; //상수이므로 오류발생
		System.out.println(num);
	}
}

public class FinalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass sc = new SubClass();
		sc.finalmethod();
		FinalVal f1 = new FinalVal(10);
		f1.method();
		FinalVal f2 = new FinalVal(20);
		f2.method();
	}
}
