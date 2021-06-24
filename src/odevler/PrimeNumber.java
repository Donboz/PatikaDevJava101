package odevler;

public class PrimeNumber {
    public static void main(String[] args) {
        int i,j,num;
        for (i = 2;i <= 100;i++){
            num = 0;
            for (j = 2;j <= i/2;j++){
                if(i%j==0) num++;
            }
            if(num==0) System.out.println(i);
        }
    }
}
