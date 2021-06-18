package calismalar;

import java.util.Scanner;

public class DaireninAlani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi=3.14,cevre,alan;
        int cap,yariCap;
        System.out.print("Lütfen yarıçapı giriniz: ");
        yariCap = input.nextInt();
        cap=yariCap*2;
        cevre=cap*pi;
        alan=pi*(yariCap*yariCap);
        System.out.println("Çevre: "+cevre);
        System.out.println("Alan: "+alan);
    }
}
