import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;

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
		setBounds(150, 150, 1000, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorder(null);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			}
		});
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBounds(0, 250, 225, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			}
		});
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBounds(0, 200, 225, 25);
		contentPane.add(btnNewButton_1);
		
		JLabel lblPatientsRecord = new JLabel("PATIENTS' RECORDS");
		lblPatientsRecord.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPatientsRecord.setForeground(new Color(255, 255, 255));
		lblPatientsRecord.setBounds(50, 255, 175, 14);
		contentPane.add(lblPatientsRecord);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Home.class.getResource("user.png")));
		label_1.setBounds(20, 250, 25, 25);
		contentPane.add(label_1);
		
		JLabel lblHome = new JLabel("HOME");
		lblHome.setForeground(new Color(255, 255, 255));
		lblHome.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHome.setBounds(50, 205, 46, 14);
		contentPane.add(lblHome);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Home.class.getResource("home.png")));
		label.setBounds(20, 200, 25, 25);
		contentPane.add(label);
		
		JLabel lblExit = new JLabel("EXIT");
		lblExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblExit.setForeground(new Color(255, 255, 255));
		lblExit.setBounds(50, 605, 46, 14);
		contentPane.add(lblExit);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(Home.class.getResource("logout.png")));
		label_3.setBounds(20, 600, 25, 25);
		contentPane.add(label_3);
		
		JLabel lblInvoice = new JLabel("INVOICE");
		lblInvoice.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblInvoice.setForeground(new Color(255, 255, 255));
		lblInvoice.setBounds(50, 355, 75, 14);
		contentPane.add(lblInvoice);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Home.class.getResource("bill.png")));
		lblNewLabel_2.setBounds(20, 350, 25, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblAppointments = new JLabel("APPOINTMENTS");
		lblAppointments.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAppointments.setForeground(new Color(255, 255, 255));
		lblAppointments.setBounds(50, 305, 125, 14);
		contentPane.add(lblAppointments);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Home.class.getResource("clock.png")));
		label_2.setBounds(20, 300, 25, 25);
		contentPane.add(label_2);
		
		JLabel lblMateoDentalClinic = new JLabel("MATEO DENTAL CLINIC");
		lblMateoDentalClinic.setForeground(new Color(255, 255, 255));
		lblMateoDentalClinic.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMateoDentalClinic.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblMateoDentalClinic.setBounds(25, 122, 200, 15);
		contentPane.add(lblMateoDentalClinic);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Home.class.getResource("mateo.png")));
		lblNewLabel_1.setBounds(60, 11, 100, 100);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(null);
		lblNewLabel.setBackground(new Color(0, 206, 209));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBounds(0, 0, 225, 661);
		contentPane.add(lblNewLabel);
		
		JPanel patrec = new JPanel();
		patrec.setBackground(new Color(220, 220, 220));
		patrec.setBounds(225, 0, 759, 661);
		contentPane.add(patrec);
		patrec.setLayout(null);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(Home.class.getResource("userbig2.png")));
		label_4.setBounds(233, 48, 256, 256);
		patrec.add(label_4);
		
		JLabel lblNewLabel_3 = new JLabel("VIEW EXISTING RECORDS");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_3.setBounds(171, 395, 400, 25);
		patrec.add(lblNewLabel_3);
		
		JLabel lblCreateNewRecord = new JLabel("CREATE NEW RECORD");
		lblCreateNewRecord.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblCreateNewRecord.setBounds(203, 484, 400, 25);
		patrec.add(lblCreateNewRecord);
		patrec.setVisible(false);
		
		
		
		setUndecorated(false);
	}
}
