package educate.dateandcalendar;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        //��ȡϵͳʱ��
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DATE);
        int hour = c.get(Calendar.HOUR);
        int min = c.get(Calendar.MINUTE);
        int sce = c.get(Calendar.SECOND);
        System.out.print("����ʱ����:");
        if (min < 10)
            System.out.println("" + year + "��" + (month + 1) + "��" + day + "��" + hour + "ʱ" + "0" + min + "��" + sce + "��");
        else
            System.out.println("" + year + "��" + (month + 1) + "��" + day + "��" + hour + "ʱ" + min + "��" + sce + "��");
        System.out.println("--------------------------");
        //����ʱ��
        Calendar c1 = Calendar.getInstance();
        c1.set(2021,5-1,1);  //����ʱ��2021��5��1��
        int year1 = c1.get(Calendar.YEAR);
        int month1 = c1.get(Calendar.MONTH);
        int day1 = c1.get(Calendar.DATE);
        System.out.print("�޸ĺ��ʱ��: ");
        System.out.println(year1 +"��"+(month1+1)+"��"+day1 +"��");
        /////�����������
        Calendar c2 = Calendar.getInstance();
        c2.set(2021,4,3);   //����ʱ��2021��5��3��,Java���·�Ϊ0-11
        long oldDay = c2.getTimeInMillis();
        Calendar c3 = Calendar.getInstance();
        long newday = c3.getTimeInMillis();
        long DAY = (newday - oldDay) / (24*60*60*1000);
        System.out.println("�������: "+DAY);
    }
}
