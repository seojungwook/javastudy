package chap6;
/*
 * Animal2 Ŭ������ �Ʒ� ����� �������� ����� �����ϱ�
 * ��� : 
 * 	�����̴�(��) 26���Դϴ�.
 * 	���ڴ�(��) 1���Դϴ�.
 * 	�����(��) 100���Դϴ�.
 */
class Animal2{
	int age;
	String name;
	
	Animal2(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Animal2(String name){
		this(name, 1);
	}
	
	Animal2(int age){
		this("���",age);
		//this.name = "���";
		//this.age = age;    �Ȱ��� ��
	}
	
	void show(){
		 System.out.println(name+"��(��) " + age + "���Դϴ�");	
	}
}
public class AnimalEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal2 a1 = new Animal2("������",26);
		a1.show();
		Animal2 a2 = new Animal2("����");
		a2.show();
		Animal2 a3 = new Animal2(100);
		a3.show();
	}

}
