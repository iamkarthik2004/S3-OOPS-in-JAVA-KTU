package oopj24csb45;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import javax.swing.*;
import java.awt.Graphics;

public class MyTrafficLight extends JFrame implements ActionListener {
    Color red_c, yellow_c, green_c;	
	JRadioButton R1,R2,R3;
	
	MyTrafficLight()
	{
		super("Traffic Light"); //Initialize j with a title TRAFFIC LIGHT
		R1 = new JRadioButton("Red");
		R1.setBounds(20,20,90,90);
		R2 = new JRadioButton("Yellow");
		R2.setBounds(90,20,90,90);
		R3 = new JRadioButton("Green");
		R3.setBounds(160,20,90,90);

		ButtonGroup gb = new ButtonGroup();

		gb.add(R1); gb.add(R2); gb.add(R3);

		red_c=getBackground();
		yellow_c=getBackground();
		green_c=getBackground();
		
		add(R1); add(R2); add(R3);
		
		setLayout(null);
	    setSize(500,500);
		setVisible(true);
		setResizable(false);
		
		R1.addActionListener(this);
		R2.addActionListener(this);
		R3.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(R1.isSelected())
		{
			red_c = Color.red;
			yellow_c = getBackground();
			green_c = getBackground();
		}
		else if(R2.isSelected())
		{
			red_c = getBackground();
			yellow_c = Color.yellow;
			green_c = getBackground();	
		}
		else if(R3.isSelected())
		{
			red_c = getBackground();
			green_c = Color.green;
			yellow_c = getBackground();
		}
		repaint();
	}

	public void paint(Graphics g)
	{
		super.paint(g);
		/*This line calls the super class implementation of paint method which 
		 * clears the previous drawings and prepares the component for fresh drawing*/
		
		g.drawOval(50,160,50,50);
		g.drawOval(50,220,50,50);
		g.drawOval(50,280,50,50);
		g.setColor(red_c);
		g.fillOval(50,160,50,50);
		g.setColor(yellow_c);
		g.fillOval(50,220,50,50);
		g.setColor(green_c);
		g.fillOval(50,280,50,50);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyTrafficLight();
	}
}
