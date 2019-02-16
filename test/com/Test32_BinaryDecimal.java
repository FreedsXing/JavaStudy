package com;

import com.BinaryDecimalUtil;

public class Test32_BinaryDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 12;
		System.out.println("---num=" + BinaryDecimalUtil.DecimalToBinary(num1));
		
		System.out.println("---num3=" + DecimalTo(1.255552, 5));
		
		double num11 = 0.05;
		double num12 = 0.01;
		System.out.println("---------num11 + num12 =" + (num11 + num12));
		System.out.println("---------num11 + num11 =" + (num11 + num11));
		System.out.println("---------num11=" + num11);
		System.out.println("---------num12=" +  num12);

	}

	
	public static String DecimalTo(double dec, int len) {
		String num = "";
		
		while(num.length() <= len) {
			num = Double.parseDouble((dec * 2 % 10 + "").substring(1)) + num;
		}
		return num;
	}
	
}
