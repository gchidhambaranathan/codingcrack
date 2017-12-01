package com.array;

public class HeapSort {
    public static void main(String[] args) {
        int Arr[] = {12, 11, 13, 5, 6, 7};
        heapSort(Arr);
        printArray(Arr);
    }

    private static void heapSort(int Arr[ ])

    {
        buildMaxHeap(Arr);
        for(int i = Arr.length-1; i >= 0 ; i-- )
        {
            swap(Arr,0,i);
            maxHeapify(Arr,0,i);
        }
    }

    private static void buildMaxHeap(int[] Arr){
        for(int i =(Arr.length/2)-1 ; i >=0; i--){
            maxHeapify(Arr,i, Arr.length-1);
        }
    }

    private static void maxHeapify(int[] Arr,int index, int size){
        int largest = index;
        int left = 2*index +1;
        int right = 2*index +2;

        if(left < size && Arr[left] > Arr[largest]){
            largest = left;
        }

        if(right < size && Arr[right] > Arr[largest]){
            largest = right;
        }

        if(largest != index){
           swap(Arr,index,largest);
        }
    }

    public static void swap(int[] Arr, int i , int j){
        int temp = Arr[i];
        Arr[i] = Arr[j];
        Arr[j] = temp;
    }

    public static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
