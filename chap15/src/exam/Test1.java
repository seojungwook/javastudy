package exam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/*����, ����, ����, ����, ȭ��, ��ȸ, ��ǻ�� ������ �Է¹����� ,���� ��� ���ϰ�
 * �̵� ��ο� ���� ����׷����� �Ʒ����ǿ� �°� �׸� �� �ִ� ���α׷��� �ۼ��Ͻÿ�
 * 
 * 1. ����, ����, ����, ����, ȭ��, ��ȸ, ��ǻ�� ������ ���� A,B,C,D,E,F,G�� ��ǥ�Ͽ�,
 * 	������ �Է¹��� ��, �̿� ���� ����, ���, �ִ�����, �ּ������� ���Ѵ�.
 * 2. ����� ������ ����ؾ� �ϸ�, �Ҽ����� ��� ������.
 * 3. ������ ���� �������� ����Ŀ��� �̵� ���� �������� ��� ����׷����� ǥ���Ѵ�.
 * ���� ������, ���, �ִ�����, �ּ������� �׷����� �׷����� ����̸� ���� �׷����� 10���� '*' �ϳ���
 * ��ǥ�ϸ�, 10�� ���������� �ڸ����ڴ� ������� �ʴ´�.
 * 4. �׷����� �׸���, �� ���� �ش��ϴ� ���� ������ ����� ������ ���ڷ� ��ǥ�ϸ�,
 * 	�ִ������� H, �ּ������� I, ����� J�� ��ǥ�Ѵ�.
 */
public class Test1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int e = scan.nextInt();
		int sum =0;
		int avg =0;
		int max = 0;
		int min = 0;
		System.out.println(a + " " + b+ " " +  c+ " " + d+ " " + e);
		System.out.println();
		sum = a+b+c+d+e;
		avg = sum/5;
		int arr[] = new int[5];
		int arr1[] = new int[8];
		arr[0]=a; arr[1]=b;arr[2]=c;arr[3]=d;arr[4]=e; 
		arr1[0]=a; arr1[1]=b;arr1[2]=c;arr1[3]=d;arr1[4]=e; 
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length-1-i; j++){
				if(arr[j]> arr[j+1]){
					int num = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = num;
				}
			}
		}
		max = arr[4];
		min = arr[0];
		arr1[5]=max; arr1[6]=min; arr1[7]=avg;
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
		System.out.println("�ִ����� : "+ max);
		System.out.println("�ּ����� : " + min);
		System.out.println();
		int y=0;
		for(int i=0; i<10; i++){
			System.out.print(100-y + "\t");
			y+=10;
			for(int j=0; j<8; j++){	
			if(arr1[j]/10 < 10-i){
				System.out.print("  " + "\t");
			}else
				System.out.print(" *" + "\t");
			}
			System.out.println();
		}
		System.out.println("\t A\t"+" B\t"+ " C\t"+ " D\t"+ " E\t"+ " F\t"+ " G\t"+ " H\t");
	}
}
