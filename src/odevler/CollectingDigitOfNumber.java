package odevler;

import java.util.Scanner;

public class CollectingDigitOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,tempNum,digits,total = 0;

        System.out.print("Sayı Giriniz :");
        num = input.nextInt();
        tempNum = num;
        while (tempNum != 0) {
            digits = tempNum % 10;
            total += digits;
            tempNum /= 10;
        }
        System.out.println("Basamak sayılarının toplamı: "+total);
    }
}
