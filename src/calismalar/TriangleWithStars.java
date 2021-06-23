package calismalar;

import java.util.Scanner;

public class TriangleWithStars {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int n,j,k,i;
        n = klavye.nextInt();

        for (i = 1; i <= n ; i++) {
            for (k = 0; k < (n-i); k++) {
                System.out.print(" ");
            }
            for (j = 0; j < (i*2-1);j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
