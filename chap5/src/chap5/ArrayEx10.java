package chap5;

import java.util.Scanner;

/*
 * 5�� �л��� ����, ����, ���� ������ �Է¹޾�
 * �л��� ����, ����� ����ϰ�
 * ���� ������ ����ϴ� ���α׷� �ۼ�
 * 			����		����		����		����	���
 * 1�� �л�      100		80		80		260	80.xx
 * 2�� �л�      100      80		80		260	80.xx
 * 3�� �л�      100      80		80		260	80.xx
 * 4�� �л�      100      80		80		260	80.xx
 * 5�� �л�      100      80		80		260	80.xx
 *  	   500		400		400
 */
public class ArrayEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[][]=new int[5][3];
		int sTotal[] = new int[3];
		int cnt = 3;
		int b,d;
		//int c[][] =new int[3][3];
		Scanner scan =new Scanner(System.in);
		
		 for(int i=0;i<c.length;i++){
			  System.out.println((i+1) + "�� �л��� ���� :");
			  for(int j=0; j<c[i].length; j++){
			  c[i][j] = scan.nextInt();
			  }
			  }
		  System.out.println("��ȣ\t����\t����\t����\t����\t���");
		  System.out.println("==============");
		 for(int i=0;i<c.length;i++){
			 int sum=0;
			  System.out.print(i+1+"��\t");
			  for(int j=0;j<c[i].length;j++){
			  sTotal[j]+=c[i][j];
			  sum += c[i][j];
			  System.out.print(c[i][j] + "\t");
			  }
			  System.out.println
			  (sum+"\t"+ String.format("%.2f", (double)sum/c[i].length));
			  }
			  System.out.print("����\t");
			  for(int i=0;i<sTotal.length;i++)
				  System.out.print(sTotal[i] + "\t");
		 
		//System.out.print("1�� �л� : ");
	/*	for(int i=0;i<c.length;i++){
		//	System.out.print((i+1) + "���л�");
			b = scan.nextInt();
			d = i;
			for(int j=0; j<c[i].length; j++){
				c[i][j] = b;
				break;
			}
		}

	
		 int sum=0;
		
		  for(int i =0;i<c.length;i++){
			  for(int j=0; j<c[i].length;j++)
				sum+= c[i][j];
			
		}
		 // System.out.println("��ȣ\t����\t����\t����\t����\t���");
		  
		  System.out.print(sum);
		  System.out.println("\t"+ sum/cnt);*/
	}
	
	
	 /* int score[][] = new int[5][3];
	  int sTotal[] = new int[3];
	  int sum = 0;
	  Scanner scan = new Scanner(System.in);
	  
	  for(int i=0;i<score.length;i++){
	  System.out.println((i+1) + "�� �л��� ���� :");
	  for(int j=0; j<score[i].length; j++){
	  score[i][j] = scan.nextInt();
	  }
	  }
	  
	  System.out.println("��ȣ\t����\t����\t����\t����\t���");
	  System.out.println("==============");
	  for(int i=0;i<score.length;i++){
	  sum=0;
	  System.out.print(i+1+"��\t");
	  for(int j=0;j<score[i].length;j++){
	  sTotal[j]+=score[i][j];
	  sum += score[i][j];
	  System.out.print(score[i][j] + "\t");
	  }
	  System.out.println //%.2f : f(float �� �Ҽ��� ���� 2�ڸ��� ���)
	  (sum+"\t"+ String.format("%.2f", (double)sum/score[i].length));
	  }
	  System.out.print("����\t");
	  for(int i=0;i<sTotal.length;i++)
	  System.out.print(sTotal[i] + "\t");
	  System.out.println();
	}*/
		
}


