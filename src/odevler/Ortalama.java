package odevler;

import java.util.Scanner;
/**
 * @author Murat BATAK - 15.Haziran.2021
 * @Version 0.0.1
 *
 *
 */
public class Ortalama {
	public static void main(String[] args) {
		int mat,fizik,turkce,tarih,muzik,kimya;
	    Scanner input = new Scanner(System.in);
		System.out.print("Matematik Notu giriniz: ");
		mat = input.nextInt();
		System.out.print("Fizik Notu giriniz: ");
		fizik = input.nextInt();
		System.out.print("Türkçe Notu giriniz: ");
		turkce = input.nextInt();
		System.out.print("Tarih Notu giriniz: ");
		tarih = input.nextInt();
		System.out.print("Müzik Notu giriniz: ");
		muzik = input.nextInt();
		System.out.print("Kimya Notu giriniz: ");
		kimya = input.nextInt();
		int toplam = (mat+fizik+turkce+tarih+muzik+kimya);
		double sonuc = toplam/6.0;
		String gk = sonuc>60 ? "Evet" : "Hayır" ;
		System.out.println("Ortalamanız:" + sonuc + " Geçtimi : " + gk);


	}
}
