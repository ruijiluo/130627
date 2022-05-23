

类加载器：将字节码文件(.class)加载到内存中，并生成对对应的Class对象（一一对应）

-  创建类的实例时候，类加载器只加载一次

- 访问静态成员的时候，先加载静态成员

- 创建子类的实例时候，类加载器先加载父类

- 反射方式创建类的Class对象

  Class class = Class forName("类的正名");

  正名: 包名 + 类名



# 反射的作用:

#### 1.通过类加载器分析类

- 加载和初始化一个类

- 查看类的所有属性和方法

#### 2.查看并使用对象

- 查看一个对象的所有属性和方法

- 使用对象的任意属性和方法



# 获取Class对象的三种方式:

- Object类的getClass()方法

   Class class = 对象名.getClass()

  

- 类的静态属性

  Class class  =  类名.class；

  

- Class的静态方法

   Class class = Class.forName("类的正名");

  正名: 包名 + 类名



# Constructor<T> 对象	

### 通过Class对象获取构造器对象

- getConstructor(Class<?>...paramenterTypes)

   	   返回一个Constructor对象，仅公共构造函数

  ​		Class<?>...:可变参数，代表Class类型的数组

  ​		? ：通配符，代表不确定的任意类型

- getDeclaredConstructor(Class<?> ...parameterTypes)

  ​		返回一个Constructor对象，可获取私有成员

- getConstructors()

  ​		返回此类所有（不含私有）构造函数的数组



### Constructor的常用方法

- String getName()

​				返回构造函数名

- T  newInstance(Object... initargs)



### 反射方式使用构造方法

```java
public class getConstructionMethod {
    public static void main(String[] args) throws Exception {
        /*
       		1.通过全类名获取字节码文件对象
			2.通过字节码文件对象的方法获取构造器对象    .getConstructor
			3.通过对应构造器对象的newInstance获取该类的对象（需要向下转型）
			4.调用对象的方法
        
        /*
        
        //获取字节码文件对象
        Class class1 = Class.forName("educate.Reflex.constructorTest.Student");

        //获取公共无参构造
        Constructor constructor1 = class1.getConstructor();
        System.out.println(constructor1);

        //获取公共String有参构造
        Constructor constructor2 =class1.getConstructor(String.class);
        System.out.println(constructor2);

        //获取私有int有参构造
        Constructor constructor3 =class1.getDeclaredConstructor(int.class);
        System.out.println(constructor3);

        System.out.println("----------------------------------------");
        //获取Student所有公共的构造函数
        Constructor []cons =class1.getConstructors();
        for (Constructor con : cons) {
            System.out.println(con);
        }
        System.out.println("----------------------------------------");

        //获取构造器属于哪一个类
        String name =constructor1.getName();
        System.out.println(name);
        System.out.println("----------------------------------------");

        //通过构造器对象和参数，创建构造器对应的对象
        Student stu =(Student)constructor2.newInstance( "Beauty");
    }
}

```





# Method对象

## 通过Class对象获取方法

- getMethod(String name,Class<T>...parameterTypes)

     		返回一个Method,仅公共成员方法

  ​			name : 方法

  ​			parameterTypes : 方法的参数列表

- getDeclareMethod(String,Class<?>...)

​					返回一个Method对象，可获取私有成员方法

- getMethods()

  ​			返回此类所有非私有方法的数组



Method的常用方法

- String getName()

​			返回方法名字

- Object invoke(Object obj,Object ...args)

​			在指定对象上调用方法，参数为args



