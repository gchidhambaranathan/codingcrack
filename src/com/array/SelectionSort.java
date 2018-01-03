package com.array;

public class SelectionSort {
    public static void main(String[] args) {
       // int arr[] = {64,25,12,22,11};
        int arr[] = {10,9,8,7,6,5,4,3,2,1};
        SelectionSort selectionSort = new SelectionSort();


        selectionSort(arr, arr.length);

        selectionSort.printArray(arr);

    }

    public static int[] selectionSort(int[] arr, int n){
        for(int i =0; i < n-1; i++){
            int min = i;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }


    public void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}

