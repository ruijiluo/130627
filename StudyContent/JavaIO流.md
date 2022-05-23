



# IO学习



## I 输入流：

###### 字节输入流		InputStream		字节输入流的顶层抽象类

FileInputStream:		普通的字节输入流

BufferedInputStream:		高效的字节输入流（字节缓冲流）



###### 字符输入流		Reader		字符输入流的顶层抽象类

FileReader:		普通的字符输入流

BufferedReader:		高效的字符输入流（字符缓冲流）



## O 输出流：

###### 字节输出流		OutputStream	字节输出流的顶层抽象类

FileOutputStream:		普通的字节输出流

BufferedOutStream:		高效的字节输出流（字节缓冲流）



字符输出流		Writer	 字符输出流的顶层抽象类

FileWriter:		普通的字符输出流

BufferedWriter:		高效的字符输出流（字符输出缓冲流）



## 创建文件和文件夹，检查文件的状态

```java
public class Test {
    public static void main(String[] args) throws IOException {
        //1.根据字节从形式获取File对象
        File file1 = new File("F:\\IDEAConten\\educate\\1.txt");
        System.out.println("file1: " + file1);

        //2.根据父目录与子目录获取File对象
        File file2 = new File("F:\\IDEAConten\\educate", "1.txt");
        System.out.println("file2: " + file2);

        //3.根据父目录对象，以及字符串的子目录来获取File对象
        File file3 = new File("F:\\IDEAConten\\educate");
        File file4 = new File(file3, "1.txt");
        System.out.println("file4: " + file4);
        System.out.println("----------------------");
        //文件创建只存在一次，存在则不可以创建
        System.out.println("创建a文件夹");
        Boolean b;
        File file5 = new File("F:/IDEAConten/educate/a");
        b = file5.mkdirs();
        System.out.println("a文件创建成功: " + b);

        System.out.println("在a文件夹中创建1.txt文件");
        File file6 = new File("F:/IDEAConten/educate/a/1.txt");
        b = file6.createNewFile();
        System.out.println("1.txt文件创建成功: "+ b);

        System.out.println("----------------------");
        System.out.println("验证文件状态");
        System.out.println("a存在: " + file5.exists());
        System.out.println("a是文件: " + file5.isFile());
        System.out.println("a是文件夹: " + file5.isDirectory());
        System.out.println("1.txt存在: " + file6.exists());
        System.out.println("1.txt是文件: " + file6.isFile());
        System.out.println("1.txt是文件夹: " + file6.isDirectory());

    }
}
```





## 字符流

字符流只可以拷贝纯文本，无法拷贝图片

### 字符流读取数据（文件）:

```java
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
public class reader {
    public static void main(String[] args) throws IOException {
        /*
        Read类中的方法
        int r.read(数组)    返回读取有效字符个数，如果没有数据则返回-1
                            数组长度如果小于文件的字符个数，当再次读取的时候，会覆盖前面读取的内容
         */
        
        //1.创建字符流读对象
         Reader r = new FileReader("IOstream/1.txt");

         //2.读取数据
         char []a = new char[3];
         int len;
//         len = r.read(a);
//         System.out.println(a);   //自动拼接成字符串
//         System.out.println(len);
//
//        //数组长度如果小于文件的字符个数，当再次读取的时候，会覆盖前面读取的内容
//        len = r.read(a);
//        System.out.println(a);
//        System.out.println(len);

        //优化代码
        while((len = r.read(a)) != -1){
            //len 为返回读取到的字符个数
            //a 为储存字符的数组
            String s = new String(a,0,len);     //a为字符数组，0为起始索引，len为读取有效字符个数
            System.out.println(s);      //每次创建一个新数组，用来存储字符
        }

         //3.释放资源
        r.close();
    }
}
```





### 字符流写写入数据（文件）:

```java
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
        w.write(a,3,1);     //第一个数字为索引起始位置，第二个数字为要读取后面字符的个数
*/
        //一个写一个字符串
        w.write("Hello World!");
        
        //3.释放资源
        w.close();
    }
}
```



### 文件拷贝（非缓冲区）:

```java
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
       //创建字符流对象
        FileReader fr = new FileReader("1.txt");
        FileWriter fw = new FileWriter("2.txt");		//如果文件不存在则自动创建

        //输入数据
        int len;
        while((len = fr.read()) != -1){
            fw.write(len);		
        }

        //清除缓存
        fr.close();
        fw.close();
    }
}
```



### 文件拷贝（缓冲区）:

缓冲区的大小为8192个字符   即16384个字节		即16kb

```java
import java.io.*;
public class BFW_R {
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

```

```java
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

```





## 字节流

可以拷贝图片

### 拷贝文件（非缓冲区)

一次性拷贝

```java
public class FIn_OutputStream {
    public static void main(String[] args) throws IOException {
        //创建字节流对象
        FileInputStream fip = new FileInputStream("IOstream/1.jpg");
        FileOutputStream fop = new FileOutputStream("IOstream/2.jpg");

        //读入数据
        int len;
        while((len = fip.read()) != -1){
            fop.write(len);
        }

        //释放资源
        fip.close();
        fop.close();

    }
}

```



用数组拷贝：数组必须为byte数组

```java
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

```



### 拷贝文件（缓冲区）

字节缓冲区为8192个字节		即8kb

```java
public class CopyFileBFI_O {
    public static void main(String[] args) throws IOException {
        //创建字节流缓冲对象
        long start = System.currentTimeMillis();
        //BufferedOutputStream 是字节缓冲输出流，用来写数据的
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("IOstream/2.jpg"));
        //BufferedInputStream 是字节缓冲输入流，用来读取数据的
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("IOstream/1.jpg"));

        //输入数据
        
        //文件过大用数组更快
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

```



模拟头像上传

```java
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
```

