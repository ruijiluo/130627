package educate.IOstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class writer {
    public static void main(String[] args) throws IOException {
        //1.创建字符流写文件
        Writer w = new FileWriter("IOstream/1.txt");

        //2.写入数据
        //一次写一个字符
        /*
        w.write('H');
*/
        //一次写入指定的字符数组
       /* char []a ={'C','h','i','n','a'};
        w.write(a);
        w.write('\n');
        w.write(a,3,1);     //第一个为索引起始位置，第二个为后面字符的个数
*/
        //一个写一个字符串
        w.write("Hello World!");

        //3.释放资源
        w.close();
    }
}
