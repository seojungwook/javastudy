package chap6;
/*
 * ������ ����
 * �����ڶ� : ��üȭ�� �ݵ�� ȣ��Ǵ� �޼���
 * 		     ������ ���� ��ü������ �Ұ��ϴ�.
 * 		     ����� �ַ� �ν��Ͻ� ������ �ʱ�ȭ�� �����
 * 		=> ��ü������ �����ϴ� Ư���� �޼���
 * 		     �����ڵ� �����ε��� �����ϴ�.
 * 		     �������� �̸��� Ŭ������� ����.
 * 		     ����Ÿ���� ����.
 * �⺻�����ڶ�?
 * 		�����ڰ� �����ڸ� �������� ������ �����Ϸ��� �˾Ƽ� �߰��ϴ� ������
 * 		public Ŭ������(){}
 */
class Data1{ //�⺻�����ڰ� �����Ǵ� Ŭ����
	int value;
}
class Data2{ //�⺻�����ڰ� �������� �ʴ� Ŭ����
	int value;
	Data2(int x){ //������
		value = x;
	}
}
public class ConstructorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data1 d1 = new Data1();
		/*
		 * new ������ ���
		 * 1. �������� �޸� �Ҵ�
		 * 2. ��������� �⺻������ �ʱ�ȭ
		 * 3. ������ ȣ��
		 */
		d1.value = 10;
		System.out.println(d1.value);
		Data2 d2 = new Data2(100);
		System.out.println(d2.value);
	}

}
