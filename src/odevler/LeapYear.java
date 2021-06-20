package odevler;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;
        System.out.print("Lütfen yılınızı girin: ");
        yil = input.nextInt();
        if(yil % 100 == 0){
            if(yil % 400 == 0){
                System.out.println(yil+" artık yıldır.");
            }else{
                System.out.println(yil+" artık yıl değildir.");
            }
        }else{
            if(yil % 4 == 0){
                System.out.println(yil+" artık yıldır.");
            }else{
                System.out.println(yil+" artık yıl değildir.");
            }
        }
    }
}
