package Algorithm;

public class SumFactor {
    public static void main(String[] args) {
        int i = 0, s=0, n = 0;
        for(i=2;i<=1000;i++){

            for(int j=1;j<i;j++){
                if(i % j==0){
                    s=s+j;
                }
            }
            if(s==i){
                System.out.print(i+" ");
            }
        }
    }
}
