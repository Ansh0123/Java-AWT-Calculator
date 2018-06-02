package com.util;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

public class AWTLayoutUtility {

	public static void flowLayoutLeft(Frame frame) {
		frame.setLayout(new FlowLayout(FlowLayout.LEFT));
	}

	public static void flowLayoutRight(Frame frame) {
		frame.setLayout(new FlowLayout(FlowLayout.RIGHT));
	}

	public static void setBackgroundColor(Frame frame, Color clr) {
		frame.setBackground(clr);
	}

	public static void setSize(Frame frame, int x, int y) {
		frame.setSize(x, y);
	}
}
