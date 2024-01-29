package main;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {

	JFrame frame = new JFrame();
	JLabel wlabel = new JLabel("Hello!");
	
	WelcomePage(String userID) {
		
		wlabel.setBounds(0,0,200,35);
		wlabel.setFont(new Font(null, Font.PLAIN, 25));
		wlabel.setText("Hello " + userID);
		
		frame.add(wlabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
}
