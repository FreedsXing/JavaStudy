package com;

public class Test21_String {

	public static void main(String[] args) {
		
		String city = "beijing";
		
		System.out.println("获得第一次出现字符i的位置：" + city.indexOf('i'));
		System.out.println("获得第4个位置的字符：" + city.charAt(4));
		System.out.println("获得字符传长度：" + city.length());
		System.out.println("截取字符串第2到第3位置字符：" + city.substring(2, 4));
		System.out.println("取出str两端空格等字符：" + "          beijing".trim());
		System.out.println("输出字符串全部小写：" + "BeijIng".toLowerCase());
		System.out.println("输出字符串全部大写：" + city.toUpperCase());
		
		System.out.println("判断字符串是否以jing开头：" + city.endsWith("jing"));
		System.out.println("判断字符串是否包含jin：" + city.contains("jin"));
		System.out.println("字符串匹配规则" + city.matches("[b][ing]\\c{5}"));
		String citysStr = "bei shanghai  nan";
		String [] cityArray = citysStr.split("i");
		for(String part : cityArray) {
			System.out.println("字符根据字符i分割：第N部分：" +part);
		}

		//不能
		String num = "11112.55667.555555";
		String [] nums = num.split(".");
		for(String part : nums) {
			System.out.println("字符根据字符.分割：第N部分：" +part);
		}
		
		
		//比较三种Java判断字符串是否为null的效率
		compareStrNullJudgeEfficency();
	}
	
	

	private static void compareStrNullJudgeEfficency() {
		test1("xing", 1000000);
		test2("xing", 1000000);
		test3("xing", 1000000);
	}

	public static void test1(String s, int n) {
		long startTime = System.currentTimeMillis();

		for (long i = 0; i < n; i++) {
			if (s == null || s.equals(""));
		}
		long endTime = System.currentTimeMillis();

		System.out.println("test 1 use time: " + (endTime - startTime) + "ms");
	}

	public static void test2(String s, int n) {
		long startTime = System.currentTimeMillis();

		for (long i = 0; i < n; i++) {
			if (s == null || s.length() <= 0);
		}
		long endTime = System.currentTimeMillis();

		System.out.println("test 2 use time: " + (endTime - startTime) + "ms");

	}

	public static void test3(String s, int n) {
		long startTime = System.currentTimeMillis();

		for (long i = 0; i < n; i++) {
			if (s == null || s.isEmpty());
		}
		long endTime = System.currentTimeMillis();

		System.out.println("test 3 use time: " + (endTime - startTime) + "ms");

		} 

}
