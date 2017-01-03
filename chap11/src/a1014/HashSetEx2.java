package a1014;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * HashSet을 이용한 로또번호 생성기
 * Lotto 1 ~ 45까지의 수 중 6개 추첨
 * 
 * Collection : 객체들의 모임
 * 		기본자료형은 Collection의 객체 대상이 아님.
 * 		int -> Integer 객체 저장 (boxing)
 */
public class HashSetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Set lotto = new HashSet();
		Set lotto = new TreeSet(); // 정렬까지
	
		while(true){
			lotto.add((int)(Math.random()*45)+1);
			if(lotto.size()>=6) break;
		}
		System.out.println(lotto);
	}

}
