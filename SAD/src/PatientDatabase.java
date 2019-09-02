import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class PatientDatabase {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblCompanyName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientDatabase window = new PatientDatabase();
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
	public PatientDatabase() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Log In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//JOptionPane.showMessageDialog(null, "Welcome!");
				lblCompanyName.setText("Welcome!");
			}
		});
		btnNewButton.setBounds(167, 202, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		lblCompanyName = new JLabel("Mateo Dental Clinic");
		lblCompanyName.setBounds(167, 89, 132, 14);
		frame.getContentPane().add(lblCompanyName);
		
		
	}
}
