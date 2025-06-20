package odevler;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matris = {
                {31, 69, 100},
                {13, 96, 001}
        };

        int satir = matris.length;
        int sutun = matris[0].length;

        int[][] transpoz = new int[sutun][satir];

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }

        System.out.println("Matris:");
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpoz:");
        for (int i = 0; i < transpoz.length; i++) {
            for (int j = 0; j < transpoz[0].length; j++) {
                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
