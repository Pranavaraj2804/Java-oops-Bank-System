import java.util.ArrayList;

public class leetco {
    static void main() {
        ArrayList<ArrayList<Integer>> triangle = generatePascal(6);
        for(ArrayList<Integer>row:triangle){
            System.out.println(row);

        }
    }
//static long check(int n,int r){
//        long res = 1;
//        for(int i =0;i<r;i++){
//            res = res*(n-i);
//            res = res/(i+1);
//        }
//        return  res;
//}
    static  ArrayList<Integer> check1(int n){
        ArrayList<Integer> ans1 = new ArrayList<>();
        int ans = 1;
        ans1.add(ans);
        for(int i = 1;i<n;i++){
            ans = ans*(n-i);
            ans = ans/i;
            ans1.add(ans);
        }
        return  ans1;
    }
    static ArrayList<ArrayList<Integer>> generatePascal(int n){
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();
        for(int i = 1; i < n; i++){
            triangle.add(check1(i));
        }
        return triangle;
    }
}


