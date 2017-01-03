package a1013;

import a1013.Outer.InstanceInner;

//�ܺο� �ִ� ����Ŭ����
class Outer{
	int iv = 10;
	int iv2 = 20;
	class InstanceInner{
		int iv = 100;
		void method1(){
			System.out.println("iv=" + iv);
			System.out.println("this.iv=" + this.iv);
			//����Ŭ�������� �ܺ�Ŭ������ �ִ� ����� �����ϱ�����
			System.out.println("Outer.this.iv="
										+ Outer.this.iv); 
		}
	}
	static class StaticInner{
		int iv = 200;
		static int cv = 300;
	}
	void myMethod(){
		class LocalInner{int iv=400;}
		LocalInner lc = new LocalInner();
		System.out.println(lc.iv);
	}
}
public class InnerEx3 {

	public static void main(String[] args) {
	//InstanceInner Ŭ���� ��üȭ
		Outer oc = new Outer();
		Outer.InstanceInner ii = oc.new InstanceInner(); //Outer.InstanceInner 
														//�������� ����Ŭ������ �̷���
		System.out.println("InstanceInner.iv= " + ii.iv);
		ii.method1();
	//StaticInner Ŭ������ ��üȭ
		Outer.StaticInner si = new Outer.StaticInner(); 
		System.out.println("StaticInner iv = "+si.iv); //��üȭ�� ���ְ�
		System.out.println("StaticInner cv = "+Outer.StaticInner.cv); //��üȭ �ʿ���� static�̴ϱ�
		oc.myMethod();
	}
}
