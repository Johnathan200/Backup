package com.Jmeet;

import javax.swing.*;

public class Videocall {

	void videoDisplay() {
		
		vexecuter ve = new vexecuter();
		ve.vexecute();
		
	}	
}
class Vcreator{
	
	JFrame vf = new JFrame();
	JPanel vp = new JPanel();	
	JButton vb1 = new JButton();
	JButton vb2 = new JButton();

	
}
class vexecuter{
	void vexecute() {
		Vcreator vc = new Vcreator();
		vc.vf.setSize(400,250);
		vc.vf.add(vc.vp);
		vc.vb1.setText("Mute");
		vc.vb2.setText("Camera on");
		vc.vp.add(vc.vb2);
		vc.vp.add(vc.vb1);
		vc.vf.setVisible(true);
	}
}