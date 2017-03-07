package com.renz.Contacts;
/*
 *  Demonstrate the use of GUI
 *  Jayson Mallari
 */
import javax.swing.JFrame;
public class Contacts {
	
	public static void main(String[] args){
		JFrame frame = new ContactUI();
		frame.setTitle("GUI Test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
