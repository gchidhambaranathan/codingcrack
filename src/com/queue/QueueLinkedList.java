package com.queue;


import com.linkdedlist.LinkedList;

/**
 * Created by GChidhambaranathan on 12/22/2017.
 */
public class QueueLinkedList {
    private Node rear;
    private  Node front;


    public void enqueue(Object data){
        Node insertNode = new Node(data);
        if(rear == null){
            rear = insertNode;
        }
        if(front == null){
            front = rear;
        }
        rear.setNext(insertNode);
        rear = insertNode;
    }

    public Object dequeue(){
        if(front == null)
            return 0;
        Object data = front.getData();
        front = front.getNext();
        return data;
    }

    public static class Node {
        private Object data;
        private Node next;

        public Node(Object data){
            this.data = data;
        }
        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void Node(Object data){
            this.data = data;
        }



    }
    public void print(){
        Node currentNode = front;
        while (currentNode != null){
            System.out.print(currentNode.data + "-->");
            currentNode =  currentNode.getNext();
        }
        System.out.println();
    }

    public boolean isEmpty(){
        return (front == null || rear == null);
    }

    public static void main(String[] args) {
        QueueLinkedList queueLinkedList = new QueueLinkedList();
        queueLinkedList.enqueue(5);
        queueLinkedList.enqueue(4);
        queueLinkedList.enqueue(3);
        queueLinkedList.enqueue(2);
        queueLinkedList.enqueue(1);

        queueLinkedList.print();

        System.out.println(queueLinkedList.isEmpty());
        System.out.println(queueLinkedList.dequeue());
        System.out.println(queueLinkedList.dequeue());
        System.out.println(queueLinkedList.dequeue());
        System.out.println(queueLinkedList.dequeue());
        System.out.println(queueLinkedList.dequeue());

        System.out.println(queueLinkedList.isEmpty());

        queueLinkedList.print();

    }
}
