package educate.Reflex.getClass;

public class getClass {
    public static void main(String[] args) throws ClassNotFoundException {
        Student st = new Student();
        Class class1 =st.getClass();
        System.out.println(class1);
        Class class2 = Student.class;
        System.out.println(class2);
        Class class3 =Class.forName("educate.Reflex.getClass.Student");
        System.out.println(class3);
    }
}
class Student{
    private  String name;
    private  int age;
}
