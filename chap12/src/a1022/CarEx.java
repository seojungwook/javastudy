package a1022;

import java.util.ArrayList;
import java.util.List;

/*
 * 소비자스레드가 판매할 자동차가 없으면 wait() 함.
 * 자동차가 3대가 생산될 때까지 소비자는 wait()을 유지
 * 생산자스레드는 재고가 3대가 되면 소비자스레드를  notify()함.
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
		case 1 : carName = "소나타"; break;
		case 2 : carName = "매그너스"; break;
		}
		return carName;
	}
	//고객스레드가 호출함
	public synchronized String pop(){
		String carName = null;
		if(carList.size()==0){
			try{
				System.out.println("차가 없습니다. 대기하세요.");
				wait();
			}catch (InterruptedException e){}
		}
		carName = carList.remove(0); //지워주고 넘겨줘
		System.out.println(Thread.currentThread().getName() + " : "
										+ carName + "차량이 판매되었습니다");
		return carName;
	}
	//자동차를 생산기능, 자동차공장 스레드가 호출
	public synchronized void push(String car){
		carList.add(car);
		System.out.println(Thread.currentThread().getName() + " : " 
										+ car + "차량이 생산되었습니다.");
		if(carList.size()>=3) notifyAll();
	}
} //CarFactory 클래스 종료

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
} //Customer 클래스 종료
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
		// => 스레드가 시작하면, r.run() 메서드를 실행
		//		name : 스레드의 이름 설정
		Thread t1 = new Thread(new Producer(car),"자동차공장 스레드"); //new Producer(car)
																		//Runnable 인터페이스 구현
		Thread t2 = new Thread(new Customer(car),"고객 스레드");
		t1.start();
		t2.start();
		
	}
}
