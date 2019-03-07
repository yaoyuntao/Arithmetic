package MyAlgorithm;

import java.util.Scanner;  
public class exp {
    public static void main(String[] args) {
         exp tn = new  exp();
        Scanner s = new Scanner(System.in);
        long a = s.nextLong();
        if (a < 0 || a > 100000) {
            System.out.println("Error Input, please run this program Again");
            System.exit(0);
        }
        if (a >= 0 && a <= 9) {
            System.out.println(a + "是一位数");
            System.out.println("按逆序输出是" + '\n' + a);
        } else if (a >= 10 && a <= 99) {
            System.out.println(a + "是二位数");
            System.out.println("按逆序输出是");
            tn.converse(a);
        } else if (a >= 100 && a <= 999) {
            System.out.println(a + "是三位数");
            System.out.println("按逆序输出是");
            tn.converse(a);
        } else if (a >= 1000 && a <= 9999) {
            System.out.println(a + "是四位数");
            System.out.println("按逆序输出是");
            tn.converse(a);
        } else if (a >= 10000 && a <= 99999) {
            System.out.println(a + "是五位数");
            System.out.println("按逆序输出是");
            tn.converse(a);
        }
    }

    public void converse(long l) {
        String s = Long.toString(l);
        char[] ch = s.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
    }
}