package odevler;

import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,i,perfectNum = 0,temp;
        System.out.print("Lütfen bir sayı giriniz: ");
        num = input.nextInt();
        for (i = 1;i<=num;i++){
            if(num % i == 0 && i != num){
                perfectNum += i;
            }
        }
        if(perfectNum == num){
            System.out.println(num+" mükemmel sayıdır");
        }else{
            System.out.println(num+" mükemmel sayı değildir");
        }
    }
}
