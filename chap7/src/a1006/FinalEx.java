package a1006;
/*
 * final ������ ����
 * final class(����Ŭ����) : ��ӺҰ� Ŭ����
 * 						�ٸ� Ŭ������ �θ�Ŭ������ �� �� ����.
 * final method(���ܸ޼���) : ������ �Ұ� �޼���
 *    					�ڼ�Ŭ�������� �������̵� �Ұ�
 * final ���� : ���� �Ұ� ���� ��, ����� �������
 * 			   �ѹ� �����ڿ��� ������ �����ϴ�.  =>  ��ü���� �ٸ� ������� ����
 * 										��, ����� �ʱ�ȭ �Ǿ�� �ȵȴ�.
 */

//final class FinalClass{
 class FinalClass{
	//final void finalmethod() {
	 void finalmethod() {
		System.out.println("�������̵� �Ұ�");	
	}
}
class SubClass extends FinalClass{
	final int x = 100;
	void finalmethod(){
//		x = 200;
		System.out.println(x);
	}
}
class FinalVal{
//	final int num =1000; ����� �ʱ�ȭ X
	final int num;
	FinalVal(int num){  //����� �����ڿ��� ����Ǿ��� 
		this.num = num; 
	}
	void method(){
	//	num=300; //����̹Ƿ� �����߻�
		System.out.println(num);
	}
}

public class FinalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass sc = new SubClass();
		sc.finalmethod();
		FinalVal f1 = new FinalVal(10);
		f1.method();
		FinalVal f2 = new FinalVal(20);
		f2.method();
	}
}
