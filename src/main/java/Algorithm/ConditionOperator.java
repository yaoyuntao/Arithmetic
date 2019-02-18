package Algorithm;

/*【程序5】   题目：利用条件运算符的嵌套来完成此题：
学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
1.程序分析：(a> b)?a:b这是条件运算符的基本例子。
[扩展]
*/
public class ConditionOperator {
    public static void main(String[] args) {
        String str="";
        PrimeFac primeFac = new PrimeFac();
        str = javax.swing.JOptionPane.showInputDialog("请输入成绩N(输入exit退出)：");
        int N=0;
        N=Integer.parseInt(str);
        str=(N>90?"A":(N>80?"B":(N>70?"C":(N>60?"D":"E"))));
        System.out.println(str);
        System.exit(0);
    }
}
