package a1012;
/*
 * hashcode �޼��� ����
 * �ؽ��ڵ�� ��ü�� �����ϴ� ������ �� (�ּҰ� ����)
 * �ΰ�ü�� �ؽ��ڵ� ���� �ٸ� ��� �� ��ü�� ���� �ٸ� ��ü��.
 * => �������̵��� �ؼ� ����񱳷� ����� �����ϴ�.
 * => Collection ���� �ٽ� ��������
 */
public class HashCodeEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []x={1,2,3};
		int []y = x;
		System.out.println(y[0]);
		String s1 = new String("abc"); 
		String s2 = new String("abc");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		if(s1 == s2)
			System.out.println("s1�� s2�� ���� ��ü");
		else 
			System.out.println("s1�� s2�� �ٸ� ��ü");
		//������ hashCode��
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		//ValueŬ������ hashCode���ϱ�
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		System.out.println(System.identityHashCode(v1));
		System.out.println(System.identityHashCode(v2));
	}

}
