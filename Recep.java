import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Recep extends JFrame {

	protected static final Recep Patientdetails = null;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	protected Window frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recep frame = new Recep();
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
	public Recep() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblReceptionistLogin = new JLabel("RECEPTIONIST LOGIN");
		lblReceptionistLogin.setBounds(166, 11, 113, 14);
		contentPane.add(lblReceptionistLogin);
		
		JLabel lblUsername = new JLabel("username");
		lblUsername.setBounds(66, 67, 67, 14);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(66, 118, 67, 14);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(181, 64, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(181, 118, 86, 20);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText();
				String password=String.valueOf(passwordField.getPassword());
				if(name.equals("meenu")&&password.equals("8263")){
					patientdetails a=new patientdetails();
					a.setVisible(true);
					
				}else{
					JOptionPane.showMessageDialog(Recep.this, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
					
				}
			}
		});
		btnLogin.setBounds(166, 191, 89, 23);
		contentPane.add(btnLogin);
	}

}
