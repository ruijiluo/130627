package educate.collections;
import java.util.Iterator;
import  java.util.Set;
import  java.util.HashSet;
/*
    创建集合对象
    创建元素对象
    将元素放入到集合中
    历遍集合
 */
/*  (需要重写equals和hashCode方法)
    Set集合的特点:
    1.无序(无法使用get(索引)获取值)
    2.唯一性(通过equals()和hashCode()两个方法进行判定————因此要重写元素类中的这两个方法,否则比较的是该类的父类中的这两个方法)   Object类
 */
public class SetTest {
    public static void main(String[] args) {
        //创建集合对象
        Set<Student> set = new HashSet<>();

        //创建元素对象
        Student s1 = new Student("张三", 17);
        Student s2 = new Student("张三", 17);
        Student s3 = new Student("李四", 18);
        Student s4 = new Student("王五", 19);

        //将元素添加到集合中
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        System.out.println("集合中学生唯一的信息: " + set);
        System.out.println("-------------------------");

        //通过迭代器获得信息:
        System.out.print("通过迭代器获得所有唯一信息: ");
        Iterator<Student> it =set.iterator();   //返回对此集中的元素的迭代器
        while(it.hasNext()){
            Student s = it.next();    //通过泛型限制类型，将其转化为对应类型输出
            System.out.print(s + "     ");
        }
        System.out.println();
        System.out.println("-------------------------");

        System.out.print("通过增强for获得所有唯一信息: ");
        for (Student s : set) {
            System.out.print(s);
        }
        System.out.println();

    }

}
