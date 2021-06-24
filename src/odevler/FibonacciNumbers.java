package odevler;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int num,nacci = 1,fibo = 0,i,fibonacci;
        System.out.print("Lütfen fibonacci sayılarından kaç tanesini görmek istersiniz: ");
        num = input.nextInt();
        for (i = 1;i< num;i++){
            fibonacci = fibo+nacci;
            System.out.println(fibo+" + "+nacci+" = "+fibonacci);
            fibo = nacci;
            nacci = fibonacci;

        }
    }
}
