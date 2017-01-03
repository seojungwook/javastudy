package a1014;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class EventHandler extends WindowAdapter{
	public void windowClosing(WindowEvent e){
		e.getWindow().setVisible(false);;
		e.getWindow().dispose();
		System.exit(0);
	}
}
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame();
		f.setSize(500,500);
		f.setVisible(true);
		//f.addWindowListener(new EventHandler());
		//1. 방식
		WindowAdapter we = new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		};
		f.addWindowListener(we);
		
		//2. 방식
		f.addWindowListener(new EventHandler(){
			public void windowClosing(WindowEvent e){
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
		}
	});
	}
}
