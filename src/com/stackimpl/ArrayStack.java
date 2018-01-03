package com.stackimpl;

/**
 * Created by GChidhambaranathan on 12/22/2017.
 */
public class ArrayStack {
    private int[] stack;
    int capacity = 0;
    int top;


    public ArrayStack(int capacity){
        this.capacity = capacity;
        stack  = new int[this.capacity];
        top = -1;
    }
    private void push(int data) throws Exception{
        if(isFull()){
            throw new Exception("Stack is Full");
        }

        stack[++top] = data;
    }

    private int pop() throws  Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        return stack[top--];
    }

    private boolean isFull(){
        if(top == capacity-1 || top == stack.length){
            return true;
        }
        return false;
    }

    private boolean isEmpty() {
        if(top == -1)
            return true;
        return false;
    }


    private int size(){
        return top+1;
    }



    private void printStack(){
        for(int i = top; i >= 0; i--){
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        try {
            ArrayStack arrayStack = new ArrayStack(5);
            arrayStack.push(5);
            arrayStack.push(4);
            arrayStack.push(2);
            arrayStack.push(1);
            arrayStack.push(3);


            System.out.println("Size of stack "+ arrayStack.size());
            arrayStack.printStack();

            System.out.println("Popping "+ arrayStack.pop());
            System.out.println("Popping "+ arrayStack.pop());
            System.out.println("Popping "+ arrayStack.pop());
            System.out.println("Popping "+ arrayStack.pop());
            System.out.println("Popping "+ arrayStack.pop());
            arrayStack.push(10);
            arrayStack.push(11);
            System.out.println("Size of stack "+ arrayStack.size());
            arrayStack.printStack();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
