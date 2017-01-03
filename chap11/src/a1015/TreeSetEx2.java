package a1015;

import java.util.TreeSet;

/*
 * Comparator 인터페이스 연습
 */
public class TreeSetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set1 = new TreeSet();
		TreeSet set2 = new TreeSet(new Descending());
		int[] score = {30,50,10,20,40};
		for(Integer i : score){
			set1.add(i); //Integer 객체 추가(Collection은 객체들의 모임이니 정수x)
			set2.add(i);
		}
		System.out.println("set1 :"+ set1);
		System.out.println("set2 :"+ set2);
	}
}
