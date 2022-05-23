package educate.IOstream.LunchPicture;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        //获取文件
        File path = getPath();
        System.out.println(path);

        //判断文件是否存在
        boolean flag = isExists(path.getName());
        if(flag){
            //存在则说明已经存在
            System.out.println("头像文件已经存在,上传失败");
        }else{
            //不存在则上传
            loadPicture(path);
        }
    }
    public static File getPath() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要上传图片的文件路径:");
        while(true){
            String path  = sc.nextLine();
            //判断文件是否是图片格式
            if(!path.endsWith(".jpg") && !path.endsWith(".png") && !path.endsWith(".bmp") ){
                System.out.print("你录入的不是图片，请重新录入:");
                //如果不是图片后面也无需判断是否是文件了
                continue;
            }

            //判断文件路径是否合法
            File file = new File(path);
            if(file.isFile() && file.exists()){
                return  file;
            }else {
                System.out.print("你输入的文件路径不合法，请重新输入:");
            }
        }
    }

    public  static  boolean isExists(String path){

        //判断文件在当前目录下是否存在了
        File file = new File("F:\\IDEA\\educate\\IOstream\\LunchPicture");

        //获取文件所有名称的文件数组
        String []names = file.list();

        //增强for循环来判断文件是否存在
        for(int  i = 0; i < names.length;i++){
            if(names[i].equals(path)){
                return true;
            }
        }
        return  false;
    }

    public static  void loadPicture(File path) throws IOException {
        //字节输入流，读取文件的内容
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
        //字节输出流，写入文件的内容
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\IDEA\\educate\\IOstream\\LunchPicture\\" + path.getName()));


        int len;
        byte []temp = new byte[1024];
        while((len =  bis.read(temp) )!= -1 ){
            bos.write(temp,0,len);
        }

        bos.close();;
        bis.close();

        System.out.println("上传成功！");
    }
}

