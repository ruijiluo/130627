package educate.baseclass;

//Ŀ���ǽ��ַ������͵�����ת��Ϊ�������͵�����

public class Test {
    public static void main(String[] args) {
        Integer in = 100; // װ��:����Ӧ��������ת��Ϊ��װ��
        int i = in ;  //����:����װ��ת��Ϊ��������
        //����Character��װ���⣬����7�ֿ���ͨ�� ����.parseXxx(String)���ַ���ת��Ϊ��Ӧ��������
        String s = "10";
        int i1 = Integer.parseInt(s);
        System.out.println("s = " + i1);
        System.out.println("s + 2 = "+(i1 + 2));


        //�ַ���ת��Ϊ�ַ�����ͨ��String��� .toCharArray ���� .charAt()
        String s2 = "I love China";
        char [] chs =s2.toCharArray();
        for(int j = 0; j < chs.length; j++){
            if(j == chs.length -1)   System.out.println(chs[j]);
            else System.out.print(chs[j]);
        }
        char ch =s2.charAt(7);
        System.out.println("�ַ����е�7���������ַ�: "+ ch);



    }
}
