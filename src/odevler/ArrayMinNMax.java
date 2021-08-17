package odevler;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayMinNMax {
    public static void main(String[] args) {
        //https://github.com/phyex
        int[] list = {15,12,788,1,-1,-778,2,0};

        Scanner scan = new Scanner( System.in );
        int digit = scan.nextInt();
        int min = Arrays.stream(list).min().orElse(digit);
        int max = Arrays.stream(list).max().orElse(digit);
        for( int i = 0 ; i < list.length ; i++ ) {
            if( list[i] > digit  ){
                if( list[i] < max )
                    max = list[i];
            }
            if( list[i] < digit ){
                if( list[i] > min )
                    min = list[i];
            }
        }
        System.out.println("En küçük en yakın rakam " + min);
        System.out.println("En büyük en yakın rakam " + max);
    }
}
