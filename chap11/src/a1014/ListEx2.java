package a1014;

import java.util.List;
import java.util.Vector;

/*
 * Vector ���� : List �������̽��� ����Ŭ����
 * 		Collection �����ӿ�ũ ������ Ŭ����
 * 		���� �޼����, List �޼��尡 �ִ�.
 * 
 * List ���� Ŭ����
 * 	ArrayList : ��� �޼��尡 �����忡 ����ȭ ���� �ʾҴ�.
 *	 		Thread�� safe�����ʴ�

 * 	Vector    : ��� �޼��尡 �����忡 ����ȭ �Ǿ��ִ�
 * 			Thread�� safe�ϴ�
 */
public class ListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	List v= new Vector();
		Vector v = new Vector();
		v.add(100.3);
		v.add(3.14);
		v.addElement(1005.0); //List�� ��� ���� �ּ�ó���Ѱ� �ȵ�
		
		for(Object o : v)
			System.out.println(o);
		double search = 1005;
		int index = v.indexOf(search);
		if(index >=0 )
			System.out.println(search + "�� ��ġ:"+index);
		else 
			System.out.println(search +"�� �����ϴ�.");
		double del= 3.14;
		if(v.contains(del)){ //v���ο� del �� ����?
			v.removeElement(del);
			System.out.println(del + "�����Ϸ�");
		}
		System.out.println(v);
	}

}
