package educate.Reflex.constructorTest;

import java.awt.*;
import java.sql.SQLType;

public class Student {
    //公共空参构造方法
    public Student() {
    }

    //公共有参构造方法
    public Student(String name) {
        System.out.println("Your name: " + name);
    }

    //私有有参构造方法
    private Student(int age) {
        System.out.println("Your age: " + age);
    }

    //公共带参方法
    public  void Speak(String str){
        System.out.println("What I said: " +str);
    }

    //公共带参方法
    public int sum(int a ,int b ){
        System.out.println("Returns a public method with parameters of type int!");
        return a+b;
    }

    //共有无参方法
    public void say1(){
        System.out.println("Public nonparametric method");
    }
    //私有无参方法
    public void say(){
        System.out.println("Private parameterless method");
    }

}
