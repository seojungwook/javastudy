package a1015;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * ���׸� ����
 * Collection ��ü���� ���� �ڷ����� ����
 */
public class GenericEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> dlist = new ArrayList<Double>();
		dlist.add(10.1);
		dlist.add(10.2);
		dlist.add(10.3);
		dlist.add(10.4);
		System.out.println(dlist);
		
		for(Double d : dlist)
			System.out.println(d);
		
		Iterator<Double> it = dlist.iterator();
		while(it.hasNext()){
			Double d= it.next();
			System.out.println(d);
		}
		List<Object> list = new ArrayList<Object>();
		list.add(1);list.add("2");list.add(3.0);
		list.add(new Phone("a",1));
		System.out.println(list);
		
	}

}
