# Java异常

## 一.异常的处理



### 1.自己处理

通过try catch语句处理

#### 1.1单个异常处理

```Java
try{
    //输入可能出现错误的代码
}catch(异常类型 异常名称){
    //处理异常的代码
}finally{
    //一般用来释放内存，在try或者catch语句结束前运行
}
```

例子:

```java
try{
    int a = 10 / 9;
}catch(ArithmeticException e){   //ArithmeticException   算术异常
    System.out.println("除数为0");
}finally{
    System.out.println("假设释放了内存");
}
```



#### 1.2多个异常处理

try中遇到多个异常的时候会执行第一个异常，然后跳出try语块，进入对应异常的catch语块中,如果无对应的异常语块就进入Exception中由JVM寻找

```java
try{
    //可能出现的异常代码
}catch(子异常类型 异常名称){
    //处理异常的代码
}catch(子异常类型 异常名称){
	//处理异常的代码
}....{
    //处理异常的代码
}catch(Exception 异常名称){
    //处理异常的代码
}finally{
    //释放空间内存你
}
```

例子:

```java
int [] i = new int[3];
String s = null;
try {
    i[100] = 1;
    s.length();
    int a = 10 / 0;
}catch (NullPointerException e){
    System.out.println("空指针异常");
}catch (ArrayIndexOutOfBoundsException e){
    System.out.println("栈溢出异常");
}catch (ArithmeticException e){
    System.out.println("算术异常");
}catch (Exception e){
    e.printStackTrace();   //由JVM寻找异常，并输出异常内容，最后终止运行
}finally {
    System.out.println("释放内存");
}
```



### 二.抛出异常

两种处理:  第一种是继续往上抛，让主函数调用JVM来处理(不推荐，会终止程序)   

​				  第二种是调用者自己处理异常

第一种:

格式:

```java
  public static void main(String[] args) throws 异常类型1,异常类型2,异常类型3,..... {  //主方法抛给JVM
       //调用方法
    }

    public static int test() throws ArithmeticException,异常类型1,异常类型2,异常类型3,..... {
        //异常内容
    }
```

例子:

```java
public static void main(String[] args) throws ArithmeticException,NullPointerException { //由JVM处理会终止运行
    int b = test();
    System.out.println(b);
}

public static int test() throws ArithmeticException,NullPointerException {
    String s = null;
    return s.length();
}
```

第二种:

格式:

```java
public static void main(String[] args) {
        try {
         	//调用异常
        } catch (异常类型 异常名称) {
     		//处理异常
        } catch (异常类型 异常名称) {
     		//处理异常
        }.....{
            
        } finally {
 			//释放内存
        }
    }

    public static int test() throws 异常类型1,类型异常2,....... {
      
    }
```

例子:

```java
public static void main(String[] args) {
        try {
            int b = test();  					//主函数调用存在异常
            System.out.println(b);   
        } catch (ArithmeticException e) {  	 	//主函数处理异常
            System.out.println("存在算术异常");
        } finally {
            System.out.println("释放空间");
        }
    }

    public static int test() throws ArithmeticException {
        int a = 10;
        return a / 0;
    }
```

throws格式:

```java
修饰符 返回类型 方法名称(参数列表) throws 异常类型1,异常类型2.......
```

注意:

1.如果一个方法是编译异常，那么在调用这个方法的时候就要处理这个异常(谁调用谁处理)

![image-20220505160814505](C:\Users\pc\AppData\Roaming\Typora\typora-user-images\image-20220505160814505.png)

2.重写一个方法的时候，子类方法的异常范围不可以被扩大,否则出错

![image-20220505161746756](C:\Users\pc\AppData\Roaming\Typora\typora-user-images\image-20220505161746756.png)

