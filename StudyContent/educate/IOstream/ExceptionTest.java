package educate.IOstream;
/*
     ���㸸��:Throwable
   1.Exception Ϊ��Ԥ���쳣�������޸�
   2.Error  Ϊ��Ԥ���쳣���޷��޸�
 */
public class ExceptionTest {
    public static void main(String[] args) {
        //�����쳣  ��ʽ:try catch finally
        System.out.println("���Բ����쳣");
        try{
            //����Ҫִ�еĴ��գ�����������ֱ�ӽ���catch���
            int a = 10 / 0;
            System.out.println("a: "+a);
            return;
        }catch (Exception e){
            //���������Ĵ���
            System.out.println("�����쳣");
            //return;
        }finally{
            //һ������»�������try����catch������ǰִ��,�����ͷ��ڴ�
            System.out.println("ִ����finally���");
        }
        System.out.println("-----------------");


        //�׳��쳣(˭���ý��)
        //����1�������׳��쳣����JVM���
        //����2. �����߽��
        System.out.println("�����׳��쳣");
        try{
            show();
        }catch (Exception e){
            System.out.println("�����쳣");
        }finally {
            System.out.println("ִ����finally���");
        }

    }
    public  static void show() throws Exception{
        int a = 10 / 0;
        System.out.println("a: "+ a);
    }
}
