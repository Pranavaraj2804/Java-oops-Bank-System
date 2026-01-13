import java.util.Arrays;

public class longest {
    static void main() {
        int[] arr = {102,101,100,4,3,2,1,5,6};
        System.out.println(check(arr));
    }
    static  int check(int[] arr){
        Arrays.sort(arr);
        int longest = 1;
        int count = 1;
        int lastSmall = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]-1==lastSmall){
                count = count+1;
                lastSmall = arr[i];
            }
            else if(arr[i]!=lastSmall){
                count = 1;
                lastSmall = arr[i];
            }
            longest = Math.max(longest,count);
        }

        return  longest;
    }
}
