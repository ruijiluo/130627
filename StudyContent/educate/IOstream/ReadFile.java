package educate.IOstream;

import educate.collections.E;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        File file = new File("F:/IDEA/educate/IOstream/1.txt");
        Reader reader = new FileReader(file);
       int a;
       if(file.createNewFile())  System.out.println("�ļ������ɹ�");
        while((a = reader.read()) != -1){
            System.out.print((char)a);    //ǿת
        }
        reader.close();     //��Ҫ�ر��Ķ��ļ�
    }
}
