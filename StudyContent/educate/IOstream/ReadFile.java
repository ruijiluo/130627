package educate.IOstream;

import educate.collections.E;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        File file = new File("F:/IDEA/educate/IOstream/1.txt");
        Reader reader = new FileReader(file);
       int a;
       if(file.createNewFile())  System.out.println("文件创建成功");
        while((a = reader.read()) != -1){
            System.out.print((char)a);    //强转
        }
        reader.close();     //需要关闭阅读文件
    }
}
