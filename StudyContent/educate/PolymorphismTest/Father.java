package educate.PolymorphismTest;

public class Father {
    public static void main(String[] args) {
        Father1 s = new Son1();  //编译看左（看父类是否有该成员），运行看右（运行用的是右边类中该成员）
        s.speak(); //调用的时候是先判断子类是否有该方法，有则覆盖父类方法，无则调用父类方法
       // s.fa();   多态无法调用子类特有的成员
    }
}
class Father1{
    public void speak() {
        System.out.println("这是父类方法!");
    }
}
class Son1 extends Father1{
    @Override
    public void speak(){
        System.out.println("这是重写子类方法！");
    }
    public void fa(){
        System.out.println("测试新增方法！");
    }
}
