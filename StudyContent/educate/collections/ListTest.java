package educate.collections;
import  java.util.List;
import  java.util.ArrayList;
/*
    �������϶���
    ����Ԫ�ض���
    ��Ԫ�ط��뵽������
    ���鼯��
 */
/*
(��Ҫ��дtoString����)
   ListΪ�ӿ�
   ����:���ظ�(��Ϣ�����ظ�),����
   �ӿ�ʵ����(���ӿ�ָ���������)Ӧ��:  List list = new Array();

 */
public class ListTest {
    public static void main(String[] args) {
        //�������϶���
        List<Student> list = new ArrayList<Student>();  //ʹ�÷���,��ӵ�Ԫ�ض���Student�����   ʹ�����Ͱ�ȫ������������ת��
        //����Ԫ�ض���
        Student s1 = new Student("����", 17);
        Student s2 = new Student("����", 17);
        Student s3 = new Student("����", 18);
        Student s4 = new Student("����", 19);
        //��Ԫ�ط��뼯����,�����������������Զ�װ��,����ת�ͳɶ�Ӧ���͵İ�װ��
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        //���Է����÷���

        int length = list.size();     //��ȡ���ϸ����ķ���
        System.out.println("���ϵ�Ԫ�ظ���Ϊ:" + length);

        System.out.println(list);    //��������е�ȫ������,�����ʽΪ�ö������toString�ĸ�ʽ

        Object obj =list.get(2);     //��ȡָ�������ж������Ϣ,���ܵ���������ΪObject����
        System.out.println("����Ϊ 2 ��ѧ������Ϣ: " +list.get(2));
        System.out.println("����Ϊ 2 ��ѧ������Ϣ: "+obj);

        for(int i = 0; i < list.size(); i++){
            Object o =list.get(i);
            System.out.println("����Ϊ " + i +" ��ѧ������ϢΪ: " + list.get(i) );
        }


    }
}
