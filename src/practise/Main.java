package practise;

import java.sql.SQLOutput;

public class Main {
    static void main() {
        car car1 = new car("BMW",200,4);
        System.out.println(car1.brand);
        System.out.println(car1.seats);
        System.out.println(car1.speed);
    }
}
