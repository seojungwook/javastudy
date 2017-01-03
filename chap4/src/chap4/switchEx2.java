package chap4;

import java.util.Scanner;

/*
 * switch 구문을 이용하여 시스템과 가위바위보게임하기
 * 
 */
public class switchEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int srp; //시스템이 정한 가위바위보
		//가위(1), 바위(2), 보(3) 임의의 값을 저장됨
		/*
		 * 임의의 수 리턴(난수 발생 메서드)
		 * 		0 <= Math.random()   < 1.0
		 * 		0 <= Math.random()*3 < 3.0 
		 * 		0 <= (int)Math.random()*3 < 3    정수 취해줘서 가능한 숫자 0,1,2 
		 * 	+1 해줘서 srp : 1,2,3의 값을 갖는다.
		 * 
		 */
		srp = (int)(Math.random() * 3) + 1;
		System.out.println("가위(1), 바위(2), 보(3)를 숫자로 입력하세요");
		Scanner scan = new Scanner(System.in);
		int mySrp = scan.nextInt();
		boolean win = false; //true값은 내가 승리
		System.out.print("시스템 : " + srp + ", 나 : " + mySrp);
		
		if(mySrp == srp)
			System.out.println(" \t비겼습니다");
		else{
			switch(srp){
			case 1 : 
				if(mySrp==2) win = true; break;
			case 2 : 
				if(mySrp==3) win = true; break;
			case 3 : 
				if(mySrp==1) win = true; break;
			}
			
			if (win)
				System.out.println(" \t내가 승리!");
			else
				System.out.println(" \t시스템 승리");
			
		}
	}

}
