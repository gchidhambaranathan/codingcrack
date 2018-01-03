package com.linkdedlist;

/**
 * Created by GChidhambaranathan on 12/21/2017.
 */
public class LinkedList {
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
            head = insertNode;
        }else{
            int counter = 1;
            Node prevNode = head;
            while (counter < position -1){
                prevNode = prevNode.getNext();
                counter++;
            }

            Node currentNode = prevNode.getNext();
            prevNode.setNext(insertNode);
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
        }else {
            int counter = 1;
            Node prevNode = head;
            while (counter < position -1){
                prevNode = prevNode.getNext();
                counter++;
            }

            Node currentNode = prevNode.getNext();
            prevNode.setNext(currentNode.getNext());
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

    public static class Node {
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
            LinkedList linkedList = new LinkedList();
            linkedList.insertElement(7, 1);
            linkedList.insertElement(5, 2);
            linkedList.insertElement(8, 3);
            linkedList.insertElement(10, 4);
            linkedList.print();
            System.out.println(linkedList.length());
            linkedList.insertElement(11, 3);
            linkedList.print();
            System.out.println(linkedList.length());

            linkedList.insertElement(12, 1);
            linkedList.print();
            System.out.println(linkedList.length());

            linkedList.insertElement(13, 7);
            linkedList.print();
            System.out.println(linkedList.length());

            linkedList.deleteElement(1);
            linkedList.print();
            System.out.println(linkedList.length());

            linkedList.deleteElement(3);
            linkedList.print();
            System.out.println(linkedList.length());

            linkedList.deleteElement(6);
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
        }
        System.out.println();
    }

    public int findKthFromLastElement(int kthFromLast){
        Node p1 = head;
        Node p2 = head;
        for(int i =0; i < kthFromLast; i++){
            p1 = p1.getNext();
        }

        while(p1 != null){
            p1 = p1.getNext();
            p2 = p2.getNext();
        }
        return p2.getData();
    }

    public Node detectLoopAndReturnNode(){
        Node slow = head;
        Node fast = head;
        boolean loopFound = false;
        while(fast != null && fast.getNext() !=null){
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if(slow == fast){
                loopFound = true;
                break;
            }
        }

        if(loopFound){
            slow = head;
            while (slow != fast){
                slow = slow.getNext();
                fast = fast.getNext();
            }
            return fast;
        }
        return null;
    }

    public void createLoop(){
        Node currentNode = head;
        Node eiththNode = head;
        while(currentNode.next != null){
            if(currentNode.getData() == 8){
                eiththNode = currentNode;
            }
            currentNode = currentNode.getNext();

        }
        currentNode.setNext(eiththNode);

    }
}
