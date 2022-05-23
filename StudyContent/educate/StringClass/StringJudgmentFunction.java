package educate.StringClass;

/*  包含String 类方法如下:
boolean:contains(String)   //在本例中，作用是判断字符串中是否包含给定的字符串
String:concat(String)      //在本例中，作用是在字符串后面添加新的字符串
boolean:equals(String)     //在本例中，作用是判断两个字符串是否相同，区分大小写
boolean:equalsIgnoreCase(String)    //在本例中，作用是判断两个字符串的字母是否相同,不区分大小写
boolean:startsWith(String)      //在本例中，作用是判断字符串的起始字符串是否为给定的字符串
 */

public class StringJudgmentFunction {
    public static void main(String[] args) {
     String str = new String("Hello World");
     if(str.contains("World")){    // contains() 方法用来检测字符串中是否含有放入的字符串内容
         System.out.println("含有World");
     }else{
         System.out.println("查找无果");
     }
     String str1 = str.concat(",I love China");      //concat() 方法用来在本字符串后面连接新的字符串内容,返回内容不是自身，需要接收
     System.out.println(str1);
     System.out.println("---------------------------");
     String str2 = new String("abc");
     String str3 = new String("ABC");
     boolean b1 = str2.equals(str3);
     boolean b2 = str2.equalsIgnoreCase(str3);
     System.out.println("equals(): " +b1);  // equals() 方法区分大小写
     System.out.println("equalsIgnoreCase(): " + b2);       // equalsIgnoreCase() 方法不区分大小
     System.out.println("statsWith(): "+str2.startsWith("a"));   // startsWith() 方法区分大小写
     System.out.println("startsWith(): "+str3.startsWith("ab"));
     System.out.println("ifEmpty(): " +str2.isEmpty());
     System.out.println("---------------------------");
    }
}
