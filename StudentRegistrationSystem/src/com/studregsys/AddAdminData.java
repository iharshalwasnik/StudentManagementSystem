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
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class AddAdminData extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textreg;
	private JTextField textname;
	private JTextField textadd;
	private JTextField textphone;
	private JTextField textdesig;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddAdminData frame = new AddAdminData();
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
	public AddAdminData() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 847, 882);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 196));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADD ADMIN DATA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(189, 35, 465, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblRegno = new JLabel("REG.NO.");
		lblRegno.setHorizontalAlignment(SwingConstants.LEFT);
		lblRegno.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRegno.setBounds(62, 117, 119, 33);
		contentPane.add(lblRegno);
		
		textreg = new JTextField();
		textreg.setHorizontalAlignment(SwingConstants.LEFT);
		textreg.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textreg.setColumns(10);
		textreg.setBounds(265, 116, 446, 36);
		contentPane.add(textreg);
		
		JLabel lbl111 = new JLabel("NAME");
		lbl111.setHorizontalAlignment(SwingConstants.LEFT);
		lbl111.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl111.setBounds(62, 184, 119, 33);
		contentPane.add(lbl111);
		
		textname = new JTextField();
		textname.setHorizontalAlignment(SwingConstants.LEFT);
		textname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textname.setColumns(10);
		textname.setBounds(265, 183, 446, 36);
		contentPane.add(textname);
		
		JLabel lbl113 = new JLabel("ADDRESS");
		lbl113.setHorizontalAlignment(SwingConstants.LEFT);
		lbl113.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl113.setBounds(62, 252, 119, 33);
		contentPane.add(lbl113);
		
		JLabel lblGender = new JLabel("GENDER");
		lblGender.setHorizontalAlignment(SwingConstants.LEFT);
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblGender.setBounds(62, 397, 153, 33);
		contentPane.add(lblGender);
		
		JLabel lblPhone = new JLabel("PHONE");
		lblPhone.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPhone.setBounds(62, 327, 119, 33);
		contentPane.add(lblPhone);
		
		JLabel lblBloodGroup = new JLabel("BLOOD GROUP");
		lblBloodGroup.setHorizontalAlignment(SwingConstants.LEFT);
		lblBloodGroup.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBloodGroup.setBounds(62, 472, 153, 33);
		contentPane.add(lblBloodGroup);
		
		JLabel lblQualification = new JLabel("QUALIFICATION");
		lblQualification.setHorizontalAlignment(SwingConstants.LEFT);
		lblQualification.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblQualification.setBounds(62, 549, 179, 33);
		contentPane.add(lblQualification);
		
		JLabel lblDesignation = new JLabel("DESIGNATION");
		lblDesignation.setHorizontalAlignment(SwingConstants.LEFT);
		lblDesignation.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDesignation.setBounds(62, 634, 153, 33);
		contentPane.add(lblDesignation);
		
		textadd = new JTextField();
		textadd.setHorizontalAlignment(SwingConstants.LEFT);
		textadd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textadd.setColumns(10);
		textadd.setBounds(265, 251, 446, 36);
		contentPane.add(textadd);
		
		textphone = new JTextField();
		textphone.setHorizontalAlignment(SwingConstants.LEFT);
		textphone.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textphone.setColumns(10);
		textphone.setBounds(265, 326, 446, 36);
		contentPane.add(textphone);
		
		textdesig = new JTextField();
		textdesig.setHorizontalAlignment(SwingConstants.LEFT);
		textdesig.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textdesig.setColumns(10);
		textdesig.setBounds(265, 633, 446, 36);
		contentPane.add(textdesig);
		
		JComboBox combobg = new JComboBox();
		combobg.setModel(new DefaultComboBoxModel(new String[] {"Select Blood Group", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"}));
		combobg.setFont(new Font("Tahoma", Font.PLAIN, 18));
		combobg.setBounds(265, 472, 446, 35);
		contentPane.add(combobg);
		
		JComboBox combogen = new JComboBox();
		combogen.setModel(new DefaultComboBoxModel(new String[] {"Select the Gender ", "Male ", "Female", "Transgender"}));
		combogen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		combogen.setBounds(265, 397, 446, 35);
		contentPane.add(combogen);
		
		JComboBox comboqua = new JComboBox();
		comboqua.setModel(new DefaultComboBoxModel(new String[] {"Select Qualification ", "Management MBA/BBA", "Engineering B.Tech and B.Arch, M.Tech, ME, BE", "Arts – psychology, history, sociology", "Computer Application-BCA/MCA", "Fine arts – B.F.A", "Education- B.Ed, M.Ed", "Designing – Fashion/Interior/Web", "Mass-communication/Journalism BJMC", "Pharmacy – B.Pharma, M.Pharma", "Hospitality – Hotel Management", "Medical-BDS and MBBS", "Nursing – B.Sc. M.Sc.", "Dental- BDS", "Finance – B.Com/CA/CFA/ CS", "Architecture – B.Arch"}));
		comboqua.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboqua.setBounds(265, 549, 446, 35);
		contentPane.add(comboqua);
		
		JButton btnsubmit = new JButton("SUBMIT");
		btnsubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String nm = textname.getText();
				String add = textadd.getText();
				String ph = textphone.getText();
				String gen = combogen.getSelectedItem().toString();
				String bg = combobg.getSelectedItem().toString();
				String qua = comboqua.getSelectedItem().toString();
				String desig = textdesig.getText();
				
//				boolean bol = nm.isEmpty();
//         		System.out.println(bol);
				
				if ((nm.isEmpty()==false )&&(add.isEmpty()==false)&&(ph.isEmpty()==false)&&(gen.isEmpty()==false)&&(bg.isEmpty()==false)&&(qua.isEmpty()==false)&&(desig.isEmpty()==false))
				{
					int regno = Integer.parseInt(textreg.getText());
					AllMethods am = new AllMethods();
					am.connectiondb();
					int a = am.addadmindata(regno, nm, add, ph, gen, bg, qua, desig);
					System.out.println(a);
					if (a==1)
					{
						JOptionPane.showConfirmDialog(btnsubmit,"are you sure you want to save the data ?","Select",JOptionPane.YES_NO_OPTION);
						NewHome nhm = new NewHome();
						nhm.setVisible(true);
						dispose();
					}
					else {}
				}
				else
				{
					JOptionPane.showMessageDialog(btnsubmit, "kindly fill all details...");
				}
				
			}
		});
		btnsubmit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnsubmit.setBounds(189, 734, 206, 43);
		contentPane.add(btnsubmit);
		
		JButton btnGoBackTo = new JButton("GO BACK TO HOME PAGE");
		btnGoBackTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NewHome nh = new NewHome();
				nh.setVisible(true);
				dispose();
				
			}
		});
		btnGoBackTo.setForeground(Color.GRAY);
		btnGoBackTo.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnGoBackTo.setBounds(449, 734, 295, 43);
		contentPane.add(btnGoBackTo);
	}
}
