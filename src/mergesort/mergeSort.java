package mergesort;

import Multiple.A;

import java.util.Arrays;

public class mergeSort {
    static void main() {
        int[] arr = {8, 3, 4, 12, 5, 6};
//
        mergeInplace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }


    static int[] merges1(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = merges1(Arrays.copyOfRange(arr, 0, mid));
        int[] right = merges1(Arrays.copyOfRange(arr, mid, arr.length ));
        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < first.length) {
            mix[k] = first[i];
            i++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
        }
        return mix;
    }
    static void mergeInplace(int[] arr,int s ,int e) {
        if (e-s == 1) {
            return;
        }
        int mid = (s+e) / 2;
        mergeInplace(arr, s, mid);
        mergeInplace(arr, mid, e);
       merges2(arr,s,mid,e);
    }

    static void merges2(int[] arr,int s,int mid,int e) {
        int[] mix = new int[e-s];
        int i = s;
        int j = mid;
        int k = 0;
        while (i < mid && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] =arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < mid) {
            mix[k] = arr[i];
            i++;
        }
        while (j < e) {
            mix[k] = arr[j];
            j++;
        }
        for(int l=0;l<mix.length;l++){
            arr[s+l] = mix[l];
        }
    }
}
