package a1016;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
				
		while(true){
		
			System.out.println("�⵵ �Է��ϼ���");
			int y = scan.nextInt();
			System.out.println("���� �Է��ϼ���");
			int m = scan.nextInt();
			if(m <1 || m>12){
				System.out.println("�ٽ� �Է��ϼ���");
			}
			int start =0;
			int end = 0;
			Calendar cal = Calendar.getInstance();
			cal.set(y,m-1,1);
			start = cal.get(Calendar.DAY_OF_WEEK);
			end =cal.getActualMaximum(Calendar.DATE);
		
			System.out.println("     "+y +"�� "+ m +"��");
			System.out.println(" �� �� ȭ �� �� �� ��");
			
			for(int i=1; i<start; i++){
				System.out.print("   ");
			}
			int i=start;
			for(int n=1; n<=end; n++, i++){
				System.out.print(String.format("%3d", n));
				if(i%7==0){
					System.out.println();
				}
			}
			System.out.println();
			System.out.println("�迭�� �̿��Ͽ� ���");
			int[][] calendar = new int[7][7];
			System.out.println("     "+y +"�� "+ m +"��");
			System.out.println(" �� �� ȭ �� �� �� ��");
			
			for(int k=0; k<end;k++){
				cal.set(y, m-1, k+1);
				int weekcnt = cal.get(Calendar.WEEK_OF_MONTH);
				int week = cal.get(Calendar.DAY_OF_WEEK);
				calendar[weekcnt-1][week-1] = k+1;
			}
			for(int k=0;k<calendar.length;k++){
				for(int l=0; l<calendar[k].length;l++){
					if(calendar[k][l]==0)
						System.out.print("   ");
					//%3d : 10�������� 3�ڸ��� �����
					//printf() : String.format() ������ ����
					else 
						System.out.printf("%3d",calendar[k][l]);
				}
				System.out.println();
			}
			
		}
	
	}

}
