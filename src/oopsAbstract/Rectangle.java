package oopsAbstract;

public class Rectangle extends Shape{
    double l,b;
    public Rectangle(double l,double b){
        this.l = l;
        this.b = b;
    }
    @Override
   double area(){
        return l*b;
    }
    double perimeter(){
        return 2*(l+b);
    }
}
