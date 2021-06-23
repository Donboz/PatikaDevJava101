package odevler;

import java.util.Scanner;

public class PowerOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int power,num,total=1,i;
        System.out.print("Sayıyı giriniz: ");
        num = input.nextInt();
        System.out.print("Üssü giriniz: ");
        power = input.nextInt();

        for (i=1;i<=power;i++){
            total *= num;
        }
        System.out.println("İşleminiz: "+total);
    }
}
