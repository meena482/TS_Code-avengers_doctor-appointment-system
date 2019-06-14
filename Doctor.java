import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Dao.DoctorDao;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Doctor extends JFrame {

	private static final Doctor Patient = null;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Doctor frame = new Doctor();
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
	public Doctor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 742, 358);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Doctor Details");
		lblNewLabel.setBounds(240, 11, 147, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblDocid = new JLabel("DOC_ID");
		lblDocid.setBounds(23, 66, 46, 14);
		contentPane.add(lblDocid);
		
		textField = new JTextField();
		textField.setBounds(68, 63, 55, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setBounds(155, 66, 46, 14);
		contentPane.add(lblName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(196, 63, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnAddDoctor = new JButton("Add Doctor");
		btnAddDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnAddDoctor.setBounds(584, 28, 104, 23);
		contentPane.add(btnAddDoctor);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUpdate.setBounds(584, 62, 104, 23);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDelete.setBounds(584, 102, 104, 23);
		contentPane.add(btnDelete);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(428, 11, 46, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(459, 11, 257, 138);
		contentPane.add(label_2);
		
		JLabel lblCityid = new JLabel("CITY_ID");
		lblCityid.setBounds(307, 66, 46, 14);
		contentPane.add(lblCityid);
		
		textField_2 = new JTextField();
		textField_2.setBounds(363, 63, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblSpecalist = new JLabel("SPECALIST");
		lblSpecalist.setBounds(10, 123, 71, 14);
		contentPane.add(lblSpecalist);
		
		textField_3 = new JTextField();
		textField_3.setBounds(85, 120, 79, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(267, 120, 71, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home a=new Home();
				a.setVisible(true);
				dispose();
			}
		});
		btnLogout.setBounds(467, 271, 98, 23);
		contentPane.add(btnLogout);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSubmit.setBounds(68, 271, 89, 23);
		contentPane.add(btnSubmit);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancel.setBounds(257, 271, 89, 23);
		contentPane.add(btnCancel);
		
		JLabel lblAvailableDate = new JLabel("AVAILABLE DATE");
		lblAvailableDate.setBounds(174, 123, 95, 14);
		contentPane.add(lblAvailableDate);
		
		JLabel lblTIME = new JLabel("TIME");
		lblTIME.setBounds(348, 123, 46, 14);
		contentPane.add(lblTIME);
		
		textField_5 = new JTextField();
		textField_5.setBounds(383, 120, 55, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
	}
}
