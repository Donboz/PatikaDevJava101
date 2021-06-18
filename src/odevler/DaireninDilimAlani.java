package odevler;

import java.util.Scanner;

public class DaireninDilimAlani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi=3.14,dilimalan;
        int yariCap,aci;
        System.out.print("Lütfen yarıçap giriniz: ");
        yariCap = input.nextInt();
        System.out.print("Lütfen dilim açıyı giriniz giriniz: ");
        aci = input.nextInt();
        dilimalan = (pi*(yariCap*yariCap)*aci)/360;
        System.out.print("Daire dilim alan ölçüsü: "+dilimalan);
    }
}
