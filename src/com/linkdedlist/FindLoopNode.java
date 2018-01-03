package com.linkdedlist;

/**
 * Created by GChidhambaranathan on 12/21/2017.
 */
public class FindLoopNode {
    public static void main(String[] args) {
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.insertElement(1, 1);
            linkedList.insertElement(2, 2);
            linkedList.insertElement(3, 3);
            linkedList.insertElement(4, 4);
            linkedList.insertElement(5, 5);
            linkedList.insertElement(6, 6);
            linkedList.insertElement(7, 7);
            linkedList.insertElement(8, 8);
            linkedList.insertElement(9, 9);
            linkedList.insertElement(10, 10);
            linkedList.insertElement(11, 11);


            linkedList.print();
            //creating loop

            System.out.println(linkedList.length());
            //linkedList.createLoop();
            System.out.printf("Loop Node " + linkedList.detectLoopAndReturnNode().getData());
        }catch (Exception e){
            System.out.println(e.getMessage()+ e);
        }
    }
}
