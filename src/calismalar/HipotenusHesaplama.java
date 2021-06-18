package calismalar;
import java.util.Scanner;
/**
 * @author Murat BATAK - 15.Haziran.2021
 * @Version 0.0.1
 *
 *
 */
public class HipotenusHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int d1,d2,hipotenuskare;
        System.out.print("Lütfen dik kenarlardan ilkini girin: ");
        d1=input.nextInt();
        System.out.print("Lütfen dik kenarlardan ikincisini girin: ");
        d2=input.nextInt();
        hipotenuskare=(d1*d1)+(d2*d2);
        double hipotenus=Math.sqrt(hipotenuskare);
        System.out.print(hipotenus);
    }
}
