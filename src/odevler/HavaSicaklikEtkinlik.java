package odevler;

import java.util.Scanner;

public class HavaSicaklikEtkinlik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sicaklik;
        System.out.print("Lütfen havanın sıcaklığını yazınız(celsius): ");
        sicaklik = input.nextInt();
        if(sicaklik > 25 ){
            System.out.print("Yüzmeye gidebilirsiniz. :)");
        }else if (sicaklik <= 25 && sicaklik >= 5 ){
            if (sicaklik >= 5 && sicaklik < 15){
                System.out.print("Sinemaya gidebilirsin. :)");
            }else{
                System.out.print("Pikniğe gidebilirsin. :)");
            }
        }else{
            System.out.print("Kayağa gidebilirsin");
        }
    }
}
