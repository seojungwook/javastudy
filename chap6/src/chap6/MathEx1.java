package chap6;
/*
 * �޼��� ����
 * 
 * 		�޼��� ����
 * 		[���������� ������] ����Ÿ�� �޼����(�Ű��������) => �����
 * 		{    => ������
 * 		}
 * 
 * 		����Ÿ�� : �޼��� ���� �� �Ѱ����� ���� �ڷ���
 * 				����Ÿ���� void�� ���� ���ϰ��� ����. ex)void main
 * 		�Ű����� : �ż��� ȣ��� �ʱ�ȭ�Ǵ� ��
 * 				�Ű������� ���� ���� () ǥ����.
 * 		return : �޼��� ������.
 * 				 ����Ÿ���� void�� �ƴ� ���� return ���ϰ�; ���� �����Ѵ�.
 * 				 ����Ÿ���� void�� ���� return�� ���� ������.
 * 				 �޼����� �� '}'�� ������ �޼��尡 ����ȴ�
 */
class Math1{
	//int a, int b �Ű�����(add�� ����� ���� ���� �ΰ� �־��)
	int add(int a, int b) //�����
	{ return a + b; } //������ : ���
	int sub(int a, int b){ return a - b; }
	int mul(int a, int b){ return a * b; }
	int div(int a, int b){ return a / b; }
}
public class MathEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math1 m1 = new Math1(); //��üȭ
		System.out.println(m1.add(10, 10)); //�޼��� ȣ��
		System.out.println(m1.sub(100, 50));
		System.out.println(m1.mul(10, 10));
		System.out.println(m1.div(100, 10));
	}

}
