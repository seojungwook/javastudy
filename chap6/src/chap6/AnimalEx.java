package chap6;
/*
 *  ���� : ����Ŭ����(Animal)
 *  	������� : �̸�(name), ����(age)
 *  	����޼��� : eat() ;
 *  ����� �̸�(name) : ������
 *  	����(age) : 20
 *  	���ְ� ���
 *  ��µǵ��� ����Ŭ������ ����Ŭ������ �����ϱ�
 */
class Animal{
	String name;
	int age;
	//String eat(){return "���ְ� ���"; }
	 void eat(String food){ System.out.println(food +" ���ְ� �ȳ�");}
}

public class AnimalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal r1 = new Animal();
		r1.name = "������";
		r1.age = 20;
		System.out.println("�̸� : "+r1.name);
		System.out.println("���� : "+r1.age);
		//System.out.println(r1.eat());
		// void�� �Ѵٸ� �׳� 
		 r1.eat("�ٳ���");
	}

}
