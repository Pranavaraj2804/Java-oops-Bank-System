package practise;

public class Main1 {
    static void main() {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Dog d3 = new Dog();
        Cat c3 = new Cat();

       a1.eat();
       a2.eat();
       d3.bark();
       c3.eat();
    }
}
