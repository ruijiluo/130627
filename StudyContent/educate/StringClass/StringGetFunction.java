package educate.StringClass;

/*  ����String �෽������:
int: length()       //�ڱ����У������ǻ�ȡ�ַ����ĳ���
char: charAt(int index)     //�ڱ����У������ǻ�ȡ���������±���ַ�
int: indexOf(String)        //�ڱ����У������ǻ�ȡ��һ�����ַ�������
int: lastIndexOf(string)    //�ڱ����У������ǻ�ȡ���һ�������ַ�������
String: subString(int)      //�ڱ����У������ǻ�ȡ�Ӹ��������±굽����һ���ַ���
String: subString(int,int)      //�ڱ����У������ǻ�ȡ�ӵ�һ������������������������ǰһ���ַ���һ���ַ���
 */

public class StringGetFunction {
    public static void main(String[] args) {
        String str = "Hello world,I love China";
        //length() ������ȡ�ַ����ĳ���
        System.out.println("str�ַ����ĳ���Ϊ: " + str.length());
        //chatAt() ������ȡ���������±���ַ�
        System.out.println("�ַ���������Ϊ19���ַ�: "+ str.charAt(19) );
        //indexOf() ������ȡ��һ�������ַ����ֵ�����
        System.out.println("��һ���ַ�l���ֵ�����Ϊ: "+ str.indexOf('l'));
        //lastIndexOf() ������ȡ���һ�������ַ����ֵ�����
        System.out.println("���һ���ַ�l���ֵ�����Ϊ: "+ str.lastIndexOf('l'));
        //subString(int) ������ȡ�Ӹ������������������һ���ַ���
        System.out.println("������12�����������һ���ַ���Ϊ: "+ str.substring(12));
        //subString(int.int) ������ȡ�ӵ�һ�������������ڶ�������������һ���ַ���һ���ַ���
        System.out.println("������19��23��һ�����ַ���: "+ str.substring(19,24));  //��ȡ���ַ���������ΧΪ[19,24)

    }
}
