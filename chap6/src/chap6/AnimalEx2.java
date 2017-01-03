package chap6;
/*
 * Animal2 클래스를 아래 결과가 나오도록 멤버를 구현하기
 * 결과 : 
 * 	원숭이는(은) 26살입니다.
 * 	사자는(은) 1살입니다.
 * 	사람는(은) 100살입니다.
 */
class Animal2{
	int age;
	String name;
	
	Animal2(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Animal2(String name){
		this(name, 1);
	}
	
	Animal2(int age){
		this("사람",age);
		//this.name = "사람";
		//this.age = age;    똑같은 것
	}
	
	void show(){
		 System.out.println(name+"는(은) " + age + "살입니다");	
	}
}
public class AnimalEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal2 a1 = new Animal2("원숭이",26);
		a1.show();
		Animal2 a2 = new Animal2("사자");
		a2.show();
		Animal2 a3 = new Animal2(100);
		a3.show();
	}

}
