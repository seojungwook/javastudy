package chap6;
/*	����޼���
 * 		Ŭ�����޼���
 * 		�ν��Ͻ��޼���
 */
class Math2{
	long a,b; //�ν��Ͻ� ���� (��üȭ�� �ʿ�(��üȭ�� �Ǿ�� �޸� �Ҵ�))
	long add(){return a+b;} // �ν��Ͻ��޼���(��üȭ �ʿ�)
	//Ŭ�����޼��� :��üȭ �ʿ� ���� Ŭ������.�޼����(.
	static long add(long x,long y){ 
		return x + y; 
	}
}
public class MathEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math2.add(100L, 200L));
		Math2 math = new Math2();
		math.a = 10;
		math.b = 20;
		System.out.println(math.add());
	}

}
