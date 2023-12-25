package com.studregsys;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class NewHome extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewHome frame = new NewHome();
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
	public NewHome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 982, 772);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO THE HOMEPAGE ");
		lblNewLabel.setBounds(253, 30, 509, 55);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JLabel lbl2 = new JLabel("");
		lbl2.setBounds(0, 157, 256, 241);
		ImageIcon ig = new ImageIcon(this.getClass().getResource("/addStud.png"));
		lbl2.setIcon(ig);
		contentPane.add(lbl2);
		
		JLabel lbl3 = new JLabel("");
		lbl3.setBounds(229, 157, 256, 241);
		ImageIcon ig1 = new ImageIcon(this.getClass().getResource("/addStudent.png"));
		lbl3.setIcon(ig1);
		contentPane.add(lbl3);
		
		JLabel lbl4 = new JLabel("");
		lbl4.setBounds(490, 157, 256, 241);
		ImageIcon ig2 = new ImageIcon(this.getClass().getResource("/adminLogin.png"));
		lbl4.setIcon(ig2);
		contentPane.add(lbl4);
		
		JLabel lbl5 = new JLabel("");
		lbl5.setBounds(712, 157, 256, 241);
		ImageIcon ig3 = new ImageIcon(this.getClass().getResource("/addAdmin.png"));
		lbl5.setIcon(ig3);
		contentPane.add(lbl5);
		
		JButton btnstuddata = new JButton("STUDENTS DATA");
		btnstuddata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ShowData sd = new ShowData();
				sd.setVisible(true);
				dispose();
				
			}
		});
		btnstuddata.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnstuddata.setBounds(10, 482, 223, 68);
		contentPane.add(btnstuddata);
		
		JButton btnstuddata_1 = new JButton("ADD STUDENTS DATA");
		btnstuddata_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AddStudData asd = new AddStudData();
				asd.setVisible(true);
				dispose();
			}
		});
		btnstuddata_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnstuddata_1.setBounds(243, 482, 242, 68);
		contentPane.add(btnstuddata_1);
		
		JButton btnstuddata_2 = new JButton("ADMIN DATA");
		btnstuddata_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ShowAdminData sad = new ShowAdminData();
				sad.setVisible(true);
				dispose();
			}
		});
		btnstuddata_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnstuddata_2.setBounds(495, 482, 221, 68);
		contentPane.add(btnstuddata_2);
		
		JButton btnstuddata_3 = new JButton("ADD ADMIN DATA");
		btnstuddata_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AddAdminData amd = new AddAdminData();
				amd.setVisible(true);
				dispose();
				
				
			}
		});
		btnstuddata_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnstuddata_3.setBounds(726, 482, 232, 68);
		contentPane.add(btnstuddata_3);
		
		JButton btnlogout = new JButton("LOGOUT");
		btnlogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int i = JOptionPane.showConfirmDialog(btnlogout, "Are You Sure ,You want to exit ?", "Select", JOptionPane.YES_NO_OPTION);

				if(i==0)
				{
					Login lo = new Login();
					lo.setVisible(true);
					dispose();
				}
				else{}
			}
		});
		btnlogout.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnlogout.setBounds(122, 612, 309, 55);
		contentPane.add(btnlogout);
		
		JButton btnEXIT = new JButton("EXIT");
		btnEXIT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int ex = JOptionPane.showConfirmDialog(btnEXIT, "Are You Sure You Want Exit ?", "Select", JOptionPane.YES_NO_OPTION);
				if (ex==0)
				{
					NewHome nh = new NewHome();
					dispose();
				}
				else{}
			}
		});
		btnEXIT.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEXIT.setBounds(525, 612, 309, 55);
		contentPane.add(btnEXIT);
		
		JLabel lblbg = new JLabel("New label");
		lblbg.setIcon(new ImageIcon("C:\\Users\\harsh\\Downloads\\studentimg (1).jpg"));
		lblbg.setBounds(0, 0, 968, 730);
		contentPane.add(lblbg);
	}
}
