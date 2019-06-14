import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomePage = new JLabel("WELCOME PAGE");	
		lblWelcomePage.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblWelcomePage.setBounds(163, 11, 133, 14);
		contentPane.add(lblWelcomePage);
		
		JButton btnAdminLogin = new JButton("ADMIN LOGIN");
		btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admins a=new Admins();
				a.setVisible(true);
			}
		});
		btnAdminLogin.setBounds(51, 191, 111, 23);
		contentPane.add(btnAdminLogin);
		
		JButton btnReceptionistLogin = new JButton("RECEPTIONIST LOGIN");
		btnReceptionistLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Recep a=new Recep();
				a.setVisible(true);
				dispose();
				
			}
		});
		btnReceptionistLogin.setBounds(254, 191, 170, 23);
		contentPane.add(btnReceptionistLogin);
	}
}
