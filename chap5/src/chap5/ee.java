package chap5;
// ����� 10���� => 2����, 8����, 10����
import java.util.Scanner;

public class ee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, div, i=0;
		char number[]=null; //���������� ����
		int digit[]={2,8,16};
		char[] data= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

	   System.out.print("10���� �Է� : ");
		Scanner scan = new Scanner(System.in);
		num= scan.nextInt();
		for(int j=0;j<3;j++){ //3 => digit.length
		number= new char[32];
		div=num;
		
		i=0;
		do{
			number[i++] = data[div % digit[j]];
			div /= digit[j];
			}while(div > 0);
			System.out.print(digit[j]+ "����\t:");
			for(int k=i;k>=0;k--)
			System.out.print(number[k]);
			System.out.println();
	}
		
	}
	
} 
	
