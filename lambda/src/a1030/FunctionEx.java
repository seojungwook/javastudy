package a1030;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

/*
 * Funtion 인터페이스 : 매개변수와 리턴값도 존재하는 경우에 
 * 					사용하는 함수적 인터페이스
 * 
 */
class Student{
	private String name;
	private int score1;
	private int score2;
	public Student(String name, int score1, int score2) {
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
	}
	public String getName() {
		return name;
	}
	public int getScore1() {
		return score1;
	}
	public int getScore2() {
		return score2;
	}
}
public class FunctionEx {
	private static List<Student> list = Arrays.asList(new Student("홍길동",90,96),
														new Student("김삿갓",95,93));
	/*
	 * Function<T1,T2> : 
	 * 		T1 매개변수로 넘겨주면, T2리턴
	 * Function<Student, String> : 
	 * 		Student 객체를 매개변수로 넘겨주면, String 객체 리턴함.
	 */
	public static void printString(Function<Student,String> f){
		for(Student s : list){
			System.out.print(f.apply(s) + " ");
		}
		System.out.println();
	}
	/*
	 * ToIntFunction<T> : T객체를 매개변수로 넘겨주면 Integer 객체 리턴
	 * ToIntFunction<Student> : Student 객체를 매개변수로 넘겨주면, int값을 리턴
	 */
	static void printInt(ToIntFunction<Student> f){
		for(Student s : list){
			System.out.print(f.applyAsInt(s) + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.println("[학생이름]");
		printString(t->t.getName());
		System.out.println("[점수1]");
		printInt(t->t.getScore1());
		System.out.println("[점수2]");
		printInt(t->t.getScore2());
	}
}
