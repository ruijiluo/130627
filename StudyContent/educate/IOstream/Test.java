package educate.IOstream;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
       //创建字符流对象
        FileReader fr = new FileReader("1.txt");
        FileWriter fw = new FileWriter("2.txt");

        //输入数据
        int len;
        char []a = new char[20];
        while((len = fr.read(a)) != -1){
            fw.write(a,0,len);

        }

        //清除缓存
        fr.close();
        fw.close();
    }
}