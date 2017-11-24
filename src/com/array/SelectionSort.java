package com.array;

public class SelectionSort {
    public static void main(String[] args) {
       // int arr[] = {64,25,12,22,11};
        int arr[] = {10,9,8,7,6,5,4,3,2,1};
        SelectionSort selectionSort = new SelectionSort();


        for(int i = 0; i < arr.length; i++){
            selectionSort.selectionSort(i, arr);
        }

        selectionSort.printArray(arr);

    }

    public int[] selectionSort(int index , int[] array){
        int small = array[index];
        int smallIndex = index;
        for(int i = index+1 ; i < array.length; i++){
           if(small > array[i]) {
               small = array[i];
               smallIndex = i;
           }
        }
        int temp = array[index];
        array[index] = small;
        array[smallIndex] = temp;
        return array;
    }

    public void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}

