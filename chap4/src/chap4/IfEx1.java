package chap4;
/*
 *  ���ǹ� if ����
 *  if(���ǽ�){
 *  	���� <= ���ǽ��� ����� ���� ��츸 ����
 *  }
 */
public class IfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// score�� 60�̻��� ��� �հ�
		int score = 60;
		if(score>=60){ 
			System.out.println("�հ��� �����մϴ�");
		} else {
			System.out.println("���հ�");
		}
		//���ǿ����ڷ� ����
		System.out.println((score>=60)?"�հ��� �����մϴ�":"���հ�");
		System.out.println("���α׷� ����");
	}

}
