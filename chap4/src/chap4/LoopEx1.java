package chap4;
/*
 * �ݺ��� ����
 */
public class LoopEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ݺ��� ���� 1���� 10���� ����ϱ�
		System.out.println("�ݺ��� ���� 1���� 10���� ����ϱ�");
		System.out.print(1);
		System.out.print(2);
		System.out.print(3);
		System.out.print(4);
		System.out.print(5);
		System.out.print(6);
		System.out.print(7);
		System.out.print(8);
		System.out.print(9);
		System.out.println(10);
		
		System.out.println("for������ 1���� 10���� ����ϱ�");
		
	for(int i=1;i<=10;i++){
			System.out.print(i);
		}
	 	/* ó�� ����
	 	 * 1. i <= 1
	 	 * 2. i<=10 : ��
	 	 * 3. ȭ�鿡 1 ���
	 	 * 4. i++;  : i = 2
	 	 * 5. i<=10 : ��
	 	 * 6. ȭ�鿡 2 ���
	 	 * ...
	 	 * n1. i = 9
	 	 * n2. i<=10 : ��
	 	 * n3. ȭ�鿡 9���
	 	 * n4. i = 11
	 	 * n5. i<=10 : ����
	 	 */
		System.out.println();
		System.out.println("while������ 1���� 10���� ����ϱ�");
		int i = 1;
		while(i<=10){
			System.out.print(i);
			i++;
		}
		System.out.println();
		System.out.println(i);
		System.out.println("do while������ 1���� 10���� ����ϱ�");
		i = 1;
		do{
			System.out.print(i);
			i++;
		}while(i<=10);
		System.out.println();
	}

}
