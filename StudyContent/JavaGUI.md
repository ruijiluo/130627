

# 学习GUI

组件

- 窗口
- 弹窗
- 面板
- 文本框
- 列表框
- 按钮
- 图片
- 监听事件
- 键盘事件
- 破解工具



## 1.GUI核心技术: Swing  	AWT

### 1.1、创建一个窗口

- 设置窗口的大小
- 设置窗口的位置
- 设置窗口的背景颜色
- 设置窗口拉伸
- 设置窗口可视

```java
 Frame f = new Frame("我的第一个窗口");       //设置窗口的标题
        f.setVisible(true);         //设置窗口可视
        f.setResizable(true);       //设置窗口是否可以拉伸

        f.setSize(400,400);         //设置窗口的大小
        f.setLocation(400,400);     //设置窗口的初始出现位置,(0,0)为屏幕的左上方

        //f.setBounds(400,400,400,400);  //相当于设置窗口的初始出现位置,(0,0)为屏幕的左上方，设置窗口的大小
        f.setBackground(new Color(210, 14, 14));        //设置窗口背景颜色
```



### 1.2、创建面板,设置布局

```java
   Frame f =new Frame("我的第一个窗口");       //创建一个窗口
       Panel p = new Panel();           //创建一个面板

        f.setLayout(null);          //设置布局
        f.setBounds(300,300,400,400);       //坐标为电脑窗口的坐标 //设置行坐标，列坐标，窗口的宽，窗口的长
        f.setBackground(new Color(255, 255, 255, 255));     //设置窗口的背景

        p.setBackground(new Color(0,0,0));      //设置面板的背景
        p.setBounds(0,0,200,200);     //设置面板的大小,其中坐标为窗口中的坐标

        f.add(p);       //背景中添加面板
        f.setVisible(true);  	//设置窗口可视

        //监听命令
        f.addWindowListener(new WindowAdapter() {       //适配器
            @Override
            public void windowClosing(WindowEvent e) {          //关闭窗口事件
                System.out.println("关闭窗口");
                System.exit(0);
            }
        });
```



### 1.3管理布局

- 流式布局  FlowLayout	（左右布局

  ```java
   Frame f = new Frame("流式布局窗口");
  
          //创建按钮
          Button button1 = new Button("button1");
          Button button2 = new Button("button1");
          Button button3 = new Button("button1");
  
          f.setBounds(300,300,400,400);
          f.setBackground(new Color(255,255,255));
  
          //设置流式布局
          f.setLayout(new FlowLayout(1));     // 0 为窗口的左边，1 为窗口的中间，2 为窗口的右边
  
          //添加按钮
          f.add(button1);
          f.add(button2);
          f.add(button3);
  
          //添加缉监听事件
          f.addWindowListener(new WindowAdapter() {
              @Override
              public void windowClosing(WindowEvent e) {
                  System.out.println("关闭窗口");
                  System.exit(0);
              }
          });
  
          f.setVisible(true);
      }
  ```

  

- 东西南北东布局   BoraderLayout（上下布局）

  ```java
     Frame f  = new Frame("东西南北中布局窗口");
  
          Button w = new Button("West");
          Button e = new Button("East");
          Button n = new Button("North");
          Button c = new Button("Center");
          Button s = new Button("South");
  
          //设置窗口
          f.setSize(400,400);
          f.setLocation(300,300);
  
          //添加布局
          f.add(w,BorderLayout.WEST);
          f.add(e,BorderLayout.EAST);
          f.add(n,BorderLayout.NORTH);
          f.add(c,BorderLayout.CENTER);
          f.add(s,BorderLayout.SOUTH);
  
  
          //添加缉监听事件
         f.addWindowListener(new WindowAdapter() {
             @Override
             public void windowClosing(WindowEvent e) {
                 System.out.println("关闭窗口");
                 System.exit(0);
             }
         });
  
          f.setVisible(true);
  ```

  

- 表格布局   GridLayout  

  ```java
   Frame f  = new Frame("东西南北中布局窗口");
   f.setSize(400,400);
   f.setLocation(300,300);
  
   Button button1 = new Button("button1");
   Button button2 = new Button("button2");
   Button button3 = new Button("button3");
   Button button4 = new Button("button4");
   Button button5 = new Button("button5");
   Button button6 = new Button("button6");
  
   f.setLayout(new GridLayout(3,2));
  
   f.add(button1);
   f.add(button2);
   f.add(button3);
   f.add(button4);
   f.add(button5);
   f.add(button6);
  
   //f.pack();   //Java函数，自动填充最佳位置
  
   //添加缉监听事件
  f.addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
          System.out.println("关闭窗口");
          System.exit(0);
      }
  });
  
   f.setVisible(true);
  ```



### 总结:

-  Frame 是一个顶级窗口

- Panel无法单独显示，需要被添加到某容器中

- 布局管理器

1. 流式

   2.东西南北中

   3.表格

   4.定位，背景颜色，可视性，监听



### 监听事件

### 1.按钮事件

T1

```java
public class TryDemo {
    public static void main(String[] args) {
        //设置窗口
        Frame frame = new Frame();
        frame.setSize(400,400);
        frame.setLocation(300,200);

        //给按钮添加事件
        Button button1 = new Button("button1");
        button1.addActionListener(new MyActionListener());

        //窗口添加按钮
        frame.add(button1,BorderLayout.CENTER);
        frame.setVisible(true);
        closeWindow(frame);
    }

    //关闭窗口事件
    private  static void  closeWindow(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("关闭窗口");
                System.exit(0);
            }
        });
    }
}

//重写事件内容
class MyActionListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("点击了按钮");
    }
} 
```

T2

```java
public class TryDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("开始--停止");
        frame.setLocation(300,400);

        Button button1 = new Button("start");
        Button button2 = new Button("stop");
        button2.setActionCommand("停止");

        button1.addActionListener(new MyActionListener());
        button2.addActionListener(new MyActionListener());

        frame.add(button1,BorderLayout.NORTH);
        frame.add(button2,BorderLayout.SOUTH);

        closeWindow(frame);
        frame.pack();
        frame.setVisible(true);
    }
    private  static  void closeWindow(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("关闭窗口");
                System.exit(0);
            }
        });
    }
}
class MyActionListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("点击按钮: mes -->" +e.getActionCommand());   //获取按钮信息
    }
}
```



### 2.加法窗口(监听器写到内部类)

```java
public class TryDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.loadFrame();
        closeWindow(calculator);
    }

    //关闭事件监听
    public static void closeWindow(Frame frame) {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("关闭窗口");
                System.exit(0);
            }
        });

    }

}
class Calculator extends  Frame{
    
    TextField num1,num2,num3;
    public  void loadFrame() {
        
        //流式布局
        setLayout(new FlowLayout());
       
        //三个文本框
        num1  = new TextField(10); //设置输入长度
        num2  = new TextField(10); //设置输入长度
        num3  = new TextField(20); //设置输入长度
      
        //一个标签(+)
        Label  label = new Label("+");
       
        //一个按钮(=  添加事件)
        Button button = new Button("=");
        button.addActionListener(new MyListener());

        //添加管理布局
        add(num1);
        add(label);
        add(num2);
        add(button);
        add(num3);
        pack();
        setVisible(true);
    }

    //内部类处理文本框
   class MyListener implements ActionListener{

       @Override
       public void actionPerformed(ActionEvent e) {
          
           //提取文本框内容并转化为整型
           int i1 = Integer.parseInt(num1.getText());
           int i2 = Integer.parseInt(num2.getText());

           //设置处理文本框
           num3.setText(""+(i1 + i2));
           num1.setText("");
           num2.setText("");
       }
   }
}
```





