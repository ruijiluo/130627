package educate.StringBuilderClass;

public class Test {
    public static void main(String[] args) {
     String s = "abc";
     StringBuilder str = new StringBuilder(s);
     System.out.println("将String类转换为StringBuilder类: "+str);
     str.append("def");    //返回自身，无需新的StringBuilder类引用接收;
     System.out.println("StringBuilder类str应用append方法添加def: "+ str);
     String s2 = str.toString();
     System.out.println("将StringBuilder类转换为String类: " + s2);
     StringBuilder str2 = new StringBuilder("Hello World");
     int length = str2.capacity();   //返回str2的容量
     System.out.println(length);
     str2.delete(0,6);  //删除索引初始到结束前一个的内容，返回内容是自身，无需接收
     System.out.println(str2);
     str2.deleteCharAt(0);  // 删除给定索引的内容
     System.out.println(str2);
    }
}
