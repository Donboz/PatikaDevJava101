package odevler;

import java.util.Scanner;

public class FindYourHoroscope {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day,month;
        System.out.print("Hangi ayda doğuduğunuzu 1-12 arasında belirtin: ");
        month = input.nextInt();
        System.out.print("Hangi ayın hangi gününde doğuduğunu belirtin: ");
        day = input.nextInt();
        if(month == 1){
            if(day <=21 && day > 0 ){
                System.out.println("Oğlak burçusunuz İyi günler dilerim.");
            }else if(day >=22 && day <= 31){
                System.out.println("Kova burçusunuz. İyi günler dilerim.");
            }else{
                System.out.println("Belirttiğiniz ayda öyle bir gün yoktur!");
            }
        }else if(month == 2){
            if(day <=19 && day > 0){
                System.out.println("Kova burçusunuz. İyi günler dilerim.");
            }else if(day >= 20 && day <= 29){
                System.out.println("Balık burçusunuz. İyi günler dilerim.");
            }else{
                System.out.println("Belirttiğiniz ayda öyle bir gün yoktur!");
            }
        }else if(month == 3){
            if(day <=20 && day > 0){
                System.out.println("Balık  burçusunuz. İyi günler dilerim.");
            }else if(day > 20 && day <= 31){
                System.out.println("Koç burçusunuz. İyi günler dilerim.");
            }else{
                System.out.println("Belirttiğiniz ayda öyle bir gün yoktur!");
            }
        }else if(month == 4){
            if(day <=20 && day > 0){
                System.out.println("Koç burçusunuz. İyi günler dilerim.");
            }else if(day > 20 && day <= 30){
                System.out.println("Boğa burçusunuz. İyi günler dilerim.");
            }else{
                System.out.println("Belirttiğiniz ayda öyle bir gün yoktur!");
            }
        }else if(month == 5){
            if(day <=21 && day > 0){
                System.out.println("Boğa burçusunuz. İyi günler dilerim.");
            }else if(day > 21 && day <= 31){
                System.out.println("İkizler burçusunuz. İyi günler dilerim.");
            }else{
                System.out.println("Belirttiğiniz ayda öyle bir gün yoktur!");
            }
        }else if(month == 6){
            if(day <=22 && day > 0){
                System.out.println("İkizler burçusunuz. İyi günler dilerim.");
            }else if(day > 22 && day <= 30){
                System.out.println("Yengeç burçusunuz. İyi günler dilerim.");
            }else{
                System.out.println("Belirttiğiniz ayda öyle bir gün yoktur!");
            }
        }else if(month == 7){
            if(day <=22 && day > 0){
                System.out.println("Yengeç burçusunuz. İyi günler dilerim.");
            }else if(day > 22 && day <= 31){
                System.out.println("Aslan burçusunuz. İyi günler dilerim.");
            }else{
                System.out.println("Belirttiğiniz ayda öyle bir gün yoktur!");
            }
        }else if(month == 8){
            if(day <=22 && day > 0){
                System.out.println("Aslan burçusunuz. İyi günler dilerim.");
            }else if(day > 22 && day <= 31){
                System.out.println("Başak burçusunuz. İyi günler dilerim.");
            }else{
                System.out.println("Belirttiğiniz ayda öyle bir gün yoktur!");
            }
        }else if(month == 9){
            if(day <=22 && day > 0){
                System.out.println("Başak burçusunuz. İyi günler dilerim.");
            }else if(day > 22 && day <= 30){
                System.out.println("Terazi burçusunuz. İyi günler dilerim.");
            }else{
                System.out.println("Belirttiğiniz ayda öyle bir gün yoktur!");
            }
        }else if(month == 10){
            if(day <=23 && day > 0){
                System.out.println("Terazi burçusunuz. İyi günler dilerim.");
            }else if(day > 23 && day <= 31){
                System.out.println("Akrep burçusunuz. İyi günler dilerim.");
            }else{
                System.out.println("Belirttiğiniz ayda öyle bir gün yoktur!");
            }
        }else if(month == 11 ){
            if(day <=21 && day > 0){
                System.out.println("Akrep burçusunuz. İyi günler dilerim.");
            }else if(day > 21 && day <= 30){
                System.out.println("Yay burçusunuz. İyi günler dilerim.");
            }else{
                System.out.println("Belirttiğiniz ayda öyle bir gün yoktur!");
            }
        }else if(month == 12){
            if(day <=21 && day > 0){
                System.out.println("Yay burçusunuz. İyi günler dilerim.");
            }else if(day > 21 && day <= 31){
                System.out.println("Oğlak burçusunuz. İyi günler dilerim.");
            }else{
                System.out.println("Belirttiğiniz ayda öyle bir gün yoktur!");
            }
        }else{
            System.out.println("Belirttiğiniz ay 1-12 arasında değildir.");
        }
    }
}
