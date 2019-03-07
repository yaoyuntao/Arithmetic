package MyAlgorithm;

//不能在prime函数打印输出，因为有循环可能会多个次输出;做boolean判断

/*【程序2】   题目：判断101-200之间有多少个素数，并输出所有素数。
1.程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除，
则表明此数不是素数，反之是素数。   */
public class PrimeNum {

    public static boolean prime(int i){
        for(int j = 2; j<= StrictMath.sqrt(i); j++){
            if(i%j==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        for(int j=101;j<200;j++){
            if(prime(j)==true){
                System.out.println(j);
            }
        }


    }

}
