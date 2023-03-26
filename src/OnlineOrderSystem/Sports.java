package OnlineOrderSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Sports extends SportsDetails{

	private JFrame frame;
	private JTextField textFieldbat;
	private JTextField textFieldcarrom;
	private JTextField textFieldfootball;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sports window = new Sports();
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
	public Sports() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sports Accessories");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 0, 414, 51);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 62, 414, 87);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Sports.class.getResource("/images/cricketbat.png")));
		lblNewLabel_1.setBounds(10, 11, 67, 67);
		panel.add(lblNewLabel_1);
		
		JTextPane txtpnTapeTennisCricket = new JTextPane();
		txtpnTapeTennisCricket.setText("Tape tennis cricket bat for long pitch");
		txtpnTapeTennisCricket.setBounds(87, 11, 140, 40);
		panel.add(txtpnTapeTennisCricket);
		
		JLabel lblNewLabel_2 = new JLabel("500 BDT");
		lblNewLabel_2.setBounds(87, 62, 99, 14);
		panel.add(lblNewLabel_2);
		
		textFieldbat = new JTextField();
		textFieldbat.setBounds(318, 31, 86, 20);
		panel.add(textFieldbat);
		textFieldbat.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Add Qty");
		lblNewLabel_3.setBounds(335, 11, 46, 14);
		panel.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				if(JOptionPane.showConfirmDialog(frame,"Confirm "+Integer.parseInt(textFieldbat.getText())+" x Cricket Bat ?","Bat",JOptionPane.YES_NO_OPTION)
						== JOptionPane.YES_NO_OPTION) {
					setBat(Integer.parseInt(textFieldbat.getText()));
						FileWriter ob = new FileWriter("CreateOrder.txt",true);
						ob.write("\n Tape tennis cricket bat for long pitch X "+textFieldbat.getText());
						ob.close();
					}}catch(NumberFormatException e1) {
						JOptionPane.showMessageDialog(null, "Enter an integer as amount");
						}catch(IOException b) {
					}
				textFieldbat.setText(null);
			}
		});
		btnNewButton.setBounds(344, 55, 60, 23);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(10, 160, 414, 87);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(Sports.class.getResource("/images/carrom.png")));
		lblNewLabel_1_1.setBounds(10, 11, 67, 67);
		panel_1.add(lblNewLabel_1_1);
		
		JTextPane txtpnCarromBoard = new JTextPane();
		txtpnCarromBoard.setText("Carrom Board - 40\"- Mahogany Chua Polish");
		txtpnCarromBoard.setBounds(87, 11, 140, 40);
		panel_1.add(txtpnCarromBoard);
		
		JLabel lblNewLabel_2_1 = new JLabel("3000 BDT");
		lblNewLabel_2_1.setBounds(87, 62, 99, 14);
		panel_1.add(lblNewLabel_2_1);
		
		textFieldcarrom = new JTextField();
		textFieldcarrom.setColumns(10);
		textFieldcarrom.setBounds(318, 31, 86, 20);
		panel_1.add(textFieldcarrom);
		
		JLabel lblNewLabel_3_1 = new JLabel("Add Qty");
		lblNewLabel_3_1.setBounds(336, 11, 46, 14);
		panel_1.add(lblNewLabel_3_1);
		
		JButton btnNewButton_1 = new JButton("Ok");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				if(JOptionPane.showConfirmDialog(frame,"Confirm "+Integer.parseInt(textFieldcarrom.getText())+" x Carrom Board ?","Carrom",JOptionPane.YES_NO_OPTION)
						== JOptionPane.YES_NO_OPTION) {
					setCarrom(Integer.parseInt(textFieldcarrom.getText()));
						FileWriter ob = new FileWriter("CreateOrder.txt",true);
						ob.write("\n Carrom Board - 40\\\"- Mahogany Chua Polish X "+textFieldcarrom.getText());
						ob.close();
					}}catch(NumberFormatException e1) {
						JOptionPane.showMessageDialog(null, "Enter an integer as amount");
						}catch(IOException b) {
					}
				textFieldcarrom.setText(null);
			}
		});
		btnNewButton_1.setBounds(344, 55, 60, 23);
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(10, 258, 414, 87);
		frame.getContentPane().add(panel_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon(Sports.class.getResource("/images/football.png")));
		lblNewLabel_1_2.setBounds(10, 11, 67, 67);
		panel_2.add(lblNewLabel_1_2);
		
		JTextPane txtpnFootballDeer = new JTextPane();
		txtpnFootballDeer.setText("Football - Deer V - Black & White");
		txtpnFootballDeer.setBounds(87, 11, 140, 40);
		panel_2.add(txtpnFootballDeer);
		
		JLabel lblNewLabel_2_2 = new JLabel("1200 BDT");
		lblNewLabel_2_2.setBounds(87, 62, 99, 14);
		panel_2.add(lblNewLabel_2_2);
		
		textFieldfootball = new JTextField();
		textFieldfootball.setColumns(10);
		textFieldfootball.setBounds(318, 31, 86, 20);
		panel_2.add(textFieldfootball);
		
		JLabel lblNewLabel_3_2 = new JLabel("Add Qty");
		lblNewLabel_3_2.setBounds(341, 11, 46, 14);
		panel_2.add(lblNewLabel_3_2);
		
		JButton btnNewButton_2 = new JButton("Ok");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				if(JOptionPane.showConfirmDialog(frame,"Confirm "+Integer.parseInt(textFieldfootball.getText())+" x Football ?","Football",JOptionPane.YES_NO_OPTION)
						== JOptionPane.YES_NO_OPTION) {
					setFootball(Integer.parseInt(textFieldfootball.getText()));
						FileWriter ob = new FileWriter("CreateOrder.txt",true);
						ob.write("\n Football - Deer V - Black & White X "+textFieldfootball.getText());
						ob.close();
					}}catch(NumberFormatException e1) {
						JOptionPane.showMessageDialog(null, "Enter an integer as amount");
						}catch(IOException b) {
					}
				textFieldfootball.setText(null);
			}
		});
		btnNewButton_2.setBounds(344, 55, 60, 23);
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Pay");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Sir/Madam, You Have to Pay "+ price() + " BDT");
			}
		});
		btnNewButton_3.setBounds(84, 357, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Back");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dashboard.main(null);
				frame.dispose();
			}
		});
		btnNewButton_4.setBounds(214, 357, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
	}

}
