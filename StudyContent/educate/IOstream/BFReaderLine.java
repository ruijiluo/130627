package educate.IOstream;

import java.io.*;

public class BFReaderLine {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲流对象
        BufferedReader br = new BufferedReader(new FileReader("IOstream/1.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("IOstream/2.txt"));

        //读取数据  BufferedReader.readLine 返回一个字符串String类型
        String str;
        while((str = br.readLine()) != null){
            bw.write(str);

            //输入一行需要换行，否则会连在一起
            bw.newLine();
        }

        //释放资源
        br.close();
        bw.close();

    }
}
