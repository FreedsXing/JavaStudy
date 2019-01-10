package com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	
	//常用方法：
	//1.str转化为短日期格式
	//2.date短格式转化为字符串
	//3.get N天后的日期
	//4.get截止到某天的天数
	//5.get两个日期间天数
	//6.is判断是否是闰年
	//7. 毫秒转化为多久以前 ---英豪项目
	//8. 日期转化为多久以前 ---英豪项目
	
	/**
	 * 将字符串转化为短日期格式Date
	 * @param date
	 * @return
	 */
	public static String dateToStr(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(date);
	}
	
	
	/**
	 * 将短时间格式字符串转换为时间 yyyy-MM-dd
	 */
	public static Date strToDate(String str) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			 date = sdf.parse(sdf.format(sdf.parse(str)));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return date;
	}
	
	
	/**
	 * 	获得N天后的日期
	 * @param daysAfter
	 * @return N天后日期
	 */
	public static String getDateAfterSomeDays(int daysAfter) {
		
		Calendar cal = Calendar.getInstance();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		cal.add(Calendar.DATE, daysAfter);
		
		return sdf.format(cal.getTime());
	}
	
	
	/**
	 * 获得截止某日期的天数
	 * @param date
	 * @return days
	 */
	public static int getDaysUntilSomeDate(Date date) {
		
		if (date == null || date.equals(""))
			return 0;
		
		long timeCurrent = System.currentTimeMillis();
				
	    long days = (date.getTime() - timeCurrent) / 1000 / 3600 / 24;
		
		return (int) days;
	}
	
	/**
	 * 两个时间之间的天数
	 *
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static long getDaysBetweenTwoDates(String date1, String date2) {
		if (date1 == null || date1.equals(""))
			return 0;
		if (date2 == null || date2.equals(""))
			return 0;
		// 转换为标准时间
		SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date = null;
		java.util.Date mydate = null;
		try {
			date = myFormatter.parse(date1);
			mydate = myFormatter.parse(date2);
		} catch (Exception e) {
		}
		long day = (date.getTime() - mydate.getTime()) / (24 * 60 * 60 * 1000);
		return day;
	}
	
	
	/**
	 * 判断是否是闰年
	 * 
	 * @param year 年
	 * @return 是否
	 */
	public static boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}
	
	

	/**
	 * 毫秒转化为 Spell前      案例：20954659845 To 5分钟前 
	 * @param spellMillisecond
	 * @return
	 */
    public static String millisecondToSpell(long spellMillisecond){
        if (spellMillisecond != 0){

            long to = System.currentTimeMillis();

            String desc = "--";
            long time = to - spellMillisecond;

            if (time < 10 * 60 * 1000) {
                desc = "刚刚";
            }
            else if (time < 60 * 60 * 1000) {
                desc =(time / (60 * 1000)) + "分钟前";
            }
            else if (time < 24 * 60 * 60 * 1000) {
                desc = (time / (60 * 60 * 1000)) + "小时前";
            }
            else if (time < (long)30 * 24 * 60 * 60 * 1000) {
                desc = (time / (24 * 60 * 60 * 1000)) + "天前";
            }
            else if (time < (long)30 * 24 * 60 * 60 * 1000 * 12) {
                desc = (time / ((long)24 * 60 * 60 * 1000 * 30)) + "月前";
            }
            else {
                desc = (time /( (long)24 * 60 * 60 * 1000 * 30 * 12)) + "年前";
            }
            return desc;

        }else {
            return null;
        }
    }


 
    /**
           * 日期 转化为 Spell前      案例：2018-05-21 08:19:54 To 5分钟前
     * @param startDate
     * @return
     */
    public static String dateToSpell(String startDate){

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long from = 0;

        if (startDate != null && !"".equals(startDate)){
            try {
                from = df.parse(startDate).getTime();
            } catch (ParseException e) {
                e.printStackTrace();
            }

            long to = System.currentTimeMillis();

            String desc = "--";
            long time = to - from;

            if (time < 10 * 60 * 1000) {
                desc = "刚刚";
            }
            else if (time < 60 * 60 * 1000) {
                desc =(time / (60 * 1000)) + "分钟前";
            }
            else if (time < 24 * 60 * 60 * 1000) {
                desc = (time / (60 * 60 * 1000)) + "小时前";
            }
            else if (time < (long)30 * 24 * 60 * 60 * 1000) {
                desc = (time / (24 * 60 * 60 * 1000)) + "天前";
            }
            else if (time < (long)30 * 24 * 60 * 60 * 1000 * 12) {
                desc = (time / ((long)24 * 60 * 60 * 1000 * 30)) + "月前";
            }
            else {
                desc = (time /( (long)24 * 60 * 60 * 1000 * 30 * 12)) + "年前";
            }
            return desc;

        }else {
            return null;
        }

    }
}
