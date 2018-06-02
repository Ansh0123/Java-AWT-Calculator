package com.basics;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import javax.swing.JComboBox;
import javax.swing.JPanel;

import com.util.AWTLayoutUtility;
import com.util.AWTUtility;

/**
 * 
 * @author Ashutosh K. Further Enhancement to use postfix calculation to perform
 *         multiple operation in one go. On going development showing history of
 *         the calculations and building scientific calculator.
 *
 */

public class Calculator {

	public static void main(String args[]) {
		Frame calcFrame = AWTUtility.getFrame("Calculator");
		AWTLayoutUtility.flowLayoutLeft(calcFrame);
		AWTLayoutUtility.setBackgroundColor(calcFrame, Color.white);
		AWTLayoutUtility.setSize(calcFrame, 500, 500);

		JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		AWTUtility.setBounds(panel, 18, 45, 120, 25);
		panel.setBackground(Color.orange);
		AWTUtility.setFontSize(panel, 20);
		String[] choices = { " Options", "Converter", "Scientific Calculator" };
		final JComboBox<String> cb = new JComboBox<String>(choices);
		cb.setVisible(true);
		AWTUtility.setFontSize(cb, 16);
		panel.add(cb);
		calcFrame.add(panel);

		// History button
		Button history = AWTUtility.getButton("History");
		AWTUtility.setBounds(history, 370, 45, 110, 25);
		AWTUtility.add(calcFrame, history);
		history.setBackground(Color.orange);
		AWTUtility.setFontSize(history, 20);

		// inputBox Read Only
		TextField input = AWTUtility.getTextField();
		AWTUtility.setBounds(input, 20, 70, 460, 50);
		AWTUtility.add(calcFrame, input);
		input.setFont(new Font("14", Font.BOLD, 25));
		input.setForeground(Color.BLACK);
		input.setEditable(false);

		// buttons for numbers with actionListener
		Button btn1 = AWTUtility.getButton("1");
		AWTUtility.setBounds(btn1, 40, 150, 60, 60);
		AWTUtility.add(calcFrame, btn1);
		AWTUtility.setFontSize(btn1, 28);
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg) {
				String str = input.getText();
				str += String.valueOf('1');
				input.setText(str);
			}
		});

		Button btn2 = AWTUtility.getButton("2");
		AWTUtility.setBounds(btn2, 120, 150, 60, 60);
		AWTUtility.add(calcFrame, btn2);
		AWTUtility.setFontSize(btn2, 28);
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg) {
				String str = input.getText();
				str += String.valueOf('2');
				input.setText(str);
			}
		});

		Button btn3 = AWTUtility.getButton("3");
		AWTUtility.setBounds(btn3, 200, 150, 60, 60);
		AWTUtility.add(calcFrame, btn3);
		AWTUtility.setFontSize(btn3, 28);
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg) {
				String str = input.getText();
				str += String.valueOf('3');
				input.setText(str);
			}
		});

		Button btn4 = AWTUtility.getButton("4");
		AWTUtility.setBounds(btn4, 40, 230, 60, 60);
		AWTUtility.add(calcFrame, btn4);
		AWTUtility.setFontSize(btn4, 28);
		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg) {
				String str = input.getText();
				str += String.valueOf('4');
				input.setText(str);
			}
		});

		Button btn5 = AWTUtility.getButton("5");
		AWTUtility.setBounds(btn5, 120, 230, 60, 60);
		AWTUtility.add(calcFrame, btn5);
		AWTUtility.setFontSize(btn5, 28);
		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg) {
				String str = input.getText();
				str += String.valueOf('5');
				input.setText(str);
			}
		});

		Button btn6 = AWTUtility.getButton("6");
		AWTUtility.setBounds(btn6, 200, 230, 60, 60);
		AWTUtility.add(calcFrame, btn6);
		AWTUtility.setFontSize(btn6, 28);
		btn6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg) {
				String str = input.getText();
				str += String.valueOf('6');
				input.setText(str);
			}
		});

		Button btn7 = AWTUtility.getButton("7");
		AWTUtility.setBounds(btn7, 40, 310, 60, 60);
		AWTUtility.add(calcFrame, btn7);
		AWTUtility.setFontSize(btn7, 28);
		btn7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg) {
				String str = input.getText();
				str += String.valueOf('7');
				input.setText(str);
			}
		});

		Button btn8 = AWTUtility.getButton("8");
		AWTUtility.setBounds(btn8, 120, 310, 60, 60);
		AWTUtility.add(calcFrame, btn8);
		AWTUtility.setFontSize(btn8, 28);
		btn8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg) {
				String str = input.getText();
				str += String.valueOf('8');
				input.setText(str);
			}
		});

		Button btn9 = AWTUtility.getButton("9");
		AWTUtility.setBounds(btn9, 200, 310, 60, 60);
		AWTUtility.add(calcFrame, btn9);
		AWTUtility.setFontSize(btn9, 28);
		btn9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg) {
				String str = input.getText();
				str += String.valueOf('9');
				input.setText(str);
			}
		});

		Button btn0 = AWTUtility.getButton("0");
		AWTUtility.setBounds(btn0, 120, 390, 60, 60);
		AWTUtility.add(calcFrame, btn0);
		AWTUtility.setFontSize(btn0, 28);
		btn0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg) {
				String str = input.getText();
				str += String.valueOf('0');
				input.setText(str);
			}
		});

		Button btnDot = AWTUtility.getButton(".");
		AWTUtility.setBounds(btnDot, 200, 390, 60, 60);
		AWTUtility.add(calcFrame, btnDot);
		AWTUtility.setFontSize(btnDot, 32);
		btnDot.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg) {
				String str = input.getText();
				str += String.valueOf('.');
				input.setText(str);
			}
		});

		Button btnBack = AWTUtility.getButton("<-");
		AWTUtility.setBounds(btnBack, 40, 390, 60, 60);
		AWTUtility.add(calcFrame, btnBack);
		AWTUtility.setFontSize(btnBack, 32);
		btnBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				StringBuilder str = new StringBuilder(input.getText());
				if (str.length() >= 1) {
					str.deleteCharAt(str.length() - 1);
				}
				input.setText(str.toString());
			}
		});
		// Basic operation performed
		Button add = AWTUtility.getButton("+");
		AWTUtility.setBounds(add, 300, 150, 75, 60);
		AWTUtility.add(calcFrame, add);
		AWTUtility.setFontSize(add, 32);
		add.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg) {
				if (AWTUtility.nextCalIsNeeded(input.getText())) {
					input.setText(input.getText().split("=")[1].trim());
				}
				String str = input.getText();
				str += " + ";
				input.setText(str);
			}
		});

		Button sub = AWTUtility.getButton("-");
		AWTUtility.setBounds(sub, 390, 150, 75, 60);
		AWTUtility.add(calcFrame, sub);
		AWTUtility.setFontSize(sub, 32);
		sub.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg) {
				if (AWTUtility.nextCalIsNeeded(input.getText())) {
					input.setText(input.getText().split("=")[1].trim());
				}
				String str = input.getText();
				str += " - ";
				input.setText(str);
			}
		});

		Button mul = AWTUtility.getButton("*");
		AWTUtility.setBounds(mul, 300, 230, 75, 60);
		AWTUtility.add(calcFrame, mul);
		AWTUtility.setFontSize(mul, 32);
		mul.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg) {
				if (AWTUtility.nextCalIsNeeded(input.getText())) {
					input.setText(input.getText().split("=")[1].trim());
				}
				String str = input.getText();
				str += " * ";
				input.setText(str);
			}
		});

		Button div = AWTUtility.getButton("/");
		AWTUtility.setBounds(div, 390, 230, 75, 60);
		AWTUtility.add(calcFrame, div);
		AWTUtility.setFontSize(div, 32);
		div.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg) {
				if (AWTUtility.nextCalIsNeeded(input.getText())) {
					input.setText(input.getText().split("=")[1].trim());
				}
				String str = input.getText();
				str += " / ";
				input.setText(str);
			}
		});

		Button pow = AWTUtility.getButton("pow");
		AWTUtility.setBounds(pow, 300, 310, 75, 60);
		AWTUtility.add(calcFrame, pow);
		AWTUtility.setFontSize(pow, 28);
		pow.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg) {
				if (AWTUtility.nextCalIsNeeded(input.getText())) {
					input.setText(input.getText().split("=")[1].trim());
				}
				String str = input.getText();
				str += " ^ ";
				input.setText(str);
			}
		});

		Button inv = AWTUtility.getButton("1/x");
		AWTUtility.setBounds(inv, 390, 310, 75, 60);
		AWTUtility.add(calcFrame, inv);
		AWTUtility.setFontSize(inv, 32);
		inv.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg) {
				if (AWTUtility.nextCalIsNeeded(input.getText())) {
					input.setText(input.getText().split("=")[1].trim());
				}
				String str = input.getText();
				str = " 1 / " + str;
				input.setText(str);
			}
		});

		Button clr = AWTUtility.getButton("clr");
		AWTUtility.setBounds(clr, 390, 390, 75, 60);
		AWTUtility.add(calcFrame, clr);
		AWTUtility.setFontSize(clr, 28);
		clr.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg) {
				input.setText("");
			}
		});

		Button calculate = AWTUtility.getButton("=");
		AWTUtility.setBounds(calculate, 300, 390, 75, 60);
		AWTUtility.add(calcFrame, calculate);
		AWTUtility.setFontSize(calculate, 32);
		calculate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String finalStr = input.getText();
				String res = "";
				boolean add = finalStr.contains("+");
				if (add) {
					String[] arr = finalStr.split("\\+");
					BigDecimal bd1 = new BigDecimal(arr[0].trim());
					BigDecimal bd2 = new BigDecimal(arr[1].trim());
					res = AWTUtility.calculate('+', bd1, bd2);
				}

				boolean sub = finalStr.contains("-");
				if (sub) {
					String[] arr = finalStr.split("\\-");
					BigDecimal bd1 = new BigDecimal(arr[0].trim());
					BigDecimal bd2 = new BigDecimal(arr[1].trim());
					res = AWTUtility.calculate('-', bd1, bd2);
				}

				boolean mul = finalStr.contains("*");
				if (mul) {
					String[] arr = finalStr.split("\\*");
					BigDecimal bd1 = new BigDecimal(arr[0].trim());
					BigDecimal bd2 = new BigDecimal(arr[1].trim());
					res = AWTUtility.calculate('X', bd1, bd2);
				}

				boolean div = finalStr.contains("/");
				if (div) {
					String[] arr = finalStr.split("/");
					BigDecimal bd1 = new BigDecimal(arr[0].trim());
					BigDecimal bd2 = new BigDecimal(arr[1].trim());
					res = AWTUtility.calculate('/', bd1, bd2);
				}

				boolean pow = finalStr.contains("^");
				if (pow) {
					String[] arr = finalStr.split("\\^");
					BigDecimal bd1 = new BigDecimal(arr[0].trim());
					BigDecimal bd2 = new BigDecimal(arr[1].trim());
					res = AWTUtility.calculate('^', bd1, bd2);
				}

				input.setText(finalStr + " = " + res.toString());
			}

		});

		calcFrame.add(calculate);
		calcFrame.setLayout(null);
		calcFrame.setVisible(true);
		AWTUtility.closeWindow(calcFrame);
	}

}
