package a1030;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

/*
 * Funtion �������̽� : �Ű������� ���ϰ��� �����ϴ� ��쿡 
 * 					����ϴ� �Լ��� �������̽�
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
	private static List<Student> list = Arrays.asList(new Student("ȫ�浿",90,96),
														new Student("���",95,93));
	/*
	 * Function<T1,T2> : 
	 * 		T1 �Ű������� �Ѱ��ָ�, T2����
	 * Function<Student, String> : 
	 * 		Student ��ü�� �Ű������� �Ѱ��ָ�, String ��ü ������.
	 */
	public static void printString(Function<Student,String> f){
		for(Student s : list){
			System.out.print(f.apply(s) + " ");
		}
		System.out.println();
	}
	/*
	 * ToIntFunction<T> : T��ü�� �Ű������� �Ѱ��ָ� Integer ��ü ����
	 * ToIntFunction<Student> : Student ��ü�� �Ű������� �Ѱ��ָ�, int���� ����
	 */
	static void printInt(ToIntFunction<Student> f){
		for(Student s : list){
			System.out.print(f.applyAsInt(s) + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.println("[�л��̸�]");
		printString(t->t.getName());
		System.out.println("[����1]");
		printInt(t->t.getScore1());
		System.out.println("[����2]");
		printInt(t->t.getScore2());
	}
}
