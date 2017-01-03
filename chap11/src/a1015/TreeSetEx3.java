package a1015;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * Phone ��ü�� Comparable ��ü�� �ǵ��� Ŭ���� �ٽ� �ۼ�
 * Comparable �������̽� �����ϸ� CompareTo()�޼��带 �̸������� �����ϵ��� ����
 * 
 * ���Ĺ�� ���ϱ� : 
 * 		Comparator ��ü�� �̿��ؼ� ����.
 * 		 ������ �ִ� compare �޼��带 ȣ���Ͽ� ��� ���� : �ռ���,
 * 													��� : �ڼ���
 */
class Phone implements Comparable{
	String name;
	int number;
	Phone(String name, int number){
		this.name = name;
		this.number = number;
	}
	public String toString() {
		return name + ":" + number;
	}
	//
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Phone p = (Phone)o;
		return name.compareTo(p.name);
	}
}
class NameDesc implements Comparator{
	public int compare(Object o1, Object o2) {
		Comparable p1 = (Comparable)o1;
		Comparable p2 = (Comparable)o2;
		return p2.compareTo(p1);
	}
}
//ȫ�浿, ���, �̸���, �Ӳ���
//���, �̸���,ȫ�浿
class NumberDesc implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Phone p1 = (Phone)o1;
		Phone p2 = (Phone)o2;
		return p2.number-p1.number; //�����̰�, ���� �������� �Ϸ��� *-1�ؾ� �Ǵµ� �׳� ��ġ�� �ٲ�
	}
}
class NumberAsc implements Comparator{
//��ȣ ��������
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Phone p1 = (Phone)o1;
		Phone p2 = (Phone)o2;
		return p1.number-p2.number;
	}
	
}

public class TreeSetEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet set1 = new TreeSet();
		//set2 ��ü�� �̸����� �ƴϰ� ��ȣ���� ����(��������)���� ����
		TreeSet set2 = new TreeSet(new NumberDesc());
		set1.add(new Phone("ȫ�浿",1234));
		set1.add(new Phone("���",2345));
		set1.add(new Phone("�̸���",3456));
		set1.add(new Phone("�Ӳ���",4567));
		System.out.println(set1);
		set2.add(new Phone("ȫ�浿",1234));
		set2.add(new Phone("���",2345));
		set2.add(new Phone("�̸���",3456));
		set2.add(new Phone("�Ӳ���",4567));
		System.out.println(set2);
		TreeSet set3 = new TreeSet(new NumberAsc());
		set3.add(new Phone("ȫ�浿",1234));
		set3.add(new Phone("���",2345));
		set3.add(new Phone("�̸���",3456));
		set3.add(new Phone("�Ӳ���",4567));
		System.out.println(set3);
		TreeSet set4 = new TreeSet(new NameDesc());
		set4.add(new Phone("ȫ�浿",1234));
		set4.add(new Phone("���",2345));
		set4.add(new Phone("�̸���",3456));
		set4.add(new Phone("�Ӳ���",4567));
		System.out.println(set4);
	
	}

}
