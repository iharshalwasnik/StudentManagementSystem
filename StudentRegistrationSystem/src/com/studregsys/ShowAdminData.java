package com.studregsys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;

public class ShowAdminData extends JFrame {

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
					ShowAdminData frame = new ShowAdminData();
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
	public ShowAdminData() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1175, 754);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdminData = new JLabel("ADMIN DATA");
		lblAdminData.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminData.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblAdminData.setBounds(405, 22, 361, 51);
		contentPane.add(lblAdminData);
		
		JButton btnshowdata = new JButton("SHOW DATA ");
		btnshowdata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (count == 1)
					
				{
				try
				{
					Connection con;
					Class.forName("com.mysql.cj.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","");
					Statement st = con.createStatement();
					String query = "select * from addadmin";
					ResultSet rs = st.executeQuery(query);
					ResultSetMetaData rsmd = rs.getMetaData();
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					int cols = rsmd.getColumnCount();
					String[] colName = new String[cols];
					
					for (int i=0;i<cols;i++)
						
						 colName[i] = rsmd.getColumnName(i +1);
						model.setColumnIdentifiers(colName);
						
						String aRegno , aName , aAddress , aPhone , aGender , aBloodgroup , aQualification , aDesignation;
						while(rs.next())
						{
							aRegno = rs.getString(1);
							aName = rs.getString(2);
							aAddress = rs.getString(3);
							aPhone = rs.getString(4);
							aGender = rs.getString(5);
							aBloodgroup = rs.getString(6);
							aQualification = rs.getString(7);
							aDesignation = rs.getString(8);
							
							String [] row = {aRegno , aName , aAddress , aPhone , aGender , aBloodgroup , aQualification , aDesignation};
							model.addRow(row);
						}
						st.close();
						con.close();
				}
				catch (Exception expp)
				{
					System.out.println(expp);
				}
				
				
				count++;
				}
				else
				{JOptionPane.showMessageDialog(btnshowdata, "Data has already been Restored ...");}
			}
		});
		btnshowdata.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnshowdata.setBounds(26, 575, 184, 51);
		contentPane.add(btnshowdata);
		
		JButton btnbackhomepage = new JButton("GO BACK TO HOME PAGE");
		btnbackhomepage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NewHome nh = new NewHome();
				nh.setVisible(true);
				dispose();
			}
		});
		btnbackhomepage.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnbackhomepage.setBounds(365, 648, 276, 44);
		contentPane.add(btnbackhomepage);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 100, 1108, 453);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table.setBackground(new Color(128, 255, 255));
		scrollPane.setViewportView(table);
		
		JButton btndel = new JButton("DELETE DATA ");
		btndel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					Connection con;
					Class.forName("com.mysql.cj.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","");
					String query = "delete from addadmin where aRegno = '"+textdel.getText()+"' ";
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
			                String selectQuery = "select * from addadmin";
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
		btndel.setBounds(632, 578, 195, 44);
		contentPane.add(btndel);
		
		textdel = new JTextField();
		textdel.setBounds(325, 583, 219, 42);
		contentPane.add(textdel);
		textdel.setColumns(10);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Adminupdate1 au = new Adminupdate1();
				au.setVisible(true);
				dispose();
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnUpdate.setBounds(950, 575, 184, 51);
		contentPane.add(btnUpdate);
	}
}
