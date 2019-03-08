package com.my.algorithm;

public class Revesal {

    public  int[] revesalArray(int[] arr){
        int[] newarr=new int[arr.length];
        for(int i =0; i<=arr.length-1;i++){
            newarr[i] = arr[arr.length-i-1];
        }
        return newarr;
    }
    public  char[] revesalArray(char[] arr){
        char[] newarr=new char[arr.length];
        for(int i =0; i<=arr.length-1;i++){
            newarr[i] = arr[arr.length-i-1];
        }
        return newarr;
    }

    public double toNum(int[] arr){
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


//
//    public static void main(String[] args) {
//        int n = 123467890;
//        String str = Integer.toString(n);
//        char[] array = str.toCharArray();
//        int[] arrint = new int[array.length];
//
//        for(int i = 0; i<=array.length-1;i++){
//            System.out.println("array:"+array[i]);
//            arrint[i]=(int)array[i]-48;
//            System.out.println(arrint[i]);
//        }
////        int[] arr = {2,3,4,0,9};
//        double sum=Revesal.toNum(arrint);
//        System.out.println((int)sum);
//    }
}
