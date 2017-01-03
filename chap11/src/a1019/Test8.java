package a1019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student3 implements Comparable{
	String name;
	int ban;
	int no;
	int kor, eng, math;
	
	int total;
	int schoolRank;
	
	Student3(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		total = kor + eng + math;
		
	}
	int getTotal(){
		return total;
	}
	
	float getAverage(){
		return (int)((getTotal()/3f)*10+0.5)/10f;
	}
	
	public String toString() {
		return name +"," + ban + "," + no + "," + kor + "," + eng + "," + math
				+ "," +getTotal() + "," + getAverage() + "," +schoolRank;
	}
	@Override
	public int compareTo(Object o) { 
			
			Student3 s = (Student3)o;
			return (s.getTotal() - total); //내림차순정렬형태
			
	}
}

public class Test8 {
	public static void main(String[] args) {
		ArrayList<Student3> list = new ArrayList<Student3>();
		list.add(new Student3("이자바",2,1,70,90,70));
		list.add(new Student3("안자바",2,2,60,100,80));
		list.add(new Student3("홍길동",1,3,100,100,100));
		list.add(new Student3("남궁성",1,1,90,70,80));
		list.add(new Student3("김자바",1,2,80,80,90));
		
		
		calculateSchoolRank(list);
		
		Iterator it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}

	public static void calculateSchoolRank(ArrayList<Student3> list) {
		// TODO Auto-generated method stub
		Collections.sort(list);
		
		int prevRank = -1;
		int prevTotal = -1;
		int length = list.size();
		
		int rank=0;
		for(Student3 stu : list){
			if(stu.getTotal() == prevTotal){
				stu.schoolRank = prevRank;
				++rank;
			} else {
				stu.schoolRank = ++rank;
				prevTotal = stu.getTotal();
				prevRank = rank;
			}
		}
	/*	for(int i=0; i<length;i++){
			Student3 s = (Student3)list.get(i);
			if(s.total==prevTotal){
				s.schoolRank = prevRank;
			}else{
			s.schoolRank = i + 1;
			}
			
			prevRank = s.schoolRank;
			prevTotal = s.total;
		
		}*/
		
	}
}
