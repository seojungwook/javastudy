package a1027;

import java.io.Serializable;
/*
 * Serializable : 멤버가 없는 인터페이스
 *  => 해당클래스의 객체는 직렬화가 가능함.
 *  => ObjectOutputStream을 통해서 외부로 객체전송이 가능함.
 *  
 *  직렬화란?
 *  		객체를 외부로 전송이 가능
 */

public class Customer implements Serializable{
	//serialVersionUID : 객체복원시 버전을 설정
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	//transient : 객체를 전송할 때 해당필가 제외
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
