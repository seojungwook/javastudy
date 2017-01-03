package a1019;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/*
 * Random 클래스 : seed 설정 가능 
 * 					자료형별로 난수 발생 가능
 * 					범위 지정가능 nextInt(n) : 0 ~ n-1
 * Math.random() : 0.0 ~ 0.9999999 임의의 수 리턴
 * 					seed값 설정 안됨
 */
public class RandomEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		/*
		 * System.currentTimeMillis() : 
		 * 		1970년 시작부터 현재까지의 밀리초를 
		 * 		long타입 리턴
		 */
		rand.setSeed(System.currentTimeMillis());
		Random rand2 = new Random();
	//	rand2.setSeed(System.currentTimeMillis()); //결과를 다르게 하려면 +1
		rand2.setSeed(System.currentTimeMillis() +1);
		System.out.println("= rand =");
		for(int i=0; i<5; i++)
			System.out.println(i + ":" + rand.nextInt(100)); //0~99까지의 값을 넘겨줘
		System.out.println();
		System.out.println("= rand2 =");
		for(int i=0; i<5; i++)
			System.out.println(i + ":" + rand2.nextInt(100));
		//로또번호를 추출하기 (1~ 45) 6개
		//TreeSet를 이용하여 중복제거
		Random rand3 = new Random();
		Set<Integer> lotto = new TreeSet<Integer>();
		rand3.setSeed(System.currentTimeMillis());
		while(true){
			lotto.add(rand3.nextInt(45)+1);
			if(lotto.size()>5){ //size() : lotto 객체안의 객체의 갯수
				System.out.println(lotto);
					break;
			}
		}
	}

}
