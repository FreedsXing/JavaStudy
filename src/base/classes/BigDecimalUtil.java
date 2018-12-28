package base.classes;

import java.math.BigDecimal;

public class BigDecimalUtil {
	
	//除法的保留位数
	public static final int DEFAULT_DIV_SCALE = 2;

	public static double add(double num1, double num2) {
		
		BigDecimal n1 = BigDecimal.valueOf(num1);
		BigDecimal n2 = BigDecimal.valueOf(num2);
		
		return n1.add(n2).doubleValue();
	}
	
	public static double sub(double num1, double num2) {
		
		BigDecimal n1 = BigDecimal.valueOf(num1);
		BigDecimal n2 = BigDecimal.valueOf(num2);
		
		return n1.subtract(n2).doubleValue();
	}
	
	public static double mul(double num1, double num2) {
		
		BigDecimal n1 = BigDecimal.valueOf(num1);
		BigDecimal n2 = BigDecimal.valueOf(num2);
		
		return n1.multiply(n2).doubleValue();
	}
	
	public static double div(double num1, double num2) {
		
		BigDecimal n1 = BigDecimal.valueOf(num1);
		BigDecimal n2 = BigDecimal.valueOf(num2);
		
		return n1.divide(n2, DEFAULT_DIV_SCALE, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
}
