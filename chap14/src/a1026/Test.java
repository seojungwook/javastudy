package a1026;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long c = 0,d = 0,e = 0,f = 0,g =0;
		long h = 0,j = 0,k = 0,l =0, m=0, o=0, r=0;
		long sum=0;
//		String input= scan.nextLine();  //°­»ç´Ô
//		
//		int sum =0;
//		do{
//			sum = 0;
//			for(int i=0; i<input.length(); i++){
//				sum+=input.charAt(i) - '0';
//			}
//			System.out.println(input = sum+ "");
//		}while(sum>=10);
		
			long x = (a/100000);
			long z = (a%100000);
			
			for(int i=0; i<5;i++){
				 c = x/10000;
				 d = (x/1000)%10;
				 e = (x/100)%10;
				 f = (x/10)%10;
				 g = x%10;
			}
			for(int y=0; y<5;y++){
				 h = z/10000;
				 j = (z/1000)%10;
				 k = (z/100)%10;
				 l = (z/10)%10;
				 m = z%10;
			}
		
			sum = c+d+e+f+g+h+j+k+l+m;
			System.out.println(sum);
		while(true){
			if(sum>=10){
				o = sum/10;
				r = sum%10;
				sum = o+r;
				System.out.println(sum);
				
			}else {
				break;
			}
		}
	}
}
