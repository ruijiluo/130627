package educate.IOstream;

import java.io.*;
public class CopyFileBFW_R {
    public static void main(String[] args) throws IOException {
        //创建缓冲流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("IOstream/2.txt"));
        BufferedReader br = new BufferedReader(new FileReader("IOstream/1.txt"));

        //输入数据
        int len;
        while((len = br.read()) != -1){
            bw.write(len);
        }

        //释放资源
        br.close();
        bw.close();
    }
}
