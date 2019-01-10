package test;


public class MainString {

	public static void main(String[] args) {

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
