package striver;

import java.util.Arrays;

public class pr1 {
    static void main() {
        int[] arr = {2,1,5,4,3,0,0};
        check(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void check(int[] arr){
        int n  = arr.length;
        int index = -1;
        for(int i = n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index = i;
                break;
            }
        }
        if(index==-1){
            reverse(arr,0,n-1);
        }
        for(int i =n-1;i>=index;i--){
            if(arr[i]>arr[index]){
                swap(arr,index,i);
                break;
            }
        }
        reverse(arr, index + 1, n-1);

    }
    static  void reverse(int[] arr,int first,int last){
        while(first<last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }
    static  void swap(int[] arr,int first,int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
