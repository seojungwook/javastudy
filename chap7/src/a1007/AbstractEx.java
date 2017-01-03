package a1007;
/*
 * �߻�Ŭ������ �̿ϼ� Ŭ����
 * 	�߻�޼��带 ���� �� �ִ� Ŭ����
 * 	��üȭ �Ұ�
 * 	��üȭ�� �Ϸ��� �ݵ�� ����� ���ؼ� �ڼ�Ŭ������ ��ü�� ��üȭ�� ����
 * 	�׿ܴ� �Ϲ�Ŭ����ó�� ������, �������, ����޼��带 ����� ���� �� �ִ�.
 * 	������ ǥ��ȭ�� ����Ѵ�. 
 * 
 * 	�߻�޼���
 * 		����θ� �����ϴ� �޼���, �����ΰ� ����.
 * 		�ڼ�Ŭ�������� �ݵ�� �������̵��ؾ� �Ѵ�.@
 */
abstract class Player{ //�߻�Ŭ����
	boolean pause; 
	int currentPos;
	Player(){
		currentPos = 0;
	}
	abstract void play(int pos); //�߻�޼���
	abstract void stop();		// �߻�޼���
	void play(){ 				//�����ε�(�̰� �Ǿ�� ��üȭ?)
		play(currentPos);		//�߻�޼��� ȣ��
	}
	void pause() {
		if(pause){
			pause = false;
			play(currentPos);
		}else {
			pause = true;
			stop();
		}
	}
}
class CDPlayer extends Player{  //�׳� ����� abstract�޼��带 ����϶�� ������ 

	@Override
	void play(int pos) {
		// TODO Auto-generated method stub
		System.out.println("CDPlayer play~~");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("CDPlayer stop!");
	}
	
}
class MP3Player extends Player{

	@Override
	void play(int pos) {
		// TODO Auto-generated method stub
		System.out.println("MP3Player play~~");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("MP3Player stop!");
	}
	
}
public class AbstractEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player[] player = new Player[2];
		player[0] = new CDPlayer();
		player[1] = new MP3Player();
		for(Player p : player){
			p.play();
			p.pause();
			p.stop(); //���� �������̵��� �޼ҵ����
			}
	}
}

/*
 * 1.�߻�Ŭ�������� ����� �ڼ�Ŭ�������� �߻�޼��带 �������̵� ���� ���� �� �ִ�.
 * �ڼ��� �߻�Ŭ������ ��ӹ��� �Ϲ� Ŭ������ 
 * �θ� �߻�Ŭ������ �߻�޼���� �ڼ��߻�Ŭ������ �߻�޼��带 ��� �������̵� �ؾ��Ѵ�. 
 */ 

abstract class Abs1 {
	abstract void method1();
}
abstract class Abs2 extends Abs1{ //�̰� 1.�� ���̾�
	
}
class Gclass extends Abs2{

	@Override
	void method1() {
		// TODO Auto-generated method stub
		
	}

}
