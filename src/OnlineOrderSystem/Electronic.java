package OnlineOrderSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileWriter;
import java.io.IOException;



public class Electronic extends ElectronicDetails{

	private JFrame frame;
	private JTextField textFieldtv;
	private JTextField textFieldpc;
	private JTextField textFieldac;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Electronic window = new Electronic();
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
	public Electronic() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 440, 471);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Electronic Devices");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 404, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(20, 64, 394, 89);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Electronic.class.getResource("/images/tv.png")));
		lblNewLabel_1.setBounds(10, 11, 67, 67);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("50,000 BDT");
		lblNewLabel_4.setBounds(87, 70, 107, 14);
		panel.add(lblNewLabel_4);
		
		textFieldtv = new JTextField();
		textFieldtv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		textFieldtv.setBounds(298, 24, 86, 20);
		panel.add(textFieldtv);
		textFieldtv.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Add Qty");
		lblNewLabel_7.setBounds(324, 11, 46, 14);
		panel.add(lblNewLabel_7);
		
		JButton btnTvokButton = new JButton("Ok");
		btnTvokButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				if(JOptionPane.showConfirmDialog(frame,"Confirm "+Integer.parseInt(textFieldtv.getText())+" x LG Smart TV ?","TV",JOptionPane.YES_NO_OPTION)
						== JOptionPane.YES_NO_OPTION) {
						setTv(Integer.parseInt(textFieldtv.getText()));
						FileWriter ob = new FileWriter("CreateOrder.txt",true);
						ob.write("\n LG Smart TV size 36'' Full Color TV 4K UHD Resolution X "+textFieldtv.getText());
						ob.close();
					}}catch(NumberFormatException e1) {
						JOptionPane.showMessageDialog(null, "Enter an integer as amount");
					}
					catch(IOException b) {
					}	
				textFieldtv.setText(null);
			}
		});
		btnTvokButton.setBounds(324, 55, 60, 23);
		panel.add(btnTvokButton);
		
		JTextPane txtpnLgSmartTv = new JTextPane();
		txtpnLgSmartTv.setText("LG Smart TV size 36'' Full Color TV 4K UHD Resolution\r\n");
		txtpnLgSmartTv.setBounds(87, 11, 170, 55);
		panel.add(txtpnLgSmartTv);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(20, 176, 394, 89);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Electronic.class.getResource("/images/computer.png")));
		lblNewLabel_2.setBounds(10, 11, 67, 67);
		panel_1.add(lblNewLabel_2);
		
		JTextPane txtpnIntelthGen = new JTextPane();
		txtpnIntelthGen.setText("Intel 12th Gen\r\nCore i5-12400F \r\nGaming Desktop PC");
		txtpnIntelthGen.setBounds(87, 11, 170, 56);
		panel_1.add(txtpnIntelthGen);
		
		JLabel lblNewLabel_5 = new JLabel("80,000 BDT");
		lblNewLabel_5.setBounds(87, 70, 107, 14);
		panel_1.add(lblNewLabel_5);
		
		textFieldpc = new JTextField();
		textFieldpc.setBounds(298, 24, 86, 20);
		panel_1.add(textFieldpc);
		textFieldpc.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Add Qty");
		lblNewLabel_8.setBounds(316, 11, 46, 14);
		panel_1.add(lblNewLabel_8);
		
		JButton btnCmokButton = new JButton("Ok");
		btnCmokButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				if(JOptionPane.showConfirmDialog(frame,"Confirm "+Integer.parseInt(textFieldpc.getText())+" x Desktop PC ?","PC",JOptionPane.YES_NO_OPTION)
						== JOptionPane.YES_NO_OPTION) {
						setPc(Integer.parseInt(textFieldpc.getText()));
						FileWriter ob = new FileWriter("CreateOrder.txt",true);
						ob.write("\n Intel 12th Gen Core i5-12400F Gaming Desktop PC X "+textFieldpc.getText());
						ob.close();
					}
				}catch(NumberFormatException e1) {
						JOptionPane.showMessageDialog(null, "Enter an integer as amount");
					}
					catch(IOException b) {
					}
				textFieldpc.setText(null);
			}
		});
		btnCmokButton.setBounds(324, 55, 60, 23);
		panel_1.add(btnCmokButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBackground(new Color(192, 192, 192));
		panel_2.setBounds(20, 288, 394, 89);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Electronic.class.getResource("/images/ac.png")));
		lblNewLabel_3.setBounds(10, 11, 67, 67);
		panel_2.add(lblNewLabel_3);
		
		JTextPane txtpnXiaomiViomiA = new JTextPane();
		txtpnXiaomiViomiA.setText("Xiaomi Viomi A1 1 Ton Split Type Smart Air Conditioner (AC)");
		txtpnXiaomiViomiA.setBounds(87, 11, 170, 55);
		panel_2.add(txtpnXiaomiViomiA);
		
		JLabel lblNewLabel_6 = new JLabel("60,000 BDT");
		lblNewLabel_6.setBounds(87, 70, 110, 14);
		panel_2.add(lblNewLabel_6);
		
		textFieldac = new JTextField();
		textFieldac.setBounds(298, 24, 86, 20);
		panel_2.add(textFieldac);
		textFieldac.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Add Qty");
		lblNewLabel_9.setBounds(317, 11, 46, 14);
		panel_2.add(lblNewLabel_9);
		
		JButton btnAcokButton = new JButton("Ok");
		btnAcokButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				if(JOptionPane.showConfirmDialog(frame,"Confirm "+Integer.parseInt(textFieldac.getText())+" x Smart Air Conditionar ?","Smart Air Conditionar",JOptionPane.YES_NO_OPTION)
						== JOptionPane.YES_NO_OPTION) {
						setAc(Integer.parseInt(textFieldac.getText()));
						FileWriter ob = new FileWriter("CreateOrder.txt",true);
						ob.write("\n Xiaomi Viomi A1 1 Ton Split Type Smart Air Conditioner (AC) X "+textFieldac.getText());
						ob.close();
					}}catch(NumberFormatException e1) {
						JOptionPane.showMessageDialog(null, "Enter an integer as amount");
					}
					catch(IOException b) {
					}
				textFieldac.setText(null);
			}
		});
		btnAcokButton.setBounds(324, 55, 60, 23);
		panel_2.add(btnAcokButton);
		
		JButton btnNewButton_3 = new JButton("Back");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dashboard.main(null);
				frame.dispose();
			}
		});
		btnNewButton_3.setBounds(252, 398, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Pay");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null,"Sir/Madam, You Have to Pay "+ price() + " BDT"); 
			}
		});
		btnNewButton_4.setBounds(104, 398, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
	}
	
	
}
