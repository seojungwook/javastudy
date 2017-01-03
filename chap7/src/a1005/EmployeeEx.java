package a1005;

import java.util.Date;

/*
 * 회사가 고용하는 여러 유형의 직원들이 있다.
 * 지원은 정규직원과 비정규직원으로 나뉜다.
 * 비정규직원은 임시직원과 인턴 사원으로 나뉜다.
 * 
 * 모든 직원은 지원구분(type), 이름(name), 주소(address), 소속부서(dept)정보를 가진다.
 * 정규직원은 직원번호(empNo), 직급(position), 연봉(salary)를 가진다.
 * 비정규직원은 계약만료일(expireDate), 기본임금(primaryPay)를 가진다.
 * 임시직원은 시간당 임금(timePay), 근무시간(empTime)을 가진다.
 * 인턴사원은 임금지급율(payRate)를 가진다.
 * 직원클래스(Employee)
 * 정규직원(FormalEmployee)
 * 비정규직원(InformalEmployee)
 * 임시직원(TempEmployee)
 * 인턴직원(InternEmployee)클래스로 한다.
 * 
 * 모든 직원은 급여를 받는다. 
 * 정규직원은 급여로 연봉 / 12 로
 * 비정규직원은 기본임금
 * 임시직원 기본임금 + (시간당 임금 * 근무시간)
 * 인턴사원 기본임금 * 임금지급율
 */

class Employee{
	String type;
	String name; 
	String address;
	String dept;
	
	public Employee(String type, String name, String address, String dept) {
		
		this.type = type;
		this.name = name;
		this.address = address;
		this.dept = dept;
	}


	void getPay(){
	} // 기능 : 급여 지급


	@Override
	public String toString() {
		return "직원  [type=" + type + ", name=" + name + ", address=" + address + ", dept=" + dept;
	}
}
//
class FormalEmployee extends Employee{
	String empNo; //직원번호
	String position; //직급
	int salary; //연봉
	
	
	public FormalEmployee(String name, String address, String dept, 
			String empNo, int salary, String position) {
		super("정규직", name, address, dept);
		this.empNo = empNo;
		this.position = position;
		this.salary = salary;
	}
	
	@Override
	void getPay(){
		System.out.println(salary/12);	
	}

	@Override
	public String toString() {
		return super.toString() +
				", empNo=" + empNo + ", position=" + position + ", salary=" + salary + "]";
	}
}


class InformalEmployee extends Employee{
	Date expireDate; //계약만료일
	int primaryPay; //기본임금
	
	public InformalEmployee(String name, String address, String dept, 
			Date expireDate, int primaryPay) {
		super("비정규직", name, address, dept);
		this.expireDate = expireDate;
		this.primaryPay = primaryPay;
	}
	
	public InformalEmployee(String type, String name, String address, String dept, 
			Date expireDate, int primaryPay) {
		super(type, name, address, dept);
		this.expireDate = expireDate;
		this.primaryPay = primaryPay;
	}
	
	@Override
	void getPay(){
		System.out.println(primaryPay);	
	}

	@Override
	public String toString() {
		return super.toString() +
				"  expireDate=" + expireDate + ", primaryPay=" + primaryPay ;
	}
	
}

class TempEmployee extends InformalEmployee{
	int timePay; //시간당 임금
	int empTime; // 근무시간
	
	public TempEmployee(String name, String address, 
			String dept, Date expireDate, int primaryPay,
			int timePay, int empTime) {
		super("임시직", name, address, dept, expireDate, primaryPay);
		this.timePay = timePay;
		this.empTime = empTime;
	}
	
	@Override
	void getPay(){
		System.out.println(primaryPay + (timePay*empTime));	
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"  timePay=" + timePay + ",  empTime=" +  empTime;
	}
}
class InternEmployee extends InformalEmployee{
	float payRate; //임금지급율
	
	public InternEmployee(String name, String address, 
			String dept, Date expireDate, int primaryPay,
			float payRate) {
		super("인턴사원", name, address, dept, expireDate, primaryPay);
		this.payRate =  payRate;
		
	}
	
	@Override
	void getPay(){
		System.out.println(primaryPay*payRate);	
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"  payRate=" + payRate ;
	}
}


public class EmployeeEx {

	public static void main(String[] args) {
		//정규직원 객체 생성
		FormalEmployee fe = new FormalEmployee("김정규", "서울시 용산구", "총무부", "1", 5000, "과장");
		System.out.println(fe.toString());
		System.out.print(fe.name + "의 급여 : ");
		fe.getPay();
		
		//비정규직원 객체 생성
		Date expireDate = new Date(); // 오늘 날짜 객체 생성
		//expireDate.getTime()   : 1970년 부터 현재까지의 시간을 밀리 sec(1/1000초)로 리턴
		//2년 후(1000L 밀리sec, 60s, 60m, 24h, 365일 *2)
		expireDate.setTime(expireDate.getTime() + 1000L * 60 * 60 *24 * 365 *2); 
		InformalEmployee ie = new InformalEmployee("이비정", "서울시 구로구", "영업부", expireDate, 1000);
		System.out.println(ie);
		System.out.print(ie.name + "의 급여 : ");
		ie.getPay(); 
		
		TempEmployee te = new TempEmployee("박임시", "경기도 고양시", "인사부", expireDate, 0, 1, 50);
		System.out.println(te);
		System.out.print(te.name + "의 급여 : ");
		te.getPay(); 
		
		InternEmployee ite = new InternEmployee("김인턴", "서울시 용산구", "기획부", expireDate, 2000, 0.8f);
		System.out.println(ite);
		System.out.print(ite.name + "의 급여 : ");
		ite.getPay();

	}

}
