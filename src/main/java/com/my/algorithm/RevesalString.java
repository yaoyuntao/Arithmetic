package com.my.algorithm;

public class RevesalString {

    public static int[] revesalArray(int[] arr){
        int[] newarr=new int[arr.length];
        for(int i =0; i<=arr.length-1;i++){
            newarr[i] = arr[arr.length-i-1];
        }
        return newarr;
    }
    public static char[] revesalArray(char[] arr){
        char[] newarr=new char[arr.length];
        for(int i =0; i<=arr.length-1;i++){
            newarr[i] = arr[arr.length-i-1];
        }
        return newarr;
    }

    public static double toNum(int[] arr){
        double sum =0,n = 0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==0){
                n = arr[i] * Math.pow(10, i);
            }else{
                n = arr[i] * Math.pow(10, i);
            }
            sum+=n;
        }
        return sum;
    }



    public static void main(String[] args) {
        String s="i am a songxiaonan";
        char[] array = s.toCharArray();

        for(int i = 0; i<=array.length-1;i++){
            System.out.print(array[array.length-1-i]);

        }

    }
}
