package educate.collections;

import java.util.ArrayList;
import java.util.List;

public class E {
    public static void main(String[] args) {
        //�����÷���
        List list = new ArrayList();
        list.add("abc ");
        list.add("bcd ");
        list.add("cde ");
        //list.add(10);  ��ǿforѭ���н�������ת���Ὣ����

        for (Object o : list) {    //��Ҫ��������ת��,ͬʱ���Ͳ���ȫ,�����ӵ����ݲ���ת���������򱨴�
            String s =(String) o;
            System.out.println(s);
        }

        //ʹ�÷���
        System.out.println("--------------");
        List<String> list1 = new ArrayList<>();    //���Ͱ�ȫ������������ת��
        list1.add("abc ");
        list1.add("bcd ");
        list1.add("cde ");
        //list1.add(10);   ���Ͳ�������ӹ涨���������������
        for (String s : list1) {
            System.out.println(s);
        }

    }
}
