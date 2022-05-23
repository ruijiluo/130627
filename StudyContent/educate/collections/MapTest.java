package educate.collections;

import java.util.*;

/*
    创建集合对象
    创建元素对象
    将元素放入到集合中
    历遍集合
 */
/*
    Map集合由键值对组成，key表示键，value表示值
    特点 : 键不可以重复(重复会覆盖前一个），值可以重复
    创建Map对象               Map<K,V> map = new hashMap();    其中K表示键,V表示值
 */
public class MapTest  {
    public static void main(String[] args) {
        //创建Map对象
        Map<Integer,Student> map = new HashMap<>();

        //创建元素对象
        Student s1 = new Student("张三", 17);
        Student s2 = new Student("张三", 17);
        Student s3 = new Student("李四", 18);
        Student s4 = new Student("王五", 19);

        //将元素添加到集合中
        map.put(1,s1);
        map.put(2,s1);
        map.put(3,s3);
        map.put(4,s4);
        System.out.println(map);
        System.out.println("------------------------");

        //通过键获取值
        Student s = map.get(2);
        System.out.println("ket:" + 2 + "\t" + "value:" + s);
        System.out.println("------------------------");

        //Map遍历集合需要转化为单列集合

        //1. 通过keySet() 方法获取所以的键
        Set<Integer> keys =map.keySet();     //返回值为    Set<E>单列集合保证了每个键的唯一性
        System.out.println("通过map.keySet()获取到的键信息: " +keys);
        System.out.println("------------------------");

        //2.通过迭代器的方法输出
        //获取迭代器对象
        Iterator<Integer> it =keys.iterator();   //获取集合所有的键
        while(it.hasNext()){
            Integer key =it.next();   //key接受每一个键，Iterator.next()返回一个泛型(由使用方法的引用决定类型)
            Student value =map.get(key);   //通过每一个键获取每一个值
            System.out.println("key:" + key +"\t\t" + "value:" + value);
        }
        System.out.println("------------------------");

        //用增强for的方法输出
        for (Integer key : keys) {
            System.out.println("key:" + key +"\t\t" + "value:" + map.get(key));
        }
    }
}
