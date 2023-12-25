package com.studregsys;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.*;
import java.awt.Color;

public class ShowData extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	int count =1;
	private JTextField textdel;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowData frame = new ShowData();
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
	public ShowData() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1028, 744);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnshowdata = new JButton("SHOW DATA ");
		btnshowdata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
//				AllMethods am = new AllMethods();
//				am.showstudentdata();
//				am.connectiondb();
				
				if(count == 1)
				{
					try
					{
						
						Connection con;
						Class.forName("com.mysql.cj.jdbc.Driver");
						con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","");
						Statement st = con.createStatement();
						String query = "select * from studentdata";
						ResultSet rs = st.executeQuery(query);
						ResultSetMetaData rsmd = rs.getMetaData();
						DefaultTableModel model = (DefaultTableModel) table.getModel();
						int cols = rsmd.getColumnCount();
						String[] colName = new String[cols];
						
						for (int i=0;i<cols;i++)
						
						 colName[i] = rsmd.getColumnName(i +1);
						model.setColumnIdentifiers(colName);
						
						String sRegistrationNo , sName , sFathersname , sAddress , sCity , sBloodgrp , sGender , sPhone , sClass , sRollno;
						while(rs.next())
						{
							sRegistrationNo = rs.getString(1);
							sName = rs.getString(2);
							sFathersname = rs.getString(3);
							sAddress = rs.getString(4);
							sCity = rs.getString(5);
							sBloodgrp = rs.getString(6);
							sGender = rs.getString(7);
							sPhone = rs.getString(8);
							sClass = rs.getString(9);
							sRollno = rs.getString(10);
							String [] row = {sRegistrationNo , sName , sFathersname , sAddress , sCity , sBloodgrp , sGender , sPhone , sClass , sRollno};
							model.addRow(row);
						}
						st.close();
						con.close();
					}
					catch (Exception ex)
					{
						System.out.println(ex);
					}
					
					count++;
				}
				else 
				{
					JOptionPane.showMessageDialog(btnshowdata, "Data has already been Restored ...");
				}
				
			}
		});
		btnshowdata.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnshowdata.setBounds(31, 570, 160, 44);
		contentPane.add(btnshowdata);
		
		JLabel lblNewLabel = new JLabel("STUDENTS DATA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(335, 10, 361, 51);
		contentPane.add(lblNewLabel);
		
		JButton btnbackhomepage = new JButton("GO BACK TO HOME PAGE");
		btnbackhomepage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NewHome nh = new NewHome();
				nh.setVisible(true);
				dispose();
			}
		});
		btnbackhomepage.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnbackhomepage.setBounds(367, 635, 276, 44);
		contentPane.add(btnbackhomepage);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 71, 957, 473);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table.setBackground(new Color(128, 255, 255));
		scrollPane.setViewportView(table);
		
		JButton btndel = new JButton("DELETE DATA");
		btndel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					Connection con;
					Class.forName("com.mysql.cj.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","");
					String query = "delete from studentdata where sRegistrationNo = '"+textdel.getText()+"' ";
					PreparedStatement ps = con.prepareStatement(query);
					int rs = ps.executeUpdate();
					System.out.println("rs...."+rs);
					
					if (rs == 1)
					{
						JOptionPane.showMessageDialog(btndel, "Data Deleted Successfully...");
						textdel.setText("");
						
						DefaultTableModel model = (DefaultTableModel) table.getModel();
		                model.setRowCount(0);

		                Statement st = con.createStatement();
		                String selectQuery = "select * from studentdata";
		                ResultSet result = st.executeQuery(selectQuery);
		                ResultSetMetaData rsmd = result.getMetaData();
		                int cols = rsmd.getColumnCount();

		                while (result.next()) {
		                    Object[] row = new Object[cols];
		                    for (int i = 1; i <= cols; i++) {
		                        row[i - 1] = result.getObject(i);
		                    }
		                    model.addRow(row);
		                }

		                st.close();
						
						
					}
					else if(textdel.getText().isEmpty())
					{
						JOptionPane.showMessageDialog(btndel, "Please Select the Data ");

					}
					else
					{
						JOptionPane.showMessageDialog(btndel, "Data was not deleted ,please try again later... ");
						textdel.setText("");
					}
				}
				catch (Exception exp)
				{
					exp.printStackTrace();
				}
			}
		});
		btndel.setFont(new Font("Tahoma", Font.BOLD, 18));
		btndel.setBounds(518, 570, 160, 44);
		contentPane.add(btndel);
		
		textdel = new JTextField();
		textdel.setBounds(711, 571, 224, 40);
		contentPane.add(textdel);
		textdel.setColumns(10);
		
		JButton btnupdate = new JButton("UPDATE DATA");
		btnupdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Studupdate stu = new Studupdate();
				stu.setVisible(true);
				dispose();
			}
		});
		btnupdate.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnupdate.setBounds(246, 570, 210, 44);
		contentPane.add(btnupdate);
	}
}
