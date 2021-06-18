package odevler;

import java.util.Scanner;

public class UcgeninAlani1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double k1,k2,k3,alankare,yariCevre,cevre,alan;
        System.out.print("Lütfen 1.kenar uzunluğunu gir: ");
        k1 =input.nextInt();
        System.out.print("Lütfen 2.kenar uzunluğunu gir: ");
        k2 =input.nextInt();
        System.out.print("Lütfen 3.kenar uzunluğunu gir: ");
        k3 =input.nextInt();
        cevre=k1+k2+k3;
        yariCevre=cevre/2;
        alankare=yariCevre*(yariCevre-k1)*(yariCevre-k2)*(yariCevre-k3);
        alan=Math.sqrt(alankare);
        System.out.print("Alan: "+alan);

    }
}
