package chap5;

import java.util.Scanner;

public class ArrayEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*Scanner scan = new Scanner(System.in);
		
	System.out.print("10진수 입력 : ");
		int arr[] = new int[32];
		int arr1[] = new int[32];
		int arr2[] = new int[32];
		 char[] arr3= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
		
		int mok = scan.nextInt();
		int cnt = 0;
		int j= mok;

		for(int i=0; i<arr.length; i++){
			cnt = i;
			arr[i] = mok%2;
			mok /=2;
			if (mok==0) break;
		}
		System.out.print("2진수 :");
		for (int i=cnt;i>=0;i--)
			System.out.print(arr[i]);
		
		System.out.println();
	
		mok=j;
		for(int i=0; i<arr1.length; i++){
			cnt = i;
			arr1[i] = mok%8;
			mok /=8;
			if (mok==0) break;
		}
		System.out.print("8진수 :");
		for (int i=cnt;i>=0;i--)
			System.out.print(arr1[i]);
		
		System.out.println();
	
		mok=j;
		for(int i=0; i<arr2.length; i++){
			cnt = i;
			arr2[i] = mok%16;
			mok /=16;
			if (mok==0) break;
		}
		System.out.print("16진수 :");
		for(int x=0;x<32;x++)
			arr2[x]=arr3[x];
		for (int i=cnt;i>=0;i--){
			arr2[i]=arr3[i];
		
		/*	if(arr2[i]==10)
				arr2[i]='A';
			if(arr2[i]==11)
				arr2[i]='B';
			if(arr2[i]==12)
				arr2[i]='C';
		 	if(arr2[i]==13)
				arr2[i]='D';
			if(arr2[i]==14)
				arr2[i]='E';
			if(arr2[i]==15)
				arr2[i]='F';
			else
			if(arr2[i]==arr2[10]) arr2[i]=arr3[i];
			if(arr2[i]==arr2[11]) arr2[i]=arr3[i];
			if(arr2[i]==arr2[12]) arr2[i]=arr3[i];
			if(arr2[i]==arr2[13]) arr2[i]=arr3[i];
			if(arr2[i]==arr2[14]) arr2[i]=arr3[i];
			if(arr2[i]==arr2[15]) arr2[i]=arr3[i];*/
			
			int num, div, i=0;
			char number[]=null;
			int digit[]={2,8,16};
			char[] data= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
			System.out.print("10진수 입력 : ");
			Scanner scan = new Scanner(System.in);
			num= scan.nextInt();
			for(int j=0;j<3;j++){
			number= new char[32];
			div=num;
			do{
				number[i++] = data[div % digit[j]];
				div /= digit[j];
				}while(div>0);
				System.out.print(digit[j]+ "진수\t:");
				for(int k=i;k>=0;k--)
				System.out.print(number[k]);
				System.out.println();
				
			//System.out.print(arr2[i]);
		}
		
	}

}
