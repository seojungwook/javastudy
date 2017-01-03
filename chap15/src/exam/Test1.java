package exam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/*국어, 영어, 수학, 물리, 화학, 사회, 컴퓨터 점수를 입력받은후 ,총점 평균 구하고
 * 이들 모두에 대한 막대그래프를 아래조건에 맞게 그릴 수 있는 프로그램을 작성하시오
 * 
 * 1. 국어, 영어, 수학, 물리, 화학, 사회, 컴퓨터 점수를 각각 A,B,C,D,E,F,G로 대표하여,
 * 	점수를 입력받은 후, 이에 대한 총점, 평균, 최대점수, 최소점수를 구한다.
 * 2. 평균은 정수로 출력해야 하며, 소수점은 모두 버린다.
 * 3. 위에서 구한 점수들을 출력후에는 이들 값을 기준으로 모두 막대그래프로 표현한다.
 * 과목별 점수와, 평균, 최대점수, 최소점수가 그래프로 그려야할 대상이며 막대 그래프는 10점당 '*' 하나로
 * 대표하며, 10의 단위이하의 자리숫자는 고려하지 않는다.
 * 4. 그래프를 그릴때, 각 과목에 해당하는 값은 위에서 언급한 영문자 한자로 대표하며,
 * 	최대점수는 H, 최소점수는 I, 평균은 J로 대표한다.
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
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("최대점수 : "+ max);
		System.out.println("최소점수 : " + min);
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
