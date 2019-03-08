package com.my.algorithm;


/*【程序3】   题目：打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。     
1.程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
 */
public class NarcissusNum {

    public static boolean Narcissus(int n){
        int i,j,k;
        i = n/100;
        j = (n%100)/10;
        k = n%10;
        if(n == i*i*i+j*j*j+k*k*k){
            return true;
        }else
        return false;
    }

    public static void main(String args[]){
        for(int j=100;j<900;j++){
            if(Narcissus(j)==true){
                System.out.println(j);
            }
        }


    }

}
