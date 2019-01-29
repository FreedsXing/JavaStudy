package com;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test22_Date {
	public static void main(String[] args) throws ParseException {
		//测试时间工具类方法
		testDateUtil();
	}
	
	private static void testDateUtil() throws ParseException {
		
		//格林尼治时间格式 : Wed Jan 09 13:33:30 CST 2019
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");											
		
		Calendar cal = Calendar.getInstance();
		System.out.println("获取当前时间(毫秒数)：" + cal.getTimeInMillis());
		System.out.println("获取当前时间(毫秒数)：" + System.currentTimeMillis());
		System.out.println("获取当前时间(格林尼治时间格式)：" + cal.getTime());
		//System.out.println("获取当前时区：" + cal.getTimeZone());

		System.out.println("获取今天的时间(Date:格林尼治格式)：" + cal.getTime());
		System.out.println("获取今天的时间(预设格式)：" + sdf.format(cal.getTime()));

		cal.add(Calendar.DAY_OF_MONTH, 2);
		cal.set(Calendar.HOUR_OF_DAY, 20);
		//cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		System.out.println("得到今天的某个时间点：" + cal.getTime());

		
		Date date = new Date(); 
		//System.out.println("Date: " + date + ", 字符串格式：" + date.toString());
		System.out.println("格式化时间： " + sdf.format(date));
		
		long timeCurrent = System.currentTimeMillis();
		System.out.println("当前日期：" + new Date(timeCurrent));
		System.out.println("当前日期, 格式化时间： " + sdf.format(date));
		System.out.println("当前日期, 100秒后时间： " + sdf.format(new Date(timeCurrent + 1000 * 100)));
		
		//System.out.println("Date转换为日期Str: " + DateUtil.dateToStr(date));
		//此处更改为长日期格式会报Parse错误
		//System.out.println("Str转换为日期格式Date: " + DateUtil.strToDate("2019-01-15"));
		
		//System.out.println("获取N天后的日期： " + DateUtil.getDateAfterSomeDays(1));
		//System.out.println("获取截止某日期的天数： " + DateUtil.getDaysUntilSomeDate(DateUtil.strToDate("2019-05-05")));
	}  
	
}
