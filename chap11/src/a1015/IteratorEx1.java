package a1015;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Vector;

/*
 * Iterator �������̽�
 * 		Collection ��ü�� ��� Iterator ��ü�� ��ȯ�� �����ϴ�.
 * 		hasNext() : ��ȸ����� ������?
 * 		next()    : ��ȸ����� ������
 * 		remove()  : ��ȸ�� ��ü�� ����
 * 
 * ListIterator : Iterator �������̽��� ���� �������̽�
 * 		Iterator�� next()�� ��ȸ����
 * 		ListIterator : ����� ��ȸ ����
 * Enumeration �������̽� : Iterator�� ������
 * 							Vector, Hashtable ��ü�� ��밡��
 * 		hasMoreElement() : ��ȸ����� ����?
 * 		nextElement() : ��ü ��ȸ
 */
public class IteratorEx1 {
	public static void main(String[] args) {
		Iterator it = null;
		List list = new ArrayList();
		list.add("1");list.add("2");list.add("3");
		list.add("4");list.add("5");list.add("6");
		it = list.iterator();
		while(it.hasNext()){ //�����ϳ�?
			System.out.print(it.next()); //������
			it.remove(); //�ݵ�� next() �޼��� ���Ŀ� ȣ�Ⱑ��
		}
		
		System.out.println();
		System.out.println(list);
		Set set = new HashSet();
		set.add("1");set.add("2");set.add("3");
		set.add("4");set.add("5");set.add("6");
		it = set.iterator();
		while(it.hasNext()){
			System.out.print(it.next());
		}
		System.out.println();
		Enumeration e = null;
		Vector v = new Vector();
		v.add(1);v.add(2);v.add(3);
		e = v.elements();
		while(e.hasMoreElements()){
			System.out.print(e.nextElement());
		}
		System.out.println();
		
		it = v.iterator();
		//it ��ü�� ����Ͽ� ȭ�鿡 ���
		while(it.hasNext()){
			System.out.print(it.next());
		}
		System.out.println();
		
		ListIterator lit = v.listIterator();
		
		while(lit.hasNext())
			System.out.print(lit.next());
		System.out.println();
		while(lit.hasPrevious())
			System.out.print(lit.previous());
		System.out.println();
	}
}
