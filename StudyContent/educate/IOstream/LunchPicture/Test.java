package educate.IOstream.LunchPicture;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        //��ȡ�ļ�
        File path = getPath();
        System.out.println(path);

        //�ж��ļ��Ƿ����
        boolean flag = isExists(path.getName());
        if(flag){
            //������˵���Ѿ�����
            System.out.println("ͷ���ļ��Ѿ�����,�ϴ�ʧ��");
        }else{
            //���������ϴ�
            loadPicture(path);
        }
    }
    public static File getPath() {
        Scanner sc = new Scanner(System.in);
        System.out.print("������Ҫ�ϴ�ͼƬ���ļ�·��:");
        while(true){
            String path  = sc.nextLine();
            //�ж��ļ��Ƿ���ͼƬ��ʽ
            if(!path.endsWith(".jpg") && !path.endsWith(".png") && !path.endsWith(".bmp") ){
                System.out.print("��¼��Ĳ���ͼƬ��������¼��:");
                //�������ͼƬ����Ҳ�����ж��Ƿ����ļ���
                continue;
            }

            //�ж��ļ�·���Ƿ�Ϸ�
            File file = new File(path);
            if(file.isFile() && file.exists()){
                return  file;
            }else {
                System.out.print("��������ļ�·�����Ϸ�������������:");
            }
        }
    }

    public  static  boolean isExists(String path){

        //�ж��ļ��ڵ�ǰĿ¼���Ƿ������
        File file = new File("F:\\IDEA\\educate\\IOstream\\LunchPicture");

        //��ȡ�ļ��������Ƶ��ļ�����
        String []names = file.list();

        //��ǿforѭ�����ж��ļ��Ƿ����
        for(int  i = 0; i < names.length;i++){
            if(names[i].equals(path)){
                return true;
            }
        }
        return  false;
    }

    public static  void loadPicture(File path) throws IOException {
        //�ֽ�����������ȡ�ļ�������
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
        //�ֽ��������д���ļ�������
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\IDEA\\educate\\IOstream\\LunchPicture\\" + path.getName()));


        int len;
        byte []temp = new byte[1024];
        while((len =  bis.read(temp) )!= -1 ){
            bos.write(temp,0,len);
        }

        bos.close();;
        bis.close();

        System.out.println("�ϴ��ɹ���");
    }
}

