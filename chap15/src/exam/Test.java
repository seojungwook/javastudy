package exam;

import java.util.Scanner;

/*
 * �Էµ� ���� n�� ���� ���μ��� 1�̻� n������ ������ ������ ����ϴ� ���α׷��� �ۼ�
 * ���⼭ ������ ���� n�� ���μҶ�, n���� ������� 1�ۿ� ���� ���ڸ� ���Ѵ�.
 * �� �׽�Ʈ���̽��� ���� ���μ��� ������ ���ٿ� �ϳ��� ����Ѵ�.
 */
public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int arr[] = new int[a];

		int cnt = 0;
		int b = 0;
		for (int i = 1; i <= a; i++) {
			arr[i - 1] = i;
			if (a % i == 0) {
				cnt++;
			}
		}
		int arr1[] = new int[cnt];
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				arr1[b++] = i;
				System.out.print(i + " ");

			}
		}
		System.out.println();
		int c = 0;
		for (int i = 1; i < a; i++) {
			for (int j = 1; j < arr1.length; j++) {
				if (i % arr1[j] == 0) {
					c = 1;
				}
			}

			if (c == 0) {
				System.out.print(i + " ");
			}
			c = 0;
		}
	}
}
