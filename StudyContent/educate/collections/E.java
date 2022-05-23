package educate.collections;

import java.util.ArrayList;
import java.util.List;

public class E {
    public static void main(String[] args) {
        //不适用泛型
        List list = new ArrayList();
        list.add("abc ");
        list.add("bcd ");
        list.add("cde ");
        //list.add(10);  增强for循环中进行类型转换会将报错

        for (Object o : list) {    //需要进行类型转换,同时类型不安全,如果添加的内容不是转化的类型则报错
            String s =(String) o;
            System.out.println(s);
        }

        //使用泛型
        System.out.println("--------------");
        List<String> list1 = new ArrayList<>();    //类型安全，避免了类型转换
        list1.add("abc ");
        list1.add("bcd ");
        list1.add("cde ");
        //list1.add(10);   泛型不可以添加规定泛型外的数据类型
        for (String s : list1) {
            System.out.println(s);
        }

    }
}
