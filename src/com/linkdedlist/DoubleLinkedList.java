package com.linkdedlist;

/**
 * Created by GChidhambaranathan on 12/21/2017.
 */
public class DoubleLinkedList {
   private Node head;

    public Node insertElement(int data, int position) throws Exception{
        Node insertNode = new Node(data);
        if(head == null){
            head = insertNode;
            return head;
        }
        int size = length();
        if(position >  size +1 || position < 1){
            throw new Exception("Inproper position to insert element");
        }

        if(position == 1){
            insertNode.setNext(head);
            head.prev = insertNode;
            head = insertNode;
        }else{
            int counter = 1;
            Node prevNode = head;
            while (counter < position -1){
                prevNode = prevNode.getNext();
                counter++;
            }

            Node currentNode = prevNode.getNext();
            insertNode.setPrev(prevNode);
            prevNode.setNext(insertNode);
            if(currentNode != null) {
                currentNode.setPrev(insertNode);
            }
            insertNode.setNext(currentNode);
        }
        return head;
    }

    public Node deleteElement(int position) throws Exception{

        if(head == null){
            return null;
        }

        int size = length();

        if(position >  size  || position < 1){
            throw new Exception("Inproper position to delete element "+ position);
        }
        if(position == 1){
            head = head.next;
            head.setPrev(null);
        }else {
            int counter = 1;
            Node prevNode = head;
            while (counter < position -1){
                prevNode = prevNode.getNext();
                counter++;
            }

            Node currentNode = prevNode.getNext();
            Node laterNode = currentNode.getNext();
            prevNode.setNext(laterNode);
           if(laterNode != null) {
               laterNode.setPrev(prevNode);
           }

        }
        return head;
    }

    public int length(){
        if(head == null){
            return 0;
        }

        int length = 0;
        Node currentNode = head;
        while (currentNode != null){
            length++;
            currentNode = currentNode.getNext();
        }
        return length;
    }

    private static class Node {
        private int data;
        private Node prev;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void Node(int data) {
            this.data = data;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }
    }

    public void print(){
        Node currentNode = head;
        while (currentNode != null){
            String prevData = null;
            String NextData = null;
            if(currentNode.prev != null){
                prevData = String.valueOf(currentNode.prev.getData());
            }

            if(currentNode.next != null){
                NextData = String.valueOf(currentNode.next.getData());
            }
            System.out.print(prevData + "-"+currentNode.data + "-" +  NextData + "-->");
            currentNode =  currentNode.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try {
            DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
            doubleLinkedList.insertElement(5, 1);
            doubleLinkedList.insertElement(3, 2);
            doubleLinkedList.insertElement(4, 3);
            doubleLinkedList.print();
            System.out.println(doubleLinkedList.length());

            doubleLinkedList.insertElement(7, 1);
            doubleLinkedList.print();
            System.out.println(doubleLinkedList.length());

            doubleLinkedList.insertElement(9, 3);
            doubleLinkedList.print();
            System.out.println(doubleLinkedList.length());

            doubleLinkedList.insertElement(8, 6);
            doubleLinkedList.print();
            System.out.println(doubleLinkedList.length());

            doubleLinkedList.deleteElement(1);
            doubleLinkedList.print();
            System.out.println(doubleLinkedList.length());

            doubleLinkedList.deleteElement(5);
            doubleLinkedList.print();
            System.out.println(doubleLinkedList.length());

            doubleLinkedList.deleteElement(3);
            doubleLinkedList.print();
            System.out.println(doubleLinkedList.length());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
