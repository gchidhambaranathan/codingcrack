package com.stackimpl;

/**
 * Created by GChidhambaranathan on 12/22/2017.
 */
public class StackLinkedList {
    private Node top;

    public void push(int data){
        Node node = new Node(data);

        if(top == null){
            top = node;
            return;
        }

        node.setNext(top);
        top = node;
    }

    public int pop() throws Exception{
        if(top == null)
            throw  new Exception("Stack is empty");

        int data = top.getData();
        top = top.getNext();
        return data;
    }
    public void printStack() {
        Node currentNode = top;
        while (currentNode != null){
            System.out.println(currentNode.getData() + "-->");
            currentNode = currentNode.getNext();
        }
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

        public void Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        try {
            StackLinkedList stackLinkedList = new StackLinkedList();
            stackLinkedList.push(5);
            stackLinkedList.push(4);
            stackLinkedList.push(3);
            stackLinkedList.push(2);
            stackLinkedList.push(1);

            stackLinkedList.printStack();

            System.out.println(stackLinkedList.pop());
            System.out.println(stackLinkedList.pop());
            stackLinkedList.printStack();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
