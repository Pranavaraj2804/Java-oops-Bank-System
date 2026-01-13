package Shapes;

public class Main {
    static void main() {
       Shape[] shapes = {new Circle(),new Square(),new Triangle()};
       for(Shape s:shapes){
           s.area();

       }
    }
}
