package chap5;

import java.util.Scanner;

/*
 * 숫자 맞추기 게임
 * 시스템이 4자리의 서로 다른 수를 저장한 후 사용자가 
 * 저장된 수를 맞추는 게임
 * 		자리수도 맞는 경우 ㅣ 스트라이크
 * 		자리수는 틀리지만 숫자가존재하면 : 볼
 * 		4스트라이크가 되면 정답
 * 	알고리즘
 * 	1. 시스템의 수를 지정(Random함수 사용) 중복 문제
 * 	2. 화면으로부터 4자리 정수를 입력
 * 	3. 시스템의 수와 입력된 수를 비교하여 스트라이크와 볼을 결정, 화면 출력
 * 	4. 4스트라이크가 될 때까지 2,3을 계속 실행
 * 	5. 정답이 된 경우 몇번만에 정답을 맞췄는지 입력횟수를 화면에 출력하기
 * 
 */
public class ArrayEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base[] = new int[4];
		int ran[] = {0,1,2,3,4,5,6,7,8,9};
		int imp[] = new int[4];
		int cnt = 0, mok =0;
		//int im1=0;
		int strike=0, ball=0;
		
		for(int i=0; i<1000;i++){
			int index = (int)(Math.random()*10);
			int temp = ran[0];
			ran[0] = ran[index];
			ran[index] = temp;
		}
		for(int i=0; i<4;i++){
			base[i] = ran[i];
		}
		for(int i=0; i<4; i++)
		System.out.print(base[i]);
		//System.out.print("\n서로 다른 4자리 수를 입력하세요");
		System.out.println();
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("서로 다른 4자리 수를 입력하세요");
			int num = scan.nextInt();
			cnt++;
			imp[0] = num /1000;
			imp[1] = (num%1000) /100;
			imp[2] = (num%100)/10;
			imp[3] = num%10;
			strike = 0;
			ball = 0;
			for(int i =0; i<4;i++){
				for(int j=0; j<4;j++){
					if(imp[i]==base[j]){
						if(i==j)strike++;
						else ball++;
						break;
					}
				}
			}
			if(strike==4){
				System.out.println(num+"정답입니다.");
				System.out.println(cnt +"번만에 맞추셨습니다. 게임을 종료합니다.");
				break;
			} else
				System.out.println
				(String.format("%04d", num)+ " : " + strike + "스트라이크, " + ball + "볼\n");
			
		}
		/*int im= scan.nextInt();
		int op = im;
		for(int i=3; i<0; i--){
			imp[i]= im%10;
			im/=10;
		}
		for(int i=0; i<4; i++ ){
			if(base[i]==imp[i]){
				cnt1++;
			}
		}
		for(int i=0; i<1; i++){
			
			if(base[i]%10==im%10){
				cnt1++;
				mok=base[i]%10;
				im1=im;
			}
			if(mok%10== im1%10)cnt1++;{
				cnt1++;
				mok=base[i]%10;
				im1=im;
			}
			if(mok%10== im1%10)cnt1++;{
				cnt1++;
				mok=base[i]%10;
				im1=im;
			}
		
			
				/*if()
				for(int j=0; j<2; j++){
				if(base[j]%100== )
				}
		}
	System.out.println(cnt1);*/
			
	}

}
