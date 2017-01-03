package a1027;

import java.io.Serializable;
/*
 * Serializable : ����� ���� �������̽�
 *  => �ش�Ŭ������ ��ü�� ����ȭ�� ������.
 *  => ObjectOutputStream�� ���ؼ� �ܺη� ��ü������ ������.
 *  
 *  ����ȭ��?
 *  		��ü�� �ܺη� ������ ����
 */

public class Customer implements Serializable{
	//serialVersionUID : ��ü������ ������ ����
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	//transient : ��ü�� ������ �� �ش��ʰ� ����
	private transient String jumin;
	
	public Customer(String name, int age, String jumin) {
		this.name = name;
		this.age = age;
		this.jumin = jumin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", jumin=" + jumin + "]";
	}

}
