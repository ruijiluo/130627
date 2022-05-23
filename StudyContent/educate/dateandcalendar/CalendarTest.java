package educate.dateandcalendar;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        //获取系统时间
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DATE);
        int hour = c.get(Calendar.HOUR);
        int min = c.get(Calendar.MINUTE);
        int sce = c.get(Calendar.SECOND);
        System.out.print("现在时间是:");
        if (min < 10)
            System.out.println("" + year + "年" + (month + 1) + "月" + day + "日" + hour + "时" + "0" + min + "分" + sce + "秒");
        else
            System.out.println("" + year + "年" + (month + 1) + "月" + day + "日" + hour + "时" + min + "分" + sce + "秒");
        System.out.println("--------------------------");
        //设置时间
        Calendar c1 = Calendar.getInstance();
        c1.set(2021,5-1,1);  //设置时间2021年5月1日
        int year1 = c1.get(Calendar.YEAR);
        int month1 = c1.get(Calendar.MONTH);
        int day1 = c1.get(Calendar.DATE);
        System.out.print("修改后的时间: ");
        System.out.println(year1 +"年"+(month1+1)+"月"+day1 +"日");
        /////测试相差天数
        Calendar c2 = Calendar.getInstance();
        c2.set(2021,4,3);   //设置时间2021年5月3日,Java中月份为0-11
        long oldDay = c2.getTimeInMillis();
        Calendar c3 = Calendar.getInstance();
        long newday = c3.getTimeInMillis();
        long DAY = (newday - oldDay) / (24*60*60*1000);
        System.out.println("相差天数: "+DAY);
    }
}
