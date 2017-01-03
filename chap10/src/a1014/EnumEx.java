package a1014;
/*
 * 열거형
 * jdk5.0 이후에 추가됨.
 * enum 예약어가 5.0이후에 추가됨
 */
public class EnumEx {
	public enum Lesson{
		C,JAVA,XML,EJB,JSP,Spring  //객체를 만든것?
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lesson le = Lesson.JAVA;
		System.out.println("Lesson : "+le); //JAVA
		System.out.println("XML : "+Lesson.XML); 
		if(le instanceof Object){ // le가 객체니?
			System.out.println(le.toString());
			System.out.println(le.getClass().getName()); //a1014.EnumEx$Lesson //$이후는 내부클래스
			System.out.println("저장된 정수값 : "+  le.ordinal());
		}
		le = Lesson.C;
		//System.out.println(le);
		Lesson[] lessons = Lesson.values(); //Lesson 안에 있는 객체들 다 가져와
		System.out.println("lessons.length= "+lessons.length);
		for(Lesson n : lessons)
			System.out.println(n+":"+n.ordinal());
	}

}