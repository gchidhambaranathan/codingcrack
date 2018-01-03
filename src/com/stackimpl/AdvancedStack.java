package com.stackimpl;

/**
 * Created by GChidhambaranathan on 12/22/2017.
 */
public class AdvancedStack {
    private ArrayStackDynamic elementStack = new ArrayStackDynamic();
    private ArrayStackDynamic minStack = new ArrayStackDynamic();



    public void push(int data) throws Exception{
        elementStack.push(data);
        if(minStack.isEmpty() || minStack.getTop() >= data){
            minStack.push(data);
        }
    }

    public void pop() throws Exception{
        int elementTop = elementStack.getTop();
        int minTop = elementStack.getTop();

        if(elementTop == minTop){
            minStack.pop();
        }
        elementStack.pop();
    }

    public int getMin(){
        if(minStack.isEmpty())
            return 0;
        return  minStack.getTop();
    }

    public void print(){
        elementStack.printStack();
    }

    public static void main(String[] args) {
        try {
            AdvancedStack advancedStack = new AdvancedStack();
            advancedStack.push(5);
            advancedStack.push(4);
            advancedStack.push(3);
            advancedStack.push(2);
            advancedStack.push(1);
           /* advancedStack.print();
            System.out.println(advancedStack.getMin());*/

            advancedStack.pop();
            advancedStack.pop();

            advancedStack.print();
            System.out.println(advancedStack.getMin());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
