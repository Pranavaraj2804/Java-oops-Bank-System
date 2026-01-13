import java.util.Arrays;

public class sort {
    static void main() {
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0};
        check1(arr);
        System.out.println(Arrays.toString(arr));
    }
    // better sln
//    static void check(int[] arr){
//        int count0 = 0;
//        int count1 = 0;
//        int count2 = 0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==0){
//                count0++;
//            }
//            else if(arr[i]==1){
//                count1++;
//
//            }
//            else count2++;
//        }
//        for(int i =0;i<count0;i++){
//            arr[i] = 0;
//        }
//        for(int i = count0;i<count0+count1;i++){
//            arr[i] =1;
//        }
//        for(int i = count0+count1;i< arr.length;i++){
//            arr[i] = 2;
//        }
//    }
//}

    // Detach nation algo
    static void check1(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
       while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;

            }
            else if(arr[mid]==1){

                mid++;
            }
            else {
                swap(arr, mid, high);
                high--;
            }
        }
    }
    static void swap(int[] arr,int first,int last){

            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
        }

}