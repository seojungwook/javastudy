package a1019;

import java.io.*;
import java.util.*;
class Test20
{
	static ArrayList record = new ArrayList(); // 성적데이터를 저장할 공간
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
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		} // while(true)
	}
// menu를 보여주는 메서드
	static int displayMenu(){
		System.out.println("**************************************************");
		System.out.println("* 성적 관리 프로그램 *");
		System.out.println("**************************************************");
		System.out.println();
		System.out.println(" 1. 학생성적 입력하기 ");
		System.out.println();
		System.out.println(" 2. 학생성적 보기");
		System.out.println();
		System.out.println(" 3. 프로그램 종료 ");
		System.out.println();
		System.out.print("원하는 메뉴를 선택하세요.(1~3) : ");
		int menu = 0;
		
/*
(1) 아래의 로직에 맞게 코드를 작성하시오.
1. 화면으로부터 메뉴를 입력받는다. 메뉴의 값은 1~3사이의 값이어야 한다.
2. 1~3사이의 값을 입력받지 않으면, 메뉴의 선택이 잘못되었음을 알려주고
다시 입력받는다.(유효한 값을 입력받을 때까지 반복해서 입력받는다.)
*/
		return menu;
	} // public static int displayMenu(){
	static void inputRecord() {
		System.out.println("1. 학생성적 입력하기");
		System.out.println("이름,반,번호,국어성적,영어성적,수학성적'의 순서로 공백없이 입력하세요.");
		System.out.println("입력을 마치려면 q를 입력하세요. 메인화면으로 돌아갑니다.");
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
				System.out.println("잘 입력되었습니다. 입력을 마치려면 q를 입력하세요");
				
			}catch(Exception e){
				System.out.println("입력오류입니다.");
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
			System.out.println("이름 반 번호 국어 영어 수학 총점 평균 전교등수 반등수");
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
			System.out.println("총점: "+koreanTotal+" "+englishTotal
					+" "+mathTotal+" "+total);
			System.out.println();
		} else {
			System.out.println("====================================================");
			System.out.println(" 데이터가 없습니다.");
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
	int classRank; // 반등수
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