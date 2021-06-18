package calismalar;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username,password;
        System.out.print("Kullanıcı adı giriniz: ");
        username = input.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        password = input.nextLine();
        if (username.equals("Donboz")&& password.equals("123123")){
            System.out.print("Başarıyla giriş yaptınız");
        }else{
            System.out.print("Şifreniz veya Kullanıcı adınız yanlış");
        }
    }
}
