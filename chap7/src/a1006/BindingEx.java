package a1006;
/*
 * 275p
 * �θ�Ŭ������ ����� �ڼ�Ŭ������ ����� ������ ��
 *  ���������� �ڷ����� ��ü �ڷ��� ����
 *  ��������� ���������� �ڷ����� ������.(x ��)
 *  ����޼���� ��ü�� �ڷ���(�������� �������̵��� )�� ������.
 */
class Parent {
	int x = 10;
	void method(){
		System.out.println("Parent �޼���");
	}
}
class Child extends Parent {
	int x = 20;
	void method() {
		System.out.println("Child �޼���");
	}
}
public class BindingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child();
		System.out.println(p.x);
		p.method();
		Child c = (Child)p;
		System.out.println(c.x);
		c.method();
	}

}
