package a1015;

import java.util.ArrayList;
import java.util.List;

/*
 * 10, 40, 30, 60, 30 이라는 숫자들이 있다. 
 * 이들의 평균과 중앙값을 구하는 프로그램을 작성하시오
 * 
 * 중앙값은 주어진 수를 크기 순서대로 늘어 놓았을 때 가장 중앙에 놓인 값이다
 * 10, 40, 30, 60, 30의 경우, 크기 순서대로 늘어 놓으면 
 * 10 30 30 40 60
 * 이 되고 따라서 중앙값은 30이 된다.
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
		System.out.println("평균 :"+ avg+ " 중앙값 :" + arr[c] );
	}

}
