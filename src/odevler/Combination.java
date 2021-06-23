package odevler;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,r,sum,total=0,facR=1,facN=1,facSum=1,i;
        System.out.print("Lütfen Eleman sayısını giriniz: ");
        n = input.nextInt();
        System.out.print("Lütfen bir elaman yazınız: ");
        r = input.nextInt();
        for (i=1;i<=n;i++){
            facN = facN*i;
        }
        for (i=1;i<=r;i++){
            facR = facR*i;
        }
        sum = n-r;
        for (i=1;i<=sum;i++){
            facSum = facSum*i;
        }
        total = (facN / (facR *  facSum) );
        System.out.println(total);
    }
}
