import java.util.*;

public class striver {
    static void main() {
//        int[] arr = {-2,-2,-2,-1,-1,-1,0,0,0,2,2,2};
//        Arrays.sort(arr);
//        List<List<Integer>> ans = check(arr);
//        System.out.println(ans);
        int[] arr = {1, -2, 3, 5, 7, 9};
        int target = 7;
        Arrays.sort(arr);
        List<List<Integer>> ans = check1(arr, target);
        System.out.println(ans);
    }

    //    static  List<List<Integer>> check(int[] arr){
//        List<List<Integer>> list = new ArrayList<>();
//        for(int i =0;i<arr.length;i++){
//            if(i!=0 && arr[i]==arr[i-1]){
//                continue;
//            }
//            int j=i+1;
//            int k = arr.length-1;
//            while(j<k){
//                int sum = arr[i]+arr[j]+arr[k];
//                if(sum<0){
//                    j++;
//                }
//                else if(sum>0){
//                    k--;
//                }
//                else{
//                    list.add(Arrays.asList(arr[i], arr[j], arr[k]));
//
//                    j++;
//                    k--;
//                    while(j<k&&arr[j]==arr[j-1])j++;
//                    while(j<k&&arr[k]==arr[k+1])k--;
//
//                }
//
//            }
//        }
//        return list;
//    }
    static List<List<Integer>> check1(int[] arr, int target) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            for (int j = i + 1; j < arr.length; j++) {
                if (j != i + 1 && arr[j] == arr[j - 1]) continue;
                int k = j + 1;
                int l = arr.length - 1;
                while (k < l) {
                    long sum = (long) arr[i] + arr[j] + arr[k] + arr[l];

                    if (sum == target) {
                        list.add(Arrays.asList(arr[i], arr[j], arr[k], arr[l]));
                        k++;
                        l--;
                        while (k < l && arr[k] == arr[k - 1]) k++;
                        while (k < l && arr[l] == arr[l - 1]) l--;
                    } else if (sum < target) k++;
                    else l--;
                }
            }

        }
        return list;
    }
}
