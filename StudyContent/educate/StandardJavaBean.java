package educate;

public class StandardJavaBean {
    public static void main(String[] args) {

    }
}
class Test{

    //������public���Σ���Ա������private����
    //���޲ι��캯��
    public Test(){};
    //�г�Ա����
    private String name;
    private int age;
    //���вι��캯��
    public Test(String name,int age){
        this.age = age;
        this.name = name;
    }
    //��set����
    public void setAge(int age){
        this.age = age;
    }
    //��get����
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