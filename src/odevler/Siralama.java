package odevler;

import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.print("Lütfen sıralanacak ilk sayıyı giriniz: ");
        a = input.nextInt();
        System.out.print("Lütfen sıralanacak ikinci sayıyı giriniz: ");
        b = input.nextInt();
        System.out.print("Lütfen sıralanacak üçüncü sayıyı giriniz: ");
        c = input.nextInt();
        // a nın tüm durumları
        if((a < b) && (a < c)){
            if(b < c){
                System.out.println("a < b < c");
            }else{
                if(b > c){
                    System.out.println("a < c < b");
                }else{
                    if(b == c){
                        System.out.println("a < c = b");
                    }else{
                        System.out.println(" a = b = c");
                    }
                }
            }//b nin tüm durumları
        }else if((b < a) && (b < c)) {
            if(a<c){
                System.out.println("b < a < c");
            }else{
                if(a > c){
                    System.out.println("b < c < a");
                }else{
                    if(a == c){
                        System.out.println("b < a = c");
                    }else{
                        System.out.println(" a = b = c");
                    }
                }
            }//c nin tüm durumları
        }else if((c < a) && (c<b)){
            if(a<b){
                System.out.println("c < a < b");
            }else{
                if(a > b){
                    System.out.println("c < b < a");
                }else{
                    if(a == b){
                        System.out.println("c < a = b");
                    }else{
                        System.out.println(" a = b = c");
                    }
                }
            }
        }else if((a == b)){
            if(a < c){
                System.out.println("a = b < c");
            }else{
                if (a == c){
                    System.out.println("a = b = c");
                }else{
                    System.out.println("c < a = b");
                }
            }
        }else if((a == c)){
            if(a < b){
                System.out.println("a = c < b");
            }else{
                if (a == b){
                    System.out.println("a = b = c");
                }else{
                    System.out.println("b < a = c");
                }
            }
        }else if((b == c)){
            if(b < a){
                System.out.println("b = c < a");
            }else{
                if (a == b){
                    System.out.println("a = b = c");
                }else{
                    System.out.println("a < b = c");
                }
            }
        }else{
            System.out.println(" a = b = c");
        }
    }
}
