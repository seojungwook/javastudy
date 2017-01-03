package a1027;

import java.util.Scanner;

public class exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a= scan.nextInt();
		int b = scan.nextInt();
		int x=1;
		int max=0;
		int min=0;
		while(true){
			if(a%2==0 && b%2==0){
				x*=2;
				a =a/2;
				b =b/2;
			}else if(a%3==0 && b%3==0){
				x*=3;
				a = a/3;
				b = b/3;
			}else if(a%5==0 && b%5==0){
				x*=5;
				a = a/5;
				b = b/5;
			}else if(a%7==0 && b%7==0){
				x*=7;
				a = a/7;
				b = b/7;
			}else 
				break;
		}
		max = x;
		min = x*a*b;
		System.out.println("최대공약수 : " + max + ", 최소공배수 : " + min);
	}
}
