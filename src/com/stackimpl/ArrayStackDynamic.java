package com.stackimpl;

import java.util.Arrays;

/**
 * Created by GChidhambaranathan on 12/22/2017.
 */
public class ArrayStackDynamic {
    private int[] stack;
    int capacity = 0;
    int top;


    public ArrayStackDynamic(){
       this(1);
    }
    public ArrayStackDynamic(int capacity){
        this.capacity = capacity;
        stack  = new int[this.capacity];
        top = -1;
    }
    public void push(int data) throws Exception{
        if(isFull()){
          doubleStack();
        }

        stack[++top] = data;
    }

    public void doubleStack(){
        int[] newStack = new int[capacity*2];
        System.arraycopy(stack, 0, newStack, 0,capacity);
        capacity = capacity *2;
        stack = newStack;
    }

    public int pop() throws  Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        return stack[top--];
    }

    public boolean isFull(){
        if(top == capacity-1 || top == stack.length){
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if(top == -1)
            return true;
        return false;
    }


    public int size(){
        return top+1;
    }

    public int getCapacity(){
        return capacity;
    }

    public int getTop(){
        return stack[top];
    }



    public void printStack(){
        for(int i = top; i >= 0; i--){
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        try {
            ArrayStackDynamic arrayStack = new ArrayStackDynamic(5);
            arrayStack.push(5);
            arrayStack.push(4);
            arrayStack.push(2);
            arrayStack.push(1);
            arrayStack.push(3);


            System.out.println("Size of stack "+ arrayStack.size());
            System.out.println("Capacity of stack "+ arrayStack.getCapacity());

            arrayStack.printStack();

           /* System.out.println("Popping "+ arrayStack.pop());
            System.out.println("Popping "+ arrayStack.pop());
            System.out.println("Popping "+ arrayStack.pop());
            System.out.println("Popping "+ arrayStack.pop());
            System.out.println("Popping "+ arrayStack.pop());
            arrayStack.push(10);
            arrayStack.push(11);
            System.out.println("Size of stack "+ arrayStack.size());
            arrayStack.printStack();*/
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
