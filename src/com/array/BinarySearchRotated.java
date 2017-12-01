package com.array;

public class BinarySearchRotated {
    public static void main(String[] args) {
        int[] arr = new int[]{4,5,6,7,8,9,1,2,3};
        BinarySearchRotated binarySearch = new BinarySearchRotated();
        System.out.println(binarySearch.binarySearchRotated(arr, 0,arr.length-1,1));
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

    private  int binarySearchRotated(int[] arr,int left , int right , int element) {
        if(right >=left) {
            int middle = (left + right) / 2;


            if (arr[middle] == element) {
                return middle;
            }
            //So left array is sorted
            if(arr[left] <= arr[middle]){
                if(arr[left] <= element && arr[middle] >= element){
                    return binarySearch(arr,left,middle-1,element);
                }else{
                    return binarySearch(arr,middle + 1, right, element);
                }
            }else{
                if(arr[left] <= element && arr[middle] >= element){
                    return binarySearch(arr,middle + 1, right, element);
                }else{
                    return binarySearch(arr,left,middle-1,element);
                }
            }


        }
        return -1;
    }
}
