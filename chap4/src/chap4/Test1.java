package chap4;
/*
 * ��������
 */
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 int ���� x�� 10���� ũ�� 20���� ������ true
		int x= 11;
		if(x>10 && x<20)
			System.out.println(true);
		else
			System.out.println(false);
		//2 char�� ���� ch�� �����̳� ���� �ƴ� �� true�� ���ǽ�
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


