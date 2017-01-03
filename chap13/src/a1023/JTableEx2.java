package a1023;
/*
 * TableModel�� �̿��� JTable
 * TableModel �������̽��� ������ AbstractTableModel
 * �߻�Ŭ������ ����Ͽ� TableModel��ü�� �����Ѵ�.
 */

import java.awt.BorderLayout;

import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

public class JTableEx2 extends JFrame{
	String data[][] = new String[2][3];
	String s[] = {"1.����", "2.������", "3. �ܽĺ�"};
	JTextField text = new JTextField("");
	JTable table;
	JLabel re;
	String in;
	int[] value = new int[2];
	JTableEx2(){
		super("TableModel�� �̿��� JTable");
		JPanel pane = new JPanel();
		pane.setLayout(new BorderLayout()); //�������̾ƿ����� ������ױ⿡ �ؿ�"���ڸ��Է�"�κ� �����Ѱ�
		TableModel model = new MyTableModel();
		//JTable�� model�� �����ϴ� ���Ĵ�� ȭ�� ���
		table = new JTable(model);
		table.setRowHeight(20);
		TableColumn tc = //tc -> ù��° �÷� 
				table.getColumnModel().getColumn(0);
		//ComboBox ���� : ������ s�� ���� 
		JComboBox combo = new JComboBox(s); 
		tc.setCellEditor(new DefaultCellEditor(combo));
		pane.add(new JScrollPane(table),"Center");
		pane.add(re=new JLabel("���ڸ� �Է��ϼ���"),"South");
		add(pane);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 150);
		setVisible(true);
	}
	public void getTotal(String index){
		re.setText(index + "�� �հ�:" + (value[0] + value[1]));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTableEx2();
	}
	//JTableŬ������ �����͸� �����ϴ� TableModel�� ����Ŭ����
	class MyTableModel extends AbstractTableModel{

		@Override
		public int getRowCount() { //���� ���� ����
			return data.length;
		}
		@Override
		public int getColumnCount() { //���� ���� ����
			return data[0].length;
		}
		//getValueAt : JTable�� ������ �������� �� ����
		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			return data[rowIndex][columnIndex];
		}
		//Table Header ǥ��
		@Override
		public String getColumnName(int col){
			String s= "";
			switch(col){
			case 0 : s="�׸�"; break;
			case 1 : s="��1"; break;
			case 2 : s="��2"; break;
			}
			return s;
		}
		@Override
		public void setValueAt(Object value, int row, int col){
			data[row][col] = value.toString();
				if(col==0){ //0�� ComboBox�̱⿡ 
					in = value.toString();
				}else {
					try{
						JTableEx2.this.value[col-1]=Integer.parseInt(value.toString());
					}catch(NumberFormatException e){
						re.setText("���ڸ� �Է°���");
					}
				}
			if(col==2)
				getTotal(in);
		}
		@Override
		public boolean isCellEditable(int row, int col){
			return true;
		}	
	}
}
