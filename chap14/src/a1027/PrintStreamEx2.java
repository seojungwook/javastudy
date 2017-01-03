package a1027;
/*
 * PrintStream ���� 2
 * printf() �޼��� ���� 
 * 		- jdk5.0 ���Ĺ��������� ����� ����
 * 		- ��������ڸ� ���
 * 		- String.format() �޼���� ������� ����
 */
public class PrintStreamEx2 {
	public static void main(String[] args) {
		//char ��� : %c
		//%n : \n�� ����.
		System.out.printf("%c%n",'A'); //A
		System.out.printf("%5c%n",'A'); //5�ڸ��� Ȯ���ϰ� 'A' ����������
		System.out.printf("%-5c%n",'A'); //5�ڸ��� Ȯ���ϰ� 'A' ��������
		
		//���� ��� : %d(10������), %o(8������), %x(16������);
		System.out.printf("%d%n",12345); //12345
		System.out.printf("%,d%n",12345); //12,345
		System.out.printf("%o%n",12345); //30071
		System.out.printf("%x%n",12345); //3039
		System.out.printf("%x%n",255); //ff
		System.out.printf("%X%n",255); //FF
		System.out.printf("%10d%n",12345); //10�ڸ� Ȯ�� 12345
		System.out.printf("%010d%n",12345); //10�ڸ� Ȯ�� 0000012345

		//�Ǽ� ��� : %f, %g(�ٻ�Ǽ�), %e(�����Ǽ�)
		System.out.printf("%f%n",12.12745);
		System.out.printf("%.2f%n",12.12745);
		System.out.printf("%g%n",12.12745);
		System.out.printf("%e%n",12.12745);
		System.out.printf("%10.2f%n",12.12745); //10�ڸ�Ȯ�� �Ҽ���2�ڸ�����(��������)
		System.out.printf("%-10.2f%n",12.12745); //10�ڸ�Ȯ�� �Ҽ���2�ڸ�����(��������)
		System.out.printf("%010.2f%n",12.12745);
		
		//���ڿ� : %s
		System.out.printf("%s%n","ȫ�浿");
		System.out.printf("%d,%s%n%s%n",100,"ȫ�浿","�̸���");// 100,ȫ�浿
															   // �̸���  <=�̴�γ���
		//���� : %b
		System.out.printf("%b%n",true);
		//255 ���ڸ� 8������ ����ϱ�
		System.out.printf("10����:%d, 8����:%o%n",255,255);
		String f = String.format("10����:%d, 8����:%o%n",255,255);
		System.out.println(f);
	}
}
