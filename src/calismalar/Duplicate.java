package calismalar;

import java.util.ArrayList;

public class Duplicate {
    static boolean isHas(ArrayList<Integer> arr,int value){
        for(int i : arr){
            if(i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] list = {24, 37, 16, 51, 42, 29, 51, 63, 16, 75, 88, 55, 42, 91, 68, 77, 88, 39, 55};
        //Dinamik Array
        ArrayList<Integer> dupNums = new ArrayList<>();
        for(int i = 0 ; i<list.length ; i++) {
            for(int j = 0 ; j<list.length ; j++ ){
                if(i!=j && list[i] == list[j] && list[j]%2 == 0){
                    if(!isHas(dupNums,list[j])){
                        //Dinamik Array'a elaman ekleme
                        dupNums.add(list[i]);
                    }
                }
            }
        }

        System.out.println("Tekrar eden çift sayılar: " + dupNums);
    }
}
