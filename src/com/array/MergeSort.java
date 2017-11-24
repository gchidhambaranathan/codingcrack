package com.array;

public class MergeSort {

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr,0,arr.length-1);
        mergeSort.printArray(arr);
    }

    private void mergeSort(int[] arr, int l, int r) {
        if(l < r){
            int m = (l+r)/2;

            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }

    private void merge(int[] arr, int l, int m, int r) {

        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];

        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];


        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }


}