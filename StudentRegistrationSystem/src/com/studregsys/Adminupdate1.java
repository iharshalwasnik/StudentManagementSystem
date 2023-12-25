package com.studregsys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Adminupdate1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Adminupdate1 frame = new Adminupdate1();
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
	public Adminupdate1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 566);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SELECT THE UPDATE OPTION");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(79, 35, 373, 48);
		contentPane.add(lblNewLabel);
		
		JCheckBox chname = new JCheckBox("NAME");
		chname.setForeground(Color.BLACK);
		chname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chname.setBackground(new Color(128, 128, 255));
		chname.setBounds(64, 134, 93, 33);
		contentPane.add(chname);
		
		JCheckBox chadd = new JCheckBox("ADDRESS");
		chadd.setForeground(Color.BLACK);
		chadd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chadd.setBackground(new Color(128, 128, 255));
		chadd.setBounds(64, 179, 119, 33);
		contentPane.add(chadd);
		
		JCheckBox chph = new JCheckBox("PHONE");
		chph.setForeground(Color.BLACK);
		chph.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chph.setBackground(new Color(128, 128, 255));
		chph.setBounds(64, 220, 93, 33);
		contentPane.add(chph);
		
		JCheckBox chdes = new JCheckBox("DESIGNATION");
		chdes.setForeground(Color.BLACK);
		chdes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chdes.setBackground(new Color(128, 128, 255));
		chdes.setBounds(64, 260, 167, 33);
		contentPane.add(chdes);
		
		JButton btnProceed = new JButton("PROCEED");
		btnProceed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
			        
					
			        if (!(chname.isSelected() || chadd.isSelected() || chph.isSelected() || chdes.isSelected())) 
			        {
			            JOptionPane.showMessageDialog(contentPane, "Please select at least one option.", "Error",
			                    JOptionPane.ERROR_MESSAGE);
			            return;
			        }

			        Adminupdate2 aud = new Adminupdate2();
			        aud.setVisible(true);
			        dispose();

			        if (chname.isSelected()) 
			        {
			            aud.tf112.setEditable(true);
			        } 
			        else 
			        {
			            aud.tf112.setVisible(false);
			            aud.lbl2.setVisible(false);
			            
			        }
			       
			        if (chadd.isSelected()) 
			        {
			            aud.tf113.setEditable(true);
			        }
			        else 
			        {
			            aud.tf113.setVisible(false);
			            aud.lbl3.setVisible(false);
			        }
			        
			        if (chph.isSelected()) 
			        {
			            aud.tf114.setEditable(true);
			        } 
			        else 
			        {
			            aud.tf114.setVisible(false);
			            aud.lbl4.setVisible(false);
			        }
			        
			        if (chdes.isSelected()) 
			        {
			            aud.tf115.setEditable(true);
			        } 
			        else 
			        {
			            aud.tf115.setVisible(false);
			            aud.lbl5.setVisible(false);
			        }
			        
			        

			    } 
				catch (Exception ex) 
				{
			        ex.printStackTrace();
			    }
			
				
			
			}
		});
		btnProceed.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnProceed.setBounds(180, 371, 174, 37);
		contentPane.add(btnProceed);
		
		JButton btnbackhomepage = new JButton("GO BACK TO HOME PAGE");
		btnbackhomepage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ShowAdminData sad = new ShowAdminData();
				sad.setVisible(true);
				dispose();
			}
		});
		btnbackhomepage.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnbackhomepage.setBounds(126, 430, 276, 37);
		contentPane.add(btnbackhomepage);
	}
}
