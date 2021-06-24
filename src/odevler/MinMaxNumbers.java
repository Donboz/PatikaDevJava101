package odevler;

import java.util.Scanner;

public class MinMaxNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nums,num,i,min=0,max=0;
        System.out.print("Kaç tane sayı gireceğinizi yazınız: ");
        nums = input.nextInt();
        for (i = 1;i<=nums;i++){
            System.out.print("Lütfen "+i+". sayıyı giriniz: ");
            num = input.nextInt();
            if(num > max){
                max = num;
            }
            if(num < max){
                min = num;
            }
            if(num == max){
                min = num;
            }
        }
        System.out.println("max :"+max);
        System.out.println("min :"+min);
    }
}
