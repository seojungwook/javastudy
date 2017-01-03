package chap6;
/*
 * 195p, 196p 봐야돼
 * this 생성자 : 내 클래스의 다른 생성자를 호출할 때 사용
 * 			    반드시 첫줄에 구현되어야 한다.
 * this 참조변수 : 인스턴스 멤버를 참조하는 참조변수
 * 				인스턴스메서드 내부에 지역변수로 자동으로 선언됨. 
 * 				인스턴스멤버만 사용이 가능함
 */
class Car {
	String color;
	String gearType;
	int door;
	Car(){
		this("white","auto",4);
		System.out.println("Car() 생성자 호출");
//		color = "white";
//		gearType = "auto";
//		door = 4;
	}
	Car(String color, String gearType, int door){ //매개변수를 인스턴스변수로 사용 가능
		this.color = color; 
		this.gearType = gearType;
		this.door = door;
		System.out.println("Car(String, String, int) 생성자 호출");
	}
	
	public Car(Car c) {
		
		this(c.color, c.gearType, c.door);
	}
	public Car(String color) {
		
		this(color,"auto",4);
	}

	public Car(int door) {
		this("white","auto",door);
	}
	public String toString() { //형식을 정해준 것?
		return color + "," + gearType + "," + door;
	}
	
}
public class ThisEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		System.out.println(c1);
		Car c2 = new Car("blue", "manual", 5);
		System.out.println(c2);
		Car c3 = new Car(c1);
		System.out.println(c3);
		Car c4 = new Car("yellow");
		System.out.println(c4);
		Car c5 = new Car(2);
		System.out.println(c5);
	}

}
