package educate.IOstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIn_OutputStream {
    public static void main(String[] args) throws IOException {
        //创建字节流对象
        FileInputStream fip = new FileInputStream("IOstream/1.jpg");
        FileOutputStream fop = new FileOutputStream("IOstream/2.jpg");

        //读入数据
        int len;
        byte []a = new byte[1024];
        while((len = fip.read(a)) != -1){
            fop.write(a,0,len);
        }

        //释放资源
        fip.close();
        fop.close();

    }
}