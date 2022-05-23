package educate.IOstream;

import java.io.*;

public class CopyFileBFI_O {
    public static void main(String[] args) throws IOException {
        //创建字节流缓冲对象
        long start = System.currentTimeMillis();
        //BufferedOutputStream 是字节缓冲输出流，用来写数据的
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("IOstream/2.mp4"));
        //BufferedInputStream 是字节缓冲输入流，用来读取数据的
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("IOstream/1.mp4"));

        //输入数据
        int len;
        byte []temp = new byte[1024];
        while((len = bis.read(temp)) != -1){
            bos.write(temp,0,len);
        }

        //释放空间
        bos.close();
        bis.close();

        long end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");
    }
}
