package exam;

import java.util.Scanner;
/*
 * 		    *
 * 		   ***
 * 		  *****
 * 		 *******		
 * 
 */
public class StarPrintEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.print("�ﰢ���� ���̿� ������ �Է��ϼ��� (3 2)");
				int a = scan.nextInt();
				int b = scan.nextInt();
				if(a>100) {
					System.out.println("100 ������ �ڿ����� �Է��ϼ���");
					continue;
					}
				if(b== 1){
					for(int i=0; i<a; i++){
						for(int j=0; j<=i; j++){
							System.out.print("*");
							}System.out.println();
						}
				}else if(b==2){
					for(int i=0; i<a; i++){
						for(int j=i; j<a; j++){
							System.out.print("*");
						}System.out.println();
					}
				}
				if(b==3){
					int y=0;
					for(int i=0; i<a; i++){
						for(int x=i; x<a-1; x++){
							System.out.print(" ");
						}
						for(int j=0; j<=y; j++){
							System.out.print("*");
						}System.out.println();
						y+=2;
					}
					/*
					 * int maxcnt = len *2-1; //�ٴ��� * ����
					 * for(int i=0; i< len; i++){
					 * for(int j=0; j<maxcnt; j++){
					 * if(j>=(maxcnt/2-i)&& j<=(maxcnt/2+i))
					 * System.out.print("*");
					 * else System.out.print(" ");
					 * }System.out.println();
					 * }
					 */
				}
			}
		}
}
