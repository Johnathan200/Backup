package com.Jmeet;

import java.awt.event.*;
import javax.swing.*;

public class Home{
	public static void main(String[]args) {
		
		Executer e = new Executer();
		e.execute();
		
	}
}  

		
//class for creating objects
class creator {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton btnl = new JButton();	
	JButton btnvi = new JButton();
}

class Executer implements ActionListener{
	creator c = null; // default 
	public void execute() {
	     c = new creator();
		c.frame.setSize(500,350);
		c.frame.setTitle("Jmeet- home");
		c.frame.setResizable(false);
		c.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.frame.add(c.panel);	

		c.btnvi.setText("Start video call");
		c.btnl.setText("Login");
		c.btnl.addActionListener(this);
		c.btnvi.addActionListener(this);
		c.panel.add(c.btnl);
		c.panel.add(c.btnvi);

		c.btnl.setBounds(40, 100, 100, 60);
		c.btnvi.setBounds(50,100,100,60);
		
		c.frame.setVisible(true);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == c.btnl) {
			Login j = new Login();
			j.login();
		}
		if (e.getSource() == c.btnvi){
			Videocall vc = new Videocall();
			vc.videoDisplay();
		}
		
	}
	
		
}


