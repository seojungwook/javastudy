package a1006;
/*
 * ��Ű���� Ŭ����(�������̽�- ��������� �ʾҾ�)���� ����
 * ��� Ŭ���� �̸��� ��Ű������ �����Ѵ�. ex)a1006.PackageEx
 * ��Ű����.Ŭ������ ���� ����Ѵ�.
 * package ������ �ݵ�� ������ ù �ٿ� ����Ѵ�.
 * => �ϳ��� ���Ͽ� �����ϴ� ��� Ŭ������ �ϳ��� ��Ű���� ���Ѵ�.
 * ��Ű������ ������ �� �ִ�.
 * 1. ����ϴ� Ŭ������ ������ ��Ű���� Ŭ������ ���
 * 2. java.lang ��Ű���� ���� Ŭ�������ΰ��(String, System ��)
 * 3. import ������ ������ Ŭ������ ���
 */

class Pack{
	void method(){
		System.out.println("a1006.Pack Ŭ������ �޼���");
	}
}
public class PackageEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Date today = new java.util.Date();
		System.out.println(today);
		Pack p1 = new Pack();
		p1.method();
		b1006.Pack p2 = new b1006.Pack();
		p2.method();
	}
}
