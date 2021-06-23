package odevler;

import java.util.Scanner;

public class DiamondWithStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int n,j,k,i,t;
        n = input.nextInt();

        for (i = 1; i <= n ; i++) {
            for (k = 0; k < (n-i); k++) {
                System.out.print(" ");
            }
            for (j = 0; j < (i*2-1);j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        t = (n-1) * 2;
        for (i = 0 ; i < t ; i++ ){
            System.out.print(" ");
            for(k = t-i ; k < t ; k++ ){
                System.out.print(" ");
            }
            for(k= t-i*2-1 ; k > 0 ; k-- ){
                System.out.print("*");
            }

            for(k = t-i ; k < t ; k++ ){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
