import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.JTextField;

public class Admin {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin window = new Admin();
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
	public Admin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(36, 31, 49));
		frame.getContentPane().setBackground(new Color(30, 39, 89));
		frame.getContentPane().setLayout(null);
		
		JPanel panel_menu = new JPanel();
		panel_menu.setBackground(new Color(0, 1, 56));
		panel_menu.setBounds(0, 0, 55, 501);
		frame.getContentPane().add(panel_menu);
		panel_menu.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Admin.class.getResource("/IMAGENES/login.png")));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setForeground(new Color(23, 22, 123));
		btnNewButton.setBackground(new Color(0, 1, 56));
		btnNewButton.setBounds(0, 12, 55, 54);
		panel_menu.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(Admin.class.getResource("/IMAGENES/hoyos.png")));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setForeground(new Color(23, 22, 123));
		btnNewButton_1.setBackground(new Color(0, 1, 56));
		btnNewButton_1.setBounds(0, 105, 55, 54);
		panel_menu.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(Admin.class.getResource("/IMAGENES/registros.png")));
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setForeground(new Color(23, 22, 123));
		btnNewButton_2.setBackground(new Color(0, 1, 56));
		btnNewButton_2.setBounds(0, 202, 55, 54);
		panel_menu.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon(Admin.class.getResource("/IMAGENES/admin.png")));
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setForeground(new Color(23, 22, 123));
		btnNewButton_3.setBackground(new Color(0, 1, 56));
		btnNewButton_3.setBounds(0, 292, 55, 54);
		panel_menu.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("");
		btnNewButton_3_1.setIcon(new ImageIcon(Admin.class.getResource("/IMAGENES/ayuda.png")));
		btnNewButton_3_1.setBorderPainted(false);
		btnNewButton_3_1.setForeground(new Color(23, 22, 123));
		btnNewButton_3_1.setBackground(new Color(0, 1, 56));
		btnNewButton_3_1.setBounds(0, 378, 55, 54);
		panel_menu.add(btnNewButton_3_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(23, 22, 123));
		panel_1.setBounds(55, 0, 230, 501);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(UIManager.getBorder("Button.border"));
		panel.setBackground(new Color(53, 132, 228));
		panel.setBounds(12, 134, 206, 355);
		panel_1.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_4 = new JButton(" Añadir");
		btnNewButton_4.setBackground(new Color(26, 95, 180));
		btnNewButton_4.setForeground(new Color(153, 193, 241));
		btnNewButton_4.setFont(new Font("Dialog", Font.BOLD, 15));
		btnNewButton_4.setBounds(56, 64, 89, 31);
		panel.add(btnNewButton_4);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(153, 193, 241));
		separator.setBounds(12, 114, 182, 13);
		panel.add(separator);
		
		JLabel lblAadirNuevoUsuario = new JLabel("Añadir Nuevo Usuario");
		lblAadirNuevoUsuario.setFont(new Font("Dialog", Font.BOLD, 16));
		lblAadirNuevoUsuario.setBounds(12, 12, 182, 40);
		panel.add(lblAadirNuevoUsuario);
		
		JList list = new JList();
		list.setBackground(new Color(153, 193, 241));
		list.setBounds(12, 135, 182, 208);
		panel.add(list);
		
		JLabel lblGestion = new JLabel("GESTION");
		lblGestion.setFont(new Font("Dialog", Font.BOLD, 20));
		lblGestion.setForeground(new Color(153, 193, 241));
		lblGestion.setBounds(12, 90, 96, 35);
		panel_1.add(lblGestion);
		
		JLabel lblUsuarios = new JLabel("USUARIOS");
		lblUsuarios.setFont(new Font("Dialog", Font.BOLD, 20));
		lblUsuarios.setForeground(new Color(153, 193, 241));
		lblUsuarios.setBounds(110, 93, 108, 28);
		panel_1.add(lblUsuarios);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Admin.class.getResource("/IMAGENES/icons8-¿por-qué-somos-hombre-80.png")));
		lblNewLabel.setBounds(69, 12, 96, 81);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Admin.class.getResource("/IMAGENES/icons8-cambiar-usuario-masculino-80.png")));
		lblNewLabel_1.setBounds(499, 12, 116, 91);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNombre = new JLabel("Oscar Sanchez");
		lblNombre.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNombre.setForeground(new Color(153, 193, 241));
		lblNombre.setBounds(480, 105, 147, 43);
		frame.getContentPane().add(lblNombre);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(53, 132, 228));
		panel_2.setBounds(297, 171, 511, 253);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre usuario");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_2.setBounds(21, 12, 173, 39);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Contraseña");
		lblNewLabel_2_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(66, 63, 128, 39);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Telefono");
		lblNewLabel_2_2.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_2_2.setBounds(93, 121, 101, 39);
		panel_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Dirrecion");
		lblNewLabel_2_3.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_2_3.setBounds(93, 177, 101, 39);
		panel_2.add(lblNewLabel_2_3);
		
		textField = new JTextField();
		textField.setBackground(new Color(153, 193, 241));
		textField.setBounds(212, 19, 246, 31);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(153, 193, 241));
		textField_1.setColumns(10);
		textField_1.setBounds(212, 75, 246, 31);
		panel_2.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(153, 193, 241));
		textField_2.setColumns(10);
		textField_2.setBounds(212, 133, 246, 31);
		panel_2.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(153, 193, 241));
		textField_3.setColumns(10);
		textField_3.setBounds(212, 184, 246, 31);
		panel_2.add(textField_3);
		
		JButton btnNewButton_5 = new JButton("Guardar");
		btnNewButton_5.setForeground(new Color(153, 193, 241));
		btnNewButton_5.setBackground(new Color(53, 132, 228));
		btnNewButton_5.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton_5.setBounds(703, 451, 105, 27);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_5_1 = new JButton("Cancelar");
		btnNewButton_5_1.setForeground(new Color(153, 193, 241));
		btnNewButton_5_1.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton_5_1.setBackground(new Color(53, 132, 228));
		btnNewButton_5_1.setBounds(586, 451, 105, 27);
		frame.getContentPane().add(btnNewButton_5_1);
		frame.setBounds(100, 100, 832, 528);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
