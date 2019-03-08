package com.my.algorithm;

/*
【程序16】 题目：输出9*9口诀。
1.程序分析：分行与列考虑，共9行9列，i控制行，j控制列。
*/

public class NineNine {
    public static void main(String[] args) {
        int i=0,j=0;
        for(i=1;i<=9;i++){
            for(j=1;j<=i;j++)
                System.out.print(i*j+"\t");
                System.out.println();
        }
    }
}
