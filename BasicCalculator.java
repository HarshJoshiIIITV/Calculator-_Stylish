package BasicCalculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BasicCalculator extends JFrame {

	private JPanel contentPane;
	private JTextField txtDisplay;
	String operations;
	String answer;
	double firstnum;
	double secondnum;
	double result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BasicCalculator frame = new BasicCalculator();
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
	public BasicCalculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 458);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setBounds(10, 10, 359, 53);
		contentPane.add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton btnBS = new JButton("\uF0D5");
		btnBS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				String backspace=null;
				
				if(txtDisplay.getText().length()>0) {
					StringBuilder strB=new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length()-1);
					backspace=strB.toString();
					txtDisplay.setText(backspace);
				}
				
				
			}
		});
		btnBS.setFont(new Font("Wingdings", Font.BOLD, 20));
		btnBS.setBounds(10, 101, 64, 53);
		contentPane.add(btnBS);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnC.setBounds(95, 101, 64, 53);
		contentPane.add(btnC);
		
		JButton button_2 = new JButton("%");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="%";
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_2.setBounds(198, 101, 64, 53);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("+");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="+";
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_3.setBounds(305, 101, 64, 53);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("-");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="-";
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_4.setBounds(305, 172, 64, 53);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("9");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+button_5.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_5.setBounds(198, 172, 64, 53);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("8");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+button_6.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_6.setBounds(95, 172, 64, 53);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+button_7.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_7.setBounds(10, 172, 64, 53);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("*");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="*";
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_8.setBounds(305, 235, 64, 53);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("6");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+button_9.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_9.setBounds(198, 235, 64, 53);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("5");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+button_10.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		button_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_10.setBounds(95, 235, 64, 53);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("4");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+button_11.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_11.setBounds(10, 235, 64, 53);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("/");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="/";
			}
		});
		button_12.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_12.setBounds(305, 298, 64, 53);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("3");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+button_13.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		button_13.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_13.setBounds(198, 298, 64, 53);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("2");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+button_14.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		button_14.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_14.setBounds(95, 298, 64, 53);
		contentPane.add(button_14);
		
		JButton button_15 = new JButton("1");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+button_15.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		button_15.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_15.setBounds(10, 298, 64, 53);
		contentPane.add(button_15);
		
		JButton button_1 = new JButton("0");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber=txtDisplay.getText()+button_1.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_1.setBounds(10, 361, 64, 53);
		contentPane.add(button_1);
		
		JButton button_16 = new JButton(".");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txtDisplay.getText().contains(".")) {
					txtDisplay.setText(txtDisplay.getText()+button_16.getText());
				}
				
				
				
				
			}
		});
		button_16.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_16.setBounds(95, 361, 64, 53);
		contentPane.add(button_16);
		
		JButton button_17 = new JButton("\u00B1");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops=Double.parseDouble(txtDisplay.getText());
				ops=ops*-(1);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		button_17.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_17.setBounds(198, 361, 64, 53);
		contentPane.add(button_17);
		
		JButton button_18 = new JButton("=");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondnum=Double.parseDouble(txtDisplay.getText());
				if(operations=="+") {
					result=firstnum+secondnum;
					answer=String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations=="-") {
					result=firstnum-secondnum;
					answer=String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations=="*") {
					result=firstnum*secondnum;
					answer=String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations=="/") {
					result=firstnum/secondnum;
					answer=String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations=="%") {
					result=firstnum%secondnum;
					answer=String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				
				
			}
		});
		button_18.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_18.setBounds(305, 361, 64, 53);
		contentPane.add(button_18);
	}

}
