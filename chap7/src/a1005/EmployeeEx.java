package a1005;

import java.util.Date;

/*
 * ȸ�簡 ����ϴ� ���� ������ �������� �ִ�.
 * ������ ���������� �������������� ������.
 * ������������ �ӽ������� ���� ������� ������.
 * 
 * ��� ������ ��������(type), �̸�(name), �ּ�(address), �ҼӺμ�(dept)������ ������.
 * ���������� ������ȣ(empNo), ����(position), ����(salary)�� ������.
 * ������������ ��ุ����(expireDate), �⺻�ӱ�(primaryPay)�� ������.
 * �ӽ������� �ð��� �ӱ�(timePay), �ٹ��ð�(empTime)�� ������.
 * ���ϻ���� �ӱ�������(payRate)�� ������.
 * ����Ŭ����(Employee)
 * ��������(FormalEmployee)
 * ����������(InformalEmployee)
 * �ӽ�����(TempEmployee)
 * ��������(InternEmployee)Ŭ������ �Ѵ�.
 * 
 * ��� ������ �޿��� �޴´�. 
 * ���������� �޿��� ���� / 12 ��
 * ������������ �⺻�ӱ�
 * �ӽ����� �⺻�ӱ� + (�ð��� �ӱ� * �ٹ��ð�)
 * ���ϻ�� �⺻�ӱ� * �ӱ�������
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
	} // ��� : �޿� ����


	@Override
	public String toString() {
		return "����  [type=" + type + ", name=" + name + ", address=" + address + ", dept=" + dept;
	}
}
//
class FormalEmployee extends Employee{
	String empNo; //������ȣ
	String position; //����
	int salary; //����
	
	
	public FormalEmployee(String name, String address, String dept, 
			String empNo, int salary, String position) {
		super("������", name, address, dept);
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
	Date expireDate; //��ุ����
	int primaryPay; //�⺻�ӱ�
	
	public InformalEmployee(String name, String address, String dept, 
			Date expireDate, int primaryPay) {
		super("��������", name, address, dept);
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
	int timePay; //�ð��� �ӱ�
	int empTime; // �ٹ��ð�
	
	public TempEmployee(String name, String address, 
			String dept, Date expireDate, int primaryPay,
			int timePay, int empTime) {
		super("�ӽ���", name, address, dept, expireDate, primaryPay);
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
	float payRate; //�ӱ�������
	
	public InternEmployee(String name, String address, 
			String dept, Date expireDate, int primaryPay,
			float payRate) {
		super("���ϻ��", name, address, dept, expireDate, primaryPay);
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
		//�������� ��ü ����
		FormalEmployee fe = new FormalEmployee("������", "����� ��걸", "�ѹ���", "1", 5000, "����");
		System.out.println(fe.toString());
		System.out.print(fe.name + "�� �޿� : ");
		fe.getPay();
		
		//���������� ��ü ����
		Date expireDate = new Date(); // ���� ��¥ ��ü ����
		//expireDate.getTime()   : 1970�� ���� ��������� �ð��� �и� sec(1/1000��)�� ����
		//2�� ��(1000L �и�sec, 60s, 60m, 24h, 365�� *2)
		expireDate.setTime(expireDate.getTime() + 1000L * 60 * 60 *24 * 365 *2); 
		InformalEmployee ie = new InformalEmployee("�̺���", "����� ���α�", "������", expireDate, 1000);
		System.out.println(ie);
		System.out.print(ie.name + "�� �޿� : ");
		ie.getPay(); 
		
		TempEmployee te = new TempEmployee("���ӽ�", "��⵵ ����", "�λ��", expireDate, 0, 1, 50);
		System.out.println(te);
		System.out.print(te.name + "�� �޿� : ");
		te.getPay(); 
		
		InternEmployee ite = new InternEmployee("������", "����� ��걸", "��ȹ��", expireDate, 2000, 0.8f);
		System.out.println(ite);
		System.out.print(ite.name + "�� �޿� : ");
		ite.getPay();

	}

}
