package odevler.BoxGame;

public class Main {
    public static void main(String[] args) {
        double a = (Math.random() * 5);
        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 0);
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 0);
        if(a > 2.5){
            Ring r = new Ring(marc,alex , 90 , 100);
            r.run();
        }else{
            Ring r = new Ring(alex,marc, 90 , 100);
            r.run();
        }
    }
}
