package a1015;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * TreeSet ����
 * 	: �ߺ��Ұ�, ���ĵ�.
 * 
 * ���İ��� �������̽�
 * Comparator �������̽� : ���Ĺ������
 * 			compare(Object obj);
 * Comparable �������̽� :
 * 			compareTo() : ���� : ���� ��(���� ��)
 * 						  ��� : ���� ��(ū ��)
 */
public class TreeSetEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	TreeSet set = new TreeSet();
		//TreeSet ��ü ������ ���Ĺ���� ����
		//Comparator ��ü���� ��. //Descending�� Comparator�������̽��� �����ؾ��Ѵ�.
		//Descending�� Comparator�� ��ü������
		//TreeSet�� ��ü�� �߰��� Comparator ��ü������ compare �޼��� ȣ�� 
		TreeSet set = new TreeSet(new Descending());
		String from ="bat";
		String to = "d";
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("azz");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("dzzzz");
		set.add("elevator");
		set.add("fan");
		set.add("flower");
		System.out.println(set);
		//subSet ���
	//	System.out.println("from:" + from + ",to:"+ to);
		System.out.println("from:" + to + ",to:"+ from);
		System.out.println(set.subSet(to, from));
		//System.out.println("from:" + from + ",to:" + to + "zzzz");
		System.out.println("from:" + to + "zzzz" + ",to:" + from );
		System.out.println(set.subSet(to+"zzzz", from ));
		
	}

}
class Descending implements Comparator {
	
	@Override
	public int compare(Object o1, Object o2){ //Comparator�� �����߱⿡ 
											//  Comparator�� ������ �ִ� compare �� �������̵��ؾߵ�
		Comparable c1 = (Comparable)o1;
		Comparable c2 = (Comparable)o2;
		
		return c1.compareTo(c2)*(-1); //������ �����(�ݴ�� ����)
		
	}
	
}
