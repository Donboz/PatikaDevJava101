package odevler;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil,zodiac;
        String zodiacBurc;
        System.out.print("Lütfen doğum yılınızı giriniz: ");
        yil = input.nextInt();
        zodiac = yil%12;
        switch (zodiac){
            case 0:
                zodiacBurc = "Maymun";
                break;
            case 1:
                zodiacBurc = "Horoz";
                break;
            case 2:
                zodiacBurc = "Köpek";
                break;
            case 3:
                zodiacBurc = "Domuz";
                break;
            case 4:
                zodiacBurc = "Fare";
                break;
            case 5:
                zodiacBurc = "Öküz";
                break;
            case 6:
                zodiacBurc = "Kaplan";
                break;
            case 7:
                zodiacBurc = "Tavşan";
                break;
            case 8:
                zodiacBurc = "Ejderha";
                break;
            case 9:
                zodiacBurc = "Yılan";
                break;
            case 10:
                zodiacBurc = "At";
                break;
            case 11:
                zodiacBurc = "Koyun";
                break;
            default:
                zodiacBurc = "bulunamadı";
        }
        System.out.println("Çin zodyağı burcunuz: "+zodiacBurc);
    }
}
