package calculadora;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculadora {
	float fplus;
	float splus;
	float finalplus;
	boolean containplus;
	
	float fminus;
	float sminus;
	float finalminus;
	boolean containminus;
	
	float fdiv;
	float sdiv;
	float finaldiv;
	boolean containdiv;
	
	float fmulti;
	float smulti;
	float finalmulti;
	boolean containmulti;
	
	float fpercen;
	float spercen;
	float percentage;
	float finalpercen;
	boolean containpercen;
	
	String backspace;
	
	JFrame frame = new JFrame("Calculator");
	JPanel panel = new JPanel();
	JTextField textfield = new JTextField();
	
	JButton button0 = new JButton(" 0 ");
	JButton button1 = new JButton(" 1 ");
	JButton button2 = new JButton(" 2 ");
	JButton button3 = new JButton(" 3 ");
	JButton button4 = new JButton(" 4 ");
	JButton button5 = new JButton(" 5 ");
	JButton button6 = new JButton(" 6 ");
	JButton button7 = new JButton(" 7 ");
	JButton button8 = new JButton(" 8 ");
	JButton button9 = new JButton(" 9 ");
	
	JButton buttondiv = new JButton(" / ");
	JButton buttonmulti = new JButton(" x ");
	JButton buttonplus = new JButton(" + ");
	JButton buttonminus = new JButton(" - ");
	JButton buttonpercentage = new JButton(" % ");
	
	JButton buttonequals = new JButton(" = ");
	JButton buttonreset = new JButton(" C ");
	JButton buttonbackspace = new JButton("CE");
	JButton buttondot = new JButton(" . ");
	
	void Design() {
		panel.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = 4;
		constraints.weightx = 1.0;
		constraints.weighty = 1.0;
		constraints.fill = GridBagConstraints.BOTH;
		panel.add(textfield, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.gridwidth = 1;
		panel.add(buttonreset, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 1;
		panel.add(buttonbackspace, constraints);
		
		constraints.gridx = 2;
		constraints.gridy = 1;
		panel.add(buttonpercentage, constraints);
		
		constraints.gridx = 3;
		constraints.gridy = 1;
		panel.add(buttonmulti, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.gridwidth = 1;
		constraints.fill = GridBagConstraints.BOTH;
		panel.add(button7, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 2;
		panel.add(button8, constraints);
		
		constraints.gridx = 2;
		constraints.gridy = 2;
		panel.add(button9, constraints);
		
		constraints.gridx = 3;
		constraints.gridy = 2;
		panel.add(buttondiv, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 3;
		panel.add(button4, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 3;
		panel.add(button5, constraints);
		
		constraints.gridx = 2;
		constraints.gridy = 3;
		panel.add(button6, constraints);
		
		constraints.gridx = 3;
		constraints.gridy = 3;
		panel.add(buttonminus, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 4;
		panel.add(button1, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 4;
		panel.add(button2, constraints);
		
		constraints.gridx = 2;
		constraints.gridy = 4;
		panel.add(button3, constraints);
		
		constraints.gridx = 3;
		constraints.gridy = 4;
		panel.add(buttonplus, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 5;
		constraints.gridwidth = 2;
		panel.add(button0, constraints);
		
		constraints.gridx = 2;
		constraints.gridy = 5;
		constraints.gridwidth = 1;
		panel.add(buttondot, constraints);
		
		constraints.gridx = 3;
		constraints.gridy = 5;
		panel.add(buttonequals, constraints);
		
		textfield.setEditable(false);
	}
	
	String TrimDecimalZero(String x) {
		String decimais;
		decimais = x.substring(x.indexOf(".") + 1);
		
		if(decimais.length() == 1 && decimais.contains("0")) {
			x = x.replace(".0", "");
			return x;
		} else {
			return x;
		}
	}
	
	void EnableOperacionalButtons(boolean x) {
		buttonplus.setEnabled(x);
		buttonminus.setEnabled(x);
		buttondiv.setEnabled(x);
		buttonmulti.setEnabled(x);
	}
	
	Float getSecondNumber(String x, String operation) {
		float secondnumber;
		int index = textfield.getText().indexOf(operation);
		if(containpercen ) {
			secondnumber = Float.parseFloat(textfield.getText().substring(index + 1).replace("%", ""));
		} else {
			secondnumber = Float.parseFloat(textfield.getText().substring(index + 1));
		}
		
		return secondnumber;
	}
	
	public void Logic() {
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textfield.setText(textfield.getText() + "0");
			}
		});
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textfield.setText(textfield.getText() + "1");
			}
		});
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textfield.setText(textfield.getText() + "2");
			}
		});
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textfield.setText(textfield.getText() + "3");
			}
		});
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textfield.setText(textfield.getText() + "4");
			}
		});
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textfield.setText(textfield.getText() + "5");
			}
		});
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textfield.setText(textfield.getText() + "6");
			}
		});
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textfield.setText(textfield.getText() + "7");
			}
		});
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textfield.setText(textfield.getText() + "8");
			}
		});
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textfield.setText(textfield.getText() + "9");
			}
		});
		
		buttonpercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				containpercen = true;
				textfield.setText(textfield.getText() + "%");
			}
		});
		buttonplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fplus = Float.parseFloat(textfield.getText());
				containplus = true;
				textfield.setText(textfield.getText() + "+");
				EnableOperacionalButtons(false);
			}
		});
		buttonminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fminus = Float.parseFloat(textfield.getText());
				containminus = true;
				textfield.setText(textfield.getText() + "-");
				EnableOperacionalButtons(false);
			}
		});
		buttondiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fdiv = Float.parseFloat(textfield.getText());
				containdiv = true;
				textfield.setText(textfield.getText() + "/");
				EnableOperacionalButtons(false);
			}
		});
		buttonmulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fmulti = Float.parseFloat(textfield.getText());
				containmulti = true;
				textfield.setText(textfield.getText() + "*");
				EnableOperacionalButtons(false);
			}
		});
		
		buttonreset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textfield.setText("");
				EnableOperacionalButtons(true);
			}
		});
		buttonbackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				backspace = textfield.getText().substring(0, textfield.getText().length() - 1);
				textfield.setText(backspace);
			}
		});
		buttondot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textfield.setText(textfield.getText() + ".");
			}
		});
		
		buttonequals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnableOperacionalButtons(true);
				
				if(containpercen) {
					if(containplus) {
						fpercen = fplus;
						spercen = getSecondNumber(textfield.getText(), "+");
						percentage = fpercen * (spercen/100);
						finalpercen = fpercen + percentage;
						textfield.setText(TrimDecimalZero(Float.toString(finalpercen)));
						containpercen = false;
						containplus = false;
					}
					if(containminus) {
						fpercen = fminus;
						spercen = getSecondNumber(textfield.getText(), "-");
						percentage = fpercen * (spercen/100);
						finalpercen = fpercen - percentage;
						textfield.setText(TrimDecimalZero(Float.toString(finalpercen)));
						containpercen = false;
						containminus = false;
					}
					if(containdiv) {
						fpercen = fdiv;
						spercen = getSecondNumber(textfield.getText(), "/");
						percentage = fpercen * (spercen/100);
						finalpercen = fpercen / percentage;
						textfield.setText(TrimDecimalZero(Float.toString(finalpercen)));
						containpercen = false;
						containdiv = false;
					}
					if(containmulti) {
						fpercen = fmulti;
						spercen = getSecondNumber(textfield.getText(), "*");
						percentage = fpercen * (spercen/100);
						finalpercen = fpercen * percentage;
						textfield.setText(TrimDecimalZero(Float.toString(finalpercen)));
						containpercen = false;
						containmulti = false;
					}
				}
				
				if(containpercen != true) {
					if(containplus) {
						splus = getSecondNumber(textfield.getText(), "+");
						finalplus = fplus + splus;
						textfield.setText(TrimDecimalZero(Float.toString(finalplus)));
						containplus = false;
					}
					if(containminus) {
						sminus = getSecondNumber(textfield.getText(), "-");
						finalminus = fminus - sminus;
						textfield.setText(TrimDecimalZero(Float.toString(finalminus)));
						containminus = false;
					}
					if(containdiv) {
						sdiv = getSecondNumber(textfield.getText(), "/");
						finaldiv = fdiv / sdiv;
						textfield.setText(TrimDecimalZero(Float.toString(finaldiv)));
						containdiv = false;
					}
					if(containmulti) {
						smulti = getSecondNumber(textfield.getText(), "*");
						finalmulti = fmulti * smulti;
						textfield.setText(TrimDecimalZero(Float.toString(finalmulti)));
						containmulti = false;
					}
				}
			}
		});
	}
	
	Calculadora() {
		Design();
		Logic();
		
		frame.add(panel);
		frame.setSize(300, 400);
		frame.setResizable(false);
		frame.setLocation(650, 250);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Calculadora();
	}
}
