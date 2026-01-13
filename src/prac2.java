import java.util.ArrayList;
import java.util.Arrays;

public class prac2 {
    static void main() {
//        int[] arr = {2,1,5,4,3,0,0};
//        check(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//    static void check(int[] arr){
//        int n = arr.length;
//        int index = -1;
//        for(int i =n-2;i>0;i--){
//            if(arr[i]<arr[i+1]){
//                index = i;
//                break;
//            }
//        }
//        for(int i = n-1;i>=index;i--){
//            if(arr[i]>arr[index]){
//                swap(arr,index,i);
//            }
//        }
//
//        reverse(arr,index+1,n-1);
//
//    }
//    static  void swap(int[] arr,int first,int last){
//        int temp = arr[first];
//        arr[first] = arr[last];
//        arr[last] = temp;
//    }
//    static void reverse(int[] arr,int start,int end){
//        while(start<end){
//            int temp= arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//    }

//        int[][] arr = {{1,2,3,4},
//                {5,6,7,8},
//                {9,10,11,12},
//                {13,14,15,16}
//        };
//        rotate(arr);
//        print(arr);
//
//    }
//    static void rotate(int[][] arr){
//        int n = arr.length;
//        for(int i=0;i<n;i++){
//            for(int j =i+1;j<n;j++){
//                int temp = arr[i][j];
//                arr[i][j] = arr[j][i];
//                arr[j][i] = temp;
//
//            }
//        }
//        for(int i =0;i<n;i++){
//            int left = 0;int right = n-1;
//            while(left<right){
//                int temp = arr[i][left];
//                arr[i][left] = arr[i][right];
//                arr[i][right] = temp;
//                left++;
//                right--;
//            }
//    }
//    }
//    static void print(int[][] arr){
//        for(int[] row: arr){
//            System.out.print("[");
//            for(int val: row){
//                System.out.print(val + " ");
//            }
//            System.out.println("]");
//        }
        int[] arr = {10,22,12,0,5,6};
        ArrayList<Integer> ans = check(arr);
        System.out.println(ans);
    }
    static ArrayList<Integer> check(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]>max){
                max = arr[i];
                list.add(arr[i]);

            }
        }
        return list;
    }
}
