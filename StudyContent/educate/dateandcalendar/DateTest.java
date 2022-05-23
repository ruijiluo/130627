package educate.dateandcalendar;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        //直接空参创建对象，分配对象并对其进行初始化，以便它表示分配对象的时间，以最接近的毫秒为单位。
        Date date = new Date();
        System.out.println(date);
        //获取自 1970 年 1 月 1 日 00：00：00 GMT 以来的毫秒
        long time  =date.getTime();
        System.out.println(time);
        //放入毫秒值设定指定的时间
        Date date1 = new Date(1651585858508L);
        System.out.println(date1);
        //格式化输出
        Date nowTime = new Date();
        String s =String.format("%tY年%tm月%td日%tH时%tM分%tS秒",nowTime,nowTime,nowTime,nowTime,nowTime,nowTime);
        System.out.println(s);
    }
}
