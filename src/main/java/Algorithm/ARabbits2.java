package Algorithm;


//本程序会报错：StackOverflowError堆栈溢出错误
/*程序1】   题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第四个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
1.程序分析：   兔子的规律为数列1,1,2,3,5,8,13,21....*/
public class ARabbits2 {

    public static void main(String args[]){
        for(int j=0;j<3;j++){
            System.out.println(rabbits(j));
        }
    }

    public static int rabbits(int i){
        if(i == 1 || i == 2)
            return 1;
        else
            return rabbits(i-1)+rabbits(i-2);
    }

}
