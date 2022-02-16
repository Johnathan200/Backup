package com.Jmeet;

import java.awt.event.*;
import javax.swing.*;

public class Home implements ActionListener{
	
	public static void main(String[]args) {
		
		creator c = new creator();
		c.frame.setSize(500,350);
		c.frame.setResizable(false);
		c.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.frame.add(c.panel);	

		
		
		c.buttonl.addActionListener(new Home());
		c.buttonvi.addActionListener(new Home());
		c.panel.add(c.buttonl);
		c.panel.add(c.buttonvi);

		c.buttonl.setBounds(40, 100, 100, 60);
		
		c.frame.setVisible(true);
		
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		creator c = new creator();
			if (e.getSource() != c.buttonl) {
				Jmeet jm = new Jmeet();
				jm.Login();
			
			
			}else{
				Videocall vc =new Videocall();
				vc.videoDisplay();
			}
	}

}  

		

class creator {
	
	JFrame frame = new JFrame("Jmeet- Home");
	JPanel panel = new JPanel();
	JButton buttonl = new JButton("Login");	
	JButton buttonvi = new JButton("Start video call");

}


