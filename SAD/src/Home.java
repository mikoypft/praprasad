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
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.MatteBorder;
import java.time.Month;
import javax.swing.JTable;
import javax.swing.JCheckBox;

public class Home extends JFrame {

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
		
		JPanel medhis = new JPanel();
		medhis.setBackground(Color.WHITE);
		medhis.setBounds(225, 0, 759, 661);
		contentPane.add(medhis);
		medhis.setLayout(null);
		
		JLabel lblPhysicalAndMedical = new JLabel("PHYSICAL AND MEDICAL HISTORY");
		lblPhysicalAndMedical.setBounds(50, 50, 550, 37);
		lblPhysicalAndMedical.setFont(new Font("Tahoma", Font.BOLD, 30));
		medhis.add(lblPhysicalAndMedical);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("TONGUE");
		chckbxNewCheckBox.setBounds(132, 148, 97, 23);
		medhis.add(chckbxNewCheckBox);
		
		JPanel patrec = new JPanel();
		patrec.setBackground(new Color(255, 255, 255));
		patrec.setBounds(225, 0, 759, 661);
		contentPane.add(patrec);
		patrec.setLayout(null);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(Home.class.getResource("userbig3.png")));
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
		
		
		JPanel basinf = new JPanel();
		basinf.setBackground(new Color(255, 255, 255));
		basinf.setBounds(225, 0, 759, 661);
		contentPane.add(basinf);
		basinf.setLayout(null);
		
		
		JLabel lblPatientsBasicInformation = new JLabel("PATIENT'S BASIC INFORMATION");
		lblPatientsBasicInformation.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblPatientsBasicInformation.setBounds(49, 50, 600, 25);
		basinf.add(lblPatientsBasicInformation);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblName.setBounds(49, 150, 46, 14);
		basinf.add(lblName);
		
		JLabel lblDateOfBirth = new JLabel("DATE OF BIRTH");
		lblDateOfBirth.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDateOfBirth.setBounds(49, 200, 125, 15);
		basinf.add(lblDateOfBirth);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(Month.values()));
		comboBox.setBounds(174, 195, 100, 25);
		basinf.add(comboBox);
		
		JLabel lblSex = new JLabel("SEX");
		lblSex.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSex.setBounds(49, 250, 46, 14);
		basinf.add(lblSex);
		
		JLabel lblHomeAddress = new JLabel("HOME ADDRESS");
		lblHomeAddress.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHomeAddress.setForeground(new Color(0, 0, 0));
		lblHomeAddress.setBounds(49, 300, 125, 15);
		basinf.add(lblHomeAddress);
		
		JLabel lblProvincialAddress = new JLabel("PROVINCIAL ADDRESS");
		lblProvincialAddress.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblProvincialAddress.setBounds(49, 350, 175, 15);
		basinf.add(lblProvincialAddress);
		
		JLabel lblContactNumbers = new JLabel("CONTACT NUMBERS:");
		lblContactNumbers.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblContactNumbers.setBounds(49, 400, 175, 15);
		basinf.add(lblContactNumbers);
		
		JLabel lblNewLabel_4 = new JLabel("HOME:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel_4.setBounds(74, 450, 50, 15);
		basinf.add(lblNewLabel_4);
		
		JLabel lblOffice = new JLabel("OFFICE:");
		lblOffice.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblOffice.setBounds(74, 500, 75, 15);
		basinf.add(lblOffice);
		
		JLabel lblMobile = new JLabel("MOBILE:");
		lblMobile.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblMobile.setBounds(74, 550, 75, 15);
		basinf.add(lblMobile);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 206, 209)));
		textField.setBounds(124, 145, 500, 25);
		basinf.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_1.setBounds(299, 195, 100, 25);
		basinf.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919"}));
		comboBox_2.setBounds(424, 195, 100, 25);
		basinf.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Male ", "Female"}));
		comboBox_3.setBounds(99, 245, 100, 25);
		basinf.add(comboBox_3);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_1.setColumns(10);
		textField_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 206, 209)));
		textField_1.setBounds(199, 295, 500, 25);
		basinf.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_2.setColumns(10);
		textField_2.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 206, 209)));
		textField_2.setBounds(249, 345, 500, 25);
		basinf.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_3.setColumns(10);
		textField_3.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 206, 209)));
		textField_3.setBounds(149, 445, 500, 25);
		basinf.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_4.setColumns(10);
		textField_4.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 206, 209)));
		textField_4.setBounds(149, 495, 500, 25);
		basinf.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_5.setColumns(10);
		textField_5.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 206, 209)));
		textField_5.setBounds(149, 545, 500, 25);
		basinf.add(textField_5);
		
		JButton btnNewButton_2 = new JButton("NEXT");
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setOpaque(false);
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBounds(321, 603, 89, 23);
		basinf.add(btnNewButton_2);
		basinf.setVisible(false);
		
		
		
		setUndecorated(false);
	}
}
