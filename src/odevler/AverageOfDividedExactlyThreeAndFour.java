package odevler;

import java.util.Scanner;

public class AverageOfDividedExactlyThreeAndFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,i,nums=0,numAverage=0,ort;
        System.out.print("Lütfen bir sayı giriniz: ");
        num = input.nextInt();
        for (i=1;i<=num;i++){
            if(i%12 == 0){
                    nums++;
                    numAverage += i;
            }
        }
        if (nums < 1){
            System.out.println("Hiç sayı yok");
        }else{
            ort = numAverage/nums;
            System.out.println("Girilen sayıya kadar 3 ve 4 e tam bölünen sayıların ortalaması: "+ort);
        }
    }
}
