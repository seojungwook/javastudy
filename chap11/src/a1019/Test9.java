package a1019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Student4 implements Comparable{
	String name;
	int ban;
	int no;
	int kor, eng, math;
	
	int total;
	int schoolRank;
	int classRank;
	
	Student4(String name, int ban, int no, int kor, int eng, int math){
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
				+ "," +getTotal() + "," + getAverage() + "," +schoolRank + "," +classRank;
	}
	@Override
	public int compareTo(Object o) { 
			
			Student4 s = (Student4)o;
			return (s.getTotal() - total); //내림차순정렬형태
			
	}
	
}
class ClassTotalComparator implements Comparator<Student4>{

	@Override
	public int compare(Student4 s1, Student4 s2) {
		// TODO Auto-generated method stub
		int result = s1.ban - s2.ban;
		if(result ==0){
			return s2.getTotal() - s1.getTotal();
			
		}
		return result;
	}
	
}
public class Test9 {

	static void calculateClassRank(List<Student4> list){
	Collections.sort(list,new ClassTotalComparator());
	int prevBan = -1;
	int prevRank = -1;
	int prevTotal = -1;
	int length = list.size();
	
	int rank=0;
	for(Student4 stu : list){
		if(prevBan == stu.ban){
		if(stu.getTotal() == prevTotal){
			stu.schoolRank = prevRank;
			++rank;
		} else {
			stu.classRank = ++rank;
			prevTotal = stu.getTotal();
			prevRank = rank;
		}
	}else {
		rank = 0;
		stu.classRank = ++rank;
		prevTotal = stu.getTotal();
		prevRank = rank;
		prevBan = stu.ban;
	}
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student4> list = new ArrayList<Student4>();
		list.add(new Student4("이자바",2,1,70,90,70));
		list.add(new Student4("안자바",2,2,60,100,80));
		list.add(new Student4("홍길동",1,3,100,100,100));
		list.add(new Student4("남궁성",1,1,90,70,80));
		list.add(new Student4("김자바",1,2,80,80,90));
		
		calculateSchoolRank(list);
		calculateClassRank(list);
		
		Iterator it =list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}

	private static void calculateSchoolRank(ArrayList<Student4> list) {
	Collections.sort(list);
		
		int prevRank = -1;
		int prevTotal = -1;
		int length = list.size();
		
		int rank=0;
		for(Student4 stu : list){
			if(stu.getTotal() == prevTotal){
				stu.schoolRank = prevRank;
				++rank;
			} else {
				stu.schoolRank = ++rank;
				prevTotal = stu.getTotal();
				prevRank = rank;
			}
		}
	}
}
