package a1007;
/*
 * �������̽� ����
 * 1. �������̽��� ����� �߻�޼���� ����� �����ϴ�.
 * 	    ����� ���� ���� �ִ�.
 * 2. ��üȭ �Ұ� => ����Ŭ������ ��üȭ ���� ( �߻�Ŭ������ ���� Ŭ�������� ��äȭ)
 * 3. Ŭ������ �������̽����� �����̶� �Ѵ�.
 * 	    ���߱����� �����ϴ�.
 * 4. �������̽������� ����� �����ϴ�.
 * 	    �������̽����� ����� ���߻���� �����ϴ�.
 * interface �������̽��� {
 * 		(public static final)(������ �̷���! �̷��� ���⿡ �Ƚᵵ������ �ڱⰡ ��) �ڷ��� �����=100;  
 * 		(public abstract) ����Ÿ�� �߻�޼���(�Ű�����);  
 * }
 */
interface Movable{
	public static final int Max = 100; //public static final�� �����ص� ������ ���
	public abstract void move(int x, int y);
	
}
interface Attackable{
	public abstract void attack(Unit u);
}
interface Fightable extends Movable, Attackable{  // �������̽����� ���� ���
	
}
class Unit {
	int currentHp, x, y;
}
//Fighter : ����Ŭ���� : �������̽��� ������ Ŭ����
//implements : ����(���߱����� ����)
class Fighter extends Unit implements Fightable{

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("�̵� �� ~~");
	}

	@Override
	public void attack(Unit u) {
		// TODO Auto-generated method stub
		System.out.println("�ο���!");
	}
	
}
public class FighterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighter f = new Fighter();
		System.out.println(Movable.Max);
		f.move(20, 30);
		f.attack(f);
		f. currentHp =10;
		Unit u = f;
		// u.move(); //Unit�� ����� �ƴϱ⶧���� ����
		u.x= 100;
		u.y=200;
		u.currentHp=10;
		Movable m =f;
		System.out.println(m.Max);
		if (m instanceof Fighter){
			System.out.println("m ��ü�� Fighter ��ü��");
		}
		if (m instanceof Unit){ //m ������ ������ Unit ��ü��?? but m ��ü�� Movable�� �ִ°͸� ���
			System.out.println("m ��ü�� Unit�� ��ü��");
			u= (Unit)m;
		}
		if(m instanceof Fightable){
			System.out.println("m ��ü�� Fightable�� ��ü��");
			Fightable f2= (Fightable)m;
			f2.attack(u);
			f2.move(10, 20);
			System.out.println(f2.Max);
			//f2.x=10; // Fightable ��� �ƴ�
		}
		if(m instanceof Movable){
			System.out.println("m ��ü�� Movable�� ��ü��");
			m.move(10,20);
			System.out.println(m.Max);
		}
		
		if(m instanceof Attackable){
			System.out.println("m ��ü�� Attackable�� ��ü��");
			Attackable at = (Attackable)m;
			at.attack(u);
			//at.move(1,1); // Atackable ��� �ƴ�
		}
		if(m instanceof Object){
			System.out.println("m ��ü�� Object�� ��ü��");
			Object o = m;
			
		}
	}

}
