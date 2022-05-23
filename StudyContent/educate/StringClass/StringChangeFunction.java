package educate.StringClass;

/*  ����String�෽������:
byte[]:  getBytes()  // //�ڱ����У������ǽ��ַ���ת��Ϊ�ֽ�����
char[]:  toChatArry()  // //�ڱ����У������ǽ��ַ���ת��Ϊ�ַ�����
static String:  valueOf()   //�ڱ����У������ǽ�ָ��������������ת��Ϊ�ַ���,����ֱ��ͨ��String��ʹ�÷���
String replace(old,new)   //�ڱ����У������ǽ�ָ���ַ������ַ����滻Ϊ�µ��ַ������ַ���
String[]:  split()     //�ڱ����У�������ͨ���������ַ����ָ�ԭ�����ַ��������طָ����ַ�����ԭ�����ַ�������
String:  trim()    //�ڱ����У�������ȥ���ַ������˵Ŀհ��ַ�
 */

public class StringChangeFunction {
    public static void main(String[] args) {

        //ʹ�� getByes() �������ַ���ת��Ϊ�ֽ�����
        String str1 = "abc";
        byte []bys = str1.getBytes();
        System.out.print("��getBytes�������ַ���abcת��Ϊ�ֽ�����: ");
        for(int i = 0; i < bys.length;i++){
            if(i == bys.length-1) System.out.println(bys[i]);
            else  System.out.print(bys[i]+" ");
        }
        System.out.println("-------------");

        //ʹ�� toCharArray() �������ַ���ת��Ϊ�ַ�����
        String str2 = "ABC";
        System.out.print("��toCharArray�������ַ���ABCת��Ϊ�ַ�����: ");
        char[] chs = str2.toCharArray();
        for(int i = 0; i < chs.length; i++){
            if(i == chs.length -1) System.out.println(chs[i]);
            else System.out.print(chs[i] +"  ");
        }
        System.out.println("-------------");

        //ʹ�� valueOf() ������ָ��������������ת��Ϊ�ַ���
        int is1 = 123;
        System.out.print("��valueOf����int�͵�123ת��Ϊ�ַ���123: ");
        String str3 =String.valueOf(is1);
        System.out.println(str3+4);
        System.out.print("int�͵�123ǰ��˫ð�Ŵ����String����: ");
        String str4 = "" + 123;     //ʵ�ʿ���������� valueOf() ����
        System.out.println(str4 +4);
        System.out.println("-------------");

        //ʹ�� replace(old,new) �����µ��ַ������ַ����滻ԭ���ַ����е��ַ������ַ���
        String str5 = "bca bca bca";
        System.out.print("��replace()�������ַ�a����d: ");
        System.out.println(str5.replace('a','d'));
        System.out.println("-------------");

        //ʹ�� trim() �������ַ�����ǰ��Ŀհ׷�ȥ��
        String str6 = "  abc  abc  abc  ";
        System.out.println("ԭ���ַ����ĳ���: "+ str6.length());
        System.out.print("��trim()�������ַ���ǰ��Ŀհ׷�ȥ��: ");
        System.out.println(str6.trim());
        System.out.println("ȥ���ո���ַ����ĳ���: "+ str6.trim().length());







    }
}
