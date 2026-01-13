package oopsAbstract;

public class Shapemain {
    static void main() {
        Circle circle = new Circle(56);
        Rectangle rectangle = new Rectangle(56,78);
        System.out.println(circle.area());
        System.out.println(circle.perimeter());
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
    }
}
