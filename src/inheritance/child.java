package inheritance;

public class child extends base{
    double weight;
     child(){
         this.weight = -1;
     }
     child(double l,double w,double h,double weight){
         super(l, w, h,weight);
         this.weight = weight;
     }
}
