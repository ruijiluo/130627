package educate.StringClass;

import java.util.Arrays;

public class SteingTest {
    public static void main(String[] args) {
        byte []by = {97,98,99};
        String str = Arrays.toString(by);
        System.out.println(str);
        String regex = "[\\[, \\]]+";
        String []str1 =str.split(regex);
        for(int j = 0; j < str1.length; j++){
            if(j == str1.length -1) System.out.println(str1[j]);
            else System.out.print(str1[j] + " ");
        }

    }
}
