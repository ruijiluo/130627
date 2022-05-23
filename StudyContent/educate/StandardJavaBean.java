package educate;

public class StandardJavaBean {
    public static void main(String[] args) {

    }
}
class Test{

    //方法用public修饰，成员变量用private修饰
    //有无参构造函数
    public Test(){};
    //有成员变量
    private String name;
    private int age;
    //有有参构造函数
    public Test(String name,int age){
        this.age = age;
        this.name = name;
    }
    //有set函数
    public void setAge(int age){
        this.age = age;
    }
    //有get函数
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name  = name;
    }
    public String getName(){
        return name;
    }
}