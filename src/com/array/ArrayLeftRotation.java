package com.array;

import java.util.Scanner;

public class ArrayLeftRotation {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int[] finalArray = rotateArraryLest(a,n,k);
        for(int ele : finalArray){
            System.out.print(ele + " ");
        }
    }

    public static int[] rotateArraryLest(int[] array, int length, int rotate){
        int[] newArray = new int[length];
        int index = 0;
        for(int i = rotate; i < length; i++){
            newArray[index] = array[i];
            index ++;
        }

        for(int j = 0 ; j < rotate; j++) {
            newArray[index] = array[j];
            index ++;
        }
        return newArray;
    }
}
