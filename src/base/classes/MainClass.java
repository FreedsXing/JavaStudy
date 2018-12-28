package base.classes;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class MainClass {

	public static void main(String[] args) {
	
		//demoBigDecimal();
		demoDecimalFormat();
	}

	//数值类型的格式显示
	public static void demoDecimalFormat() {
		
		 final double PI = 3.1415926;
		 System.out.println("---保留一位小数---" + new DecimalFormat("0.0").format(PI));
		 System.out.println("---整数位补齐---" + new DecimalFormat("00.00").format(PI));
		System.out.println("---保留整数---" + new DecimalFormat("#").format(PI));
		System.out.println("---保留两位小数---" + new DecimalFormat("##.##").format(PI));
		System.out.println("---整数位补齐---" + new DecimalFormat("00.##").format(PI));
		System.out.println("---百分比---" + new DecimalFormat("#.##%").format(PI));
		
		double c=299792458.357678;//光速  
		System.out.println("---科学计数法小数保留5位---" + new DecimalFormat("#.#####E0").format(c));
		System.out.println("---科学计数法整数2位，小数3位---" + new DecimalFormat("00.###E0").format(c));
		System.out.println("---每隔三位加逗号---" + new DecimalFormat(", ###").format(c));
		System.out.println("---添加字符串---" + new DecimalFormat("光每秒的速度为,###.###米").format(c));

	}
	
	
	//BigDecimal常用方法
	public static void demoBigDecimal() {
		
		//1.加减乘除
		//2.保留小数位
		//3.格式化
		
		BigDecimal num1 = BigDecimal.valueOf(0.05);
		BigDecimal num2 = new BigDecimal("0.01");
		BigDecimal num3 = new BigDecimal(0.01);

		System.out.println("0.05 + 0.01 = " + num1.add(num2));
		System.out.println("0.05 - 0.01 = " + num1.subtract(num2));
		System.out.println("0.05 * 0.01 = " + num1.multiply(num2));
		System.out.println("0.05 / 0.01 = " + num1.divide(num2));

		System.out.println("0.05 + 0.01 = " + num1.add(num3).setScale(2, BigDecimal.ROUND_HALF_UP));
		System.out.println("0.05 - 0.01 = " + num1.subtract(num3));
		System.out.println("0.05 * 0.01 = " + num1.multiply(num3));
		//System.out.println("0.05 / 0.01 = " + num1.divide(num3));
		
		
		//数值格式化类
		DecimalFormat df = new DecimalFormat("0.00");
		
		
		double num4 = 0.05;
		double num5 = 0.01;
		System.out.println("0.05 + 0.01 = " + BigDecimalUtil.add(num4, num5));
		System.out.println("0.05 - 0.01 = " + BigDecimalUtil.sub(num4, num5));
		System.out.println("0.05 * 0.01 = " + df.format(BigDecimalUtil.mul(num4, num5)));
		System.out.println("0.05 / 0.01 = " + BigDecimalUtil.div(num4, num5));
		
		
		
		
		
		
	}
}
