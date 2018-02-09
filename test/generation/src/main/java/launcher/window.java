package launcher;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class window {

	private JFrame frame;
	private JTextField txtPath;
	private JTextField textField;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window window = new window();
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
	public window() {
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
		
		JTextPane txtpnChemin_1 = new JTextPane();
		txtpnChemin_1.setText("Chemin1");
		txtpnChemin_1.setBounds(45, 33, 82, 21);
		frame.getContentPane().add(txtpnChemin_1);
		
		txtPath = new JTextField();
		txtPath.setText("path");
		txtPath.setBounds(192, 33, 114, 19);
		frame.getContentPane().add(txtPath);
		txtPath.setColumns(10);
		
		JButton btnExec = new JButton("Exec");
		btnExec.setBounds(157, 58, 117, 25);
		frame.getContentPane().add(btnExec);
		
		JTextPane txtpnChemin_2 = new JTextPane();
		txtpnChemin_2.setText("Chemin2");
		txtpnChemin_2.setBounds(45, 90, 82, 21);
		frame.getContentPane().add(txtpnChemin_2);
		
		textField = new JTextField();
		textField.setText("path");
		textField.setColumns(10);
		textField.setBounds(192, 90, 114, 19);
		frame.getContentPane().add(textField);
		
		JButton button = new JButton("Exec");
		button.setBounds(157, 120, 117, 25);
		frame.getContentPane().add(button);
		
		textField_2 = new JTextField();
		textField_2.setText("Dest Projet");
		textField_2.setColumns(10);
		textField_2.setBounds(318, 90, 114, 19);
		frame.getContentPane().add(textField_2);
	}
}
