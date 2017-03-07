package com.renz.Contacts;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ContactUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblLastName;
	private JTextField textField_1;
	private JPanel panel_1;
	private JLabel lblEmail;
	private JTextField textField_2;
	private JButton btnDone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactUI frame = new ContactUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ContactUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Name", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 414, 93);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name : ");
		lblFirstName.setBounds(56, 27, 67, 20);
		panel.add(lblFirstName);
		
		textField = new JTextField();
		textField.setBounds(133, 27, 195, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		lblLastName = new JLabel("Last Name : ");
		lblLastName.setBounds(56, 58, 67, 14);
		panel.add(lblLastName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(133, 55, 195, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Email", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 115, 414, 80);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		lblEmail = new JLabel("Email : ");
		lblEmail.setBounds(80, 35, 46, 14);
		panel_1.add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setBounds(132, 32, 197, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		btnDone = new JButton("Done");
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnDone.setBounds(186, 209, 89, 23);
		contentPane.add(btnDone);
	}

}
