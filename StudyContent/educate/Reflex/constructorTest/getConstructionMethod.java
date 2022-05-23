package educate.Reflex.constructorTest;

import java.lang.reflect.Constructor;

public class getConstructionMethod {
    public static void main(String[] args) throws Exception {
        /*
            1.通过全类名获取字节码文件
            2.通过字节码文件获取构造器对象
            3.通过对应构造器对象的newInstance获取该类的对象（需要向下转型）
            4.打印出来
         */
        Class class1 = Class.forName("educate.Reflex.constructorTest.Student");

        //获取公共无参构造
        Constructor constructor1 = class1.getConstructor();
        System.out.println(constructor1);

        //获取公共String有参构造
        Constructor constructor2 =class1.getConstructor(String.class);
        System.out.println(constructor2);

        //获取私有int有参构造
        Constructor constructor3 =class1.getDeclaredConstructor(int.class);
        System.out.println(constructor3);

        System.out.println("----------------------------------------");
        //获取Student所有公共的构造函数
        Constructor []cons =class1.getConstructors();
        for (Constructor con : cons) {
            System.out.println(con);
        }
        System.out.println("----------------------------------------");

        //获取构造器属于哪一个类
        String name =constructor1.getName();
        System.out.println(name);
        System.out.println("----------------------------------------");

        //通过构造器对象和参数，创建构造器对应的对象
        Student stu =(Student)constructor2.newInstance( "Beauty");
    }
}
