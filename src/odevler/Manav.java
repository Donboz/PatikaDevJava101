package odevler;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kgArmut=2.14,kgElma=3.67,kgDomates=1.11,kgMuz=0.95,kgPatlıcan=5.00,toplam;
        double armutFiyat,elmaFiyat,domatesFiyat,muzFiyat,patlıcanFiyat;
        int armut,elma,domates,muz,patlıcan;
        System.out.print("Armut Kaç kilo ? : ");
        armut = input.nextInt();
        System.out.print("Elma Kaç kilo ? : ");
        elma = input.nextInt();
        System.out.print("Domates Kaç kilo ? : ");
        domates = input.nextInt();
        System.out.print("Muz Kaç kilo ? : ");
        muz = input.nextInt();
        System.out.print("Patlıcan Kaç kilo ? : ");
        patlıcan = input.nextInt();
        armutFiyat=armut*kgArmut;
        elmaFiyat=elma*kgElma;
        domatesFiyat=domates*kgDomates;
        muzFiyat=muz*kgMuz;
        patlıcanFiyat=patlıcan*kgPatlıcan;
        toplam=patlıcanFiyat+muzFiyat+domatesFiyat+elmaFiyat+armutFiyat;
        System.out.println("Toplam Tutar: "+toplam);
    }
}
