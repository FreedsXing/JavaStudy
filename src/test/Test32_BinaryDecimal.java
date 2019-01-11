package test;

import com.BinaryDecimalUtil;

public class Test32_BinaryDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 12;
		System.out.println("---num=" + BinaryDecimalUtil.DecimalToBinary(num1));
		
		System.out.println("---num3=" + DecimalTo(1.255552, 5));
	}

	
	public static String DecimalTo(double dec, int len) {
		String num = "";
		
		while(num.length() <= len) {
			num = Double.parseDouble((dec * 2 % 10 + "").substring(1)) + num;
		}
		return num;
	}
	
}
