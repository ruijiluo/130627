package educate.IOstream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
public class reader {
    public static void main(String[] args) throws IOException {
        /*
        Read类中的方法
        int r.read(数组)    返回读取有效字符个数，如果没有数据则返回-1
                            数组长度如果小于文件的字符个数，当再次读取的时候，会覆盖前面读取的内容
         */
        //创建字符流读对象
         Reader r = new FileReader("IOstream/1.txt");

         //读取数据
         char []a = new char[3];
         int len;
//         len = r.read(a);
//         System.out.println(a);   //自动拼接成字符串
//         System.out.println(len);
//
//        //数组长度如果小于文件的字符个数，当再次读取的时候，会覆盖前面读取的内容
//        len = r.read(a);
//        System.out.println(a);
//        System.out.println(len);

        //优化代码
        while((len = r.read(a)) != -1){
            //len 为返回字符个数
            //a 为储存字符
            String s = new String(a,0,len);     //a为字符数组，0为起始索引，len为读取有效字符个数
            System.out.println(s);      //每次创建一个新数组，用来存储字符
        }

         //释放资源
        r.close();
    }
}
