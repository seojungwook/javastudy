package a1005;
/*
 * 228p
 * super �������� : �θ�ü�� �����ϴ� ��������
 * super ������ : ��Ӱ����� Ŭ������ ��ü ������ �θ�Ŭ������ �����ڸ� ȣ��
 * 				�����ڰ� super()�� ȣ������ ������ �����Ϸ��� ������ super();�� �߰��Ѵ�.
 * 				�θ�Ŭ������ ������ �� �Ű������� �ִ� �����ڸ� �����ϸ� �ݵ�� �ڼ�Ŭ������ 
 * 				�����ڿ��� �θ�Ŭ������ �����ڿ� �µ��� super(...) ȣ���ؾ� �Ѵ�.
 * 
 * this, super ��� �ν��Ͻ� ��������� ��� �����ϴ�. Object Ŭ������ ������ �ֱ⶧���� super�� ��� Ŭ������ �־�.	
 * 											���� �Ű������� ���� ���� ������ ����
 */

class Parent {
	int x =10;
}
class Child extends Parent{
	int x = 20;
	void method(){
		int x = 30;
		System.out.println(x);
		System.out.println(this.x); //�������� ��ü�� ���ư��� ���� ����� x ��
		System.out.println(super.x); //�θ�ü�� �ٷ�
	}
}
public class SuperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.method();
	}

}
