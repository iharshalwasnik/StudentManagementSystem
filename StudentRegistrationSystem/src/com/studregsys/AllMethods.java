package com.studregsys;


import java.sql.*;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;




public class AllMethods {
	private JTable table;
	
	Connection con;
	
	Statement st;

	
	int id;
	
	public void getId(int i)
	{
		int id = i;
		System.out.println("Constructor"+i);
		
	}
	
	/*
	public AllMethods()
	{
		
	}
	
	public AllMethods(int i)
	{
		id = i;
		System.out.println("id : "+id);
		
		
	}
	*/
	
	public void connectiondb()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","");
		    st = con.createStatement();
			System.out.println("connection established ...");
			
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void register(String nm , String ps , String ph , String gen , String bg , String add)
	{
		try 
		{
			PreparedStatement pst;
			String sql = "insert into slogin values(?,?,?,?,?,?)";
			pst = con.prepareStatement(sql);
			pst.setString(1, nm);
			pst.setString(2, ps);
            pst.setString(3, ph);
			pst.setString(4, gen);
			pst.setString(5, bg);
			pst.setString(6, add);
			
			pst.executeUpdate();
			
			System.out.println("data inserted successfully...");
			

			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		
		
	}
	
	public int addstudentdata(int regno , String nm , String fnm , String add , String city , String bg , String gen , String ph , String cls , int rno)
	{
		int rs=0;
		try
		{
			String str = "insert into studentdata values (?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(str);
			pst.setInt(1, regno);
			pst.setString(2, nm);
			pst.setString(3, fnm);
			pst.setString(4, add);
			pst.setString(5, city);
			pst.setString(6, bg);
			pst.setString(7, gen);
			pst.setString(8, ph);
			pst.setString(9, cls);
			pst.setInt(10, rno);
			rs = pst.executeUpdate();
		}
		catch (Exception exp)
		{
			System.out.println(exp);
		}
		return rs;
		
	}
	
	public int addadmindata(int regno , String nm , String add , String ph , String gen , String bg , String qua , String desig)
	{
		int result =0;
		try
		{
			String str = "insert into addadmin values (?,?,?,?,?,?,?,?)";
			PreparedStatement pss = con.prepareStatement(str);
			pss.setInt(1, regno);
			pss.setString(2, nm);
			pss.setString(3, add);
			pss.setString(4, ph);
			pss.setString(5, gen);
			pss.setString(6, bg);
			pss.setString(7, qua);
			pss.setString(8, desig);
		    result = pss.executeUpdate();
			
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		return result;
	}
	
	
	public void showstudentdata()
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
		}
		catch (Exception ex)
		{
			System.out.println(ex);
		}
	}
	
	
	public void updatestuddata(int i, String nm , String fnm)
	{
		// , String add , String ci , String ph , String rol
		try {
			Studupdate stu = new Studupdate();	
			Studupdate2 s = new Studupdate2();
			
//			if ((stu.chname.isSelected() || stu.chfname.isSelected() || stu.chadd.isSelected() || stu.chcity.isSelected() || stu.chph.isSelected() || stu.chrn.isSelected()))
//			{
//				if((s.tf1.isEditable()) || (s.tf2.isEditable()) || (s.tf3.isEditable()) || (s.tf4.isEditable()) || (s.tf5.isEditable()) || (s.tf6.isEditable()))
//				{
//					PreparedStatement ps;
//					String sql = "update studentdata set sName = '"+nm+"' sFathersname = '"+fnm+"' ,sAddress = '"+add+"' , sCity = '"+ci+"' , sPhone = '"+ph+"' , sRollno = '"+rol+"' where sRegistrationNo = '"+i+"' ";
//					ps = con.prepareStatement(sql);
//					ps.executeUpdate();
//					JOptionPane.showMessageDialog(stu, "data updated successfully...");
//				}
				
//			  if (s.nm.length()!=0) 
//			  {
//
//		           
//		                PreparedStatement ps;
//		                String sql = "update studentdata set sName = '" + nm + "' where sRegistrationNo = '" + i + "'";
//		                ps = con.prepareStatement(sql);
//		                ps.executeUpdate();
//		                JOptionPane.showMessageDialog(stu, "Data updated successfully...");
//		      } 
//			  
//			  if (s.fnm.length()==0) 
//			  {
//
//		           
//		                PreparedStatement ps;
//		                String sql = "update studentdata set sFathersname = '" + fnm + "' where sRegistrationNo = '" + i + "'";
//		                ps = con.prepareStatement(sql);
//		                ps.executeUpdate();
//		                JOptionPane.showMessageDialog(stu, "Data updated successfully...");
//		      } 

		    } catch (Exception exp) {
		        exp.printStackTrace();
		    }
	}
}


