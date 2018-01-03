package com.queue;

/**
 * Created by GChidhambaranathan on 12/22/2017.
 */
public class QueueImpl {
    int[] queue;
    int front;
    int rear;
    int capacity;

    public QueueImpl(int size){
        capacity = size;
        front = -1;
        rear = -1;
        queue = new int[size];
    }

    public boolean isFull(){
        return ((rear +1) % capacity == front);
    }

    public boolean isEmpty(){
        return front ==-1;
    }
    public void enqueue(int data) throws Exception{
        if(isFull())
            throw new Exception("Queue is overflow");

        rear = (rear +1) % capacity;
        queue[rear] = data;

        if(front == -1){
            front = rear;
        }
    }


    public int dequeue() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is underFlow");
        }

        int data = queue[front];
        queue[front] = 0;
        if(front == rear){
            front = rear-1;
        }else {
            front = front + 1 % capacity;
        }

        return data;
    }

    public static void main(String[] args) {
        try {
            QueueImpl queue = new QueueImpl(5);
            queue.enqueue(5);
            queue.enqueue(4);
            queue.enqueue(3);
            queue.enqueue(2);
            queue.enqueue(1);

            //queue.print();
            System.out.println(queue.dequeue());
            System.out.println(queue.dequeue());
            System.out.println(queue.dequeue());
            System.out.println(queue.dequeue());
            System.out.println(queue.dequeue());

            System.out.println(queue.dequeue());
            System.out.println(queue.dequeue());
            //queue.print();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
