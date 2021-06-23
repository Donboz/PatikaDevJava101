package odevler;

import java.util.Scanner;

public class EbobNEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2,i,ebob=1,ekok;
        System.out.print("ilk sayıyı giriniz: ");
        num1 = input.nextInt();
        System.out.print("ikinci sayıyı giriniz: ");
        num2 = input.nextInt();

        for (i = 1;i <= num1;i++){
            if(num1%i == 0 && num2%i == 00){
                ebob = i;
            }
        }
        ekok = (num1*num2)/ebob;
        System.out.println("Sayıların Ekoku: "+ekok);
        System.out.println("Sayıların ebobu: "+ebob);
    }
}
