package educate.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args) {
        //创建集合对象
        List<Integer> list = new ArrayList<>();

        //添加集合元素
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(4);

        System.out.println("未经过处理的原来集合的排序: " +list);

        //测试Collections类方法
        //int max = Collections.max(list);    选出集合中元素最大的值
        System.out.println("集合中元素最大的数为: " +Collections.max(list));      //选出集合中元素最大的值
        System.out.println("集合中元素最小的数为: " +Collections.min(list));      //选出集合中元素最小的值

        Collections.reverse(list);       //对原来的集合进行反转操作，返回自身
        System.out.println("反转原来集合的排序: " + list);

        Collections.sort(list);      //按自然排序对集合进行升序排列，返回自身
        System.out.println("集合升序排序输出: "+list);

        Collections.reverse(list);    //先对集合进行升序排列再反转就是降序排列,即洗牌
        System.out.println("集合降序排列输出: " +list);

        Collections.shuffle(list);    //对集合的元素位置进行随机变换
        System.out.println("对集合进行洗牌: " + list);




    }
}
