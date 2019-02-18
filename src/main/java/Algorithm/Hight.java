package Algorithm;


/*
* 【程序10】 题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在   第10次落地时，共经过多少米？第10次反弹多高？
* */
public class Hight {
    public static void main(String[] args) {
        double l = 0, h =100;
        for(int i = 1; i <= 10; i++){
//            l = l+h;
            l+=h;
            h=h/2;

        }
        System.out.println("第十次反弹高度："+h+"米; 第十次落地后共经过："+l+"米！");
    }
}
