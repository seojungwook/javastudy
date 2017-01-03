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
 * JOptionPane 	 : ���̾�α�â�� �����ִ� panel
 * MessageDialog : �޽����ڽ��� �����ִ� ���̾�α�
 * InputDialog 	 : ���� �Է¹��� �� �ִ� ���̾�α�
 * OptionDialog  : ��ư�� ���� ����
 * ConfirmDialog : Ȯ��, ��ҿ��θ� �Է¹޴� ���̾�α�
 */
public class JOptionPaneEx extends JFrame implements ActionListener{
	public static void main(String[] args) {
		new JOptionPaneEx();
	}
	JButton msg, input, option;
	Icon icon;
	Font font;
	JOptionPaneEx(){
		super("JOptionPane ����");
		msg = new JButton("�޽��� ���̾�α�");
		msg.addActionListener(this);
		input = new JButton("�Է� ���̾�α�");
		input.addActionListener(this);
		option = new JButton("�ɼ� ���̾�α�");
		option.addActionListener(this);
		icon = new ImageIcon("IU.jpg");
		addWindowListener(
			new WindowAdapter(){
				//x��ư(�ݱ�)�� Ŭ���Ǿ��� ���
				@Override
				public void windowClosing(WindowEvent e){
					/*
					 * JOptionPane.showConfirmDialog(parent, �޽���)
					 * parent : ��ȭ�� ����� �Ǵ� JFrame
					 * 			JOptionPneEx.this : JOptionPaneEx��ü
					 */
					int res = JOptionPane.showConfirmDialog
							(JOptionPaneEx.this, "�����Ͻðڽ��ϱ�?");
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
			(this, "�޽������̾�α�","�޽���", JOptionPane.YES_NO_OPTION,icon);
		}else if(e.getSource() == input){
			Object res = JOptionPane.showInputDialog(this, "�ϳ��� �����ϼ���", "�Է�",
			JOptionPane.QUESTION_MESSAGE, icon, new Object[]{"���","����","����"},"����");
			JOptionPane.showMessageDialog
			(this, "���ð�:" + res, "�Է°��", JOptionPane.INFORMATION_MESSAGE,icon);
		}else {
			int result = JOptionPane.showOptionDialog(this, "�ɼǴ��̾�α�", "�ɼ�", 
			JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, 
			icon, new String[]{"�ϳ�","��","��"}, "�ϳ�");
			System.out.println("���:" + result);
		}
	}
}
