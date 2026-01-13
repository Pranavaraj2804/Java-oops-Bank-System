package inheritance;

public class base {
    double l;
    double w;
    double h;
    double weight;

    base(){
        this.l =-1;
        this.w = -1;
        this.h = -1;
        this.weight=-1;
    }
    base(double l,double w,double h,double weight){
        this.l = l;
        this.w = w;
        this.h =h;
        this.weight = weight;
    }
    base(double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }


}
