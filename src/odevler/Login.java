package odevler;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username,password,reset,reset_user_pass,user_username,user_password;
        System.out.print("Kullanıcı adı giriniz: ");
        username = input.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        password = input.nextLine();
        if (username.equals("Donboz")&& password.equals("123123")){
            System.out.print("Başarıyla giriş yaptınız");
        }else{
            System.out.println("Şifreniz veya Kullanıcı adınız yanlış");
            System.out.print("Şifrenizi veya kullanıcı adınızı sıfırlamak istermisiniz(evet yada hayır yazınız): ");
            reset = input.nextLine();
            switch (reset){
                case "evet":
                    System.out.print("Kullanıcı adı için 'user' Şifre için 'pass' yazınız: ");
                    reset_user_pass= input.nextLine();
                    if (reset_user_pass.equals("user")){
                        System.out.print("Değiştirmek istediğiniz kullanıcı adını yazınız: ");
                        user_username = input.nextLine();
                        if (user_username.equals("Donboz") || user_username.equals(username)){
                            System.out.print("Başarısız eski kullanıcı adı ve yanlış girdiğiniz kullanıcı adı yeni kullanıcı adınız olamaz");
                        }else{
                            System.out.println("Başarıyla işlem gerçekleştirildi. Yeni Kullanıcı adınız: "+user_username);
                        }
                    }else if (reset_user_pass.equals("pass")){
                        System.out.print("Değiştirmek istediğiniz şifreyi yazınız: ");
                        System.out.println(password);
                        user_password = input.nextLine();
                        if (user_password.equals("123123") || user_password.equals(password)){
                            System.out.print("Başarısız eski şifre ve yanlış girdiğiniz şifre yeni şifre olamaz");
                        }else{
                        System.out.println("Başarıyla işlem gerçekleştirildi. Yeni Şifreniz: "+user_password);
                        }
                    }else{
                        System.out.println("Gerçerli işlem girilmedi");
                    }
                    break;
                case "hayır":
                    System.out.print("Tekrar giriş yapınız.");
                    break;
                default:
                    System.out.print("Geçerli işlem girilmedi.");
            }
        }
    }
}
