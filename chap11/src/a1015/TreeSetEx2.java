package a1015;

import java.util.TreeSet;

/*
 * Comparator �������̽� ����
 */
public class TreeSetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set1 = new TreeSet();
		TreeSet set2 = new TreeSet(new Descending());
		int[] score = {30,50,10,20,40};
		for(Integer i : score){
			set1.add(i); //Integer ��ü �߰�(Collection�� ��ü���� �����̴� ����x)
			set2.add(i);
		}
		System.out.println("set1 :"+ set1);
		System.out.println("set2 :"+ set2);
	}
}
