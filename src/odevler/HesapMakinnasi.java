package odevler;

import java.util.Scanner;

public class HesapMakinnasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s1,s2,durum;
        System.out.print("Lütfen 1. sayıyı giriniz: ");
        s1=input.nextInt();
        System.out.print("Lütfen 2. sayıyı giriniz: ");
        s2=input.nextInt();

        System.out.println("Lütfen işlem seçmek için işlemerin solundaki sayıları giriniz\n\n\n1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme");
        System.out.print("Seçiniz: ");
        durum=input.nextInt();
        switch(durum){
            case 1:
                System.out.print("Toplam: "+(s1+s2));
                break;
            case 2:
                System.out.print("Kalan: "+(s1-s2));
                break;
            case 3:
                System.out.print("Çarpım: "+(s1*s2));
                break;
            case 4:
                switch (s2){
                    case 0:
                        System.out.print("Bir sayıyı sıfıra bölemezsin");
                        break;
                    default:
                        System.out.print("Bölüm: "+(s1/s2));

                }
                break;
            default:
                System.out.print("Gerçerli işlem girilmedi");

        }
    }
}
