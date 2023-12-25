package com.studregsys;

import java.sql.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Register extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtregname;
	private JTextField txtregpass;
	private JTextField textphone;
	private JTextField textaddress;
	
	String ph = null;
	
	JButton btnregister;
	private JComboBox combo1;
	private JComboBox combo2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 669);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRATION FORM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(96, 26, 355, 47);
		contentPane.add(lblNewLabel);
		
		JLabel lblregname = new JLabel("USERNAME ");
		lblregname.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblregname.setHorizontalAlignment(SwingConstants.LEFT);
		lblregname.setBounds(53, 123, 138, 28);
		contentPane.add(lblregname);
		
		JLabel lblregpassword = new JLabel("PASSWORD");
		lblregpassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblregpassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblregpassword.setBounds(53, 196, 151, 28);
		contentPane.add(lblregpassword);
		
		JLabel lblphone = new JLabel("PHONE");
		lblphone.setHorizontalAlignment(SwingConstants.LEFT);
		lblphone.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblphone.setBounds(53, 269, 77, 28);
		contentPane.add(lblphone);
		
		JLabel lblgender = new JLabel("GENDER");
		lblgender.setHorizontalAlignment(SwingConstants.LEFT);
		lblgender.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblgender.setBounds(53, 340, 103, 28);
		contentPane.add(lblgender);
		
		JLabel lblbloodgroup = new JLabel("BLOOD GROUP");
		lblbloodgroup.setHorizontalAlignment(SwingConstants.LEFT);
		lblbloodgroup.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblbloodgroup.setBounds(53, 415, 138, 28);
		contentPane.add(lblbloodgroup);
		
		JLabel lbladdress = new JLabel("ADDRESS");
		lbladdress.setHorizontalAlignment(SwingConstants.LEFT);
		lbladdress.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbladdress.setBounds(53, 483, 89, 28);
		contentPane.add(lbladdress);
		
		btnregister = new JButton("REGISTER");
		btnregister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
				String nm = txtregname.getText();
				String ps = txtregpass.getText();
				String ph=textphone.getText();
				String gen = combo1.getSelectedItem().toString();
				String bg = combo2.getSelectedItem().toString();
				String add = textaddress.getText();
				
				
				
				if(ph.length()==10)
				{
					ph =textphone.getText();
					
					
				}
				else 
				{
					JOptionPane.showMessageDialog(btnregister, "Enter 10 Digit Mobile Number");
				}
				
				
				
				
//				boolean bol = nm.isEmpty();
//				System.out.println(bol);
				if((nm.isEmpty() == false)&&(ps.isEmpty() == false)&&(ph.isEmpty() == false)&&(gen.isEmpty() == false)&&(bg.isEmpty() == false)&&(add.isEmpty() == false))
				{
					AllMethods am = new AllMethods();
					am.connectiondb();
					am.register(nm, ps, ph, gen, bg, add);
					JOptionPane.showMessageDialog(null,"Registeration Successfull..");
					dispose();
					Login log = new Login();
					log.setVisible(true);
					

				}
				else
				{
					JOptionPane.showMessageDialog(null, "fill the form correctly...");
				}
								
				
				}
				catch (Exception ex) 
				{
					System.out.println(ex);
				}
				
			}
		});
		btnregister.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnregister.setBounds(118, 561, 130, 37);
		contentPane.add(btnregister);
		
		JButton btnback = new JButton("BACK");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Login log = new Login();
				log.setVisible(true);
				dispose();
			}
		});
		btnback.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnback.setBounds(301, 561, 130, 37);
		contentPane.add(btnback);
		
		txtregname = new JTextField();
		txtregname.setBounds(246, 123, 247, 37);
		contentPane.add(txtregname);
		txtregname.setColumns(10);
		
		txtregpass = new JTextField();
		txtregpass.setColumns(10);
		txtregpass.setBounds(246, 195, 247, 37);
		contentPane.add(txtregpass);
		
		textphone = new JTextField();
		textphone.setColumns(10);
		textphone.setBounds(246, 268, 247, 37);
		contentPane.add(textphone);
		
		textaddress = new JTextField();
		textaddress.setColumns(10);
		textaddress.setBounds(246, 482, 247, 37);
		contentPane.add(textaddress);
		
		combo1 = new JComboBox();
		combo1.setModel(new DefaultComboBoxModel(new String[] {"Select the Gender", "Male ", "Female", "Transgender"}));
		combo1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		combo1.setBounds(246, 340, 247, 37);
		contentPane.add(combo1);
		
		combo2 = new JComboBox();
		combo2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		combo2.setModel(new DefaultComboBoxModel(new String[] {"Select Blood Group", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"}));
		combo2.setBounds(246, 415, 247, 37);
		contentPane.add(combo2);
	}

}
