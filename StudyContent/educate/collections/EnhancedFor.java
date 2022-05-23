package educate.collections;

//快捷应用增强for    iter + 回车键       Iterator(迭代器) : 增强for是迭代器的简写形式
//结论:  普通的迭代器在历遍集合的时候不可以进行增加或者删除元素操作，否则异常
//       列表迭代器在历遍集合的时候可以进行增加和删除元素操作，但是必须使用列表迭代器中的方法
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EnhancedFor {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();   //使用泛型,添加的元素都是Integer类对象。   使得类型安全，避免了类型转化
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(30);

        //快捷应用增强for    iter + 回车键       Iterator(迭代器) : 增强for是迭代器的简写形式
        for (Integer i : list) {
           /* 也可以如下:
              Integer i =(Integer)o;
              System.out.println(i);
            */
            System.out.println(i);
        }
        System.out.println("--------------------");

        //迭代器演示, Iterator(迭代器) : 增强for是迭代器的简写形式
        Iterator<Integer> it =list.iterator();
        while(it.hasNext()){
            /* 也可以如下:
               Integer i =(Integer)it.next();
               System.out.println(i);
             */
            System.out.println(it.next());
        }


    }
}
