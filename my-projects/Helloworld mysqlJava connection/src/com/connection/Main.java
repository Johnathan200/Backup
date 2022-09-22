package com.connection;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Main {
	 public static void main(String []args) {
		 Class1 C1 = new Class1();
		 C1.c1exe();
	 }
}



class Class1 implements ActionListener  {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton btn  = new JButton();
	JLabel label = new JLabel();
	
 	
	public void c1exe() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250,300); 
		label.setVisible(false);
		label.setBounds(200, 200, 0, 0);
		btn.setText("All books");
		btn.addActionListener(this);
		frame.setIconImage(null);;
		frame.add(panel);
		panel.add(btn);
		panel.add(label);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		convector cn = new convector();
		cn.exe();
		label.setText("         Hi Peace No offence");
		label.setVisible(true);
		
		
	}
	
}