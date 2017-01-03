package a1022;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.SimpleDateFormat;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		
	//	TextArea ta;
	//	Time t = new Time();
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Frame f = new Frame("µðÁöÅÐ ½Ã°è");
		Label l = new Label();
		WindowListener wl = new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				
				System.exit(0);
			}
		};
		
		l.setFont(new Font("±¼¸²Ã¼",30,30));
		f.setBackground(Color.YELLOW);
		f.add(l);
		f.addWindowListener(wl);
		f.setSize(300, 100);
		f.setVisible(true);

		while(true){
			date.setTime(System.currentTimeMillis());
			String a = sdf.format(date);
			l.setText(a);
		}
		
	}

}
