package com.Jmeet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.*;




public class Jmeet {

	
	void Login() {
	instanceMaker iM = new instanceMaker();
	// frame code
	iM.	frame.setSize(350,200);
	iM.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	iM.frame.setVisible(true);
	iM.frame.add(iM.panel);	
	
	//Panel code                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
	iM.panel.setLayout(null);
	iM.panel.add(iM.usrlabel);
	iM.panel.add(iM.usrTxt);
	iM.panel.add(iM.passlabel);
	iM.panel.add(iM.passTxt);
	iM.panel.add(iM.button);
	
	//Label code
	iM.usrlabel.setBounds(10,20,80,25);
	iM.passlabel.setBounds(10,80,80,25);
	iM.ulabel.setText("Johnathan");
	
	//txtfield code
	iM.usrTxt.setBounds(100, 20, 165, 25);
	iM.passTxt.setBounds(100, 80, 165, 25);
	
	//button code
	
	iM.button.setBounds(125,120,80,25);
	iM.ulabel.setText("Johnathan");
	iM.plabel.setText("admin123");

	}
}

class instanceMaker{	
	JFrame frame = new JFrame("Jmeet - Login");
	JPanel panel = new JPanel();
	JLabel usrlabel = new JLabel("User");
	JLabel passlabel = new JLabel("Password");
	JTextField usrTxt = new JTextField(20);
	JPasswordField passTxt= new JPasswordField(10);
	JButton button = new JButton("Login");
	JLabel ulabel = new JLabel();
	JLabel plabel =new JLabel();

	
	
}
