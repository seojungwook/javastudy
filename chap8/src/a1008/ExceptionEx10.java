package a1008;
class MyException2 extends RuntimeException{ //RuntimeException�� ��ӹ޾Ƽ� ����ó�� ���ϰ�.
	MyException2(){
		super("���� ���� ���� ��ü");
	}
}
public class ExceptionEx10 {
	static boolean isException(){
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
		System.out.println("���α׷� ���� ����");
	}
	private static void method1() {
		// TODO Auto-generated method stub
		if(isException())
			//����ó�����ϰ� ���� �ǵ��� ���α׷� ����
			throw new MyException2();
	}

}
