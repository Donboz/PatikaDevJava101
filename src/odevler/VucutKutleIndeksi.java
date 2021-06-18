package odevler;

import java.util.Scanner;

public class VucutKutleIndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double KG,boy,index;
        String durum;
        System.out.print("Lütfen Boyunuzu metre cinsiden giriniz(örnek:1,72): ");
        boy = input.nextDouble();
        System.out.print("Lütfen Kilonuzu kilogram cinsiden giriniz(örnek:80): ");
        KG = input.nextDouble();
        index = KG/(boy*boy);
        if(index > 40){
            durum = "Morbid Obez";
        } else if (index<40 && index>34.9) {
            durum = "Obez(Şişman Klas II)";
        }else if (index<34.9 && index>30) {
            durum = "Obez(Şişman Klas I)";
        }else if (index<29.9 && index>25) {
            durum = "Fazla Kilolu";
        }else if (index<24.9 && index>18.5) {
            durum = "Normal";
        }else{
            durum = "Zayıf";
        }
        System.out.println("İndeksiniz: "+index);
        System.out.println("Durumunuz: "+durum);
    }
}