import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test3 extends JFrame{
	Container c;
	JRadioButton r1,r2,r3,r4;
	JCheckBox c1,c2,c3,c4,c5;
	ButtonGroup bg1,bg2;
	JButton b1;
	JPanel p1,p2,p3,p4;
	
	Test(){
		c=getContentPane();
		c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));
		
		p1=new JPanel(new FlowLayout(FlowLayout.LEFT));
		p1.setBorder(BorderFactory.createTitledBorder("Bread Type"));
		r1=new JRadioButton("Wheat Bread(Rs. 10)");
		r2=new JRadioButton("MultigrainBread(Rs. 15)");
		bg1=new ButtonGroup();
		bg1.add(r1);
		bg1.add(r2);
		p1.add(r1);
		p1.add(r2);
		c.add(p1);
		
		p2=new JPanel(new FlowLayout(FlowLayout.LEFT));
		p2.setBorder(BorderFactory.createTitledBorder("Butter Type"));
		r3=new JRadioButton("Amul Butter(Rs. 10)");
		r4=new JRadioButton("Peanut Butter(Rs. 15)");
		bg2=new ButtonGroup();
		bg2.add(r3);
		bg2.add(r4);
		p2.add(r3);
		p2.add(r4);
		c.add(p2);
		
		p3=new JPanel(new FlowLayout(FlowLayout.LEFT));
		p3.setBorder(BorderFactory.createTitledBorder("Butter Type"));
		c1=new JCheckBox("Tomatoes (Rs. 5)");
		c2=new JCheckBox("Onions (Rs. 5)");
		c3=new JCheckBox("Cucumbers (Rs. 5)");
		c4=new JCheckBox("Potatoes (Rs. 5)");
		c5=new JCheckBox("Bell Peppers (Rs. 5)");
		p3.add(c1);
		p3.add(c2);
		p3.add(c3);
		p3.add(c4);
		p3.add(c5);
		c.add(p3);
		
		p4=new JPanel();
		b1=new JButton("Submit");
		b1.addActionListener(new L1());
		p4.add(b1);
		c.add(p4);
	}
	
	public static void main(String args[]){
		Test3 f=new Test3();
		f.setSize(500,300);
		f.setLocation(100,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("Sandwich Order");
		
	}
	
	class L1 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			double total=0;
			String order="";
			
			//This is where I make the first order.
			order+="1)";
			if(r1.isSelected()){order+=r1.getText()+" "; total+=10.0;}
			if(r2.isSelected()){order+=r2.getText()+" "; total+=15.0;}
			
			//Second order.
			order+="2)";
			if(r3.isSelected()){order+=r3.getText()+" "; total+=10.0;}
			if(r4.isSelected()){order+=r3.getText()+" "; total+=15.0;}
			
			//Third Order.
			order+="3)";
			if(c1.isSelected()){order+=c1.getText()+" "; total+=5.0;}
			if(c2.isSelected()){order+=c2.getText()+" "; total+=5.0;}
			if(c3.isSelected()){order+=c3.getText()+" "; total+=5.0;}
			if(c4.isSelected()){order+=c4.getText()+" "; total+=5.0;}
			if(c5.isSelected()){order+=c5.getText()+" "; total+=5.0;}
			
			//Add all up.
			JOptionPane.showMessageDialog(c, order+"Rs. "+total);
		}
		
	}
}