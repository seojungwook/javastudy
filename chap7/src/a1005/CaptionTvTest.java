package a1005;
/*
 * ��� : extends�� ǥ��.
 * class �ڼ�Ŭ���� extends �θ�Ŭ���� {
 * 		......
 * }
 * ���ϻ�Ӹ� ���� : �ڼ�Ŭ������ �θ�Ŭ������ �Ѱ��� �����ϴ�
 * 				extends ������ �θ�Ŭ������ �Ѱ��� �����ϴ�.
 * ��üȭ : �ڼ�Ŭ������ ��ü������ �θ�Ŭ������ ��ü�� ���� �����Ѵ�.
 * 			�ڼ�Ŭ������ ��ü�� �θ�Ŭ������ ��ü�� �����Ѵ�.(���ȿ� �θ��ִ�.)
 * �ڹٿ����� Object Ŭ������ ��� Ŭ������ ��ӹ޴´�.
 * ��� ��ü�ȿ��� ObjectŬ������ ��ü�� �����Ѵ�. 227p
 */
class Tv extends Object{
	boolean power;
	int channel;
	void power() {power = !power;}
	void channelUp(){++channel;}
	void channelDown(){--channel;}
}

class CaptionTv extends Tv{
	boolean caption;
	void displayCaption(String text){
		if(caption)
			System.out.println(text);
	}
}
public class CaptionTvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaptionTv ctv = new CaptionTv();
		/* => �ڼ�Ŭ������ ��üȭ�� 
		 * 	  �θ�Ŭ������ ��ü�� ���� �����Ѵ�!
		 * ��Ӱ��迡�� new ������
		 * 1. �θ�Ŭ������ ��ü�� ����, �⺻�� �ʱ�ȭ
		 * 2. �ڼ�Ŭ������ ��ü�� ����, �⺻�� �ʱ�ȭ
		 * 3. ������ȣ��(�θ�Ŭ������ �����ڸ� ���� ����)
		 * 
		 */
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World");
		ctv.caption = true;
		ctv.displayCaption("Hello, World");
	}

}
