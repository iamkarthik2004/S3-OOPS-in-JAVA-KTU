package oopj24csb45;
import java.awt.event.*;
import javax.swing.*;
public class GUICalculator implements ActionListener{

	JTextField t1;

	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, badd, bsub, bmul, bdiv, beq, bclr;
	Double a,b, result;
	int c=0; int operator;
	
	GUICalculator()

	{

	JFrame f = new JFrame("My Calculator");

	JPanel p = new JPanel();

	t1 = new JTextField();

	b0=new JButton("0");

	b1=new JButton("1");

	b2=new JButton("2");

	b3=new JButton("3");

	b4=new JButton("4");

	b5=new JButton("5");

	b6=new JButton("6");

	b7=new JButton("7");

	b8=new JButton("8");

	b9=new JButton("9");

	badd=new JButton("+");

	bsub=new JButton("-");

	bmul=new JButton("*");

	bdiv=new JButton("/");

	beq=new JButton("=");

	bclr=new JButton("C");
	
	
	
	t1.setBounds(100,100,200,30);

	b1.setBounds(100,140,50,30);

	b2.setBounds(150,140,50,30);

	b3.setBounds(200,140,50,30);

	b4.setBounds(100,180,50,30);

	b5.setBounds(150,180,50,30);

	b6.setBounds(200,180,50,30);

	b7.setBounds(100,220,50,30);

	b8.setBounds(150,220,50,30);

	b9.setBounds(200,220,50,30);

	b0.setBounds(100,260,50,30);

	

	badd.setBounds(250,140,50,30);

	bsub.setBounds(250,180,50,30);

	bmul.setBounds(250,220,50,30);

	bdiv.setBounds(250,260,50,30);

	beq.setBounds(200,260,50,30);

	bclr.setBounds(150,260,50,30);

	

	p.add(t1);

	p.add(b0);

	p.add(b1);

	p.add(b2);

	p.add(b3);

	p.add(b4);

	p.add(b5);

	p.add(b6);

	p.add(b7);

	p.add(b8);

	p.add(b9);

	p.add(badd);

	p.add(bsub);

	p.add(bmul);

	p.add(bdiv);

	p.add(beq);

	p.add(bclr);
	

	f.add(p);
	

	b0.addActionListener(this);

	b1.addActionListener(this);

	b2.addActionListener(this);

	b3.addActionListener(this);

	b4.addActionListener(this);

	b5.addActionListener(this);

	b6.addActionListener(this);

	b7.addActionListener(this);

	b8.addActionListener(this);

	b9.addActionListener(this);

	badd.addActionListener(this);

	bsub.addActionListener(this);

	bmul.addActionListener(this);

	bdiv.addActionListener(this);

	beq.addActionListener(this);

	bclr.addActionListener(this);

	

	f.setSize(400,400);

	p.setLayout(null);

	f.setVisible(true);

	f.setResizable(false);
	}

	

	
	public void actionPerformed(ActionEvent e) {
	    if (e.getSource() == b0) t1.setText(t1.getText() + "0");
	    if (e.getSource() == b1) t1.setText(t1.getText() + "1");
	    if (e.getSource() == b2) t1.setText(t1.getText() + "2");
	    if (e.getSource() == b3) t1.setText(t1.getText() + "3");
	    if (e.getSource() == b4) t1.setText(t1.getText() + "4");
	    if (e.getSource() == b5) t1.setText(t1.getText() + "5");
	    if (e.getSource() == b6) t1.setText(t1.getText() + "6");
	    if (e.getSource() == b7) t1.setText(t1.getText() + "7");
	    if (e.getSource() == b8) t1.setText(t1.getText() + "8");
	    if (e.getSource() == b9) t1.setText(t1.getText() + "9");

	    // Perform operations
	    if (e.getSource() == badd) {
	        a = Double.parseDouble(t1.getText());
	        operator = 1; // Addition
	        t1.setText("");
	    } else if (e.getSource() == bsub) {
	        a = Double.parseDouble(t1.getText());
	        operator = 2; // Subtraction
	        t1.setText("");
	    } else if (e.getSource() == bmul) {
	        a = Double.parseDouble(t1.getText());
	        operator = 3; // Multiplication
	        t1.setText("");
	    } else if (e.getSource() == bdiv) {
	        a = Double.parseDouble(t1.getText());
	        operator = 4; // Division
	        t1.setText("");
	    }

	    // Clear the text field
	    else if (e.getSource() == bclr) {
	        t1.setText("");
	    }

	    // Calculate and display the result
	    else if (e.getSource() == beq) {
	        b = Double.parseDouble(t1.getText());

	        try {
	            switch (operator) {
	                case 1: result = a + b; break;
	                case 2: result = a - b; break;
	                case 3: result = a * b; break;
	                case 4:
	                    if (b != 0) {
	                        result = a / b;
	                    } else {
	                        t1.setText("Error: Divide by zero");
	                        return;
	                    }
	                    break;
	            }
	            t1.setText(String.valueOf(result)); // Display result
	        } catch (Exception c) {
	            System.out.println(c.getMessage());
	        }
	    }
	}


	public static void main(String[] args) {

		// TODO Auto-generated method stub

		new GUICalculator();



	}



}