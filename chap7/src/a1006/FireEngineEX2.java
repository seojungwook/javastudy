package a1006;
/*
 * ClassCastExpeption : 참조변수와 객체의 관계에 문제 발생시 발생되는 예외
 * 
 * 자손타입의 객체는 부모타입의 참조변수로 참조 가능(o)
 * => 모든 클래스의 객체는 Object타입으로 형변환이 가능하다.
 * 부모타입의 객체는 자손타입의 참조변수로 참조 불가
 * 
 */
public class FireEngineEX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new FireEngine();
		FireEngine fe = null;
		car.driver();
//		fe = (FireEngine)car; // ClassCastExpeption 발생
//		fe.driver();
		Object o = car;
		o = new String("abc");
		//instanceof 연산자 : 참조변수와 객체와의 관계
		//결과가 true인 경우 해당객체는 해당참조변수형으로 참조가 가능하다.
		if (car instanceof FireEngine)
			System.out.println("car 참조변수가 참조하는 객체는 FireEngine 객체다");
		if (car instanceof Car)
			System.out.println("car 참조변수가 참조하는 객체는 Car 객체다");
		if (car instanceof Object)
			System.out.println("car 참조변수가 참조하는 객체는 Object 객체다");
	}
}
