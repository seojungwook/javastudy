package a1015;

import java.util.ArrayList;
import java.util.List;

/*
 * 10, 40, 30, 60, 30 �̶�� ���ڵ��� �ִ�. 
 * �̵��� ��հ� �߾Ӱ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�
 * 
 * �߾Ӱ��� �־��� ���� ũ�� ������� �þ� ������ �� ���� �߾ӿ� ���� ���̴�
 * 10, 40, 30, 60, 30�� ���, ũ�� ������� �þ� ������ 
 * 10 30 30 40 60
 * �� �ǰ� ���� �߾Ӱ��� 30�� �ȴ�.
 */
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 40, 30, 60, 30};
		
		float avg=0;
		int sum=0;
		int c=0;
		for(int i=0; i<arr.length; i++){
			sum += arr[i];
		}
		avg = sum/arr.length;
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length-1-i; j++){
				if(arr[j]> arr[j+1]){
					int num = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = num;
				}
			}
		}
		if(arr.length%2==1){
			 c= arr.length/2;
		}
		System.out.println("��� :"+ avg+ " �߾Ӱ� :" + arr[c] );
	}

}
