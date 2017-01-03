package chap6;
/*
 * 195p, 196p ���ߵ�
 * this ������ : �� Ŭ������ �ٸ� �����ڸ� ȣ���� �� ���
 * 			    �ݵ�� ù�ٿ� �����Ǿ�� �Ѵ�.
 * this �������� : �ν��Ͻ� ����� �����ϴ� ��������
 * 				�ν��Ͻ��޼��� ���ο� ���������� �ڵ����� �����. 
 * 				�ν��Ͻ������ ����� ������
 */
class Car {
	String color;
	String gearType;
	int door;
	Car(){
		this("white","auto",4);
		System.out.println("Car() ������ ȣ��");
//		color = "white";
//		gearType = "auto";
//		door = 4;
	}
	Car(String color, String gearType, int door){ //�Ű������� �ν��Ͻ������� ��� ����
		this.color = color; 
		this.gearType = gearType;
		this.door = door;
		System.out.println("Car(String, String, int) ������ ȣ��");
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
	public String toString() { //������ ������ ��?
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
