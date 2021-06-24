package odevler;

import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int n,k,i,t;
        n = input.nextInt();
        t = (n) * 2;
        for (i = 0 ; i < t ; i++ ){
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
