package com.studregsys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;

public class AddStudData extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textname;
	private JTextField textfathersname;
	private JTextField textaddress;
	private JTextField textcity;
	private JTextField textphone;
	private JTextField textreg;
	private JTextField textrollno;
	
	JComboBox scrollclass;
	JComboBox scrollgen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStudData frame = new AddStudData();
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
	public AddStudData() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 926, 844);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADD STUDENTS DATA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(188, 10, 552, 66);
		contentPane.add(lblNewLabel);
		
		JLabel lbl111 = new JLabel("NAME");
		lbl111.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl111.setHorizontalAlignment(SwingConstants.LEFT);
		lbl111.setBounds(52, 166, 119, 33);
		contentPane.add(lbl111);
		
		JLabel lbl112 = new JLabel("FATHER'S NAME");
		lbl112.setHorizontalAlignment(SwingConstants.LEFT);
		lbl112.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl112.setBounds(52, 233, 179, 33);
		contentPane.add(lbl112);
		
		JLabel lbl113 = new JLabel("ADDRESS");
		lbl113.setHorizontalAlignment(SwingConstants.LEFT);
		lbl113.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl113.setBounds(52, 294, 119, 33);
		contentPane.add(lbl113);
		
		JLabel lbl114 = new JLabel("CITY");
		lbl114.setHorizontalAlignment(SwingConstants.LEFT);
		lbl114.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl114.setBounds(52, 359, 119, 33);
		contentPane.add(lbl114);
		
		JLabel lblBloodGroup = new JLabel("BLOOD GROUP");
		lblBloodGroup.setHorizontalAlignment(SwingConstants.LEFT);
		lblBloodGroup.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBloodGroup.setBounds(52, 420, 153, 33);
		contentPane.add(lblBloodGroup);
		
		JLabel lblPhone = new JLabel("PHONE");
		lblPhone.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPhone.setBounds(52, 552, 119, 33);
		contentPane.add(lblPhone);
		
		JLabel lblClass = new JLabel("CLASS");
		lblClass.setHorizontalAlignment(SwingConstants.LEFT);
		lblClass.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblClass.setBounds(52, 616, 119, 33);
		contentPane.add(lblClass);
		
		textname = new JTextField();
		textname.setHorizontalAlignment(SwingConstants.LEFT);
		textname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textname.setBounds(241, 165, 446, 36);
		contentPane.add(textname);
		textname.setColumns(10);
		
		textfathersname = new JTextField();
		textfathersname.setHorizontalAlignment(SwingConstants.LEFT);
		textfathersname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textfathersname.setColumns(10);
		textfathersname.setBounds(241, 232, 446, 36);
		contentPane.add(textfathersname);
		
		textaddress = new JTextField();
		textaddress.setHorizontalAlignment(SwingConstants.LEFT);
		textaddress.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textaddress.setColumns(10);
		textaddress.setBounds(241, 293, 446, 36);
		contentPane.add(textaddress);
		
		textcity = new JTextField();
		textcity.setHorizontalAlignment(SwingConstants.LEFT);
		textcity.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textcity.setColumns(10);
		textcity.setBounds(241, 358, 446, 36);
		contentPane.add(textcity);
		
		textphone = new JTextField();
		textphone.setHorizontalAlignment(SwingConstants.LEFT);
		textphone.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textphone.setColumns(10);
		textphone.setBounds(241, 551, 446, 36);
		contentPane.add(textphone);
		
		JLabel lblGender = new JLabel("GENDER");
		lblGender.setHorizontalAlignment(SwingConstants.LEFT);
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblGender.setBounds(52, 486, 153, 33);
		contentPane.add(lblGender);
		
		textreg = new JTextField();
		textreg.setHorizontalAlignment(SwingConstants.LEFT);
		textreg.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textreg.setColumns(10);
		textreg.setBounds(241, 104, 446, 36);
		contentPane.add(textreg);
		
		JLabel lblRegno = new JLabel("REG.NO.");
		lblRegno.setHorizontalAlignment(SwingConstants.LEFT);
		lblRegno.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRegno.setBounds(52, 105, 119, 33);
		contentPane.add(lblRegno);
		
		JLabel lblRollNo_1 = new JLabel("ROLL NO.");
		lblRollNo_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblRollNo_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRollNo_1.setBounds(52, 679, 119, 33);
		contentPane.add(lblRollNo_1);
		
		textrollno = new JTextField();
		textrollno.setHorizontalAlignment(SwingConstants.LEFT);
		textrollno.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textrollno.setColumns(10);
		textrollno.setBounds(241, 678, 446, 36);
		contentPane.add(textrollno);
		
		JComboBox scrollbg = new JComboBox();
		scrollbg.setFont(new Font("Tahoma", Font.PLAIN, 18));
		scrollbg.setModel(new DefaultComboBoxModel(new String[] {"Select Blood Group", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"}));
		scrollbg.setBounds(241, 423, 446, 35);
		contentPane.add(scrollbg);
		
		JButton btnsubmit = new JButton("SUBMIT");
		btnsubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String nm = textname.getText();
				String fnm = textfathersname.getText();
				String add = textaddress.getText();
				String city = textcity.getText();
				String bg = scrollbg.getSelectedItem().toString();
			    String gen = scrollgen.getSelectedItem().toString();
				String ph = textphone.getText();
				String cls = scrollclass.getSelectedItem().toString();
								
//				boolean bol = nm.isEmpty();
//				System.out.println(bol);
				
				
				if((nm.isEmpty()==false)&&(fnm.isEmpty()==false)&&(add.isEmpty()==false)&&(city.isEmpty()==false)&&(bg.isEmpty()==false)&&(gen.isEmpty()==false)&&(ph.isEmpty()==false)&&(cls.isEmpty()==false))
				{
					int reg = Integer.parseInt(textreg.getText());
					int rno = Integer.parseInt(textrollno.getText());
					
					AllMethods amd = new AllMethods();
					amd.connectiondb();
				    int a = amd.addstudentdata(reg, nm, fnm, add, city, bg, gen, ph, cls, rno);
					if (a== 1)
					{
						JOptionPane.showConfirmDialog(btnsubmit,"are you sure you want to save the data ?","Select",JOptionPane.YES_NO_OPTION);
						NewHome nhm = new NewHome();
						nhm.setVisible(true);
						dispose();
					}
					else 
					{
						
					}
				}
				else
				{
					JOptionPane.showMessageDialog(btnsubmit, "kindly fill all details...");
				}
			}
		});
		btnsubmit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnsubmit.setBounds(697, 675, 206, 43);
		contentPane.add(btnsubmit);
		
		JButton btnGoBackTo = new JButton("GO BACK TO HOME PAGE");
		btnGoBackTo.setForeground(new Color(128, 128, 128));
		btnGoBackTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NewHome nwh = new NewHome();
				nwh.setVisible(true);
				dispose();
				
			}
		});
		btnGoBackTo.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnGoBackTo.setBounds(309, 733, 295, 33);
		contentPane.add(btnGoBackTo);
		
	    scrollclass = new JComboBox();
		scrollclass.setModel(new DefaultComboBoxModel(new String[] {"Select the Class", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII"}));
		scrollclass.setFont(new Font("Tahoma", Font.PLAIN, 18));
		scrollclass.setBounds(241, 616, 446, 35);
		contentPane.add(scrollclass);
		
		scrollgen = new JComboBox();
		scrollgen.setModel(new DefaultComboBoxModel(new String[] {"Select Gender", "Male", "Female", "Transgender"}));
		scrollgen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		scrollgen.setBounds(241, 486, 446, 35);
		contentPane.add(scrollgen);
	}
}
