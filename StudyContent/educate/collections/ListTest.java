package educate.collections;
import  java.util.List;
import  java.util.ArrayList;
/*
    创建集合对象
    创建元素对象
    将元素放入到集合中
    历遍集合
 */
/*
(需要重写toString方法)
   List为接口
   特性:可重复(信息内容重复),有序
   接口实例化(父接口指向子类对象)应用:  List list = new Array();

 */
public class ListTest {
    public static void main(String[] args) {
        //创建集合对象
        List<Student> list = new ArrayList<Student>();  //使用泛型,添加的元素都是Student类对象。   使得类型安全，避免了类型转化
        //创建元素对象
        Student s1 = new Student("张三", 17);
        Student s2 = new Student("张三", 17);
        Student s3 = new Student("李四", 18);
        Student s4 = new Student("王五", 19);
        //将元素放入集合中,如果放入基本类型则自动装包,向上转型成对应类型的包装类
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        //测试方常用方法

        int length = list.size();     //获取集合个数的方法
        System.out.println("集合的元素个数为:" + length);

        System.out.println(list);    //输出集合中的全部内容,输出格式为该对象类的toString的格式

        Object obj =list.get(2);     //获取指定索引中对象的信息,接受的引用类型为Object类型
        System.out.println("索引为 2 的学生的信息: " +list.get(2));
        System.out.println("索引为 2 的学生的信息: "+obj);

        for(int i = 0; i < list.size(); i++){
            Object o =list.get(i);
            System.out.println("索引为 " + i +" 的学生的信息为: " + list.get(i) );
        }


    }
}
