package odevler;

import java.util.Scanner;

public class FligthCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km,yas,gidisTipi;
        double tutar,indirimli,ciftYonIndirim,toplam;
        String gidisTipiYazi;
        System.out.print("Kaç kilometre gideceksiniz: ");
        km = input.nextInt();
        if(km <= 0){
            System.out.println("Hatalı değer girildi");
        }
        System.out.print("Kaç yaşındasınız: ");
        yas = input.nextInt();
        if(yas <= 0){
            System.out.println("Hatalı değer girildi");
        }
        System.out.println("Gidiş Tipini seçiniz");
        System.out.print("1=>Tek Yön \n2=> Gidiş Dönüş \n :");
        gidisTipi = input.nextInt();
        if(gidisTipi != 1 || gidisTipi != 2){
            System.out.println("Hatalı değer girildi");
        }
        if(gidisTipi == 1){
            gidisTipiYazi = "Gidiş Dönüş";
        }else{
            gidisTipiYazi = "Tek Yön";
        }
        tutar =(km * 0.10);
        if(yas < 12 ){
            indirimli = tutar*0.50;
        }else if(yas >= 12 && yas <=24){
            indirimli = tutar*0.10;
        }else if(yas >24 && yas <= 65){
            indirimli = tutar*0;
        }else{
            indirimli = tutar*0.30;
        }
        if(gidisTipi == 2){
            ciftYonIndirim=tutar*0.20;
        }else{
            ciftYonIndirim=tutar*0;
        }
        double atop = indirimli+ciftYonIndirim;
        toplam = tutar-indirimli-ciftYonIndirim;
        System.out.println("Uçuş mesafesi(km): "+km);
        System.out.println("Yaş: "+yas);
        System.out.println("Gidiş Tipi: "+gidisTipiYazi);
        System.out.println("İndirim Tutarı: "+atop);
        System.out.println("Toplam: "+toplam);
    }
}
