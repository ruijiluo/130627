package educate.PolymorphismTest;

public class Father {
    public static void main(String[] args) {
        Father1 s = new Son1();  //���뿴�󣨿������Ƿ��иó�Ա�������п��ң������õ����ұ����иó�Ա��
        s.speak(); //���õ�ʱ�������ж������Ƿ��и÷��������򸲸Ǹ��෽����������ø��෽��
       // s.fa();   ��̬�޷������������еĳ�Ա
    }
}
class Father1{
    public void speak() {
        System.out.println("���Ǹ��෽��!");
    }
}
class Son1 extends Father1{
    @Override
    public void speak(){
        System.out.println("������д���෽����");
    }
    public void fa(){
        System.out.println("��������������");
    }
}
