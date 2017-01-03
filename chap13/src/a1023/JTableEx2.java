package a1023;
/*
 * TableModel을 이용한 JTable
 * TableModel 인터페이스를 구현한 AbstractTableModel
 * 추상클래스를 사용하여 TableModel객체를 구현한다.
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
	String s[] = {"1.수입", "2.공과금", "3. 외식비"};
	JTextField text = new JTextField("");
	JTable table;
	JLabel re;
	String in;
	int[] value = new int[2];
	JTableEx2(){
		super("TableModel을 이용한 JTable");
		JPanel pane = new JPanel();
		pane.setLayout(new BorderLayout()); //보더레이아웃으로 변경시켰기에 밑에"숫자를입력"부분 가능한것
		TableModel model = new MyTableModel();
		//JTable은 model이 전달하는 형식대로 화면 출력
		table = new JTable(model);
		table.setRowHeight(20);
		TableColumn tc = //tc -> 첫번째 컬럼 
				table.getColumnModel().getColumn(0);
		//ComboBox 생성 : 내용은 s가 설정 
		JComboBox combo = new JComboBox(s); 
		tc.setCellEditor(new DefaultCellEditor(combo));
		pane.add(new JScrollPane(table),"Center");
		pane.add(re=new JLabel("숫자를 입력하세요"),"South");
		add(pane);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 150);
		setVisible(true);
	}
	public void getTotal(String index){
		re.setText(index + "의 합계:" + (value[0] + value[1]));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTableEx2();
	}
	//JTable클래스의 데이터를 지정하는 TableModel의 구현클래스
	class MyTableModel extends AbstractTableModel{

		@Override
		public int getRowCount() { //행의 개수 지정
			return data.length;
		}
		@Override
		public int getColumnCount() { //열의 개수 지정
			return data[0].length;
		}
		//getValueAt : JTable에 각셀에 보여지는 값 설정
		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			return data[rowIndex][columnIndex];
		}
		//Table Header 표시
		@Override
		public String getColumnName(int col){
			String s= "";
			switch(col){
			case 0 : s="항목"; break;
			case 1 : s="값1"; break;
			case 2 : s="값2"; break;
			}
			return s;
		}
		@Override
		public void setValueAt(Object value, int row, int col){
			data[row][col] = value.toString();
				if(col==0){ //0은 ComboBox이기에 
					in = value.toString();
				}else {
					try{
						JTableEx2.this.value[col-1]=Integer.parseInt(value.toString());
					}catch(NumberFormatException e){
						re.setText("숫자만 입력가능");
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
