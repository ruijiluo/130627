package educate.StringClass;

/*  包含String 类方法如下:
int: length()       //在本例中，作用是获取字符串的长度
char: charAt(int index)     //在本例中，作用是获取给定索引下标的字符
int: indexOf(String)        //在本例中，作用是获取第一给定字符的索引
int: lastIndexOf(string)    //在本例中，作用是获取最后一个给定字符的索引
String: subString(int)      //在本例中，作用是获取从给定索引下标到最后的一段字符串
String: subString(int,int)      //在本例中，作用是获取从第一个给定索引到最后给定索引的前一个字符的一段字符串
 */

public class StringGetFunction {
    public static void main(String[] args) {
        String str = "Hello world,I love China";
        //length() 方法获取字符串的长度
        System.out.println("str字符串的长度为: " + str.length());
        //chatAt() 方法获取给定索引下标的字符
        System.out.println("字符串中索引为19的字符: "+ str.charAt(19) );
        //indexOf() 方法获取第一个给定字符出现的索引
        System.out.println("第一个字符l出现的做引为: "+ str.indexOf('l'));
        //lastIndexOf() 方法获取最后一个给定字符出现的索引
        System.out.println("最后一个字符l出现的索引为: "+ str.lastIndexOf('l'));
        //subString(int) 方法获取从给定索引到最后索引的一段字符串
        System.out.println("从索引12到最后索引的一段字符串为: "+ str.substring(12));
        //subString(int.int) 方法获取从第一个给定索引到第二个给定索引的一个字符的一段字符串
        System.out.println("从索引19到23的一个段字符串: "+ str.substring(19,24));  //获取的字符串索引范围为[19,24)

    }
}
