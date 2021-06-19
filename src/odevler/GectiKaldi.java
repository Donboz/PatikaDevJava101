package odevler;

import java.util.Scanner;

public class GectiKaldi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat,fizik,muzik,kimya,turkce;
        System.out.print("Lütfen Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        if(mat > 100 || mat < 0){
            mat = 0;
        }
        System.out.print("Lütfen Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        if(fizik > 100 || fizik < 0){
            fizik = 0;
        }
        System.out.print("Lütfen Müzik notunuzu giriniz: ");
        muzik = input.nextInt();
        if(muzik > 100 || muzik < 0){
            muzik = 0;
        }
        System.out.print("Lütfen Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        if(kimya > 100 || kimya < 0){
            kimya = 0;
        }
        System.out.print("Lütfen Türkce notunuzu giriniz: ");
        turkce = input.nextInt();
        if(turkce > 100 || turkce < 0){
            turkce = 0;
        }
        double ort = (mat+turkce+fizik+kimya+muzik)/5;
        if(ort > 55){
            System.out.println("Sınıfı geçtiniz");
        }else{
            System.out.println("Sınıfta kaldınız");
        }
        System.out.println("Ortalamanız: "+ort);
    }
}
