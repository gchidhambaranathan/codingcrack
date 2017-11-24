package com.array;

import java.util.Scanner;

public class StringAnagram {
   /* public static int numberNeeded(String first, String second) {
        char[] firstArray = first.toCharArray();
        char[] secondArray = second.toCharArray();


        int sum = 0;
        for(char c: firstArray){
            if(!second.contains(String.valueOf(c))){
                sum+=1;
            }
        }

        for(char c: secondArray){
            if(!first.contains(String.valueOf(c))){
                sum+=1;
            }
        }
        return sum;
    }*/

   /* public static int numberNeeded(String first, String second) {
        char[] firstArray = first.toCharArray();
        char[] secondArray = second.toCharArray();

        boolean[] asciiArray = new boolean[128];
        int sum = 0;
        for(char c: firstArray){
            assignBool(asciiArray, c);
        }

        for(char c: secondArray){
            if(asciiArray[c] == true){
                asciiArray[c] = false;
            }else {
                asciiArray[c] = true;
            }
        }

        for(boolean value : asciiArray){
            if(value){
                sum+=1;
            }
        }
        return sum;
    }*/

   public static int numberNeeded(String first, String second){

       int count1[] = new int[26];
       int count2[] = new int[26];


       for (int i = 0; i < first.length() ; i++)
           count1[first.charAt(i) -'a']++;


       for (int i = 0; i < second.length() ; i++)
           count2[second.charAt(i) -'a']++;


       int result = 0;
       for (int i = 0; i < 26; i++)
           result += Math.abs(count1[i] -
                   count2[i]);
       return result;
   }


    public static void assignBool(boolean[] asciiArray, int c) {
        asciiArray[c] = true;
    }

    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();*/
        String a = "acbdefggggg";
        String b= "acbdefggggg";
        System.out.println(numberNeeded(a, b));
    }
}
