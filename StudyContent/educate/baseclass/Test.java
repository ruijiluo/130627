package educate.baseclass;

//目的是将字符串类型的数据转化为基本类型的数据

public class Test {
    public static void main(String[] args) {
        Integer in = 100; // 装箱:将对应基本类型转化为包装类
        int i = in ;  //拆箱:将包装类转化为基本类型
        //除了Character包装类外，其他7种可以通过 引用.parseXxx(String)将字符串转化为对应基本类型
        String s = "10";
        int i1 = Integer.parseInt(s);
        System.out.println("s = " + i1);
        System.out.println("s + 2 = "+(i1 + 2));


        //字符串转化为字符可以通过String类的 .toCharArray 或者 .charAt()
        String s2 = "I love China";
        char [] chs =s2.toCharArray();
        for(int j = 0; j < chs.length; j++){
            if(j == chs.length -1)   System.out.println(chs[j]);
            else System.out.print(chs[j]);
        }
        char ch =s2.charAt(7);
        System.out.println("字符串中第7个索引的字符: "+ ch);



    }
}
