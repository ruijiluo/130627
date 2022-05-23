package educate.StringClass;

/*  ����String �෽������:
boolean:contains(String)   //�ڱ����У��������ж��ַ������Ƿ�����������ַ���
String:concat(String)      //�ڱ����У����������ַ�����������µ��ַ���
boolean:equals(String)     //�ڱ����У��������ж������ַ����Ƿ���ͬ�����ִ�Сд
boolean:equalsIgnoreCase(String)    //�ڱ����У��������ж������ַ�������ĸ�Ƿ���ͬ,�����ִ�Сд
boolean:startsWith(String)      //�ڱ����У��������ж��ַ�������ʼ�ַ����Ƿ�Ϊ�������ַ���
 */

public class StringJudgmentFunction {
    public static void main(String[] args) {
     String str = new String("Hello World");
     if(str.contains("World")){    // contains() ������������ַ������Ƿ��з�����ַ�������
         System.out.println("����World");
     }else{
         System.out.println("�����޹�");
     }
     String str1 = str.concat(",I love China");      //concat() ���������ڱ��ַ������������µ��ַ�������,�������ݲ���������Ҫ����
     System.out.println(str1);
     System.out.println("---------------------------");
     String str2 = new String("abc");
     String str3 = new String("ABC");
     boolean b1 = str2.equals(str3);
     boolean b2 = str2.equalsIgnoreCase(str3);
     System.out.println("equals(): " +b1);  // equals() �������ִ�Сд
     System.out.println("equalsIgnoreCase(): " + b2);       // equalsIgnoreCase() ���������ִ�С
     System.out.println("statsWith(): "+str2.startsWith("a"));   // startsWith() �������ִ�Сд
     System.out.println("startsWith(): "+str3.startsWith("ab"));
     System.out.println("ifEmpty(): " +str2.isEmpty());
     System.out.println("---------------------------");
    }
}
