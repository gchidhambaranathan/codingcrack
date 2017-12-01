package com.array;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr  = {5,2,9,5,2,3,5};

        int max =  getMax(arr);
       int[] countArray = new int[max+1];
       int[] sortedArray = new int[arr.length];

       for(int i =0 ;i < countArray.length; i++){
           countArray[i] = 0;
       }

     //   printArray(countArray);

       for(int j= 0; j < arr.length; j++){
           countArray[arr[j]] ++;
       }

      // printArray(countArray);

       int k = 0;
       for(int l = 0 ; l < countArray.length; l++){
           int occurrence  = countArray[l];

           while(occurrence > 0){
               sortedArray[k] = l;
               k++;
               occurrence--;
           }
       }

      printArray(sortedArray);
    }

    public static int getMax(int[] arr){
        int max = arr[0];
        for(int i=0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
