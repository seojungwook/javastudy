package a1014;

import java.util.HashSet;

/*
 * Set 객체의 중복여부 검증하는 메서드
 * 	equals() 	
 * 	hashCode()
 * 	equals()의 결과가 참이고, hashCode()의 결과가 같으면 => 중복객체
 */
class Person{
	String name;
	int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode()+ age;
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Person){
			Person p = (Person)obj;
			return name.equals(p.name)&&(age== p.age);
		}
		return false;
	}


	public String toString(){
		return "[name=" + name + ", age=" + age+ "]";
	}
}
public class HashSetEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		set.add(new String("abc")); //true
		set.add(new String("abc")); //false
		set.add(new Person("홍길동",10)); //true
		set.add(new Person("홍길동",10)); //false
		System.out.println(set.toString());
	}

}
