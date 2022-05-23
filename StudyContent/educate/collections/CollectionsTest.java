package educate.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args) {
        //�������϶���
        List<Integer> list = new ArrayList<>();

        //��Ӽ���Ԫ��
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(4);

        System.out.println("δ���������ԭ�����ϵ�����: " +list);

        //����Collections�෽��
        //int max = Collections.max(list);    ѡ��������Ԫ������ֵ
        System.out.println("������Ԫ��������Ϊ: " +Collections.max(list));      //ѡ��������Ԫ������ֵ
        System.out.println("������Ԫ����С����Ϊ: " +Collections.min(list));      //ѡ��������Ԫ����С��ֵ

        Collections.reverse(list);       //��ԭ���ļ��Ͻ��з�ת��������������
        System.out.println("��תԭ�����ϵ�����: " + list);

        Collections.sort(list);      //����Ȼ����Լ��Ͻ����������У���������
        System.out.println("���������������: "+list);

        Collections.reverse(list);    //�ȶԼ��Ͻ������������ٷ�ת���ǽ�������,��ϴ��
        System.out.println("���Ͻ����������: " +list);

        Collections.shuffle(list);    //�Լ��ϵ�Ԫ��λ�ý�������任
        System.out.println("�Լ��Ͻ���ϴ��: " + list);




    }
}
