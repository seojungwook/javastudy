package a1012;
/*
 * Wrapper Ŭ���� : �⺻�� 8���� Ŭ����ȭ �ϱ����� Ŭ����(Wrapper��� �̸��� Ŭ������ �Ƴ�)
 * 	�⺻�� 
 * 	boolean  => Boolean
 * 	char     => Character
 * 	byte     => Byte
 * 	short    => Short
 * 	int		 => Integer
 * 	long	 => Long
 * 	float	 => Float
 * 	double   => Double
 * 
 * 	�⺻������ �⺻�ڷ����� �����ڷ����� ���� ����ȯ �Ұ�
 * 	�� ���������� �⺻�ڷ����� WrapperŬ������ ����ȯ ����(jdk5.0����)
 * 
 *  �⺻�� => ������(��üȭ) : auto Boxing
 * 		   <=                : auto unBoxting
 */
public class WrapperEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println("i1==i2 ?" + (i1 == i2));
		System.out.println("i1.equals(i2) ?" + (i1.equals(i2)));
		System.out.println("i1==100 ?" + (i1 == 100)); // unBoxing
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
		
		
		
		//�⺻���� ����
		System.out.println("������ �ִ밪 : " + Integer.MAX_VALUE);
		System.out.println("������ �ּҰ� : " + Integer.MIN_VALUE);
		System.out.println("double �ִ밪 : " + Double.MAX_VALUE);
		System.out.println("double �ּҰ� : " + Double.MIN_VALUE);
		//ũŰ
		System.out.println("int bit ��: "+ Integer.SIZE);
		//����
		System.out.println("500�� 2���� : " + Integer.toBinaryString(500));
		System.out.println("500�� 8���� : " + Integer.toOctalString(500));
		System.out.println("500�� 16���� : " + Integer.toHexString(500));
		//�⺻�� <== String
		int pi = Integer.parseInt("123"); //cf. double => Double.parseDouble
		System.out.println(pi);
		//���ڿ� "764"�� 8������ �ν��Ͽ� ��������
		pi = Integer.parseInt("764",8);
		System.out.println(pi);
		//16������ �ν�
		pi = Integer.parseInt("FF",16);
		System.out.println(pi);
		//Wrapper ��ü ������ new ������ �����ص� ��
		Integer i3 = 200;
		System.out.println(i3.toBinaryString(i3));
	}

}
