package Practise1;

import practise.Cat;

public class Main {
    static void main() {
        Parent p = new Child();
        System.out.println(p.value);
        p.show();
        Child c = new Child();
        System.out.println(c.value);
        c.show();

    }
}
