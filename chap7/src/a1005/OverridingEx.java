package a1005;
/*
 * 238p �����ε��� �������̵� ����
 * 
 * �������̵� ����
 * 	�������̵��̶� : �θ�Ŭ������ �޼��带 �������ϴ� ���̴�.
 * 	�������̵����� : �θ�Ŭ������ �޼����� ����ο� �ڼ�Ŭ������ �޼����� �����(����������, ����Ÿ��, �޼����̸�, �Ű�����)�� ���ƾ� �Ѵ�.
 * 			��, ���������ڴ� �θ𺸴� ���� �����δ� �����ϴ�. �θ�޼����� ���������ڰ� default�� 
 * 											�ڼ� �޼���� default, protected, public ��� 
 *											�θ�޼����� ���������ڰ� protected�̸�
 * 											�ڼ� �޼���� protected, public ���
 * 											�θ�޼����� ���������ڰ� public�̸�
 * 											�ڼ� �޼���� public ���
 * 											
 * 											�� ����ó���� ���� �����δ� �����ϴ�.
 */
class Point {
	int x, y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	String getLocation(){
		return "x:" + x +", y:"+ y ;
	}
	
}

class Point3D extends Point{
	int z;
	Point3D(int x, int y, int z){
		super(x,y); // �θ� ���� �ʱ�ȭ�ҰŴ� ������ ù ��
//		this.x = x; super�� �����ϸ� �ʿ� ����
//		this.y = y;
		this.z = z;
	}
	//�������̵��� �޼���
	@Override // ������̼�@@@, �̰��� ����� �ùٸ��� �������̵��� �޼������� ����
	String getLocation(){
		return "x:" + x +", y:"+ y + ", z:"+z;
	}
}
public class OverridingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D p3= new Point3D(1,2,3);
		System.out.println(p3.getLocation());
	}

}
