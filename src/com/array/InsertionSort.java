package com.array;

public class InsertionSort {
    public static void main(String[] args) {
        //int arr[] = {12, 11, 13, 5, 6};
        int arr[] = {6, 8, 1, 4, 5,3,7,2};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(arr);
        insertionSort.printArray(arr);
    }

    public void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i;
            while(j >= 1 && arr[j-1] > key){
                arr[j] =  arr[j-1];
                j--;
            }
            arr[j] = key;
        }
    }

    public void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
