package educate.collections;

//���Ӧ����ǿfor    iter + �س���       Iterator(������) : ��ǿfor�ǵ������ļ�д��ʽ
//����:  ��ͨ�ĵ����������鼯�ϵ�ʱ�򲻿��Խ������ӻ���ɾ��Ԫ�ز����������쳣
//       �б�����������鼯�ϵ�ʱ����Խ������Ӻ�ɾ��Ԫ�ز��������Ǳ���ʹ���б�������еķ���
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EnhancedFor {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();   //ʹ�÷���,��ӵ�Ԫ�ض���Integer�����   ʹ�����Ͱ�ȫ������������ת��
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(30);

        //���Ӧ����ǿfor    iter + �س���       Iterator(������) : ��ǿfor�ǵ������ļ�д��ʽ
        for (Integer i : list) {
           /* Ҳ��������:
              Integer i =(Integer)o;
              System.out.println(i);
            */
            System.out.println(i);
        }
        System.out.println("--------------------");

        //��������ʾ, Iterator(������) : ��ǿfor�ǵ������ļ�д��ʽ
        Iterator<Integer> it =list.iterator();
        while(it.hasNext()){
            /* Ҳ��������:
               Integer i =(Integer)it.next();
               System.out.println(i);
             */
            System.out.println(it.next());
        }


    }
}
