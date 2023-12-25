package com.studregsys;

import java.sql.*;
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
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Studupdate2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField tf1;
	public JTextField tf2;
	public JTextField tf3;
	public JTextField tf4;
	public JTextField tf5;
	public JTextField tf6;
	JLabel lbl111;
	JLabel lbl112;
	JLabel lbl113;
	JLabel lbl114;
	JLabel lbl115;
	JLabel lbl116;
	
	JButton btnUpdate;
	
	String nm,fnm;
	
	 private int id;
	 private JTextField tf0;
	

	    public void setId(int id) {
	        this.id = id;
	    }
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Studupdate2 frame = new Studupdate2();
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
	public Studupdate2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 831, 759);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(170, 255, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl111 = new JLabel("NAME");
		lbl111.setHorizontalAlignment(SwingConstants.LEFT);
		lbl111.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl111.setBounds(76, 137, 119, 33);
		contentPane.add(lbl111);
		
		tf1 = new JTextField();
		tf1.setHorizontalAlignment(SwingConstants.LEFT);
		tf1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tf1.setColumns(10);
		tf1.setBounds(269, 134, 446, 36);
		contentPane.add(tf1);
		
		lbl112 = new JLabel("FATHER'S NAME");
		lbl112.setHorizontalAlignment(SwingConstants.LEFT);
		lbl112.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl112.setBounds(76, 204, 179, 33);
		contentPane.add(lbl112);
		
		tf2 = new JTextField();
		tf2.setHorizontalAlignment(SwingConstants.LEFT);
		tf2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tf2.setColumns(10);
		tf2.setBounds(269, 201, 446, 36);
		contentPane.add(tf2);
		
		lbl113 = new JLabel("ADDRESS");
		lbl113.setHorizontalAlignment(SwingConstants.LEFT);
		lbl113.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl113.setBounds(76, 265, 119, 33);
		contentPane.add(lbl113);
		
		tf3 = new JTextField();
		tf3.setHorizontalAlignment(SwingConstants.LEFT);
		tf3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tf3.setColumns(10);
		tf3.setBounds(269, 262, 446, 36);
		contentPane.add(tf3);
		
		lbl114 = new JLabel("CITY");
		lbl114.setHorizontalAlignment(SwingConstants.LEFT);
		lbl114.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl114.setBounds(76, 330, 119, 33);
		contentPane.add(lbl114);
		
		tf4 = new JTextField();
		tf4.setHorizontalAlignment(SwingConstants.LEFT);
		tf4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tf4.setColumns(10);
		tf4.setBounds(269, 327, 446, 36);
		contentPane.add(tf4);
		
		lbl115 = new JLabel("PHONE");
		lbl115.setHorizontalAlignment(SwingConstants.LEFT);
		lbl115.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl115.setBounds(76, 402, 119, 33);
		contentPane.add(lbl115);
		
		tf5 = new JTextField();
		tf5.setHorizontalAlignment(SwingConstants.LEFT);
		tf5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tf5.setColumns(10);
		tf5.setBounds(269, 399, 446, 36);
		contentPane.add(tf5);
		
		lbl116 = new JLabel("ROLL NO.");
		lbl116.setHorizontalAlignment(SwingConstants.LEFT);
		lbl116.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl116.setBounds(76, 479, 119, 33);
		contentPane.add(lbl116);
		
		tf6 = new JTextField();
		tf6.setHorizontalAlignment(SwingConstants.LEFT);
		tf6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tf6.setColumns(10);
		tf6.setBounds(269, 476, 446, 36);
		contentPane.add(tf6);
		
		btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			
				AllMethods am=new AllMethods();
				am.connectiondb();
				
				String nm = tf1.getText();
				String fnm = tf2.getText();
				String add = tf3.getText();
				String ci = tf4.getText();
				String ph = tf5.getText();
				String rol = tf6.getText();
				
				int flag=0;
				
               if(tf0.getText().length() != 0)
					
				{
					
					int id = Integer.parseInt(tf0.getText());
					
					
					
					
					try {
						am.st=am.con.createStatement();
						String querry ="select * from studentdata where sRegistrationNo='"+id+"'";
						ResultSet rsc=am.st.executeQuery(querry);
						if(rsc.next())
						{
					

					
					if( nm.length()!=0 || fnm.length()!=0 || add.length()!=0  || ci.length()!=0 || ph.length()!=0  || rol.length()!=0 )
					{
						if(nm.length()!=0) {
							PreparedStatement ps;
			                String sql = "update studentdata set sName = '" + nm + "' where sRegistrationNo = '" + id + "'";
			                
			                try {
								ps = am.con.prepareStatement(sql);
								ps.executeUpdate();
				               // JOptionPane.showMessageDialog(btnUpdate, "Data updated successfully...");
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
			                
			                
			               
						}
								
						if(fnm.length()!=0) {
							PreparedStatement ps;
			                String sql = "update studentdata set sFathersname = '" + fnm + "' where sRegistrationNo = '" + id + "'";
			                
			                try {
								ps = am.con.prepareStatement(sql);
								ps.executeUpdate();
				               // JOptionPane.showMessageDialog(btnUpdate, "Data updated successfully...");
							} catch (SQLException e1) 
			                {
								e1.printStackTrace();
							}  
						}
							
						if(add.length()!=0) {
							PreparedStatement ps;
			                String sql = "update studentdata set sAddress = '" + add + "' where sRegistrationNo = '" + id + "'";
			                
			                try {
								ps = am.con.prepareStatement(sql);
								ps.executeUpdate();
				               // JOptionPane.showMessageDialog(btnUpdate, "Data updated successfully...");
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}  
						}
						
						if(ci.length()!=0) {
							PreparedStatement ps;
			                String sql = "update studentdata set sCity = '" + ci + "' where sRegistrationNo = '" + id + "'";
			                
			                try {
								ps = am.con.prepareStatement(sql);
								ps.executeUpdate();
				                //JOptionPane.showMessageDialog(btnUpdate, "Data updated successfully...");
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}  
						}
						
						if(ph.length()!=0) {
							PreparedStatement ps;
			                String sql = "update studentdata set sPhone = '" + ph + "' where sRegistrationNo = '" + id + "'";
			                
			                try {
								ps = am.con.prepareStatement(sql);
								ps.executeUpdate();
				                //JOptionPane.showMessageDialog(btnUpdate, "Data updated successfully...");
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}  
						}
						
						if(rol.length()!=0) 
						{
							PreparedStatement ps;
			                String sql = "update studentdata set sRollno = '" + rol + "' where sRegistrationNo = '" + id + "'";
			                
			                try {
								ps = am.con.prepareStatement(sql);
								int rs = ps.executeUpdate();
								//System.out.println("modi : "+rs);
				                
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}  
						}
						
						flag=1;
					
						//
						if(flag==1)
						{
							JOptionPane.showMessageDialog(btnUpdate, "Data updated successfully...");
							
							ShowData sad  =  new ShowData();
							sad.setVisible(true);
							dispose();
						}	
					else
					{
						JOptionPane.showMessageDialog(btnUpdate, "Enter all details");
					}
					}
					}
					else
					{
						JOptionPane.showMessageDialog(btnUpdate, "Invalid  ...!!!");
					}
					
					}
					
					catch(Exception ex)
					{
						ex.printStackTrace();
					}
						
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
//				boolean a=tf0.isEnabled();
//				
//				//System.out.println(id);
//				
//				if(tf0.getText().length() != 0)
//					
//				{
//					//System.out.println("pat : "+id);
//					int id = Integer.parseInt(tf0.getText());
//					
//					
//					
//				}
//				else
//				{
//					JOptionPane.showMessageDialog(btnUpdate, "Please Enter Registration ID..!!!");
//				}
//				
//				
//				//System.out.println("cahal"+a);
//				nm = tf1.getText();
//				System.out.println("Viarat :"+nm);
//				System.out.println(nm.length());
//				fnm = tf2.getText();
//				//.out.println("ajay : "+fnm);
//				//System.out.println(fnm.length());
//				String add = tf3.getText();
//				String ci = tf4.getText();
//				String ph = tf5.getText();
//				String rol = tf6.getText();
//				
//				//System.out.println("modi1 : "+rol);
//				AllMethods am=new AllMethods();
//				am.connectiondb();
//				
//				Studupdate st4 = new Studupdate();
//				
//				
//				
//				
//				
//			
//				try {
//					am.st=am.con.createStatement();
//					String querry ="select * from studentdata where sRegistrationNo='"+id+"'";
//					ResultSet rsc=am.st.executeQuery(querry);
//					if(rsc.next())
//	{	
//				if (nm.length()==0 || fnm.length()==0 || add.length()==0  || ci.length()==0 || ph.length()==0  || rol.length()==0 )
//				{
//					JOptionPane.showMessageDialog(btnUpdate, "please enter all details");
//				}
//				else
//				{
//				int flag=0;
//				
//				if( nm.length()!=0 || fnm.length()!=0 || add.length()!=0  || ci.length()!=0 || ph.length()!=0  || rol.length()!=0 )
//				{	
//			
//					
//			if(nm.length()!=0) {
//				PreparedStatement ps;
//                String sql = "update studentdata set sName = '" + nm + "' where sRegistrationNo = '" + id + "'";
//                
//                try {
//					ps = am.con.prepareStatement(sql);
//					ps.executeUpdate();
//	               // JOptionPane.showMessageDialog(btnUpdate, "Data updated successfully...");
//				} catch (SQLException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//                
//                
//               
//			}
//			
//					
////					if(st4.chname.isSelected() == true)
////					{
////						if(nm.length() != 0)
////						{
////							PreparedStatement ps;
////			                String sql = "update studentdata set sName = '" + nm + "' where sRegistrationNo = '" + id + "'";
////			                
////			                try {
////								ps = am.con.prepareStatement(sql);
////								ps.executeUpdate();
////				               // JOptionPane.showMessageDialog(btnUpdate, "Data updated successfully...");
////							} catch (SQLException e1) {
////								// TODO Auto-generated catch block
////								e1.printStackTrace();
////							}
////						}
////						else
////						{
////							JOptionPane.showMessageDialog(btnUpdate, "Plss enter name");
////						}
////					}
//						
//					
//					
//			if(fnm.length()!=0) {
//				PreparedStatement ps;
//                String sql = "update studentdata set sFathersname = '" + fnm + "' where sRegistrationNo = '" + id + "'";
//                
//                try {
//					ps = am.con.prepareStatement(sql);
//					ps.executeUpdate();
//	               // JOptionPane.showMessageDialog(btnUpdate, "Data updated successfully...");
//				} catch (SQLException e1) 
//                {
//					e1.printStackTrace();
//				}  
//			}
//				
//			if(add.length()!=0) {
//				PreparedStatement ps;
//                String sql = "update studentdata set sAddress = '" + add + "' where sRegistrationNo = '" + id + "'";
//                
//                try {
//					ps = am.con.prepareStatement(sql);
//					ps.executeUpdate();
//	               // JOptionPane.showMessageDialog(btnUpdate, "Data updated successfully...");
//				} catch (SQLException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}  
//			}
//			
//			if(ci.length()!=0) {
//				PreparedStatement ps;
//                String sql = "update studentdata set sCity = '" + ci + "' where sRegistrationNo = '" + id + "'";
//                
//                try {
//					ps = am.con.prepareStatement(sql);
//					ps.executeUpdate();
//	                //JOptionPane.showMessageDialog(btnUpdate, "Data updated successfully...");
//				} catch (SQLException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}  
//			}
//			
//			if(ph.length()!=0) {
//				PreparedStatement ps;
//                String sql = "update studentdata set sPhone = '" + ph + "' where sRegistrationNo = '" + id + "'";
//                
//                try {
//					ps = am.con.prepareStatement(sql);
//					ps.executeUpdate();
//	                //JOptionPane.showMessageDialog(btnUpdate, "Data updated successfully...");
//				} catch (SQLException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}  
//			}
//			
//			if(rol.length()!=0) 
//			{
//				PreparedStatement ps;
//                String sql = "update studentdata set sRollno = '" + rol + "' where sRegistrationNo = '" + id + "'";
//                
//                try {
//					ps = am.con.prepareStatement(sql);
//					int rs = ps.executeUpdate();
//					//System.out.println("modi : "+rs);
//	                
//				} catch (SQLException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}  
//			}
//			
//			flag=1;
//			
//				}
//				if(flag==1)
//				{
//					JOptionPane.showMessageDialog(btnUpdate, "Data Updated Successfully...");
//				}
//				else
//				{
//					JOptionPane.showMessageDialog(btnUpdate, "Please Enter all Details");
//				}
//				}
//	}	
//					else
//					{
//						JOptionPane.showMessageDialog(btnUpdate, "Invalid Registration Id");
//					}
//				} 
//				catch (SQLException e1) 
//				{
//				
//					e1.printStackTrace();
//				}

			}
			
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnUpdate.setBounds(306, 584, 206, 36);
		contentPane.add(btnUpdate);
		
		JButton btnbackhomepage = new JButton("GO BACK TO HOME PAGE");
		btnbackhomepage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Studupdate sp = new Studupdate();
				sp.setVisible(true);
				dispose();
			}
		});
		btnbackhomepage.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnbackhomepage.setBounds(274, 646, 276, 37);
		contentPane.add(btnbackhomepage);
		
		JLabel lblRegNo = new JLabel("REG NO");
		lblRegNo.setHorizontalAlignment(SwingConstants.LEFT);
		lblRegNo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRegNo.setBounds(76, 61, 119, 33);
		contentPane.add(lblRegNo);
		
		tf0 = new JTextField();
		tf0.setHorizontalAlignment(SwingConstants.LEFT);
		tf0.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tf0.setColumns(10);
		tf0.setBounds(269, 60, 446, 36);
		contentPane.add(tf0);
	}
}
