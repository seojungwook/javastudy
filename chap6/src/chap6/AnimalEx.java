package chap6;
/*
 *  문제 : 동물클래스(Animal)
 *  	멤버변수 : 이름(name), 나이(age)
 *  	멤버메서드 : eat() ;
 *  결과가 이름(name) : 원숭이
 *  	나이(age) : 20
 *  	맜있게 얌얌
 *  출력되도록 동물클래스와 구동클래스를 구현하기
 */
class Animal{
	String name;
	int age;
	//String eat(){return "맛있게 얌얌"; }
	 void eat(String food){ System.out.println(food +" 맛있게 냠냠");}
}

public class AnimalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal r1 = new Animal();
		r1.name = "원숭이";
		r1.age = 20;
		System.out.println("이름 : "+r1.name);
		System.out.println("나이 : "+r1.age);
		//System.out.println(r1.eat());
		// void로 한다면 그냥 
		 r1.eat("바나나");
	}

}
