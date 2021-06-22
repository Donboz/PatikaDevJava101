package odevler;

import java.util.Scanner;

public class CollectingDividedToFourNumbersUntilOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,total = 0;
        System.out.print("Lütfen sayı giriniz(tek sayılar döngüyü bitirir.): ");
        num = input.nextInt();
        while(num % 2 != 1){
            if(num % 4 == 0){
                total += num;
            }
            System.out.print("Lütfen sayı giriniz(tek sayılar döngüyü bitirir.): ");
            num = input.nextInt();
        }
        System.out.println("4`e kalansız bölünen sayıları toplamı: "+total);
    }
}
