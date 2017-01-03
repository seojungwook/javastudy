package exam;

import java.util.Scanner;

/*
 * 입력된 정수 n에 대해 서로소인 1이상 n이하의 정수의 갯수를 출력하는 프로그램을 작성
 * 여기서 임의의 정수 n의 서로소란, n과의 공약수가 1밖에 없는 숫자를 뜻한다.
 * 각 테스트케이스에 대한 서로소의 개수를 한줄에 하나씩 출력한다.
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
