package educate;
/*
 ������������ : ��ķ���������(final)����̬��Ա�ȵ�
 ջ����� : �ӷ��������ط������õ��ڴ�(�����Ƚ����)  �����ñ������ڵ��ڴ�
 �Ѵ���� : �洢������������߶���(�������ݺͶ�������)
 */
public class ImportantContent {
    public static void main(String[] args) {
        /*
        ��һ�ֶ��� �������� [] ������ = new ������ [���鳤��];
        �ڶ��ֶ��� �������� [] ������ = new ������ []{ֵ1��ֵ2��ֵ3��������};
        �����Ӷ��� �������� [] ������ ={ֵ1��ֵ2��ֵ3.������};
         */
        /*
            Ϊ��ֵ����Ĭ��ֵ:
            int , long -> 0
            double , float -> 0.0
            boolean  -> false
         */
        int[] Array = new int[]{1, 2, 3};
        System.out.println(Array[0]);
        System.out.println(Array[1]);
        printArray(Array);
        Array = null;
        System.out.println(Array[2]);
        /*
        �������:
            д��main������main��������ڷ�����
            ������ʼ���е�ʱ�򣬷��������ؽ�ջ��
            ��ջ���е�main����ʵ�� int [] Array
            Ȼ���ڶ��п������ռ䣬����������ռ���׵�ַ�ر��� Array ��
            Ȼ����main�����д�������ʵ�ֺ���
            ������ Array = null ��ʱ��,����� Array ����ָ����е��׵�ַ�� ////ָ�򷽷�����һ���յ�ַ
            ������滹�ô� Array �������õ�ʱ�����޷��ٷ���ԭ�����ϵ�����
         */
    }
    static void printArray(int arr[]){  //�������͵ı�����Ϊ�������ݵ�ʱ�򣬴��ݵ��ǵ�ַ
        for(int i = 0;i < 2;i++){       //�������͵ı�����Ϊ�������ݵ�ʱ�򣬴��ݵ���ֵ
            System.out.println(arr[i]);
        }
    }
}
