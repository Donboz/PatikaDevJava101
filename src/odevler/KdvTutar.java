package odevler;
import java.util.Scanner;
/**
 * @author Murat BATAK - 15.Haziran.2021
 * @Version 0.0.1
 *
 *
 */

public class KdvTutar {
    public static void main(String[] args) {
        // dersteki düzenene getirdim
        Scanner input = new Scanner(System.in);
        double fiyat,kdv,kdvli,toplam;
        System.out.print("Lütfen Fiyat giriniz: ");
        fiyat = input.nextDouble();
        kdv = fiyat > 1000 ? 0.08 : 0.18;
        kdvli = fiyat*kdv;
        toplam = kdvli+fiyat;
        //Aşağı taraf dersten
        System.out.println("Fiyat: "+fiyat);//bu hariç
        System.out.println("Kdv Oranı: "+kdv);
        System.out.println("Kdv Fiyatı: "+kdvli);
        System.out.println("Toplam: "+toplam);
    }
}
