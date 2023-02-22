package hello;

import java.awt.EventQueue;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class restuarant extends JFrame{
	
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	protected JTextField textField_9;
	protected JTextField textField_10;
	private JTextField textField_12;
	private JComboBox comboBox ;
	private JCheckBox jCDelivery;
	private JComboBox comboBox_1;
	private JLabel lblNewLabel_6;
	private String com[]={"Select a Drink","Apple Juice","Tea","Cola","Coke","Coffee","Orange","Ice Tea","Ice Coffee"};
	private String com1[]={"Choose One", "Nigeria","USA","Canada","Brazil","Indonasia","India","Philippine"};	
	private JTextField textField_11;
	
	double FirstNum;
	double SecondNum;
	double result;
	String operations;
	String Answer;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					restuarant window = new restuarant();
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
	public restuarant() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1.setBounds(622, 85, 356, 293);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblCurrencyConverter.setBounds(30, 21, 293, 46);
		panel_1.add(lblCurrencyConverter);
		
		textField_9 = new JTextField();
		textField_9.setBounds(73, 127, 199, 30);
		panel_1.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(76, 181, 196, 30);
		panel_1.add(textField_10);
		textField_10.setColumns(10);	
		
		JComboBox comboBox_1 = new JComboBox(com1);
		comboBox_1.setBounds(73, 86, 196, 30);
		panel_1.add(comboBox_1);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(27, 220, 46, 14);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(103, 220, 46, 14);
		panel_1.add(lblNewLabel_7);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_2.setBounds(10, 389, 602, 145);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Cost of Drinks");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 11, 206, 28);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cost of Meal");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(10, 50, 206, 28);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Cost of Delivery");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(10, 85, 176, 49);
		panel_2.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(360, 15, 203, 28);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(360, 54, 203, 28);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(360, 99, 203, 28);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_4.setBounds(988, 85, 343, 454);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(22, 16, 300, 416);
		panel_4.add(tabbedPane);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_6, null);
		panel_6.setLayout(null);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(239, 39, -174, 270);
		panel_6.add(textArea_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 0, 295, 382);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		panel_6.add(textArea);
		textArea.setFont(new Font("Arial", Font.PLAIN, 22));
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_7, null);
		panel_7.setLayout(null);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(33, 16, 230, 44);
		panel_7.add(textField_11);
		
		 /*===============================button:backspace==============================================*/
		JButton button = new JButton("\uF0E7");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String btnufe = null;
				if(textField_11.getText().length() > 0)
				{
					 StringBuilder strB = new StringBuilder (textField_11.getText());
					 strB.deleteCharAt(textField_11.getText().length() - 1);
					 btnufe =  strB.toString();
					 textField_11.setText( btnufe);
				}	
			}
		});
		
		button.setFont(new Font("Wingdings", Font.BOLD, 20));
		button.setBounds(10, 77, 68, 50);
		panel_7.add(button);
		
		/*============================button=C========================================*/
		JButton button_1 = new JButton("C");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField_11.setText(null);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_1.setBounds(81, 76, 50, 50);
		panel_7.add(button_1);
		
		/*==================================PERCENT==============================================*/
		JButton button_2 = new JButton("%");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FirstNum = Double.parseDouble( textField_11.getText());
				textField_11.setText("");
				operations = "%";
				
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_2.setBounds(135, 76, 73, 50);
		panel_7.add(button_2);
		
		/*==================================PLUS==============================================*/	
		JButton button_3 = new JButton("+");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 FirstNum = Double.parseDouble( textField_11.getText());
				 textField_11.setText("");
				 operations = "+";
				
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_3.setBounds(213, 76, 50, 50);
		panel_7.add(button_3);
		
		JButton button_4 = new JButton("7");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber11 = textField_11.getText()+ button_4.getText();
				textField_11.setText(EnterNumber11);
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_4.setBounds(33, 137, 50, 50);
		panel_7.add(button_4);
		
		JButton button_5 = new JButton("4");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber11 = textField_11.getText()+ button_5.getText();
				textField_11.setText(EnterNumber11);
				
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_5.setBounds(33, 198, 50, 50);
		panel_7.add(button_5);
		
		JButton button_6 = new JButton("0");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber11 = textField_11.getText()+ button_6.getText();
				textField_11.setText(EnterNumber11);
				
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_6.setBounds(33, 320, 50, 50);
		panel_7.add(button_6);
		
		JButton button_7 = new JButton("1");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber11 = textField_11.getText()+ button_7.getText();
				textField_11.setText(EnterNumber11);
				
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_7.setBounds(33, 259, 50, 50);
		panel_7.add(button_7);
		
		JButton button_8 = new JButton("2");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber11 = textField_11.getText()+ button_8.getText();
				textField_11.setText(EnterNumber11);
				
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_8.setBounds(93, 259, 50, 50);
		panel_7.add(button_8);
		
		JButton button_9 = new JButton(".");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber11 = textField_11.getText()+ button_9.getText();
				textField_11.setText(EnterNumber11);
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_9.setBounds(93, 320, 50, 50);
		panel_7.add(button_9);
		
		/*============================button:PLUS-MINUS==============================================*/	
		JButton button_10 = new JButton("\u00B1");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				 double ops = Double.parseDouble( String.valueOf(textField_11.getText()));
				 ops = ops * (-1);
				 textField_11.setText( String.valueOf(ops));
				
			}
		});
		button_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_10.setBounds(153, 320, 50, 50);
		panel_7.add(button_10);
		
		/*====================================DIVIDE=====================================*/
		JButton button_12 = new JButton("/");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FirstNum = Double.parseDouble( textField_11.getText());
				textField_11.setText("");
				operations = "/";
				
			}
		});
		button_12.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_12.setBounds(213, 259, 50, 50);
		panel_7.add(button_12);
		/*====================================MINUS=====================================*/
		JButton button_13 = new JButton("-");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FirstNum = Double.parseDouble( textField_11.getText());
				textField_11.setText("");
				 operations = "-";
			}
		});
		button_13.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_13.setBounds(213, 137, 50, 50);
		panel_7.add(button_13);
		
		JButton button_14 = new JButton("9");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber9= textField_11.getText()+ button_14.getText();
				textField_11.setText(EnterNumber9);
				
			}
		});
		button_14.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_14.setBounds(153, 137, 50, 50);
		panel_7.add(button_14);
		
		JButton button_15 = new JButton("8");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber9= textField_11.getText()+ button_15.getText();
				textField_11.setText(EnterNumber9);
				
			}
		});
		button_15.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_15.setBounds(93, 137, 50, 50);
		panel_7.add(button_15);
		
		JButton button_16 = new JButton("5");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber9= textField_11.getText()+ button_16.getText();
				textField_11.setText(EnterNumber9);
				
			}
		});
		button_16.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_16.setBounds(93, 198, 50, 50);
		panel_7.add(button_16);
		
		JButton button_17 = new JButton("6");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber9= textField_11.getText()+ button_17.getText();
				textField_11.setText(EnterNumber9);
				
			}
		});
		button_17.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_17.setBounds(153, 198, 50, 50);
		panel_7.add(button_17);
		
		/*=============================MULTIPLICATION==============================================*/
		JButton button_18 = new JButton("*");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FirstNum = Double.parseDouble( textField_11.getText());
				textField_11.setText("");
				operations = "*";
				
			}
		});
		button_18.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_18.setBounds(213, 198, 50, 50);
		panel_7.add(button_18);
		
		JButton button_19 = new JButton("3");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber13= textField_11.getText()+ button_19.getText();
				textField_11.setText(EnterNumber13);
				
			}
		});
		button_19.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_19.setBounds(153, 259, 50, 50);
		panel_7.add(button_19);
		
		/*=============================EQUEL==============================================*/
		JButton button_11 = new JButton("=");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SecondNum =Double.parseDouble(textField_11.getText());
				if(operations == "+")
				{
					result = FirstNum + SecondNum;
					 Answer = String.format("%.2f", result);
					 textField_11.setText( Answer);
					
				}
				
				else if(operations == "-")
				{
					result = FirstNum - SecondNum;
					 Answer = String.format("%.2f", result);
					 textField_11.setText( Answer);
					
				}
				else if(operations == "/")
				{
					result = FirstNum / SecondNum;
					 Answer = String.format("%.2f", result);
					 textField_11.setText( Answer);
					
				}
				else if(operations == "%")
				{
					result = FirstNum % SecondNum;
					 Answer = String.format("%.2f", result);
					 textField_11.setText( Answer);
					
				}
				
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_11.setBounds(213, 320, 50, 50);
		panel_7.add(button_11);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_5.setBounds(10, 547, 1321, 93);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnTotal = new JButton("Meal Total Bill");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				
				double ChickenBurger = Double.parseDouble(textField.getText());
				double iChicBurger = 2.39;
				double Burger=  (ChickenBurger*iChicBurger) ;
				String pMeal = String.format("%.2f", Burger);
				textField_4.setText(pMeal);
				

				double ChickenBurgerMeal = Double.parseDouble(textField_1.getText());
				double iChicBurgerMeal = 4.39;
				double BurgerMeal=  (ChickenBurgerMeal*iChicBurgerMeal) ;
				String cbMeal = String.format("%.2f", (Burger+BurgerMeal));
				textField_4.setText(cbMeal);
				
				double CheeseBurger = Double.parseDouble(textField_2.getText());
				double iCheeseBurger = 3.39;
				double CheeseBurgerMeal=  (CheeseBurger*iCheeseBurger ) ;
				String Cheese = String.format("%.2f", (Burger+BurgerMeal+ CheeseBurgerMeal));
			    textField_4.setText(Cheese);
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnTotal.setBounds(137, 34, 171, 28);
		panel_5.add(btnTotal);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnExit.setBounds(1141, 34, 89, 26);
		panel_5.add(btnExit);
		
		
		JLabel lblNewLabel = new JLabel("Loan Management System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setBounds(373, 3, 676, 71);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(622, 389, 356, 145);
		frame.getContentPane().add(panel_3);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_3.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTax.setBounds(10, 11, 45, 28);
		panel_3.add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSubTotal.setBounds(10, 56, 117, 28);
		panel_3.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTotal.setBounds(10, 95, 99, 28);
		panel_3.add(lblTotal);
		
		textField_6 = new JTextField();
		textField_6.setBounds(191, 14, 133, 30);
		panel_3.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(191, 60, 133, 28);
		panel_3.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(191, 95, 133, 28);
		panel_3.add(textField_8);
		textField_8.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel.setBounds(10, 85, 602, 293);
		frame.getContentPane().add(panel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(376, 15, 187, 28);
		panel.add(textField);
		
		JLabel label = new JLabel("Chicken Burger");
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBounds(10, 11, 163, 34);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Chicken Burger Meal");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_1.setBounds(10, 56, 228, 28);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Cheese Burger");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_2.setBounds(10, 95, 206, 28);
		panel.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(376, 54, 187, 28);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(376, 99, 187, 28);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 143, 553, 9);
		panel.add(separator_1);
		
		JLabel lblNewLabel_4 = new JLabel("Drink");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(10, 153, 144, 25);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Qty");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5.setBounds(376, 153, 87, 28);
		panel.add(lblNewLabel_5);
		
		textField_12 = new JTextField();
		textField_12.setBounds(376, 192, 187, 28);
		panel.add(textField_12);
		textField_12.setColumns(10);
		
		JComboBox comboBox  = new JComboBox(com);
		comboBox.setBounds(10, 189, 163, 28);
		panel.add(comboBox);
		
		/*-----------------------------------------Drinks----------------------------------------------------*/
		
		JButton btnOkay = new JButton("Drink Total Bill");
		btnOkay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
	
	 	    double Drinks = Double.parseDouble(textField_12.getText());
			double Tea = 1.20*Drinks;
			double Ice_Tea = 0.90*Drinks;
			double Coffee = 2.50*Drinks;
			double Ice_Coffee = 1.10*Drinks;
			double Cola = 2.10*Drinks;
			double Coke = 1.60*Drinks;
			double Orange = 1.70*Drinks;
			double Apple_Juice = 1.99*Drinks;
			
				String s =comboBox.getSelectedItem().toString();
				if(s=="Apple Juice")
				{
					String cApple_Juice = String.format("%.2f", Apple_Juice);
					textField_3.setText(cApple_Juice);
				}
				else if(s=="Tea")
				{
					String cTea = String.format("%.2f", Tea);
				    textField_3.setText(cTea);
				}
				else if(s=="Orange")
				{
					String cOrange = String.format("%.2f", Orange);
				    textField_3.setText(cOrange);
				}
				else if(s=="Ice Coffee")
				{
					String cIce_Coffee= String.format("%.2f", Ice_Coffee);
				    textField_3.setText(cIce_Coffee);
				}
				else if(s=="Cola")
				{
					String cCola = String.format("%.2f", Cola);
				    textField_3.setText(cCola);
				}
				else if(s=="Coke")
				{
					String cCoke = String.format("%.2f", Coke);
				    textField_3.setText(cCoke);
				}
				else if(s=="Coffee")
				{
					String cCoffee= String.format("%.2f", Coffee);
					textField_3.setText(cCoffee);
				}
				else if(s=="Ice Tea")
				{
					String cIce_Tea = String.format("%.2f", Ice_Tea);
					textField_3.setText(cIce_Tea);
				}
				else if(s=="Select A Drink")
				{
						textField_3.setText("0");
				}			
				
			}
		});
		btnOkay.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnOkay.setBounds(349, 31, 171, 28);
		panel_5.add(btnOkay);		
		
		
		textField_5.setText("0");
		
		/*=========================================== Home Delivery ===================================================*/
		
		
		JButton btnHome_Delivery = new JButton("Home Delivery");
		btnHome_Delivery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				   double iDelivery =3.39;
			       String pDelivery = String.format("%.2f", iDelivery);
			       textField_5.setText(pDelivery);
			}
		});
		btnHome_Delivery.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnHome_Delivery.setBounds(10, 242, 206, 29);
		panel.add(btnHome_Delivery);
		
		/*==================================================== Tax =========================================*/
		
		JButton btnTax = new JButton("Tax");
		btnTax.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double cTotal1 = Double.parseDouble(textField_3.getText());
			    double cTotal2 = Double.parseDouble(textField_4.getText());
			    double cTotal3 = Double.parseDouble(textField_5.getText());
			    double AllTotal = (cTotal1 + cTotal2 + cTotal3)/100.00;
				
				String iTotal = String.format("%.2f", AllTotal);
				textField_6.setText(iTotal);
				
			}
		});
		btnTax.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnTax.setBounds(365, 244, 115, 29);
		panel.add(btnTax);
		
/*============================================== Total =============================================*/
		
		JButton btnTotal_1 = new JButton("Total");
		btnTotal_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double cTotal1 = Double.parseDouble(textField_3.getText());
			    double cTotal2 = Double.parseDouble(textField_4.getText());
			    double cTotal3 = Double.parseDouble(textField_5.getText());
				
                double cTotal4 = Double.parseDouble(textField_6.getText());
				
				double subTotal = (cTotal1 + cTotal2 + cTotal3);
				String isubTotal = String.format("%.2f", subTotal);
				textField_7.setText(isubTotal);
				
				double allTotal = (cTotal1 + cTotal2 + cTotal3 + cTotal4);
				String iTotal = String.format("%.2f", allTotal);
				textField_8.setText(iTotal);				
			}
		});
		btnTotal_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnTotal_1.setBounds(604, 33, 115, 29);
		panel_5.add(btnTotal_1);
		
	/*=============================================== Currency Convert ==============================================*/	
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		          
		          double British_Pound = Double.parseDouble(textField_9.getText());
		           
		          double Nigerian_Naira = 464.30;
		          double US_Dollar = 1.29;
		          double Canadian_Dollar = 1.74;
		          double Brazilian_Real = 5.10;
		          double Indian_Rupee = 90.63;
		          double Philippine_Peso = 67.35;
		          double Indonesian_Rupiah = 18347.91;
		           
		           if(comboBox_1.getSelectedItem().toString().equals("Nigeria"))
		           {
		                   	String cConvert1 =String.format("N %.2f", British_Pound * Nigerian_Naira );
		        	           textField_10.setText(cConvert1);
		           }
		           
			
		           else if(comboBox_1.getSelectedItem().toString().equals("USA"))
		           {
		                   	String cConvert2 =String.format("$ %.2f", British_Pound * US_Dollar );
		                   	textField_10.setText(cConvert2);
		           }
		           
		           else if(comboBox_1.getSelectedItem().toString().equals("Canada"))
		           {
		                   	String cConvert3 =String.format("C$ %.2f", British_Pound * Canadian_Dollar );
		                   	textField_10.setText(cConvert3);
		           }
		           
		           else if(comboBox_1.getSelectedItem().toString().equals("Brazil"))
		           {
		                   	String cConvert4 =String.format("Bra %.2f", British_Pound * Brazilian_Real);
		                   	textField_10.setText(cConvert4);
		           }
		           

		           else if(comboBox_1.getSelectedItem().toString().equals("India"))
		           {
		                   	String cConvert5 =String.format("INR %.2f", British_Pound * Indian_Rupee);
		                   	textField_10.setText(cConvert5);
		           }
				

		           else if(comboBox_1.getSelectedItem().toString().equals("Philippine"))
		           {
		                   	String cConvert6 =String.format("PHP %.2f", British_Pound * Philippine_Peso);
		                   	textField_10.setText(cConvert6);
		           }
		          
		           else if(comboBox_1.getSelectedItem().toString().equals("Indonesia"))
		           {
		                   	String cConvert7 =String.format("IDR %.2f", British_Pound * Indonesian_Rupiah);
		                   	textField_10.setText(cConvert7);
		           }
				
			}
		});
		
		btnConvert.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnConvert.setForeground(Color.BLACK);
		btnConvert.setBounds(37, 245, 112, 27);
		panel_1.add(btnConvert);
		
		/*====================================CLOSE BUTTON OF CONVERT CURENCY=========================================*/
		
		
		 JButton btnClose = new JButton("Close");
		 btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField_9.setText(null);
				textField_10.setText(null);
				comboBox_1.setSelectedItem("Choose One");
				
			}
		});
		
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnClose.setBounds(213, 245, 101, 27);
		panel_1.add(btnClose);
		
/*=======================================Receipt==========================================*/
				
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				  double Qty1  = Double.parseDouble(textField.getText());
			      double Qty2  = Double.parseDouble(textField_1.getText());
			      double Qty3  = Double.parseDouble(textField_2.getText());
			    
			      textArea.setText ("Restaurant Management System: \n\n"+
			     "Chicken Burger : " + Qty1+ "\n" +
			     "Chicken Burger Meal: "+ Qty2+  "\n" +
			     "Cheese Burger: " + Qty3 +
			     "\n\nThanks for using Job Estimator ");
			}
		});
		
		btnReceipt.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnReceipt.setBounds(814, 34, 105, 25);
		panel_5.add(btnReceipt);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textArea.setText(null);
				textField_10.setText(null);
				textField_12.setText(null);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnReset.setBounds(995, 34, 89, 26);
		panel_5.add(btnReset);
		
		
	}
}

