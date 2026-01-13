//import java.util.*;
//public class prac1 {
//    static void main() {
//     int[] arr = {1,2,0,4,3,0,5,0};
//        int[] arr = {1,2,3,4,5};
//        int k = 2;
//        check2(arr,k);
//        System.out.println(Arrays.toString(arr));
//    }
//    static void check(int[] arr){
//     int index = 0;
//    for(int i=0;i<arr.length;i++){
//        if(arr[i]!=0){
//             arr[index++] = arr[i];
//         }
//     while(index<arr.length){
//         arr[index++]=0;
//     }
//    static void check1(int[] arr){
//
//        int start = 0,end = arr.length-1;
//        while(start<end){
//            int temp = arr[start];
//            arr[start]=arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//    static void check2(int[]arr,int k){
//        reverse(arr,0,arr.length-1);
//        reverse(arr,0,k-1);
//        reverse(arr,k-1,arr.length-1);
//
//
//    }
//    static void reverse(int[] arr,int start,int end){
//        while(start<end){
//           int temp = arr[start];
//           arr[start]=arr[end];
//           arr[end] = temp;
//           start++;
//           end--;
//       }
//
//    }
 //}
