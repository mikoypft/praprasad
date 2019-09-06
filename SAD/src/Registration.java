import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration extends JFrame {

	private JPanel contentPane;
	private JTextField user;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration();
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
	public Registration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 848, 468);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("X");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(192, 192, 192));
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblNewLabel_1.setBackground(new Color(255, 0, 0));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1.setBackground(new Color(192, 192, 192));
			}
		});
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(0, 0, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("<html>Mateo <br> Dental Clinic<br> Database System</html>");
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_2.setBounds(5, 156, 334, 187);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setForeground(new Color(0, 255, 255));
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBackground(new Color(0, 206, 209));
		lblNewLabel_3.setBounds(0, 151, 344, 197);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Registration.class.getResource("smile3.png")));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBackground(new Color(218, 165, 32));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBounds(0, 0, 344, 468);
		contentPane.add(lblNewLabel);
		
		user = new JTextField();
		user.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		user.setOpaque(false);
		user.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 206, 209)));
		user.setBounds(506, 149, 200, 30);
		contentPane.add(user);
		user.setColumns(10);
		
		JLabel textField1 = new JLabel("Username");
		textField1.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField1.setBounds(506, 124, 100, 14);
		contentPane.add(textField1);
		
		JLabel textField2 = new JLabel("Password");
		textField2.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField2.setBounds(506, 205, 100, 14);
		contentPane.add(textField2);
		
		pass = new JPasswordField();
		pass.setOpaque(false);
		pass.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 206, 209)));
		pass.setBounds(506, 231, 200, 30);
		contentPane.add(pass);
		
		JButton btnNewButton = new JButton("Log In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
					Statement stmt=con.createStatement();
					String sql="Select * from admin where UserName ='"+user.getText()+"'and Password='"+pass.getText().toString()+"'";
					ResultSet rs=stmt.executeQuery(sql);
					if(rs.next())
						JOptionPane.showMessageDialog(null, "Login Successfully");
					else
						JOptionPane.showMessageDialog(null, "Incorrect Username and Password");
					con.close();
				}catch(Exception e) {
					System.out.print(e);
				}
			}
		});
		btnNewButton.setBorder(null);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			}
		});
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBackground(new Color(230, 230, 250));
		btnNewButton.setOpaque(false);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(562, 310, 89, 23);
		contentPane.add(btnNewButton);
		
		setUndecorated(true);
	}
}
