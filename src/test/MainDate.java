package test;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.DateUtil;

public class MainDate {
	public static void main(String[] args) {

		//测试时间工具类方法
		testDateUtil();
	}
	
	private static void testDateUtil() {
		Date date = new Date(); //该格式为格林尼治时间格式 : Wed Jan 09 13:33:30 CST 2019
		System.out.println("Date: " + date);
		System.out.println("time: " + date.toString());
		System.out.println("格式化时间： " + new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss").format(date));
		
		System.out.println("Date转换为短日期Str: " + DateUtil.dateToStr(date));
		System.out.println("Str转换为短日期格式Date: " + DateUtil.strToDate("2019-11-11"));
		
		System.out.println("获取N天后的日期： " + DateUtil.getDateAfterSomeDays(-1));
		System.out.println("获取截止某日期的天数： " + DateUtil.getDaysUntilSomeDate(DateUtil.strToDate("2019-05-05")));
	}
}
