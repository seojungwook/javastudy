package a1019;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;


/*
 * 1 ~ 10000번까지의 번호를 갖는 복권 중에서
 * 1등 1장, 2등 2장, 3등 3장을 추첨하는 프로그램
 * 3등부터 추첨. 중복되면 안됨.
 * Set LinkedHashSet : 순서유지, 중복불가
 * Random
 * ArrayList(set)
 */
public class LotteryEx {
	public static void main(String[] args) {
		Set<Integer> lottory = new LinkedHashSet<Integer>();
	
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		int grade =3;
		while(lottory.size() < 6){
			if(lottory.size()==0 || lottory.size()==3||lottory.size()==5){
				System.out.println(grade + "등 복권 추첨합니다.");
				grade--;
			}
		
		int num = rand.nextInt(10000)+1;
		if(!lottory.add(num)) //중복때문에
			continue;
		System.out.println(num);
	}
		System.out.println();
		System.out.println("***복권 추첨 결과 ***");
		List<Integer> list = new ArrayList<Integer>(lottory);
		grade = 1;
		for(int i=list.size()-1; i>=0; i--){
			if(i==5 || i==4 || i==2){
				System.out.println();
				System.out.print(grade + "등:");
				grade++;
			}
			System.out.print(list.get(i)+",");
			}
		}
}
