package Demo12_DateTime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DemoDate {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();

        // 内部重写toString方法，返回时间字符串
        System.out.println(date); // Mon Jan 04 10:21:06 CST 2021
        // 返回毫秒时间戳
        System.out.println(date.getTime()); // 1609726866424

        // 格式化日期，转换字符串
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = df.format(date);
        System.out.println(dateStr); // 2021-01-04 10:21:06

        // 时间字符串转换成Date()
        Date date1 = df.parse(dateStr);
        System.out.println(date1); // Mon Jan 04 10:21:06 CST 2021


        Calendar cal = Calendar.getInstance();

        // get 方法
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "年" + month + "月" + day + "日"); // 2021年1月4日

        // set方法
        cal.set(Calendar.YEAR,2020);
        year = cal.get(Calendar.YEAR);
        System.out.println(year + "年" + month + "月" + day + "日"); // 2020年1月4日

        // add方法,若设置负值则减去对应时间
        cal.add(Calendar.MONTH,-1);
        month = cal.get(Calendar.MONTH) + 1;
        System.out.println(year + "年" + month + "月" + day + "日"); // 2020年12月4日

        // getTime方法
        Date date2 = cal.getTime();
        System.out.println(date2); // Wed Dec 04 10:28:56 CST 2019
    }
}
