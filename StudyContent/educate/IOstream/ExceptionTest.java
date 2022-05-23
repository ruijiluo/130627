package educate.IOstream;
/*
     顶层父类:Throwable
   1.Exception 为可预料异常，可以修改
   2.Error  为不预料异常，无法修改
 */
public class ExceptionTest {
    public static void main(String[] args) {
        //捕获异常  格式:try catch finally
        System.out.println("测试捕获异常");
        try{
            //尝试要执行的代收，出现问题则直接进入catch语句
            int a = 10 / 0;
            System.out.println("a: "+a);
            return;
        }catch (Exception e){
            //出现问题后的代码
            System.out.println("出现异常");
            //return;
        }finally{
            //一般情况下会正常在try或者catch语句结束前执行,用来释放内存
            System.out.println("执行了finally语句");
        }
        System.out.println("-----------------");


        //抛出异常(谁调用解决)
        //方案1，进行抛出异常，让JVM解决
        //方案2. 调用者解决
        System.out.println("测试抛出异常");
        try{
            show();
        }catch (Exception e){
            System.out.println("出现异常");
        }finally {
            System.out.println("执行了finally语句");
        }

    }
    public  static void show() throws Exception{
        int a = 10 / 0;
        System.out.println("a: "+ a);
    }
}
