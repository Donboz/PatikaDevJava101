package odevler;

import java.util.Scanner;

public class ExponentOfFourFiveUntilNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,i,k;
        System.out.print("Lütfen sınır sayısını giriniz: ");
        num = input.nextInt();
        System.out.println("Dördün Kuvvetleri: ");
        for (i=1;i<=num;i*=4){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Beşin Kuvvetleri: ");
        for (k=1;k<=num;k*=5){
            System.out.print(k+" ");
        }
    }
}
