package com.array;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(arr);
        bubbleSort.printArray(arr);
    }

    public void bubbleSort(int[] arr){
        boolean swapped;
        for(int i =0; i < arr.length-1; i++){
            swapped = false;
            for(int j=0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
                break;
        }
    }

    public void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
