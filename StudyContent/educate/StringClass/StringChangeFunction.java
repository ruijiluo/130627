package educate.StringClass;

/*  包含String类方法如下:
byte[]:  getBytes()  // //在本例中，作用是将字符串转化为字节数组
char[]:  toChatArry()  // //在本例中，作用是将字符串转化为字符数组
static String:  valueOf()   //在本例中，作用是将指定数据类型数据转化为字符串,可以直接通过String名使用方法
String replace(old,new)   //在本例中，作用是将指定字符或者字符串替换为新的字符或者字符串
String[]:  split()     //在本例中，作用是通过给定的字符串分割原来的字符串并返回分割后的字符串，原来的字符串不变
String:  trim()    //在本例中，作用是去掉字符串两端的空白字符
 */

public class StringChangeFunction {
    public static void main(String[] args) {

        //使用 getByes() 方法将字符串转化为字节数组
        String str1 = "abc";
        byte []bys = str1.getBytes();
        System.out.print("用getBytes方法将字符串abc转化为字节数组: ");
        for(int i = 0; i < bys.length;i++){
            if(i == bys.length-1) System.out.println(bys[i]);
            else  System.out.print(bys[i]+" ");
        }
        System.out.println("-------------");

        //使用 toCharArray() 方法将字符串转化为字符数组
        String str2 = "ABC";
        System.out.print("用toCharArray方法将字符串ABC转化为字符数组: ");
        char[] chs = str2.toCharArray();
        for(int i = 0; i < chs.length; i++){
            if(i == chs.length -1) System.out.println(chs[i]);
            else System.out.print(chs[i] +"  ");
        }
        System.out.println("-------------");

        //使用 valueOf() 方法将指定数据类型数据转化为字符串
        int is1 = 123;
        System.out.print("用valueOf方将int型的123转化为字符串123: ");
        String str3 =String.valueOf(is1);
        System.out.println(str3+4);
        System.out.print("int型的123前加双冒号处理成String类型: ");
        String str4 = "" + 123;     //实际开发可以替代 valueOf() 方法
        System.out.println(str4 +4);
        System.out.println("-------------");

        //使用 replace(old,new) 方法新的字符或者字符串替换原来字符串中的字符或者字符串
        String str5 = "bca bca bca";
        System.out.print("用replace()方法将字符a换成d: ");
        System.out.println(str5.replace('a','d'));
        System.out.println("-------------");

        //使用 trim() 方法将字符串中前后的空白符去掉
        String str6 = "  abc  abc  abc  ";
        System.out.println("原来字符串的长度: "+ str6.length());
        System.out.print("用trim()方法将字符串前后的空白符去掉: ");
        System.out.println(str6.trim());
        System.out.println("去除空格后字符串的长度: "+ str6.trim().length());







    }
}
