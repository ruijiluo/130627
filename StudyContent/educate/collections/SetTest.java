package educate.collections;
import java.util.Iterator;
import  java.util.Set;
import  java.util.HashSet;
/*
    �������϶���
    ����Ԫ�ض���
    ��Ԫ�ط��뵽������
    ���鼯��
 */
/*  (��Ҫ��дequals��hashCode����)
    Set���ϵ��ص�:
    1.����(�޷�ʹ��get(����)��ȡֵ)
    2.Ψһ��(ͨ��equals()��hashCode()�������������ж������������Ҫ��дԪ�����е�����������,����Ƚϵ��Ǹ���ĸ����е�����������)   Object��
 */
public class SetTest {
    public static void main(String[] args) {
        //�������϶���
        Set<Student> set = new HashSet<>();

        //����Ԫ�ض���
        Student s1 = new Student("����", 17);
        Student s2 = new Student("����", 17);
        Student s3 = new Student("����", 18);
        Student s4 = new Student("����", 19);

        //��Ԫ����ӵ�������
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        System.out.println("������ѧ��Ψһ����Ϣ: " + set);
        System.out.println("-------------------------");

        //ͨ�������������Ϣ:
        System.out.print("ͨ���������������Ψһ��Ϣ: ");
        Iterator<Student> it =set.iterator();   //���ضԴ˼��е�Ԫ�صĵ�����
        while(it.hasNext()){
            Student s = it.next();    //ͨ�������������ͣ�����ת��Ϊ��Ӧ�������
            System.out.print(s + "     ");
        }
        System.out.println();
        System.out.println("-------------------------");

        System.out.print("ͨ����ǿfor�������Ψһ��Ϣ: ");
        for (Student s : set) {
            System.out.print(s);
        }
        System.out.println();

    }

}
