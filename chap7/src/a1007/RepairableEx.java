package a1007;
/*
 * 인터페이스의 사용
 */
interface Repairable{}
class Unit2{
	int hitPoint;
	final int MAX_HP;
	Unit2(int hp){
		MAX_HP = hp;
	}
}
class GroundUnit extends Unit2{
	GroundUnit(int hp){ super(hp);}
	
}
class AirUnit extends Unit2{
	AirUnit(int hp){ super(hp); }
}

class Tank extends GroundUnit implements Repairable{
	Tank() {super(150);}
	public String toString(){return "Tank";}
}
class DropShip extends AirUnit implements Repairable{
	DropShip() { super(125); }
	public String toString() {return "DropShip"; }
}
class Marine extends GroundUnit{
	Marine() { super(40);}
	public String toString() { return "Marine"; }
}
class SCV extends GroundUnit implements Repairable{
	SCV(){ super(60); }
	public String toString() { return "SCV"; }
	void repair (Repairable r){
		if(r instanceof Unit2){
			Unit2 u = (Unit2)r; //hitPoint 사용하려고
			u.hitPoint = u.MAX_HP;
		}
		System.out.println(r + "수리 완료!");
	}
}
public class RepairableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank t = new Tank();
		DropShip d = new DropShip();
		Marine m = new Marine();
		SCV s = new SCV();
		s.repair(t);
		s.repair(d);
	//	s.repair(m); //Mairne 객체는 Repairable 형으로 형변환이 불가능
		s.repair(s);
	}
}
