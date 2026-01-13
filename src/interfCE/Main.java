package interfCE;

public class Main {
    static void main() {
        Animal a = new Cat();
        Animal a2 = new Dog();
        a.eat();
        a.Sound();
        a2.eat();
        a2.Sound();
    }
}
