package OnlineOrderSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class Dashboard {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard window = new Dashboard();
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
	public Dashboard() {
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
		
		JButton btnElectronic = new JButton("Electronic");
		btnElectronic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Electronic.main(null);
				frame.dispose();
			}
		});
		btnElectronic.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnElectronic.setBounds(42, 102, 107, 39);
		frame.getContentPane().add(btnElectronic);
		
		JButton btnFood = new JButton("Food");
		btnFood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Food.main(null);
				frame.dispose();
			}
		});
		btnFood.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnFood.setBounds(273, 152, 100, 39);
		frame.getContentPane().add(btnFood);
		
		JButton btnDress = new JButton("Dress");
		btnDress.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDress.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dress.main(null);
				frame.dispose();
			}
		});
		btnDress.setBounds(138, 152, 89, 39);
		frame.getContentPane().add(btnDress);
		
		JButton btnSports = new JButton("Sports");
		btnSports.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sports.main(null);
				frame.dispose();
			}
		});
		btnSports.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSports.setBounds(184, 102, 107, 39);
		frame.getContentPane().add(btnSports);
		
		JLabel lblNewLabel = new JLabel("SHOP NOW !!");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(32, 11, 373, 70);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnDBack = new JButton("Back");
		btnDBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User_Login.main(null);
				frame.dispose();
			}
		});
		btnDBack.setBounds(358, 233, 66, 17);
		frame.getContentPane().add(btnDBack);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 79, 414, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 213, 414, 3);
		frame.getContentPane().add(separator_1);
	}

}
