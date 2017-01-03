package chap5;

/*
 * 야구게임
 */
import java.util.Scanner;

public class ArrayEx7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numarr[]={0,1,2,3,4,5,6,7,8,9};
		int answer[] = new int[4]; //정답저장
		int rcvData[] = new int[4]; //사용자입력정보
		int strike,ball,cnt=0;
		//시스템의 정답 결정 : answer 값 결정
		for(int i=0; i<10000;i++){
			int index = (int)(Math.random()*10);
			int temp= numarr[0];
			numarr[0]=numarr[index];
			numarr[index]=temp;
		}
		for(int i=0;i<4;i++)
			answer[i]=numarr[i];
		
//		  for(int a : answer)
//		  System.out.print(a);
//		  System.out.println();
		 
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.println("서로 다른 4자리 수를 입력하세요");
			int num = scan.nextInt();
			cnt++; //입력실행 수 
			rcvData[0] = num /1000;
			rcvData[1] = (num%1000) /100;
			rcvData[2] = (num%100)/10;
			rcvData[3] = num%10;
			//3. 스트라이크 수, 볼 수를 결정
			strike = 0;
			ball = 0;
			for(int i =0; i<4;i++){
				for(int j=0; j<4;j++){
					if(rcvData[i]==answer[j]){
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
				//첫번째 자리수가 0까지 나오게 하기 위해
				//%04d 4자리 수인데 num이 4자리가 안되면 앞에 0을 채워라
				(String.format("%04d", num)+ " : " + strike + "스트라이크, " + ball + "볼\n");
		}
	}
}
				
		
			
		
	


