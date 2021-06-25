package odevler;

public class IsPolindrom {
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, mod;

        while (temp != 0) {
            mod = temp % 10;
            reverseNumber = (reverseNumber * 10) + mod;
            temp /= 10;
        }
        return number == reverseNumber;
    }

    public static void main(String[] args) {
        if(isPalindrom(343) == true){
            System.out.println("Girilen sayı polindrom sayıdır.");
        }else{
            System.out.println("Girilen sayı polindrom sayı değildir.");
        }
    }
}
