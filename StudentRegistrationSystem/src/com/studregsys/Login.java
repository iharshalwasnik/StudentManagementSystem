package com.studregsys;

import java.sql.*;
import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtusername;
	private JPasswordField txtpassword;
	Statement stmt;
	Connection con;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 815, 457);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblhead = new JLabel("LOGIN");
		lblhead.setForeground(new Color(255, 255, 255));
		lblhead.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblhead.setBounds(380, 56, 88, 27);
		contentPane.add(lblhead);
		
		JLabel lblusername = new JLabel("USERNAME");
		lblusername.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblusername.setForeground(new Color(255, 255, 255));
		lblusername.setBounds(213, 122, 165, 27);
		contentPane.add(lblusername);
		
		JLabel lblpassword = new JLabel("PASSWORD");
		lblpassword.setForeground(Color.WHITE);
		lblpassword.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblpassword.setBounds(213, 220, 165, 27);
		contentPane.add(lblpassword);
		
		txtusername = new JTextField();
		txtusername.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtusername.setForeground(new Color(128, 128, 128));
		txtusername.setBounds(440, 117, 221, 38);
		contentPane.add(txtusername);
		txtusername.setColumns(10);
		
		JButton btnsubmit = new JButton("SUBMIT");
		btnsubmit.setForeground(new Color(255, 255, 0));
		btnsubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","");
					stmt = con.createStatement();
					String sql = "select * from slogin where Name= '"+txtusername.getText()+"'and Password= '"+txtpassword.getText()+"'";
					ResultSet rs = stmt.executeQuery(sql);
					if(rs.next())
					{
						JOptionPane.showMessageDialog(btnsubmit, "loggedin successfully...");
						NewHome obj = new NewHome();
						obj.setVisible(true);
						dispose();	
					}
					else
					{
						JOptionPane.showMessageDialog(btnsubmit, "Incorrect username or password");
						txtusername.setText("");
						txtpassword.setText("");
					}
					con.close();
				}
				catch (Exception exp)
				{
					System.out.println(exp);
				}
				
		
			}
		});
		btnsubmit.setBackground(new Color(0, 0, 0));
		btnsubmit.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnsubmit.setBounds(229, 306, 149, 41);
		contentPane.add(btnsubmit);
		
		JButton btnregister = new JButton("REGISTER");
		btnregister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Register reg = new Register();
				reg.setVisible(true);
				dispose();
				
			}
		});
		btnregister.setForeground(new Color(255, 255, 0));
		btnregister.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnregister.setBackground(Color.BLACK);
		btnregister.setBounds(446, 306, 165, 41);
		contentPane.add(btnregister);
		
		txtpassword = new JPasswordField();
		txtpassword.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtpassword.setBounds(440, 215, 221, 38);
		contentPane.add(txtpassword);
	}
}
