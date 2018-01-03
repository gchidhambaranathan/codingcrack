package com.array;

/**
 * Created by GChidhambaranathan on 12/26/2017.
 */
public class ShellSort {
    public static void main(String[] args) {
        int arr[] = {6, 8, 1, 4, 5,3,7,2};
        shellSort(arr);
        printArray(arr);
    }

    public static int[] shellSort(int[] arr){
       int n = arr.length;

       for(int gap = n/2; gap > 0; gap /=2){
           for(int i = gap; i < n; i++){
               int key = arr[i];
               int j = i;

               while(j >= gap && arr[j-gap] > key){
                   arr[j] = arr[j-gap];
                   j = j -gap;
               }
               arr[j] = key;
           }
       }
       return arr;
    }
    public static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

}
