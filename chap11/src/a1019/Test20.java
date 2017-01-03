package a1019;

import java.io.*;
import java.util.*;
class Test20
{
	static ArrayList record = new ArrayList(); // ���������͸� ������ ����
	static Scanner s = new Scanner(System.in);
	public static void main(String args[]) {
		while(true) {
			switch(displayMenu()) {
			case 1 :
				inputRecord();
				break;
			case 2 :
				displayRecord();
				break;
			case 3 :
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			}
		} // while(true)
	}
// menu�� �����ִ� �޼���
	static int displayMenu(){
		System.out.println("**************************************************");
		System.out.println("* ���� ���� ���α׷� *");
		System.out.println("**************************************************");
		System.out.println();
		System.out.println(" 1. �л����� �Է��ϱ� ");
		System.out.println();
		System.out.println(" 2. �л����� ����");
		System.out.println();
		System.out.println(" 3. ���α׷� ���� ");
		System.out.println();
		System.out.print("���ϴ� �޴��� �����ϼ���.(1~3) : ");
		int menu = 0;
		
/*
(1) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�.
1. ȭ�����κ��� �޴��� �Է¹޴´�. �޴��� ���� 1~3������ ���̾�� �Ѵ�.
2. 1~3������ ���� �Է¹��� ������, �޴��� ������ �߸��Ǿ����� �˷��ְ�
�ٽ� �Է¹޴´�.(��ȿ�� ���� �Է¹��� ������ �ݺ��ؼ� �Է¹޴´�.)
*/
		return menu;
	} // public static int displayMenu(){
	static void inputRecord() {
		System.out.println("1. �л����� �Է��ϱ�");
		System.out.println("�̸�,��,��ȣ,�����,�����,���м���'�� ������ ������� �Է��ϼ���.");
		System.out.println("�Է��� ��ġ���� q�� �Է��ϼ���. ����ȭ������ ���ư��ϴ�.");
		while(true) {
			System.out.print(">>");
			String input = s.next();
			if(input.equalsIgnoreCase("q")) break;
			Scanner s2 = new Scanner(input);
			s2.useDelimiter(",");
			try{
				String name = s2.next();
				int ban = s2.nextInt();
				int no = s2.nextInt();
				int kor = s2.nextInt();
				int eng = s2.nextInt();
				int math = s2.nextInt();
				record.add(new Student5(name,ban,no,kor,eng,math));
				System.out.println("�� �ԷµǾ����ϴ�. �Է��� ��ġ���� q�� �Է��ϼ���");
				
			}catch(Exception e){
				System.out.println("�Է¿����Դϴ�.");
			}

		}
	} 
	static void displayRecord() {
		int koreanTotal = 0;
		int englishTotal = 0;
		int mathTotal = 0;
		int total = 0;
		int length = record.size();
		if(length > 0) {
			System.out.println();
			System.out.println("�̸� �� ��ȣ ���� ���� ���� ���� ��� ������� �ݵ��");
			System.out.println("====================================================");
			for (int i = 0; i < length ; i++) {
				Student student = (Student)record.get(i);
				System.out.println(student);
				koreanTotal += student.kor;
				mathTotal += student.math;
				englishTotal += student.eng;
				total += student.getTotal();
			}
			System.out.println("====================================================");
			System.out.println("����: "+koreanTotal+" "+englishTotal
					+" "+mathTotal+" "+total);
			System.out.println();
		} else {
			System.out.println("====================================================");
			System.out.println(" �����Ͱ� �����ϴ�.");
			System.out.println("====================================================");
		}
	} // static void displayRecord() {
}
class Student5 implements Comparable {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int total;
	int schoolRank;
	int classRank; // �ݵ��
	Student5(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor+eng+math;
	}
	int getTotal() {
		return total;
	}
	float getAverage() {
		return (int)((getTotal()/ 3f)*10+0.5)/10f;
	}
	public int compareTo(Object o) {
		if(o instanceof Student) {
			Student5 tmp = (Student5)o;
			return tmp.total - this.total;
		} else {
			return -1;
		}
	}
	public String toString() {
		return name
				+","+ban
				+","+no
				+","+kor
				+","+eng
				+","+math
				+","+getTotal()
				+","+getAverage()
				+","+schoolRank
				+","+classRank;
	}
}