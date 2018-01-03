package com.linkdedlist;

/**
 * Created by GChidhambaranathan on 12/21/2017.
 */
public class FindKthFromLast {
    public static void main(String[] args) {
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.insertElement(7, 1);
            linkedList.insertElement(5, 2);
            linkedList.insertElement(8, 3);
            linkedList.insertElement(10, 4);
            linkedList.insertElement(12, 5);
            linkedList.insertElement(15, 6);
            linkedList.print();
            System.out.println(linkedList.length());
            System.out.println(linkedList.findKthFromLastElement(2));

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


}
