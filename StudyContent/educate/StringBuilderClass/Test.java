package educate.StringBuilderClass;

public class Test {
    public static void main(String[] args) {
     String s = "abc";
     StringBuilder str = new StringBuilder(s);
     System.out.println("��String��ת��ΪStringBuilder��: "+str);
     str.append("def");    //�������������µ�StringBuilder�����ý���;
     System.out.println("StringBuilder��strӦ��append�������def: "+ str);
     String s2 = str.toString();
     System.out.println("��StringBuilder��ת��ΪString��: " + s2);
     StringBuilder str2 = new StringBuilder("Hello World");
     int length = str2.capacity();   //����str2������
     System.out.println(length);
     str2.delete(0,6);  //ɾ��������ʼ������ǰһ�������ݣ����������������������
     System.out.println(str2);
     str2.deleteCharAt(0);  // ɾ����������������
     System.out.println(str2);
    }
}
