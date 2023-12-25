package com.studregsys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Adminupdate2 extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField tf111;
	public JTextField tf112;
	public JTextField tf113;
	public JTextField tf114;
	public JTextField tf115;
	
	JLabel lbl2;
	JLabel lbl3;
	JLabel lbl4;
	JLabel lbl5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Adminupdate2 frame = new Adminupdate2();
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
	public Adminupdate2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 849, 621);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("REG NO");
		lbl1.setHorizontalAlignment(SwingConstants.LEFT);
		lbl1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl1.setBounds(88, 36, 119, 33);
		contentPane.add(lbl1);
		
		tf111 = new JTextField();
		tf111.setHorizontalAlignment(SwingConstants.LEFT);
		tf111.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tf111.setColumns(10);
		tf111.setBounds(281, 35, 446, 36);
		contentPane.add(tf111);
		
		lbl2 = new JLabel("NAME");
		lbl2.setHorizontalAlignment(SwingConstants.LEFT);
		lbl2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl2.setBounds(88, 132, 119, 33);
		contentPane.add(lbl2);
		
		tf112 = new JTextField();
		tf112.setHorizontalAlignment(SwingConstants.LEFT);
		tf112.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tf112.setColumns(10);
		tf112.setBounds(281, 131, 446, 36);
		contentPane.add(tf112);
		
		lbl3 = new JLabel("ADDRESS");
		lbl3.setHorizontalAlignment(SwingConstants.LEFT);
		lbl3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl3.setBounds(88, 199, 119, 33);
		contentPane.add(lbl3);
		
		tf113 = new JTextField();
		tf113.setHorizontalAlignment(SwingConstants.LEFT);
		tf113.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tf113.setColumns(10);
		tf113.setBounds(281, 198, 446, 36);
		contentPane.add(tf113);
		
		lbl4 = new JLabel("PHONE");
		lbl4.setHorizontalAlignment(SwingConstants.LEFT);
		lbl4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl4.setBounds(88, 279, 119, 33);
		contentPane.add(lbl4);
		
		tf114 = new JTextField();
		tf114.setHorizontalAlignment(SwingConstants.LEFT);
		tf114.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tf114.setColumns(10);
		tf114.setBounds(281, 278, 446, 36);
		contentPane.add(tf114);
		
		JButton btnbackhomepage = new JButton("GO BACK TO HOME PAGE");
		btnbackhomepage.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnbackhomepage.setBounds(286, 621, 276, 37);
		contentPane.add(btnbackhomepage);
		
		tf115 = new JTextField();
		tf115.setHorizontalAlignment(SwingConstants.LEFT);
		tf115.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tf115.setColumns(10);
		tf115.setBounds(281, 355, 446, 36);
		contentPane.add(tf115);
		
		lbl5 = new JLabel("DESIGNATION");
		lbl5.setHorizontalAlignment(SwingConstants.LEFT);
		lbl5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl5.setBounds(88, 356, 151, 33);
		contentPane.add(lbl5);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				AllMethods am=new AllMethods();
				am.connectiondb();
				
				String i=tf111.getText();
				String nm = tf112.getText();
				String add = tf113.getText();
				String ph = tf114.getText();
				String des = tf115.getText();
				
				if(i.length()!=0)
				{
					int id = Integer.parseInt(tf111.getText());
					try {
						am.st=am.con.createStatement();
						String sqll="select * from addadmin where aRegno='"+id+"' ";
						ResultSet rs=am.st.executeQuery(sqll);
						System.out.println("hardik"+rs);
					
				if(rs.next())
				{
                int flag=0;
				
				if(nm.length()!=0 ||  add.length()!=0  || ph.length()!=0  || des.length()!=0 )
				{	
					
			if(nm.length()!=0) {
				PreparedStatement ps;
                String sql = "update addadmin set aName = '" + nm + "' where aRegno = '" + id + "'";
                
                try {
					ps = am.con.prepareStatement(sql);
					ps.executeUpdate();
	               // JOptionPane.showMessageDialog(btnUpdate, "Data updated successfully...");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                
                
               
			}
			
			if(add.length()!=0) {
				PreparedStatement ps;
                String sql = "update addadmin set aAddress = '" + add + "' where aRegno = '" + id + "'";

                
                try {
					ps = am.con.prepareStatement(sql);
					ps.executeUpdate();
	               // JOptionPane.showMessageDialog(btnUpdate, "Data updated successfully...");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}  
			}
				
			if(ph.length()!=0) {
				PreparedStatement ps;
                String sql = "update addadmin set aPhone = '" + ph + "' where aRegno = '" + id + "'";
                
                try {
					ps = am.con.prepareStatement(sql);
					ps.executeUpdate();
	               // JOptionPane.showMessageDialog(btnUpdate, "Data updated successfully...");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}  
			}
			
			if(des.length()!=0) {
				PreparedStatement ps;
                String sql = "update addadmin set aDesignation = '" + des + "' where aRegno = '" + id + "'";
                
                try {
					ps = am.con.prepareStatement(sql);
					ps.executeUpdate();
	                //JOptionPane.showMessageDialog(btnUpdate, "Data updated successfully...");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}  
			}
			
			
			flag=1;
			
				}
				if(flag==1)
				{
					JOptionPane.showMessageDialog(btnUpdate, "Data updated successfully...");
					
					ShowAdminData sad  =  new ShowAdminData();
					sad.setVisible(true);
					dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(btnUpdate, "Enter all Details");
				}
				}
				else
				{
					JOptionPane.showMessageDialog(btnUpdate, "Invalid");
				}
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else
				{
					JOptionPane.showMessageDialog(btnUpdate, "Invalid length");
				}
			
					
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnUpdate.setBounds(338, 464, 206, 36);
		contentPane.add(btnUpdate);
		
		JButton btnbackhomepage1 = new JButton("GO BACK");
		btnbackhomepage1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Adminupdate1 adu = new Adminupdate1();
				adu.setVisible(true);
				dispose();
			}
		});
		btnbackhomepage1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnbackhomepage1.setBounds(306, 526, 276, 37);
		contentPane.add(btnbackhomepage1);
	}
}
