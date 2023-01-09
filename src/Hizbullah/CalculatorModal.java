package Hizbullah;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.Color;

public class CalculatorModal {

	private JFrame frmStandardCalculator;
	protected JTextField txtDisplay;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorModal window = new CalculatorModal();
					window.frmStandardCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorModal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStandardCalculator = new JFrame();
		frmStandardCalculator.setTitle("Standard Calculator");
		frmStandardCalculator.setBounds(100, 100, 625, 394);
		frmStandardCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStandardCalculator.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setBounds(10, 8, 590, 37);
		txtDisplay.setFont(new Font("Verdana",Font.BOLD,20));;
		txtDisplay.setEnabled(false);
		frmStandardCalculator.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		
		JButton btnufe = new JButton("\u2190");
		btnufe.setFont(new Font("SansSerif", Font.PLAIN, 13));
		btnufe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String backspace;
				
				if(txtDisplay.getText().length() > 0) {
					String s;
					String b;
					s=txtDisplay.getText();
					b=s.substring(0, s.length()-1);
					txtDisplay.setText(b);
				
				}
				}
		});
		btnufe.setBounds(10, 51, 46, 47);
		frmStandardCalculator.getContentPane().add(btnufe);
		
		JButton button = new JButton("7");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String iNum = txtDisplay.getText() + button.getText();
				txtDisplay.setText(iNum);
			}
		});
		button.setBounds(10, 105, 46, 47);
		frmStandardCalculator.getContentPane().add(button);
		
		JButton button_1 = new JButton("4");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String iNum = txtDisplay.getText() + button_1.getText();
				txtDisplay.setText(iNum);
			}
		});
		button_1.setBounds(10, 160, 46, 47);
		frmStandardCalculator.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("1");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String iNum = txtDisplay.getText() + button_2.getText();
				txtDisplay.setText(iNum);
			}
		});
		button_2.setBounds(10, 211, 46, 47);
		frmStandardCalculator.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("0");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String iNum = txtDisplay.getText() + button_3.getText();
				txtDisplay.setText(iNum);
			}
		});
		button_3.setBounds(10, 260, 102, 63);
		frmStandardCalculator.getContentPane().add(button_3);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtDisplay.setText("");
			}
		});
		btnCe.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnCe.setBounds(66, 51, 46, 47);
		frmStandardCalculator.getContentPane().add(btnCe);
		
		JButton button_5 = new JButton("8");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String iNum = txtDisplay.getText() + button_5.getText();
				txtDisplay.setText(iNum);
			}
		});
		button_5.setBounds(66, 105, 46, 47);
		frmStandardCalculator.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("5");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String iNum = txtDisplay.getText() + button_6.getText();
				txtDisplay.setText(iNum);
			}
		});
		button_6.setBounds(66, 160, 46, 47);
		frmStandardCalculator.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("2");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String iNum = txtDisplay.getText() + button_7.getText();
				txtDisplay.setText(iNum);
			}
		});
		button_7.setBounds(66, 211, 46, 47);
		frmStandardCalculator.getContentPane().add(button_7);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtDisplay.setText("");
			}
		});
		btnC.setBounds(122, 51, 46, 47);
		frmStandardCalculator.getContentPane().add(btnC);
		
		JButton button_8 = new JButton("9");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String iNum = txtDisplay.getText() + button_8.getText();
				txtDisplay.setText(iNum);
			}
		});
		button_8.setBounds(122, 105, 46, 47);
		frmStandardCalculator.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("6");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String iNum = txtDisplay.getText() + button_9.getText();
				txtDisplay.setText(iNum);
			}
		});
		button_9.setBounds(122, 160, 46, 47);
		frmStandardCalculator.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("3");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String iNum = txtDisplay.getText() + button_10.getText();
				txtDisplay.setText(iNum);
			}
		});
		button_10.setBounds(122, 211, 46, 47);
		frmStandardCalculator.getContentPane().add(button_10);
		
		JButton button_4 = new JButton(".");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String iNum = txtDisplay.getText() + button_4.getText();
				txtDisplay.setText(iNum);
			}
		});
		button_4.setBounds(122, 260, 46, 63);
		frmStandardCalculator.getContentPane().add(button_4);
		
		JButton button_11 = new JButton("\u00B1");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = ops * (-1);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		button_11.setBounds(177, 51, 46, 47);
		frmStandardCalculator.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("/");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
			}
		});
		button_12.setBounds(177, 105, 46, 47);
		frmStandardCalculator.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("*");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
			}
		});
		button_13.setBounds(177, 160, 46, 47);
		frmStandardCalculator.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("-");
		button_14.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		button_14.setBounds(177, 211, 46, 47);
		frmStandardCalculator.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("+");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
			}
		});
		button_15.setBounds(177, 260, 46, 63);
		frmStandardCalculator.getContentPane().add(button_15);
		
		JButton button_16 = new JButton("\u221A");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.sqrt(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		button_16.setBounds(233, 51, 54, 47);
		frmStandardCalculator.getContentPane().add(button_16);
		
		JButton button_17 = new JButton("%");
		button_17.setFont(new Font("Tahoma", Font.PLAIN, 11));
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnum = Double.parseDouble(txtDisplay.getText());
				if (operations == "+") 
				{
					result = (firstnum + secondnum) * 0.01 ;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
					
				}
				
				else if (operations == "-") 
				{
					result = (firstnum - secondnum) * 0.01 ;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
					
				}
				
				
				else if (operations == "*") 
				{
					result = (firstnum * secondnum) * 0.01 ;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
					
				}
				
				else if (operations == "/") 
				{
					result = (firstnum / secondnum) * 0.01 ;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
					
				}
			}
		});
		button_17.setBounds(233, 105, 54, 47);
		frmStandardCalculator.getContentPane().add(button_17);
		
		JButton button_18 = new JButton("1/x");
		button_18.setFont(new Font("SansSerif", Font.PLAIN, 12));
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = 1/ops;
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		button_18.setBounds(233, 160, 54, 47);
		frmStandardCalculator.getContentPane().add(button_18);
		
		JButton button_19 = new JButton("=");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnum = Double.parseDouble(txtDisplay.getText());
				if (operations == "+") 
				{
					result = firstnum + secondnum ;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
					
				}
				
				else if (operations == "-") 
				{
					result = firstnum - secondnum ;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
					
				}
				
				else if (operations == "x^y") 
				{
					result = Math.pow(firstnum, secondnum) ;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
					
				}
				
				
				else if (operations == "*") 
				{
					result = firstnum * secondnum ;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
					
				}
				
				else if (operations == "/") 
				{
					result = firstnum / secondnum ;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
					
				}
			}
		});
		button_19.setBounds(233, 211, 54, 112);
		frmStandardCalculator.getContentPane().add(button_19);
		
		JButton btnLog = new JButton("log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.log(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnLog.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLog.setBounds(309, 51, 64, 47);
		frmStandardCalculator.getContentPane().add(btnLog);
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.sin(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSin.setBounds(383, 51, 64, 47);
		frmStandardCalculator.getContentPane().add(btnSin);
		
		JButton button_20 = new JButton("Sinh");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.sinh(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		button_20.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button_20.setBounds(457, 51, 74, 47);
		frmStandardCalculator.getContentPane().add(button_20);
		
		JButton btnMod = new JButton("Mod");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
//				ops = Math.
//				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnMod.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnMod.setBounds(541, 49, 64, 47);
		frmStandardCalculator.getContentPane().add(btnMod);
		
		JButton button_21 = new JButton("x^y");
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "x^y";
			}
		});
		button_21.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button_21.setBounds(309, 105, 64, 47);
		frmStandardCalculator.getContentPane().add(button_21);
		
		JButton button_22 = new JButton("Cos");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.cos(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		button_22.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_22.setBounds(383, 105, 64, 47);
		frmStandardCalculator.getContentPane().add(button_22);
		
		JButton button_23 = new JButton("Cosh");
		button_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.cosh(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		button_23.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button_23.setBounds(457, 105, 74, 47);
		frmStandardCalculator.getContentPane().add(button_23);
		
		JButton button_24 = new JButton("lnx");
		button_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.log10(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		button_24.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button_24.setBounds(541, 105, 64, 47);
		frmStandardCalculator.getContentPane().add(button_24);
		
		JButton button_25 = new JButton("\u03BB");
		button_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double ops;
				ops = Math.PI;
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		button_25.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_25.setBounds(309, 160, 64, 47);
		frmStandardCalculator.getContentPane().add(button_25);
		
		JButton button_26 = new JButton("Tan");
		button_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.tan(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		button_26.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_26.setBounds(383, 160, 64, 47);
		frmStandardCalculator.getContentPane().add(button_26);
		
		JButton button_27 = new JButton("Tanh");
		button_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.tanh(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		button_27.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button_27.setBounds(457, 160, 74, 47);
		frmStandardCalculator.getContentPane().add(button_27);
		
		JButton button_28 = new JButton("Exp");
		button_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "Exp";
			}
		});
		button_28.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button_28.setBounds(541, 160, 64, 47);
		frmStandardCalculator.getContentPane().add(button_28);
		
		JButton button_29 = new JButton("x\u00B2");
		button_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = (ops * ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		button_29.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_29.setBounds(309, 218, 64, 47);
		frmStandardCalculator.getContentPane().add(button_29);
		
		JButton button_30 = new JButton("3"+"\u221A");
		button_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.cbrt(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		button_30.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_30.setBounds(383, 218, 64, 47);
		frmStandardCalculator.getContentPane().add(button_30);
		
		JButton button_31 = new JButton("Rnd");
		button_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = Math.round(ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		button_31.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button_31.setBounds(457, 218, 74, 47);
		frmStandardCalculator.getContentPane().add(button_31);
		
		JButton button_32 = new JButton("2"+"\u03BB");
		button_32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops;
				ops = (3.1415926535897932384626433832795) * 2;
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		button_32.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button_32.setBounds(541, 218, 64, 47);
		frmStandardCalculator.getContentPane().add(button_32);
		
		JButton button_33 = new JButton("x\u00B3");
		button_33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = (ops * ops * ops);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		button_33.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_33.setBounds(309, 276, 64, 47);
		frmStandardCalculator.getContentPane().add(button_33);
		
		JButton button_34 = new JButton("Bin");
		button_34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = Integer.parseInt(txtDisplay.getText());
				txtDisplay.setText(Integer.toBinaryString(a));
			}
		});
		button_34.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_34.setBounds(383, 276, 64, 47);
		frmStandardCalculator.getContentPane().add(button_34);
		
		JButton button_35 = new JButton("Hex");
		button_35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int a = Integer.parseInt(txtDisplay.getText());
				txtDisplay.setText(Integer.toHexString(a));
			}
		});
		button_35.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button_35.setBounds(457, 276, 74, 47);
		frmStandardCalculator.getContentPane().add(button_35);
		
		JButton button_36 = new JButton("Oct");
		button_36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int a = Integer.parseInt(txtDisplay.getText());
				txtDisplay.setText(Integer.toOctalString(a));
			}
		});
		button_36.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button_36.setBounds(541, 276, 64, 47);
		frmStandardCalculator.getContentPane().add(button_36);
		
		JMenuBar menuBar = new JMenuBar();
		frmStandardCalculator.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmStandard = new JMenuItem("Standard");
		mntmStandard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frmStandardCalculator.setTitle("Standard Calculator");
				frmStandardCalculator.setBounds(100, 100, 310, 390);
				txtDisplay.setBounds(10, 11, 243, 37);
			}
		});
		mnFile.add(mntmStandard);
		
		JMenuItem mntmScientific = new JMenuItem("Scientific");
		mntmScientific.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frmStandardCalculator.setTitle("Scientific Calculator");
				frmStandardCalculator.setBounds(100, 100, 625, 390);
				txtDisplay.setBounds(10, 11, 494, 37);
			}
		});
		mnFile.add(mntmScientific);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mnFile.add(mntmExit);
	}
}
