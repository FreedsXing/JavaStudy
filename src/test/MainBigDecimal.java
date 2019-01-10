package test;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import com.util.BigDecimalUtil;


public class MainBigDecimal {

	public static void main(String[] args) {
	
		//练习BigDecimal相关使用
		//demoBigDecimal();
	}

	//BigDecimal常用方法
	//1.加减乘除
	//2.保留小数位
	//3.格式化
	public static void demoBigDecimal() {
		//1.加减乘除	
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
			
		
		//2.保留小数位  
		System.out.println("保留两位小数：" + new BigDecimal("1.235").setScale(2, RoundingMode.HALF_UP));
		
		
		//数值格式化类
		DecimalFormat df = new DecimalFormat("0.00");
		
		double num4 = 0.05;
		double num5 = 0.01;
		System.out.println("0.05 + 0.01 = " + BigDecimalUtil.add(num4, num5));
		System.out.println("0.05 - 0.01 = " + BigDecimalUtil.sub(num4, num5));
		System.out.println("0.05 * 0.01 = " + df.format(BigDecimalUtil.mul(num4, num5)));
		System.out.println("0.05 / 0.01 = " + BigDecimalUtil.div(num4, num5));
	
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

		
		//compareTo方法
		BigDecimal num11  = new BigDecimal("1.2");
		BigDecimal num12  = new BigDecimal("1.20");
		System.out.println("num1 与 num2比较：" + num11.compareTo(num12));
	}
}
