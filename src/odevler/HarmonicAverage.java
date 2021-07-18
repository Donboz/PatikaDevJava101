package odevler;

public class HarmonicAverage {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        double sum = 0,total = 0;
        for (int i = arr[0], temp = i; i < arr.length; i++){
            while (temp > 0) {
                total += (1 / temp);
                temp--;
            }
            sum += total;
        }
        System.out.println(sum/ arr.length);
    }
}
