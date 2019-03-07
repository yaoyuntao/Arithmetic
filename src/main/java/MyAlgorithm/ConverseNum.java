package MyAlgorithm;

import java.lang.reflect.Array;

public class ConverseNum {
    public static void converse(int n){
        String str = Integer.toString(n);
        char[] ch = str.toCharArray();
        int l = ch.length;
//        System.out.println(ch[l-1]+"&&&&&");
        if('0'==ch[l-1]){
            for(int i = l-2;i>=0;i--){
                System.out.print(ch[i]);
            }
        }
        System.out.println("\n");
        if(n%10==0){
            for(int i = l-2;i>=0;i--){
                System.out.print(ch[i]);
            }
        }else
            for(int i = ch.length-1;i>=0;i--){
                System.out.print(ch[i]);
            }
        }


    public static void main(String[] args) {
        ConverseNum.converse(230);
    }
}
