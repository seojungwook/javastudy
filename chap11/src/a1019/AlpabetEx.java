package a1019;

import java.util.Random;

/*
 * Random 클래스를 이용하여 알파벳 대문자들 중 
 * 무작위로 추출하여 다음과 같이 출력하기
 * [출력]
 * G K O P W
 * R V T S K
 * Z O P U T
 */
public class AlpabetEx {
	public static void main(String[] args) {
		char c= 0;
		Random r = new Random();
		r.setSeed(System.currentTimeMillis());
			for(int j = 0; j<3; j++){
				for(int i = 0; i<5; i++){
					c = (char)(r.nextInt(26)+65);
				System.out.print(c+ " ");
				}
			System.out.println();
			}
		}
}
