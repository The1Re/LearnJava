package lesson10;

import java.awt.event.*;
import java.util.Stack;
import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	private final Font font = new Font("FiraCode", Font.BOLD, 18);
	private final String defaultText = "0";
	private JTextField display;
	private JPanel btnPanel;;
	private JButton[] numBtn = new JButton[10];
	private JButton cBtn, ceBtn, backspaceBtn, divideBtn, multiplyBtn, plusBtn, minusBtn, equalBtn, dotBtn, modBtn;
	private Stack<String> stack = new Stack<>();
//	private String lastAction;
	
	public Calculator() {
		setTitle("Calculator");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,400);
		setResizable(false);
		addComponents();
		setVisible(true);
	}
	
	private void addComponents() {
		display = new JTextField(defaultText);
		display.setFont(font);
		display.setPreferredSize(new Dimension(getWidth(), 60));
		display.setHorizontalAlignment(JTextField.RIGHT);
		display.setEnabled(false);
		
		createBtn();
		btnPanel = new JPanel(new GridLayout(5, 4, 2, 2));
		
		btnPanel.add(cBtn);
		btnPanel.add(ceBtn);
		btnPanel.add(backspaceBtn);
		btnPanel.add(divideBtn);
		
		btnPanel.add(numBtn[7]);
		btnPanel.add(numBtn[8]);
		btnPanel.add(numBtn[9]);
		btnPanel.add(multiplyBtn);
		
		btnPanel.add(numBtn[4]);
		btnPanel.add(numBtn[5]);
		btnPanel.add(numBtn[6]);
		btnPanel.add(plusBtn);
		
		btnPanel.add(numBtn[1]);
		btnPanel.add(numBtn[2]);
		btnPanel.add(numBtn[3]);
		btnPanel.add(minusBtn);
		
		btnPanel.add(modBtn);
		btnPanel.add(numBtn[0]);
		btnPanel.add(dotBtn);
		btnPanel.add(equalBtn);
		
		getContentPane().add(display, BorderLayout.NORTH);
		getContentPane().add(btnPanel, BorderLayout.CENTER);
	}
	
	private JButton getBtn(String text) {
		JButton btn = new JButton(text);
		btn.setFont(font);
		btn.setFocusable(false);
		btn.addActionListener(this);
		return btn;
	}
	
	private void createBtn() {
		for (int i=0; i<10; i++)
			numBtn[i] = getBtn(Integer.toString(i));
		cBtn = getBtn("C");
		ceBtn = getBtn("CE");
		backspaceBtn = getBtn("<-");
		divideBtn = getBtn("/");
		multiplyBtn = getBtn("*");
		plusBtn = getBtn("+");
		minusBtn = getBtn("-");
		equalBtn = getBtn("=");
		dotBtn = getBtn(".");
		modBtn = getBtn("%");
	}
	
	private double operation(char op, double x, double y) {
		switch (op) {
		case '+' : return x+y;
		case '-' : return x-y;
		case '*' : return x*y;
		case '/' : return x/y;
		case '%' : return x%y;
		}
		return -1;
	}
	
	private void calculate() {
		char op;
		double num1, num2, result;
		String text = display.getText();
		
		if (stack.empty())
			return;
		
		op = stack.pop().charAt(0);
		num1 = Double.parseDouble(stack.pop());
		num2 = Double.parseDouble(text);
		result = operation(op, num1, num2);
		stack.push(text);
		stack.push(op + "");
		if (result % 1 == 0)
			display.setText((int)result + "");
		else
			display.setText(result + "");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		String text = display.getText();
		if (btn == equalBtn) {
			calculate();
		}
		else if (btn.getText().matches("[0-9]"))
			display.setText( (text.equals(defaultText) ? "" : text) + btn.getText());
		else if (btn.getText().matches("[+,-,*,/,%]")) {
			if (Character.isDigit(text.charAt(text.length()-1))) {
				stack.push(text);
				display.setText(defaultText);
			}else {
				stack.pop();
			}
			stack.push(btn.getText());
		}else if (btn == cBtn || btn == ceBtn) {
			display.setText(defaultText);
			if (btn == cBtn)
				stack.removeAllElements();
		}else if (btn == backspaceBtn)
			display.setText((text.length() == 1) ? defaultText : text.substring(0, text.length()-1));
		else if (btn == dotBtn && text.indexOf('.') == -1)
			display.setText(text + btn.getText());
		
	}
	
	public static void main(String[] args) {
		new Calculator();
	}
	
}
