package educate.dateandcalendar;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        //ֱ�ӿղδ������󣬷�����󲢶�����г�ʼ�����Ա�����ʾ��������ʱ�䣬����ӽ��ĺ���Ϊ��λ��
        Date date = new Date();
        System.out.println(date);
        //��ȡ�� 1970 �� 1 �� 1 �� 00��00��00 GMT �����ĺ���
        long time  =date.getTime();
        System.out.println(time);
        //�������ֵ�趨ָ����ʱ��
        Date date1 = new Date(1651585858508L);
        System.out.println(date1);
        //��ʽ�����
        Date nowTime = new Date();
        String s =String.format("%tY��%tm��%td��%tHʱ%tM��%tS��",nowTime,nowTime,nowTime,nowTime,nowTime,nowTime);
        System.out.println(s);
    }
}
