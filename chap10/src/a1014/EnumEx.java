package a1014;
/*
 * ������
 * jdk5.0 ���Ŀ� �߰���.
 * enum ���� 5.0���Ŀ� �߰���
 */
public class EnumEx {
	public enum Lesson{
		C,JAVA,XML,EJB,JSP,Spring  //��ü�� �����?
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lesson le = Lesson.JAVA;
		System.out.println("Lesson : "+le); //JAVA
		System.out.println("XML : "+Lesson.XML); 
		if(le instanceof Object){ // le�� ��ü��?
			System.out.println(le.toString());
			System.out.println(le.getClass().getName()); //a1014.EnumEx$Lesson //$���Ĵ� ����Ŭ����
			System.out.println("����� ������ : "+  le.ordinal());
		}
		le = Lesson.C;
		//System.out.println(le);
		Lesson[] lessons = Lesson.values(); //Lesson �ȿ� �ִ� ��ü�� �� ������
		System.out.println("lessons.length= "+lessons.length);
		for(Lesson n : lessons)
			System.out.println(n+":"+n.ordinal());
	}

}