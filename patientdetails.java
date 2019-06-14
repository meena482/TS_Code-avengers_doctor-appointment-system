import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class patientdetails extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					patientdetails frame = new patientdetails();
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
	public patientdetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 737, 454);
		contentPane = 
				new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPatientDetails = new JLabel("Patient Details");
		lblPatientDetails.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblPatientDetails.setBounds(257, 11, 138, 14);
		contentPane.add(lblPatientDetails);
		
		JLabel lblPatiid = new JLabel("PATI_ID");
		lblPatiid.setBounds(22, 56, 46, 14);
		contentPane.add(lblPatiid);
		
		textField = new JTextField();
		textField.setBounds(73, 53, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setBounds(189, 56, 46, 14);
		contentPane.add(lblName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(242, 53, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAge = new JLabel("AGE");
		lblAge.setBounds(350, 56, 46, 14);
		contentPane.add(lblAge);
		
		textField_2 = new JTextField();
		textField_2.setBounds(401, 53, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnAddParticipents = new JButton("ADD PARTICIPENTS");
		btnAddParticipents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAddParticipents.setBounds(598, 27, 113, 23);
		contentPane.add(btnAddParticipents);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnUpdate.setBounds(598, 61, 89, 23);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBounds(598, 95, 89, 23);
		contentPane.add(btnDelete);
		
		JLabel label = new JLabel("");
		label.setBounds(568, 27, -60, 172);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(502, 11, 219, 128);
		contentPane.add(label_1);
		
		JLabel lblGender = new JLabel("GENDER");
		lblGender.setBounds(22, 88, 46, 14);
		contentPane.add(lblGender);
		
		textField_3 = new JTextField();
		textField_3.setBounds(73, 84, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblPAT_TYPE = new JLabel("PAT_TYPE");
		lblPAT_TYPE.setBounds(167, 88, 68, 14);
		contentPane.add(lblPAT_TYPE);
		
		textField_4 = new JTextField();
		textField_4.setBounds(242, 84, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblContno = new JLabel("CONT_NO");
		lblContno.setBounds(338, 88, 57, 14);
		contentPane.add(lblContno);
		
		textField_5 = new JTextField();
		textField_5.setBounds(401, 81, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblDate = new JLabel("DATE");
		lblDate.setBounds(22, 113, 46, 26);
		contentPane.add(lblDate);
		
		textField_6 = new JTextField();
		textField_6.setBounds(73, 115, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblAddress = new JLabel("ADDRESS");
		lblAddress.setBounds(180, 119, 55, 14);
		contentPane.add(lblAddress);
		
		textField_7 = new JTextField();
		textField_7.setBounds(242, 115, 235, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.setBounds(86, 347, 89, 23);
		contentPane.add(btnSubmit);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				appointment a=new appointment();
				a.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(455, 347, 89, 23);
		contentPane.add(btnBack);
		
	}
}
