package a1005;

class Parent2{
	int x=10;
	Parent2(int x){
		this.x = x;
	}
	//Parent2(){}
}
class Child2 extends Parent2 {
	int x=20;
	Child2(){
	//	super(); //�θ�Ŭ������ ������ ȣ��, �θ�Ŭ������ �����ڿ� �Ű������� ���°��� ���� ������ �̰� �ȵ�
		super(100); //������ �� ����. ������ �θ�Ŭ������ �����ڰ� �Ű������� �ֱ� ������
	}
	void method(){
		int x = 30;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}
}
public class SuperEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 c = new Child2();
		c.method();
	}

}
