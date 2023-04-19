import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Login {

	private JFrame frame;
	private JTextField txtUsername;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(30, 39, 89));
		frame.getContentPane().setBackground(new Color(23, 22, 123));
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(63, 108, 191));
		panel.setBounds(12, 12, 454, 410);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 42, 454, 398);
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/fondo/golf.jpg")));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("GREEN Gestion de Campo");
		lblNewLabel_1.setBounds(12, 12, 287, 36);
		lblNewLabel_1.setForeground(new Color(153, 193, 241));
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 22));
		panel.add(lblNewLabel_1);
		
		//Icono java
		//original
		//JLabel lblNewLabel_2 = new JLabel("");
		//lblNewLabel_2.setIcon(new ImageIcon(Login.class.getResource("/fondo/java.png")));
		//lblNewLabel_2.setBounds(364, 14, 60, 36);
		//panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Login.class.getResource("/fondo/java.png")));
		Image img = new ImageIcon(Login.class.getResource("/fondo/java.png")).getImage();
		ImageIcon icon = new ImageIcon(img.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		JLabel lblIcono = new JLabel(icon);
		lblIcono.setBounds(316, 0, 60, 52);
		panel.add(lblIcono);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Login.class.getResource("/fondo/golfclup.png")));
		Image img2 = new ImageIcon(Login.class.getResource("/fondo/golfclup.png")).getImage();
		ImageIcon icon2 = new ImageIcon(img2.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
		JLabel lblIcono_1 = new JLabel(icon2);
		lblIcono_1.setBounds(376, 0, 78, 64);
		panel.add(lblIcono_1);

		
		//JLabel lblNewLabel_3 = new JLabel("");
		//lblNewLabel_3.setIcon(new ImageIcon(Login.class.getResource("/fondo/golfclup.png")));
		//lblNewLabel_3.setBounds(290, 0, 70, 64);
		// panel.add(lblNewLabel_3);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(63, 108, 191));
		panel_1.setBounds(478, 12, 379, 410);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Login.class.getResource("/fondo/logogolflogin.png")));
		Image img3 = new ImageIcon(Login.class.getResource("/fondo/logogolflogin.png")).getImage();
		ImageIcon icon3 = new ImageIcon(img3.getScaledInstance(120, 100, Image.SCALE_SMOOTH));
		JLabel lblIcono3 = new JLabel(icon3);
		lblIcono3.setBounds(110, 44, 171, 124);
		panel_1.add(lblIcono3);
		
		txtUsername = new JTextField();
		txtUsername.setText("                   Username");
		txtUsername.setBackground(new Color(153, 193, 241));
		txtUsername.setBounds(104, 217, 177, 29);
		panel_1.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setText("                   Password");
		txtPassword.setBackground(new Color(153, 193, 241));
		txtPassword.setColumns(10);
		txtPassword.setBounds(104, 269, 177, 29);
		panel_1.add(txtPassword);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(new Color(26, 95, 180));
		btnNewButton.setForeground(new Color(153, 193, 241));
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 17));
		btnNewButton.setBounds(145, 332, 105, 27);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(Login.class.getResource("/fondo/userlogin.png")));
		Image img4 = new ImageIcon(Login.class.getResource("/fondo/userlogin.png")).getImage();
		ImageIcon icon4 = new ImageIcon(img4.getScaledInstance(40, 40, Image.SCALE_SMOOTH));
		JLabel lblIcono4 = new JLabel(icon4);
		lblIcono4.setBounds(50, 210, 45, 46);
		panel_1.add(lblIcono4);
		
		JLabel lblIcono4_1 = new JLabel(new ImageIcon(Login.class.getResource("/fondo/pass.png")));
		lblIcono4_1.setBounds(50, 257, 45, 46);
		panel_1.add(lblIcono4_1);
		frame.setBounds(100, 100, 869, 461);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}
}
