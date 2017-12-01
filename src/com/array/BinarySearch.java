package com.array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,8,12,16,23,38,56,72,91};
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearch(arr, 0,arr.length-1,23));
    }

    private  int binarySearch(int[] arr,int left , int right , int element) {
        if(right >=left) {
            int middle = (left + right) / 2;
            if (arr[middle] == element) {
                return middle;
            }

            if (arr[middle] > element) {
                return binarySearch(arr, left, middle-1,element);
            }

            return binarySearch(arr, middle+1,right,element);
        }
        return -1;
    }
}
