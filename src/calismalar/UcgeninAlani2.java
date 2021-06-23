package calismalar;
import java.util.Scanner;
/**
 * @author Murat BATAK - 15.Haziran.2021
 * @Version 0.0.1
 *
 *
 */
public class UcgeninAlani2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double k1,k2,alan,yariCevre,cevre;
        System.out.print("Lütfen üçgenin yüksekliğinin uzunluğunu giriniz: ");
        k1=input.nextInt();
        System.out.print("Lütfen üçgenin tabanının uzunluğunu giriniz: ");
        k2=input.nextInt();
        alan=(k1*k2)/2;
        System.out.print(alan);

    }
}
