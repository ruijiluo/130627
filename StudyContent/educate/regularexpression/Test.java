package educate.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 Pattern p = Pattern.compile("a*b");  //����Pattern�����ý�������������ʽ����(compile)Ϊ���и�����־��ģʽ
 Matcher m = p.matcher("aaaaab");     //matches�������Խ���������������ģʽ����ƥ��(matcher)
 boolean b = m.matches();       //matches�������Խ���������������ģʽ����ƥ��
 */
public class Test {
    public static void main(String[] args) {
      String regex = "[0-9.]+";
      String str = "ƻ��: 17.6Ԫ��ѩ��: 18.0Ԫ,��ݮ: 30.7Ԫ";
      double sum = 0;
      Pattern p =Pattern.compile(regex);        //����Pattern������,��������������ʽ����Ϊ���и�����־��ģʽ
      Matcher m =p.matcher(str);             //matches�������Խ���������������ģʽ����ƥ��
      while(m.find()){               //find() �����ҵ�ƥ��ģʽ���������е���һ��������,���������һ������������ָ����һ����
          String get = m.group();    //��������һ��ƥ��ƥ������������У����û��find()��group()�������޷��ҵ����У���ֻ��һ��find()���������
          sum += Double.valueOf(get);  //ʹ�ð�װ���еķ������ַ�����ת��Ϊ��Ӧ��װ��Ļ�������
      }
      System.out.println(str);
      System.out.println("��Ʒ�۸�һ��: " +sum +"Ԫ");

    }
}
