import java.util.ArrayList;
import java.util.List;

public class recPattern
{
    static void main() {
        int[] arr = {10,22,12,3,0,6};
        System.out.println(check(arr));
    }
//    static void check(int r,int c){
//        if(r==1){
//
//            return;
//        }
//        if(r>c){
//            System.out.print("*");
//            System.out.println();
//            check(r-1,c);
//        }
//
//    }
    static List<Integer> check(int[] arr){
        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]>max){
                max = arr[i];
                list.add(max);
            }
        }
        return list;
    }

}
