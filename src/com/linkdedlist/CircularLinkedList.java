package com.linkdedlist;

/**
 * Created by GChidhambaranathan on 12/21/2017.
 */
public class CircularLinkedList {
    private Node head;

    public Node insertElementAtBegin(int data) throws Exception{
        Node insertNode = new Node(data);
        insertNode.setNext(insertNode);
        if(head == null){
            head = insertNode;
            return head;
        }


        Node lastNode = head;
        while(lastNode.next != head){
            lastNode = lastNode.next;
        }


            insertNode.setNext(head);
            head = insertNode;
            lastNode.setNext(insertNode);

        return head;
    }

    public Node insertElementAtEnd(int data) throws Exception{
        Node insertNode = new Node(data);
        insertNode.setNext(insertNode);
        if(head == null){
            head = insertNode;
            return head;
        }


        Node lastNode = head;
        while(lastNode.next != head){
            lastNode = lastNode.next;
        }


        lastNode.setNext(insertNode);
        insertNode.setNext(head);

        return head;
    }

    public Node deleteElementAtBegin() throws Exception{


        if(head == null){
           throw new Exception("Linked list empty");
        }


        Node lastNode = head;
        while(lastNode.next != head){
            lastNode = lastNode.next;
        }

        head = head.getNext();
        lastNode.setNext(head);


        return head;
    }

    public Node deleteElementAtEnd() throws Exception{


        if(head == null){
            throw new Exception("Linked list empty");
        }


        Node lastNode = head;
        Node prevLastNode = head;
        while(lastNode.next != head){
            prevLastNode = lastNode;
            lastNode = lastNode.next;
        }

        prevLastNode.setNext(head);


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
            if(currentNode == head){
                break;
            }
        }
        return length;
    }

    private static class Node {
        private int data;
        private Node next;

        public Node(int data){
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

        public void Node(int data){
            this.data = data;
        }


    }

    public static void main(String[] args) {
        try {
            CircularLinkedList linkedList = new CircularLinkedList();
            linkedList.insertElementAtBegin(5);
            linkedList.insertElementAtEnd(6);
            linkedList.insertElementAtBegin(4);
            linkedList.insertElementAtEnd(7);
            linkedList.insertElementAtEnd(8);
            linkedList.print();
            System.out.println(linkedList.length());

            linkedList.deleteElementAtBegin();
            linkedList.print();
            System.out.println(linkedList.length());

            linkedList.deleteElementAtEnd();
            linkedList.print();
            System.out.println(linkedList.length());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }

    public void print(){
        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.data + "-->");
            currentNode =  currentNode.getNext();
            if(currentNode ==  head)
                break;
        }
        System.out.println();
    }
}
