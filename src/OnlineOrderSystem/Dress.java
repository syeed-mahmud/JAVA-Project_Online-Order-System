 package OnlineOrderSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Dress extends DressDetails{

	private JFrame frame;
	private JTextField textFieldsharee;
	private JTextField textFieldwinter;
	private JTextField textFieldkamiz;
	private JTextField textFieldshirts;
	private JTextField textFieldjeans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dress window = new Dress();
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
	public Dress() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 451, 676);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dress");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(0, 0, 434, 48);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 77, 414, 88);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Dress.class.getResource("/images/saree.png")));
		lblNewLabel_1.setBounds(10, 11, 67, 67);
		panel.add(lblNewLabel_1);
		
		JTextPane txtpnBengaliSharee = new JTextPane();
		txtpnBengaliSharee.setText("Bengali Sharee");
		txtpnBengaliSharee.setBounds(87, 11, 164, 43);
		panel.add(txtpnBengaliSharee);
		
		JLabel lblNewLabel_2 = new JLabel("Add Qty");
		lblNewLabel_2.setBounds(345, 21, 46, 14);
		panel.add(lblNewLabel_2);
		
		textFieldsharee = new JTextField();
		textFieldsharee.setBounds(318, 34, 86, 20);
		panel.add(textFieldsharee);
		textFieldsharee.setColumns(10);
		
		JButton btnNewButton_5 = new JButton("OK");
		btnNewButton_5.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
					try {
						if(JOptionPane.showConfirmDialog(frame,"Confirm "+Integer.parseInt(textFieldsharee.getText())+" x Sharee ?","Sharee",JOptionPane.YES_NO_OPTION)
								== JOptionPane.YES_NO_OPTION) {
							setSharee(Integer.parseInt(textFieldsharee.getText()));
						FileWriter ob = new FileWriter("CreateOrder.txt",true);
						ob.write("\n Bengali Sharee X "+textFieldsharee.getText());
						ob.close();
						}}catch(NumberFormatException e1) {
						JOptionPane.showMessageDialog(null, "Enter an integer as amount");
					}
						catch(IOException b) {
					}
				textFieldsharee.setText(null);
			}
		});
		btnNewButton_5.setBounds(345, 65, 60, 23);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_5_3 = new JButton("OK");
		btnNewButton_5_3.setBounds(344, 359, 60, 23);
		panel.add(btnNewButton_5_3);
		
		JLabel lblNewLabel_3 = new JLabel("7000 BDT");
		lblNewLabel_3.setBounds(87, 65, 86, 14);
		panel.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(10, 176, 414, 88);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(Dress.class.getResource("/images/wcloth.png")));
		lblNewLabel_1_1.setBounds(10, 11, 67, 67);
		panel_1.add(lblNewLabel_1_1);
		
		JTextPane txtpnWomensWinterCloths = new JTextPane();
		txtpnWomensWinterCloths.setText("Women's Winter Cloths");
		txtpnWomensWinterCloths.setBounds(87, 11, 164, 43);
		panel_1.add(txtpnWomensWinterCloths);
		
		textFieldwinter = new JTextField();
		textFieldwinter.setColumns(10);
		textFieldwinter.setBounds(318, 34, 86, 20);
		panel_1.add(textFieldwinter);
		
		JLabel lblNewLabel_2_1 = new JLabel("Add Qty");
		lblNewLabel_2_1.setBounds(339, 21, 46, 14);
		panel_1.add(lblNewLabel_2_1);
		
		JButton btnNewButton_5_1 = new JButton("OK");
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					try {
						if(JOptionPane.showConfirmDialog(frame,"Confirm "+Integer.parseInt(textFieldwinter.getText())+" x women's winter clothes ?","Women's winter clothes",JOptionPane.YES_NO_OPTION)
								== JOptionPane.YES_NO_OPTION) {
							setWinter(Integer.parseInt(textFieldwinter.getText()));
						FileWriter ob = new FileWriter("CreateOrder.txt",true);
						ob.write("\n Women's Winter Cloths X "+textFieldwinter.getText());
						ob.close();
						}}catch(NumberFormatException e1) {
							JOptionPane.showMessageDialog(null, "Enter an integer as amount");
						}
					   catch(IOException b) {
					     }
				textFieldwinter.setText(null);
			}
		});
		btnNewButton_5_1.setBounds(344, 65, 60, 23);
		panel_1.add(btnNewButton_5_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("5000 BDT");
		lblNewLabel_3_1.setBounds(87, 64, 86, 14);
		panel_1.add(lblNewLabel_3_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(192, 192, 192));
		panel_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(10, 275, 414, 88);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon(Dress.class.getResource("/images/kamiz.jpg")));
		lblNewLabel_1_2.setBounds(10, 11, 67, 67);
		panel_2.add(lblNewLabel_1_2);
		
		JTextPane txtpnKamiz = new JTextPane();
		txtpnKamiz.setText("Kamiz");
		txtpnKamiz.setBounds(87, 11, 164, 43);
		panel_2.add(txtpnKamiz);
		
		textFieldkamiz = new JTextField();
		textFieldkamiz.setColumns(10);
		textFieldkamiz.setBounds(318, 34, 86, 20);
		panel_2.add(textFieldkamiz);
		
		JLabel lblNewLabel_2_2 = new JLabel("Add Qty");
		lblNewLabel_2_2.setBounds(340, 21, 46, 14);
		panel_2.add(lblNewLabel_2_2);
		
		JButton btnNewButton_5_2 = new JButton("OK");
		btnNewButton_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					setKamiz(Integer.parseInt(textFieldkamiz.getText()));
						if(JOptionPane.showConfirmDialog(frame,"Confirm "+Integer.parseInt(textFieldkamiz.getText())+" x Kamiz ?","Kamiz",JOptionPane.YES_NO_OPTION)
								== JOptionPane.YES_NO_OPTION) {
							setKamiz(Integer.parseInt(textFieldkamiz.getText()));
						FileWriter ob = new FileWriter("CreateOrder.txt",true);
						ob.write("\n Kamiz X "+textFieldkamiz.getText());
						ob.close();
						}}catch(NumberFormatException e1) {
						JOptionPane.showMessageDialog(null, "Enter an integer as amount");
						}
					    catch(IOException b) {
					    }
				textFieldkamiz.setText(null);
			}
		});
		btnNewButton_5_2.setBounds(344, 65, 60, 23);
		panel_2.add(btnNewButton_5_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("2000 BDT");
		lblNewLabel_3_2.setBounds(87, 64, 86, 14);
		panel_2.add(lblNewLabel_3_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(192, 192, 192));
		panel_3.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(10, 374, 414, 93);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1_3 = new JLabel("");
		lblNewLabel_1_3.setIcon(new ImageIcon(Dress.class.getResource("/images/shirt.png")));
		lblNewLabel_1_3.setBounds(10, 11, 67, 67);
		panel_3.add(lblNewLabel_1_3);
		
		JTextPane txtpnMensShirt = new JTextPane();
		txtpnMensShirt.setText("Men's Shirt");
		txtpnMensShirt.setBounds(87, 11, 164, 43);
		panel_3.add(txtpnMensShirt);
		
		textFieldshirts = new JTextField();
		textFieldshirts.setColumns(10);
		textFieldshirts.setBounds(318, 34, 86, 20);
		panel_3.add(textFieldshirts);
		
		JLabel lblNewLabel_2_3 = new JLabel("Add Qty");
		lblNewLabel_2_3.setBounds(339, 21, 46, 14);
		panel_3.add(lblNewLabel_2_3);
		
		JButton btnNewButton_5_2_1 = new JButton("OK");
		btnNewButton_5_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				if(JOptionPane.showConfirmDialog(frame,"Confirm "+Integer.parseInt(textFieldshirts.getText())+" x Men's shirt ?","Men's shirt",JOptionPane.YES_NO_OPTION)
						== JOptionPane.YES_NO_OPTION) {
					setShirts(Integer.parseInt(textFieldshirts.getText()));
						FileWriter ob = new FileWriter("CreateOrder.txt",true);
						ob.write("\n Men's Shirt X "+textFieldshirts.getText());
						ob.close();
					}}catch(NumberFormatException e1) {
						JOptionPane.showMessageDialog(null, "Enter an integer as amount");
						}catch(IOException b) {
					}
				textFieldshirts.setText(null);
			}
		});
		btnNewButton_5_2_1.setBounds(344, 70, 60, 23);
		panel_3.add(btnNewButton_5_2_1);
		
		JLabel lblNewLabel_3_3 = new JLabel("1000 BDT");
		lblNewLabel_3_3.setBounds(87, 64, 86, 14);
		panel_3.add(lblNewLabel_3_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBackground(new Color(192, 192, 192));
		panel_4.setBounds(10, 478, 414, 93);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_1_4 = new JLabel("");
		lblNewLabel_1_4.setIcon(new ImageIcon(Dress.class.getResource("/images/jeans.png")));
		lblNewLabel_1_4.setBounds(10, 11, 67, 67);
		panel_4.add(lblNewLabel_1_4);
		
		JTextPane txtpnDenimJeans = new JTextPane();
		txtpnDenimJeans.setText("Denim Jeans");
		txtpnDenimJeans.setBounds(87, 11, 164, 43);
		panel_4.add(txtpnDenimJeans);
		
		textFieldjeans = new JTextField();
		textFieldjeans.setColumns(10);
		textFieldjeans.setBounds(318, 34, 86, 20);
		panel_4.add(textFieldjeans);
		
		JLabel lblNewLabel_2_4 = new JLabel("Add Qty");
		lblNewLabel_2_4.setBounds(341, 21, 46, 14);
		panel_4.add(lblNewLabel_2_4);
		
		JButton btnNewButton_5_4 = new JButton("OK");
		btnNewButton_5_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				if(JOptionPane.showConfirmDialog(frame,"Confirm "+Integer.parseInt(textFieldjeans.getText())+" x Jeans ?","Jeans",JOptionPane.YES_NO_OPTION)
						== JOptionPane.YES_NO_OPTION) {
					setJeans(Integer.parseInt(textFieldjeans.getText()));
						FileWriter ob = new FileWriter("CreateOrder.txt",true);
						ob.write("\n Denim Jeans X "+textFieldjeans.getText());
						ob.close();
					}}catch(NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "Enter an integer as amount");
					}catch(IOException b) {
					}
				textFieldjeans.setText(null);
			}
		});
		btnNewButton_5_4.setBounds(344, 70, 60, 23);
		panel_4.add(btnNewButton_5_4);
		
		JLabel lblNewLabel_3_4 = new JLabel("2000 BDT");
		lblNewLabel_3_4.setBounds(87, 64, 86, 14);
		panel_4.add(lblNewLabel_3_4);
		
		JButton btnNewButton = new JButton("Pay");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Sir/Madam, You Have to Pay "+ price() + " BDT"); 
			}
		});
		btnNewButton.setBounds(83, 617, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dashboard.main(null);
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(212, 617, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(420, 77, 17, 494);
		frame.getContentPane().add(scrollBar);
	}
}
