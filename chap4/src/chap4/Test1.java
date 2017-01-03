package chap4;
/*
 * 연습문제
 */
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 int 변수 x가 10보다 크고 20보다 작을때 true
		int x= 11;
		if(x>10 && x<20)
			System.out.println(true);
		else
			System.out.println(false);
		//2 char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
		char ch='t';
		if(!(ch==' '||ch == '\t'))
			System.out.println(true);
		else
			System.out.println(false);
		//3
		ch = 'X';
		if(ch=='x' || ch=='X')
			System.out.println(true);
		else
			System.out.println(false);
		
		//4
		ch=6;
		if(ch>=0 && ch<=9)
			System.out.println(true);
		else
			System.out.println(false);
		
		//5
		ch='a';
		if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
			System.out.println(true);
		else
			System.out.println(false);
		
		//6
		int year = 49;
		if((year%400==0) || (year%4==0 && year%100!=0))
			System.out.println(true);
		else
			System.out.println(false);
		
		
		//7
		boolean powerOn =false;
		if(!powerOn)
			System.out.println(true);
		else
			System.out.println(false);
			
		//8
			String str = "yes";
			if(str.equals("yes"))
				System.out.println(true);
			else
				System.out.println(false);
			
		//4-2
		int sum=0;
		for(int i=1; i<=20; i++){
			if(i%2!=0 && i%3!=0)
				sum +=i;
		}
			System.out.println(sum);
		
	
	
	
	}
		
		
}


