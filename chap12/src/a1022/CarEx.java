package a1022;

import java.util.ArrayList;
import java.util.List;

/*
 * �Һ��ڽ����尡 �Ǹ��� �ڵ����� ������ wait() ��.
 * �ڵ����� 3�밡 ����� ������ �Һ��ڴ� wait()�� ����
 * �����ڽ������ ��� 3�밡 �Ǹ� �Һ��ڽ����带  notify()��.
 * 
 */
class CarFactory{
	private List<String> carList = null;
	CarFactory(){
		carList = new ArrayList<String>();
	}
	public String getCar(){
		String carName = null;
		switch((int)(Math.random()*3)){
		case 0 : carName = "SM5"; break;
		case 1 : carName = "�ҳ�Ÿ"; break;
		case 2 : carName = "�ű׳ʽ�"; break;
		}
		return carName;
	}
	//�������尡 ȣ����
	public synchronized String pop(){
		String carName = null;
		if(carList.size()==0){
			try{
				System.out.println("���� �����ϴ�. ����ϼ���.");
				wait();
			}catch (InterruptedException e){}
		}
		carName = carList.remove(0); //�����ְ� �Ѱ���
		System.out.println(Thread.currentThread().getName() + " : "
										+ carName + "������ �ǸŵǾ����ϴ�");
		return carName;
	}
	//�ڵ����� ������, �ڵ������� �����尡 ȣ��
	public synchronized void push(String car){
		carList.add(car);
		System.out.println(Thread.currentThread().getName() + " : " 
										+ car + "������ ����Ǿ����ϴ�.");
		if(carList.size()>=3) notifyAll();
	}
} //CarFactory Ŭ���� ����

class Customer implements Runnable{
	private CarFactory car;
	Customer(CarFactory car){
		this.car = car;
	}
	@Override
	public void run() {
		String carName = null;
		for(int i=0; i<12; i++){
			carName = car.pop();
			try{
				Thread.sleep((int)(Math.random()*200));
			}catch(InterruptedException e){}
		}
	}
} //Customer Ŭ���� ����
class Producer implements Runnable{
	private CarFactory car; 
	Producer(CarFactory car){
		this.car = car;
	}
	@Override
	public void run() {
		for(int i=0; i<12; i++){
			car.push(car.getCar());
			try{
				Thread.sleep((int)(Math.random()*1000));
			}catch(InterruptedException e){}
		}
	}
}
public class CarEx {
	public static void main(String[] args) {
		CarFactory car = new CarFactory();
		//new Thread(Runnable r, String name)
		// => �����尡 �����ϸ�, r.run() �޼��带 ����
		//		name : �������� �̸� ����
		Thread t1 = new Thread(new Producer(car),"�ڵ������� ������"); //new Producer(car)
																		//Runnable �������̽� ����
		Thread t2 = new Thread(new Customer(car),"�� ������");
		t1.start();
		t2.start();
		
	}
}
