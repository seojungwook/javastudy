package chap5;

import java.util.Scanner;

public class ArrayEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("10진수 입력 : ");
		int arr[] = new int[32];
		int mok = scan.nextInt();
		int cnt = 0;
		for(int i=0; i<arr.length; i++){
			cnt = i;
			arr[i] = mok%2;
			mok /=2;
			if (mok==0) break;
		}
		for (int i=cnt;i>=0;i--)
			System.out.print(arr[i]);
	}

}
