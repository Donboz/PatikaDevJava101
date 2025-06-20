package odevler;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SortList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz:");
        int n = scan.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < a.length; i++){
            System.out.print("Eleman giriniz:");
            a[i] = scan.nextInt();
        }
        scan.close();
        Arrays.sort(a);
        System.out.print("Sıralama: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
