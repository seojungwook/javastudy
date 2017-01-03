package test;

class Student{
	String name;
	int ban, no, kor, eng, math;
	
	int getTotal(){
		return kor+eng+math;
	}
	
	float getAverage(){
		return (float)((getTotal()/3.0 + 
				0.05) * 10)/10f;//�����
	}
	Student(){
		
	}
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	String info(){
		return name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","
	+String.format("%.1f",getAverage());
	}

}
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.name = "ȫ�浿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		Student c = new Student("ȫ�浿",1,1,100,60,76);
		
		System.out.println("�̸� :"+ s.name);
		System.out.println("���� :"+ s.getTotal());
		System.out.println("��� :"+ String.format("%.1f",s.getAverage()));
		
		System.out.println(c.info());
	}

}
