package educate.collections;

import java.util.*;

/*
    �������϶���
    ����Ԫ�ض���
    ��Ԫ�ط��뵽������
    ���鼯��
 */
/*
    Map�����ɼ�ֵ����ɣ�key��ʾ����value��ʾֵ
    �ص� : ���������ظ�(�ظ��Ḳ��ǰһ������ֵ�����ظ�
    ����Map����               Map<K,V> map = new hashMap();    ����K��ʾ��,V��ʾֵ
 */
public class MapTest  {
    public static void main(String[] args) {
        //����Map����
        Map<Integer,Student> map = new HashMap<>();

        //����Ԫ�ض���
        Student s1 = new Student("����", 17);
        Student s2 = new Student("����", 17);
        Student s3 = new Student("����", 18);
        Student s4 = new Student("����", 19);

        //��Ԫ����ӵ�������
        map.put(1,s1);
        map.put(2,s1);
        map.put(3,s3);
        map.put(4,s4);
        System.out.println(map);
        System.out.println("------------------------");

        //ͨ������ȡֵ
        Student s = map.get(2);
        System.out.println("ket:" + 2 + "\t" + "value:" + s);
        System.out.println("------------------------");

        //Map����������Ҫת��Ϊ���м���

        //1. ͨ��keySet() ������ȡ���Եļ�
        Set<Integer> keys =map.keySet();     //����ֵΪ    Set<E>���м��ϱ�֤��ÿ������Ψһ��
        System.out.println("ͨ��map.keySet()��ȡ���ļ���Ϣ: " +keys);
        System.out.println("------------------------");

        //2.ͨ���������ķ������
        //��ȡ����������
        Iterator<Integer> it =keys.iterator();   //��ȡ�������еļ�
        while(it.hasNext()){
            Integer key =it.next();   //key����ÿһ������Iterator.next()����һ������(��ʹ�÷��������þ�������)
            Student value =map.get(key);   //ͨ��ÿһ������ȡÿһ��ֵ
            System.out.println("key:" + key +"\t\t" + "value:" + value);
        }
        System.out.println("------------------------");

        //����ǿfor�ķ������
        for (Integer key : keys) {
            System.out.println("key:" + key +"\t\t" + "value:" + map.get(key));
        }
    }
}
