package com.Jmeet;

import javax.swing.*;

public class Videocall {

	void videoDisplay() {
		
		viCreator vic = new viCreator();
		vic.vif.setSize(400,250);
		vic.vif.add(vic.vip);
		vic.vif.setVisible(true);
	}	
}
class viCreator{
	
	JFrame vif = new JFrame();
	JPanel vip = new JPanel();		
	
}