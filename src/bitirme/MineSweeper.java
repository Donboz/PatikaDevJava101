package bitirme;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    static int satir, sutun, mayinSayisi;
    static int[][] tarla;
    static char[][] gorunum;
    static int acilanHucre = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        satir = girisAl(scan, "Satır sayısını giriniz (>=2): ");
        sutun = girisAl(scan, "Sütun sayısını giriniz (>=2): ");

        tarla = new int[satir][sutun];
        gorunum = new char[satir][sutun];
        for (int i = 0; i < satir; i++)
            for (int j = 0; j < sutun; j++)
                gorunum[i][j] = '-';

        mayinSayisi = (satir * sutun) / 5;

        mayinlariYerlestir();
        mayinlariGoster(tarla);
        mayinSayilariniHesapla();

        int hedef = satir * sutun - mayinSayisi;

        while (true) {
            gorunumuYazdir();

            int x = koordinatAl(scan, "Satır girin (0-" + (satir - 1) + "): ");
            int y = koordinatAl(scan, "Sütun girin (0-" + (sutun - 1) + "): ");

            if (gorunum[x][y] != '-') {
                System.out.println("Bu hücre zaten açıldı. Başka seçin.");
                continue;
            }

            if (tarla[x][y] == -1) {
                System.out.println("BOOM! Mayına bastınız. Oyun Bitti.");
                for (int i = 0; i < satir; i++) {
                    for (int j = 0; j < sutun; j++) {
                        if (tarla[i][j] == -1)
                            gorunum[i][j] = '*';
                    }
                }
                gorunumuYazdir();
                break;
            }

            alanAc(x, y);

            if (acilanHucre == hedef) {
                System.out.println("Tebrikler! Tüm güvenli hücreleri açtınız. Kazandınız!");
                gorunumuYazdir();
                break;
            }
        }
        scan.close();
    }

    static int girisAl(Scanner scan, String mesaj) {
        int sayi;
        while (true) {
            System.out.print(mesaj);
            sayi = scan.nextInt();
            if (sayi >= 2)
                return sayi;
            System.out.println("Lütfen 2 veya daha büyük bir sayı giriniz.");
        }
    }

    static int koordinatAl(Scanner scan, String mesaj) {
        int k;
        while (true) {
            System.out.print(mesaj);
            k = scan.nextInt();
            if (k >= 0 && k < (mesaj.contains("Satır") ? satir : sutun))
                return k;
            System.out.println("Geçersiz koordinat. Tekrar deneyin.");
        }
    }

    static void mayinlariYerlestir() {
        Random rand = new Random();
        int yerlesen = 0;

        while (yerlesen < mayinSayisi) {
            int i = rand.nextInt(satir);
            int j = rand.nextInt(sutun);

            if (tarla[i][j] != -1) {
                tarla[i][j] = -1;
                yerlesen++;
            }
        }
    }

    static void mayinlariGoster(int[][] tarla) {
        System.out.println("\nMayınların Yerleşimi:");
        for (int i = 0; i < tarla.length; i++) {
            for (int j = 0; j < tarla[0].length; j++) {
                if (tarla[i][j] == -1) {
                    System.out.print("* ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void mayinSayilariniHesapla() {
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                if (tarla[i][j] == -1)
                    continue;

                int sayac = 0;
                for (int x = i - 1; x <= i + 1; x++) {
                    for (int y = j - 1; y <= j + 1; y++) {
                        if (x >= 0 && x < satir && y >= 0 && y < sutun) {
                            if (tarla[x][y] == -1)
                                sayac++;
                        }
                    }
                }
                tarla[i][j] = sayac;
            }
        }
    }

    static void alanAc(int x, int y) {
        if (x < 0 || x >= satir || y < 0 || y >= sutun)
            return;
        if (gorunum[x][y] != '-')
            return;
        if (tarla[x][y] == -1)
            return;

        gorunum[x][y] = (char) ('0' + tarla[x][y]);
        acilanHucre++;

        if (tarla[x][y] == 0) {
            for (int i = x - 1; i <= x + 1; i++) {
                for (int j = y - 1; j <= y + 1; j++) {
                    if (i == x && j == y)
                        continue;
                    alanAc(i, j);
                }
            }
        }
    }

    static void gorunumuYazdir() {
        System.out.println();
        System.out.print("  ");
        for (int j = 0; j < sutun; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i = 0; i < satir; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < sutun; j++) {
                System.out.print(gorunum[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

