package com.my.algorithm;
/*
【程序11】   题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
1.程序分析：可填在百位、十位、个位的数字都是1、2、3、4。组成所有的排列后再去   掉不满足条件的排列。
*/
public class AllNum {

    public static void main(String[] args) {
        int t=0;
        for(int i=1; i<=4;i++){
           for(int j=1; j<=4;j++){
               for(int k=1;k<=4;k++){
                   if(i!=j&&j!=k&&k!=i){
                       t+=1;
                       System.out.println(i*100+j*10+k);
                   }
               }
           }
        }
        System.out.println(t);
    }
}
