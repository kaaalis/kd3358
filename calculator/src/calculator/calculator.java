package calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Panel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextField;

public class calculator extends JFrame  {

	private JPanel contentPane;
	private JTextField textField;
	private CalculatorGUI myCalculator;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator frame = new calculator();
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
	public calculator() {
		myCalculator = new CalculatorGUI();
		setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 532, 460);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 153, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Button button = new Button("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				myCalculator.numberButtonPressed(1);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));

			}
		});
		button.setBackground(Color.WHITE);
		button.setActionCommand("1");
		button.setBounds(21, 108, 102, 50);
		contentPane.add(button);
		
		Button button_1 = new Button("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				myCalculator.numberButtonPressed(2);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_1.setBackground(Color.WHITE);
		button_1.setActionCommand("1");
		button_1.setBounds(129, 108, 102, 50);
		contentPane.add(button_1);
		
		Button button_2 = new Button("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(3);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_2.setBackground(Color.WHITE);
		button_2.setActionCommand("1");
		button_2.setBounds(237, 108, 102, 50);
		contentPane.add(button_2);
		
		Button button_3 = new Button("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(4);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_3.setBackground(Color.WHITE);
		button_3.setActionCommand("1");
		button_3.setBounds(21, 164, 102, 50);
		contentPane.add(button_3);
		
		Button button_4 = new Button("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(5);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_4.setBackground(Color.WHITE);
		button_4.setActionCommand("1");
		button_4.setBounds(129, 164, 102, 50);
		contentPane.add(button_4);
		
		Button button_5 = new Button("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(6);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_5.setBackground(Color.WHITE);
		button_5.setActionCommand("1");
		button_5.setBounds(237, 164, 102, 50);
		contentPane.add(button_5);
		
		Button button_6 = new Button("7");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(7);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_6.setBackground(Color.WHITE);
		button_6.setActionCommand("1");
		button_6.setBounds(21, 220, 102, 50);
		contentPane.add(button_6);
		
		Button button_7 = new Button("8");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(8);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_7.setBackground(Color.WHITE);
		button_7.setActionCommand("1");
		button_7.setBounds(129, 220, 102, 50);
		contentPane.add(button_7);
		
		Button button_8 = new Button("9");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(9);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_8.setBackground(Color.WHITE);
		button_8.setActionCommand("1");
		button_8.setBounds(237, 220, 102, 50);
		contentPane.add(button_8);
		
		Button button_9 = new Button("%");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_9.setBackground(Color.WHITE);
		button_9.setActionCommand("1");
		button_9.setBounds(21, 276, 102, 50);
		contentPane.add(button_9);
		
		Button button_10 = new Button("0");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(0);
				int i = myCalculator.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_10.setBackground(Color.WHITE);
		button_10.setActionCommand("1");
		button_10.setBounds(129, 276, 102, 50);
		contentPane.add(button_10);
		
		Button button_11 = new Button(",");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_11.setBackground(Color.WHITE);
		button_11.setActionCommand("1");
		button_11.setBounds(237, 276, 102, 50);
		contentPane.add(button_11);
		
		Button button_12 = new Button("/");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_12.setBackground(Color.WHITE);
		button_12.setActionCommand("1");
		button_12.setBounds(382, 108, 102, 50);
		contentPane.add(button_12);
		
		Button button_13 = new Button("x");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.mult();
				String i = myCalculator.getOperator();
				textField.setText(String.valueOf(i));
				
				
			}
		});
		button_13.setBackground(Color.WHITE);
		button_13.setActionCommand("1");
		button_13.setBounds(382, 164, 102, 50);
		contentPane.add(button_13);
		
		Button button_14 = new Button("-");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.minus();
				String i = myCalculator.getOperator();
				textField.setText(String.valueOf(i));
				
			}
		});
		button_14.setBackground(Color.WHITE);
		button_14.setActionCommand("1");
		button_14.setBounds(382, 220, 102, 50);
		contentPane.add(button_14);
		
		Button button_15 = new Button("+");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.plus();
				String i = myCalculator.getOperator();
				textField.setText(String.valueOf(i));
			}
		});
		button_15.setBackground(Color.WHITE);
		button_15.setActionCommand("1");
		button_15.setBounds(382, 276, 102, 50);
		contentPane.add(button_15);
		
		Button button_16 = new Button("=");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.equals();
			    int i = myCalculator.getResult();
				textField.setText(String.valueOf(i));
			}
		});
		button_16.setBackground(Color.WHITE);
		button_16.setActionCommand("1");
		button_16.setBounds(382, 332, 102, 50);
		contentPane.add(button_16);
		
		Button button_17 = new Button("C");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button_17.setBackground(Color.WHITE);
		button_17.setActionCommand("1");
		button_17.setBounds(21, 332, 318, 50);
		contentPane.add(button_17);
		
		textField = new JTextField();
		textField.setBounds(26, 16, 458, 79);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
