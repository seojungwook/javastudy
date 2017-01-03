package a1012;
/*
 * toString() 메서드
 * 객체의 문자열화에 관여하는 메서드
 * Object 클래스에 구현된 내용은 클래스명@16진수해쉬코드값으로 표현됨.
 */
class Value2{
	int value;
	Value2(int value){
		this.value= value;
	}
	//멤버를 조회하도록 toString()메서드 오버라이딩 필요
	@Override
	public String toString() {
		return "Value2 [value=" + value + "]";
	}
}
public class ToStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Value2 v1 = new Value2(10);
		Value2 v2 = new Value2(10);
		System.out.println(v1);//참조변수만 하면 자동으로 toString() 메서드 호출
		System.out.println(v2);
		Class c = v1.getClass();//v1이라는 객체가 누구의 객체냐
								//(다형성부분말고는 대부분 참조변수는 객체)
		System.out.println(c.getName());
		Object o = v1;
		System.out.println(o.getClass().getName());
	}

}
