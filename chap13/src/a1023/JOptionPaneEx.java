package a1023;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * JOptionPane 	 : 다이얼로그창을 보여주는 panel
 * MessageDialog : 메시지박스를 보여주는 다이얼로그
 * InputDialog 	 : 값을 입력받을 수 있는 다이얼로그
 * OptionDialog  : 버튼을 설정 가능
 * ConfirmDialog : 확인, 취소여부를 입력받는 다이얼로그
 */
public class JOptionPaneEx extends JFrame implements ActionListener{
	public static void main(String[] args) {
		new JOptionPaneEx();
	}
	JButton msg, input, option;
	Icon icon;
	Font font;
	JOptionPaneEx(){
		super("JOptionPane 예제");
		msg = new JButton("메시지 다이얼로그");
		msg.addActionListener(this);
		input = new JButton("입력 다이얼로그");
		input.addActionListener(this);
		option = new JButton("옵션 다이얼로그");
		option.addActionListener(this);
		icon = new ImageIcon("IU.jpg");
		addWindowListener(
			new WindowAdapter(){
				//x버튼(닫기)이 클릭되었을 경우
				@Override
				public void windowClosing(WindowEvent e){
					/*
					 * JOptionPane.showConfirmDialog(parent, 메시지)
					 * parent : 대화의 대상이 되는 JFrame
					 * 			JOptionPneEx.this : JOptionPaneEx객체
					 */
					int res = JOptionPane.showConfirmDialog
							(JOptionPaneEx.this, "종료하시겠습니까?");
					if(res == JOptionPane.YES_OPTION){
						System.out.println(res);
						System.exit(0);
					}
				}
			}
		);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.add(msg); panel.add(input); panel.add(option);
		add(panel);
		setSize(200,200);
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==msg){
			JOptionPane.showMessageDialog
			(this, "메시지다이얼로그","메시지", JOptionPane.YES_NO_OPTION,icon);
		}else if(e.getSource() == input){
			Object res = JOptionPane.showInputDialog(this, "하나를 선택하세요", "입력",
			JOptionPane.QUESTION_MESSAGE, icon, new Object[]{"사과","딸기","포도"},"딸기");
			JOptionPane.showMessageDialog
			(this, "선택값:" + res, "입력결과", JOptionPane.INFORMATION_MESSAGE,icon);
		}else {
			int result = JOptionPane.showOptionDialog(this, "옵션다이얼로그", "옵션", 
			JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, 
			icon, new String[]{"하나","둘","셋"}, "하나");
			System.out.println("결과:" + result);
		}
	}
}
