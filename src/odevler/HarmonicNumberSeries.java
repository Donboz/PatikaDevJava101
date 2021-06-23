package odevler;

import java.util.Scanner;

public class HarmonicNumberSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz :");
        double n = input.nextInt();
        double total = 0;
        while (n > 0) {
            total += (1 / n);
            n--;
        }

        System.out.println(total);
    }
}
