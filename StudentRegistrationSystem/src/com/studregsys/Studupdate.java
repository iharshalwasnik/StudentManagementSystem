package com.studregsys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JCheckBox;

public class Studupdate extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JCheckBox chname;
	JCheckBox chfname;
	JCheckBox chadd;
	JCheckBox chcity;
	JCheckBox chph;
	JCheckBox chrn;
	
	int x;
	private JLabel lblNewLabel;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Studupdate frame = new Studupdate();
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
	public Studupdate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 507, 533);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnbackhomepage = new JButton("GO BACK TO HOME PAGE");
		btnbackhomepage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ShowData sd = new ShowData();
				sd.setVisible(true);
				dispose();
			}
		});
		btnbackhomepage.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnbackhomepage.setBounds(122, 441, 276, 37);
		contentPane.add(btnbackhomepage);
		
		
		JButton btnProceed = new JButton("PROCEED");
		btnProceed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
//				x = Integer.parseInt(tfreg.getText());
//				System.out.println("x : "+x);
//				
//				AllMethods amobj = new AllMethods();
//				amobj.getId(x);
				
	
				
				try {
			        
//					 Studupdate2 stud = new Studupdate2();
//	                    stud.setId(x); // Pass the id to Studupdate2
//	                    stud.setVisible(true);
//	                    dispose();
					
			        if (!(chname.isSelected() || chfname.isSelected() || chadd.isSelected() || chcity.isSelected() || chph.isSelected() || chrn.isSelected())) 
			        {
			            JOptionPane.showMessageDialog(contentPane, "Please select at least one option.", "Error",
			                    JOptionPane.ERROR_MESSAGE);
			            return;
			        }

			        Studupdate2 stu = new Studupdate2();
			        stu.setVisible(true);
			        dispose();

			        if (chname.isSelected()) 
			        {
			            stu.tf1.setEditable(true);
			        } 
			        else 
			        {
			            stu.tf1.setVisible(false);
			            stu.lbl111.setVisible(false);
			            //stu.tf1.setForeground(Color.orange);
			            //stu.tf1.setDisabledTextColor(Color.blue);
			            
			        }
			        
			        
			        if (chfname.isSelected()) 
			        {
			            stu.tf2.setEditable(true);
			        } 
			        else 
			        {
			            stu.tf2.setVisible(false);
			            stu.lbl112.setVisible(false);
			        }
			        if (chadd.isSelected()) 
			        {
			            stu.tf3.setEditable(true);
			        }
			        else 
			        {
			            stu.tf3.setVisible(false);
			            stu.lbl113.setVisible(false);
			        }
			        if (chcity.isSelected()) 
			        {
			            stu.tf4.setEditable(true);
			        } 
			        else 
			        {
			            stu.tf4.setVisible(false);
			            stu.lbl114.setVisible(false);
			        }
			        if (chph.isSelected()) 
			        {
			            stu.tf5.setEditable(true);
			        } 
			        else 
			        {
			            stu.tf5.setVisible(false);
			            stu.lbl115.setVisible(false);
			        }
			        if (chrn.isSelected()) 
			        {
			            stu.tf6.setEditable(true);
			        } 
			        else 
			        {
			            stu.tf6.setVisible(false);
			            stu.lbl116.setVisible(false);
			        }
			        
			        

			    } 
				catch (Exception ex) 
				{
			        ex.printStackTrace();
			    }
			
				
			}
		});
		btnProceed.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnProceed.setBounds(176, 392, 174, 37);
		contentPane.add(btnProceed);
		
		chname = 	new JCheckBox("NAME");
		chname.setBackground(new Color(128, 128, 255));
		chname.setForeground(new Color(0, 0, 0));
		chname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chname.setBounds(45, 148, 93, 33);
		contentPane.add(chname);
		
		chfname = new JCheckBox("FATHER'S NAME");
		chfname.setBackground(new Color(128, 128, 255));
		chfname.setForeground(new Color(0, 0, 0));
		chfname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chfname.setBounds(45, 183, 159, 33);
		contentPane.add(chfname);
		
		chadd = new JCheckBox("ADDRESS");
		chadd.setBackground(new Color(128, 128, 255));
		chadd.setForeground(new Color(0, 0, 0));
		chadd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chadd.setBounds(45, 218, 119, 33);
		contentPane.add(chadd);
		
		chcity = new JCheckBox("CITY");
		chcity.setBackground(new Color(128, 128, 255));
		chcity.setForeground(new Color(0, 0, 0));
		chcity.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chcity.setBounds(45, 253, 93, 33);
		contentPane.add(chcity);
		
		chph = new JCheckBox("PHONE");
		chph.setBackground(new Color(128, 128, 255));
		chph.setForeground(new Color(0, 0, 0));
		chph.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chph.setBounds(45, 288, 93, 33);
		contentPane.add(chph);
		
		chrn = new JCheckBox("ROLL NO.");
		chrn.setBackground(new Color(128, 128, 255));
		chrn.setForeground(new Color(0, 0, 0));
		chrn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chrn.setBounds(45, 323, 109, 33);
		contentPane.add(chrn);
		
		lblNewLabel = new JLabel("SELECT THE UPDATE OPTION");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(60, 49, 373, 48);
		contentPane.add(lblNewLabel);
	}
}
