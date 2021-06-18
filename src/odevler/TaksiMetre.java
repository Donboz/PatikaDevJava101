package odevler;

import java.util.Scanner;

public class TaksiMetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double enAz,KMTutar,toplam;
        int KM,acilis;
        System.out.print("Lütfen kaç KiloMetre gidildiğini yazınız: ");
        KM = input.nextInt();
        KMTutar = 2.20;
        enAz=20;
        acilis=10;
        toplam = acilis+(KM*KMTutar)<20 ? 20 :acilis+(KM*KMTutar);
        System.out.println("Açılış: "+acilis+"tl");
        System.out.println("KM başı tutar: "+KMTutar+"tl");
        System.out.println("KM mesafe: "+KM+"tl");
        System.out.println("En az Ödenmesi gereken: "+enAz+"tl");
        System.out.println("Toplam: "+toplam+"tl");


    }
}
