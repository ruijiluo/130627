package educate.Reflex.constructorTest;

import educate.collections.E;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class getMemberMethod {
    public static void main(String[] args) throws Exception {
        /*
           1、获取字节码文件对象
           2、通过字节码文件对象获取构造器
           3、获取该类的成员方法对象，调用方法
           4.打印方法
         */
        Class class1 =Class.forName("educate.Reflex.constructorTest.Student");

        Constructor con1 =class1.getConstructor();
        Student stu = (Student) con1.newInstance();     //需要向下转型

        Method nopm =class1.getMethod("say1");     //方法名 + 参数列表名，如果没有参数列表则不写
        //获取全部信息
        System.out.println(nopm);
        //获取方法名
        System.out.println(nopm.getName());
        //调用方法
        nopm.invoke(stu);       //传入对象
        System.out.println("------------------------------------");

        Method intpm =class1.getMethod("sum",int.class,int.class);
        //获取方法名
        System.out.println(intpm.getName());
        //使用方法
        int sum =(int)intpm.invoke(stu,10,20);
        System.out.println("sum: " + sum);
        System.out.println("------------------------------------");

        Method prinop = class1.getDeclaredMethod("say1");
        //获取方法名
        System.out.println(prinop.getName());
        //使用方法
        prinop.invoke(stu);     //传入对象
    }
}