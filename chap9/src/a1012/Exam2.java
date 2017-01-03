package a1012;

import java.util.Scanner;

/*
 * 강아지와 병아리의 합 1000 이하 다리의 합 4000 이하를 구분하여 입력받는다.
 * 하나의 결과가 나온 후에도 계속 새로운 입력을 받다가 0이 입력되면 프로그램을 종료한다
 * 
 * 강아지와 병아리의 합과 다리의 수를 입력받아 강아지와 병아리가 각각 몇 마리씩인지 
 * 구하는 프로그램을 작성하시오.
 * 강아지와 병아리가 각각 몇 마리씩인지 출력한다.
 * 주어진 데이터로 마리수를 정할 수 없을 때는 "0"을 출력한다.
 * 데이터의 크기가 주어진 범위를 벗어날 경우는 "INPUT ERROR!"를 출력한다.
 * 
 */
public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum, suml;
		boolean chk = false;
		Scanner scan = new Scanner(System.in);
		while(true){
			chk = false;
			System.out.println("강아지와 병아리의 합");
			sum = scan.nextInt();
			if(sum==0)break;
			if(sum >1000){
				System.out.println("INPUT ERROR!");
				continue;
			}
			System.out.println("강아지와 병아리 다리 합");
			suml = scan.nextInt();
			if(suml==0) break;
			if(suml >4000) {
				System.out.println("INPUT ERROR!");
				continue;
			}
			for(int i=0; i<=sum; i++){
				for(int j=0; j<sum-1; j++){
					if(i+j ==sum){
						if(((i*4)+(j*2))==suml){
							System.out.println("강아지수:"+i+ "병아리수:"+ j);
							chk=true;
					}
					}
				}
			}
			if(!chk)
				System.out.println("강아지수 0, 병아리 0");
		}
	}

}
