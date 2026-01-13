import static java.lang.Math.max;

public class kadane {
    static void main() {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int ans = check2(arr);
        System.out.println(ans);
    }

    //brute force
//    static int check(int[] arr){
//        int n = arr.length;
//        int max = Integer.MIN_VALUE;
//        for(int i=0;i<n;i++){
//            for(int j =i;j<n;j++){
//                int sum= 0;
//                for(int k=i;k<=j;k++){
//                    sum+=arr[k];
//                }
//                max = max(sum,max);
//            }
//
//        }
//        return max;
    //}
//    static int check1(int[] arr) {
//        int n = arr.length;
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < n; i++) {
//            int sum = 0;
//            for (int j = i; j < n; j++) {
//                sum+=arr[j];
//                }
//            max = max(sum, max);
//            }
//
//        return max;
//        }
//
//    }
//Better sln
    static int check2(int[] arr) {
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>max){
                max = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        return max;
    }
}

