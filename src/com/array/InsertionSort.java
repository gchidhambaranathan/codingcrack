package com.array;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(arr);
        insertionSort.printArray(arr);
    }

    public void insertionSort(int[] arr){
        for(int i =1; i < arr.length; i++){
            int key = arr[i];
            int j =  i-1;

            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j -1;
            }
            arr[j+1] = key;
        }
    }

    public void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
