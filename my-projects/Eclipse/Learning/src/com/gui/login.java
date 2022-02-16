package com.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class login {

	public static void main(String[] args) {
		
		assigners();
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		JTextField Password = new JTextField();
		JTextField userText = new JTextField();
		
		
		
		
		frame.setSize(420 ,420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		
		new JLabel("User");
		label.setBounds(5,20,80,25);
		panel.add(label);
		
		new JLabel("Password");
		label.setBounds(5,20,80,25);
		panel.add(label);
		
		
		userText.setBounds(50,20,165,25);
		panel.add(userText);
		
		
		Password.setBounds(100,20,250,25);
		panel.add(Password);
		}
	
	static void assigners() {
		
		System.out.print("Succesfully called");
	}
	
}
