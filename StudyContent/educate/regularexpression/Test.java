package educate.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 Pattern p = Pattern.compile("a*b");  //创建Pattern类引用将给定的正则表达式编译(compile)为带有给定标志的模式
 Matcher m = p.matcher("aaaaab");     //matches方法尝试将整个输入序列与模式进行匹配(matcher)
 boolean b = m.matches();       //matches方法尝试将整个输入序列与模式进行匹配
 */
public class Test {
    public static void main(String[] args) {
      String regex = "[0-9.]+";
      String str = "苹果: 17.6元，雪梨: 18.0元,草莓: 30.7元";
      double sum = 0;
      Pattern p =Pattern.compile(regex);        //创建Pattern类引用,将给定的正则表达式编译为带有给定标志的模式
      Matcher m =p.matcher(str);             //matches方法尝试将整个输入序列与模式进行匹配
      while(m.find()){               //find() 尝试找到匹配模式的输入序列的下一个子序列,如果还有下一个序列则将索引指向下一序列
          String get = m.group();    //返回与上一个匹配匹配的输入子序列，如果没有find()则group()方法将无法找到序列，且只用一次find()方法便可以
          sum += Double.valueOf(get);  //使用包装类中的方法将字符串型转换为对应包装类的基本类型
      }
      System.out.println(str);
      System.out.println("商品价格一共: " +sum +"元");

    }
}
