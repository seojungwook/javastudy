package a1006;
/*
 * ������ ����
 * �������� ���������� ����ȯ�̴�.
 * ��ü�� ���������� Ÿ�Ը�ŭ�� ����� ���ٰ����ϴ�.
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
		 * �θ�Ŭ������ �ڷ����� ��  ū �ڷ������� ����.
		 * �θ�Ŭ������  <= �ڼ�Ŭ������ : ����ȯ������ ��������
		 * �ڼ�Ŭ���� �� <= �θ�Ŭ������ : ����ȯ������ �����Ұ�
		 */
		
		car = fe;// Car = (car)fe;
		//car.water(); Car Ÿ���� ����� water()�� ����.
		fe2 = (FireEngine)car;
		fe2.water();
		Object o = car;
		// o.driver(); //driver() Object�� ����� �ƴϴ�.
		car.equals(fe); // equals ������Ʈ�� ���
	}

}
