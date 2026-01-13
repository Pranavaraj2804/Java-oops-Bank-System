import java.util.Arrays;
public class striver1 {
    static void main() {
        int[] arr = {102,101,100,4,3,2,1,5,6};
        int ans = check(arr);
        System.out.println(ans);
//        check(arr);
//        System.out.println(Arrays.toString(arr));
    }
//    static void check(int[] arr){
//        int n = arr.length;
//        int index = 0;
//        for(int i = n-2;i>0;i--){
//            if(arr[i]<arr[i+1]){
//                index = i;
//                break;
//            }
//        }
//        for(int i = n-1;i>=index;i--){
//            if(arr[i]>arr[index]){
//                int temp = arr[i];
//                arr[i] = arr[index];
//                arr[index] = temp;
//            }
//        }
//        Arrays.sort(arr,index+1,n);
//    }
    static int check(int[] arr){
        Arrays.sort(arr);
        int count = 1;
        int longest = 1;
        int lastSMALL = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]-1==lastSMALL){
                count+=1;
                lastSMALL = arr[i];
            }
            else if(arr[i]!=lastSMALL){
                count =1;
                lastSMALL = arr[i];
            }
            longest = Math.max(longest,count);
        }

        return longest;
    }

}
