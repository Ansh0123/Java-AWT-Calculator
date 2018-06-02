package com.util;

import java.awt.Button;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class AWTUtility {

	public static Frame getFrame(String id) {
		return new Frame(id);
	}

	public static void add(Frame frame, Component comp) {
		frame.add(comp);
	}

	public static Button getButton(String id) {
		return new Button(id);
	}

	public static TextField getTextField() {
		return new TextField();
	}

	public static TextArea getTextArea() {
		return new TextArea(10, 8);
	}

	public static void setBounds(Component comp, int x, int y, int width, int height) {
		comp.setBounds(x, y, width, height);
	}

	public static void closeWindow(Frame frame) {
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

	// By default BOLD
	public static void setFontSize(Component comp, int fontSize) {
		comp.setFont(new Font("font", Font.PLAIN, fontSize));
	}

	public static String calculate(char x, BigDecimal a, BigDecimal b) {
		switch (x) {
		case '+':
			return a.add(b).toString();
		case '-':
			return a.subtract(b).toString();
		case 'X':
			return a.multiply(b).toString();
		case '/':
			return a.divide(b, 3, RoundingMode.HALF_UP).toString();
		case '^':
			return a.pow(Integer.valueOf(String.valueOf(b))).toString();
		default:
			return "";
		}
	}

	public static Boolean nextCalIsNeeded(String input) {
		return input.contains("=");
	}

}
