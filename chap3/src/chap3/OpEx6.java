package chap3;
/*
 *  ���� ������ : �ǿ������� ������ ������ ������
 *  ���ǿ�����  : (���ǽ�)?��:����  =>  ���ǹ����� ���� ����(if, else)
 */
public class OpEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=100, y=20;
		System.out.println("�μ� �� �� ū���� =" + ((x>y)?x:y));
		System.out.println("�μ� �� �� ���� ���� =" + ((x<y)?x:y));
		// ���� : score 60�̻��̸� �հ�, �׷��� ������ ���հ�
		// �� ���ǿ����ڸ� ����ϱ�
		int score=50;
		System.out.println((score>=60)?"�հ�":"���հ�");
		// ����2 : num ���� ���, ����, 0 ����ϱ�
		int num = 50;
		System.out.println((num>0)?"���":(num<0)?"����":0);
		/* ����3 : score�� 90�̻��̸� "A����"
		 * 				80�̻��̸� "B����"
		 * 				70�̻��̸� "C����"
		 * 				60�̻��̸� "D����"
		 * 				�ƴϸ� "F����"
		 */
		System.out.println((score>=90)?"A����":(score>=80)?
				"B����":(score>=70)?"C����":(score>=60)?"D����":"F����");
		
	}

}
