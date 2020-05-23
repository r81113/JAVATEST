package 單例模式.行事曆;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Calendardemo {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		// Calendar是一個抽象類
		Calendar cal = Calendar.getInstance();

		System.out.println(cal.getClass());

		System.out.println(cal.getClass().getSuperclass());

		System.out.println("----------------------");

		// 使用日曆輸出當前時間
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DATE);

//		int hour = cal.get(Calendar.HOUR);//12
		int hour = cal.get(Calendar.HOUR_OF_DAY);// 24
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millonsecond = cal.get(Calendar.MILLISECOND);

		String strtime = String.format("%d-%02d-%02d%n%d:%d:%d:%s",

				year, month+1, day, hour, minute, second, millonsecond

		);
		
		System.out.println(strtime);

		System.out.println("----------------------");

		// 為日曆設時間
		cal.set(2020, (6 - 1), 21, 14, 28, 4);// 下面有用到!!

		Date date = cal.getTime();

		System.out.println(date.toString());

		System.out.println(date.toLocaleString());

		System.out.println("----------------------");

		// 日期格式化
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");

		String strDate = format.format(date);

		System.out.println(strDate);

		System.out.println("----------------------");

		// 將字串轉Date類
		Date newDate = format.parse("2013-12-23 23:59:59:999");

		System.out.println(newDate.toLocaleString());

		System.out.println("----------------------");

		// 設置另一個時間
		Calendar cal2 = new GregorianCalendar(2020, (5 - 1), 21);

		long diff = Math.abs(cal.getTimeInMillis() - cal2.getTimeInMillis());// 毫秒算時間

		int diffDay = (int) (diff / 1000 / 60 / 60 / 24);

		System.out.println("相差" + diffDay + "天");

		cal.add(Calendar.YEAR, 3);//加三年
		System.out.println(cal.get(Calendar.YEAR));

		System.out.println(cal.getActualMaximum(Calendar.YEAR));// 最大年份
		System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));// 當前月份
		System.out.println(cal.getActualMaximum(Calendar.DAY_OF_YEAR));// 一年有幾天

	}

}
