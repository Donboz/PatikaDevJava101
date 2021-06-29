package odevler;

import java.util.Scanner;

public class PowerOfNumbersRecursive {
    static void power(int base,int exp){
        int result=1;
        if(exp == 0){
            System.out.println("Sonuç: 1");
        }
        for (int i=1;i<=exp;i++){
            result *= base;
        }
        System.out.println("Sonuç: "+result);
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        base = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        exp = input.nextInt();
        power(base,exp);
    }
    public static void main(String[] args) {
        int base,exp;
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        base = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        exp = input.nextInt();
        power(base,exp);
    }
}
