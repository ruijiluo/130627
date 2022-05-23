package educate;
/*
 方法区存在着 : 类的方法，常量(final)，静态成员等等
 栈存放着 : 从方法区加载方法所用的内存(方法先进后出)  即引用变量存在的内存
 堆存放着 : 存储开创的数组或者对象(数组内容和对象属性)
 */
public class ImportantContent {
    public static void main(String[] args) {
        /*
        第一种定义 数据类型 [] 数组名 = new 数组名 [数组长度];
        第二种定义 数据类型 [] 数组名 = new 数组名 []{值1，值2，值3、、、、};
        第三钟定义 数据类型 [] 数组名 ={值1，值2，值3.。。。};
         */
        /*
            为赋值的有默认值:
            int , long -> 0
            double , float -> 0.0
            boolean  -> false
         */
        int[] Array = new int[]{1, 2, 3};
        System.out.println(Array[0]);
        System.out.println(Array[1]);
        printArray(Array);
        Array = null;
        System.out.println(Array[2]);
        /*
        过程详解:
            写完main方法，main方法便存在方法区
            当程序开始运行的时候，方法区加载进栈中
            在栈中中的main方法实现 int [] Array
            然后在堆中开创出空间，并传递这个空间的首地址回变量 Array 中
            然后在main方法中从上往下实现函数
            当遇到 Array = null 的时候,则变量 Array 不在指向堆中的首地址， ////指向方法区的一个空地址
            如果后面还用带 Array 进行运用的时候，则无法再访问原来堆上的内容
         */
    }
    static void printArray(int arr[]){  //引用类型的变量作为参数传递的时候，传递的是地址
        for(int i = 0;i < 2;i++){       //基本类型的变量作为参数传递的时候，传递的是值
            System.out.println(arr[i]);
        }
    }
}
