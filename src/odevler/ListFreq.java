package odevler;

public class ListFreq {
    public static void main(String[] args){
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};

        System.out.println("Tekrar sayıları:");

        for (int i = 0; i < dizi.length; i++) {
            int sayac = 1;
            boolean dahaOnceBakildi = false;

            for (int k = 0; k < i; k++) {
                if (dizi[i] == dizi[k]) {
                    dahaOnceBakildi = true;
                    break;
                }
            }

            if (dahaOnceBakildi)
                continue;

            // Kaç kez geçtiğini say
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    sayac++;
                }
            }
            System.out.println(dizi[i] + " -> " + sayac + " kez");

        }
    }
}
