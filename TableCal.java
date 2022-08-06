import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class TableCal implements ActionListener
{
	//Begin variables
	int n1,n2;
	String tab="";
	JFrame frm;
	Container con;
	FlowLayout fly;
	JButton fbtn;
	BorderLayout bly;
	Panel pnl,pnl2;
	JTextField txt1;
	JTextField txt2;
	JButton btn;
	JLabel lbl;
	//End variables 
	
	//Begin constructor
	void runCal()
	{
		frm=new JFrame();
		con=frm.getContentPane();
		lbl=new JLabel("Test",JLabel.CENTER);
		lbl.setBackground(Color.decode("#b7b8cf"));
		lbl.setOpaque(true);
		lbl.setFont(new Font("Serif", Font.PLAIN, 60));
		lbl.setPreferredSize(new Dimension(600, 600));

		
		fly = new FlowLayout();
		con.setLayout(fly);
		
		bly = new BorderLayout();
		con.setLayout(bly);
		
		pnl=new Panel();
		pnl.setLayout(new FlowLayout());
		
		txt1= new JTextField("0");
		txt1.setToolTipText("Enter value!");
		pnl.add(txt1);
		txt2= new JTextField("1");
		txt2.setToolTipText("Enter limit!");
		pnl.add(txt2);
		pnl2=new Panel();
		pnl2.setLayout(new FlowLayout());
		btn=new JButton("GENERATE");
		pnl2.add(btn);
		btn.setPreferredSize(new Dimension(200, 200));
		btn.addActionListener(this);
		con.add(pnl,BorderLayout.NORTH);
		con.add(pnl2,BorderLayout.CENTER);
		con.add(lbl,BorderLayout.SOUTH);
		
		frm.setSize(800,800);
		frm.setVisible(true);

		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//End constructor
	public static void main(String args[])
	{
		TableCal c=new TableCal();
		c.runCal();
	}
	
	//Other Methods
	public void actionPerformed(ActionEvent e)
	{
		
		int a=Integer.parseInt(txt1.getText());
		int b=Integer.parseInt(txt2.getText());
		for(int i=1;i<=b;i++)
		{
			tab+="\n"+a+"*"+i+"="+(a*i);
		}
		lbl.setText(tab);
		tab="";
	}
}