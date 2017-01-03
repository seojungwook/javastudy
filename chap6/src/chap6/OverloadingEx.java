package chap6;
/*
 * �޼��� �����ε� ����
 * �����ε��̶�?
 * 	������ Ŭ�������� ���� �̸��� �޼��尡 ������ ������ �� �ִ�.
 * 	�� �Ű������� �ڷ����� �޶�� �Ѵ�.
 * 	�Ű������� ����, Ÿ��, ���� ��.
 * 	�Ű��������� ��� ����.
 * 
 * �����ε��� �޼����� ���� ����
 * 1. ȣ��� �Էµ� �ڷ����� ������� ����� �ڷ��� ����
 * 2. 1�� ������ ���� ���
 * 		�ּ� ������ �ڵ�����ȯ�Ǵ� �Ű������� ���� �޼��带 ������
 * 3. ���ǻ��� - ������ ������ ��찡 �������� ��� ���� �߻�
 */
class Math3{
	int add(int a, int b){
		System.out.print("1: ");
		return a+b;
	}
	long add(int a, long b){
		System.out.print("2: ");
		return a+b;
	}
	long add(long a, int b){
		System.out.print("3: ");
		return a+b;
	}
	long add(long a, long b){
		System.out.print("4: ");
		return a+b;
	}
	int add(int[] a){
		System.out.print("5 : ");
		int result =0;
		for(int i:a)result+=i;
		return result;
	}
}
public class OverloadingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math3 m3 = new Math3();
		System.out.println(m3.add(3,3));
		System.out.println(m3.add(3L,3));
		System.out.println(m3.add(3,3L));
		System.out.println(m3.add(3L,3L));
		System.out.println(m3.add(new int[]{10,20,30}));
	}
}
