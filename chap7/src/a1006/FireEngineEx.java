package a1006;
/*
 * 다형성 예제
 * 다형성은 참조변수의 형변환이다.
 * 객체는 참조변수의 타입만큼의 멤버만 접근가능하다.
 */
class Car{
	String color;
	int door;
	void driver(){
		System.out.println("drive~~~");
	}
	void stop(){
		System.out.println("stop!");
	}
}

class FireEngine extends Car {
	void water(){
		System.out.println("water!");
	}
}
public class FireEngineEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FireEngine fe = new FireEngine();
		Car car = null;
		FireEngine fe2 = null;
		fe.water();
		/*
		 * 부모클래스의 자료형을 더  큰 자료형으로 본다.
		 * 부모클래스형  <= 자손클래스형 : 형변환연산자 생략가능
		 * 자손클래스 형 <= 부모클래스형 : 형변환연산자 생략불가
		 */
		
		car = fe;// Car = (car)fe;
		//car.water(); Car 타입의 멤버에 water()가 없다.
		fe2 = (FireEngine)car;
		fe2.water();
		Object o = car;
		// o.driver(); //driver() Object의 멤버가 아니다.
		car.equals(fe); // equals 오브젝트의 멤버
	}

}
