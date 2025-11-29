package org.example;

public class queue {

    private Cutie[] queueArray;
    private int front;
    private int rear;
    private int size;

    public queue() {

        queueArray = new Cutie[10];
        this.size = 0;
        this.front = 0;
        this.rear = 0;
    }

    public queue(int capacity) {

        queueArray = new Cutie[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(Cutie item) {

        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue: " + item.description());
            return;
        }

        rear = (rear + 1) % queueArray.length;
        queueArray[rear] = item;
        size++;
    }

    public Cutie dequeue() {

        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to dequeue.");
            return null;
        }

        Cutie removed = queueArray[front];
        queueArray[front] = null;

        front = (front + 1) % queueArray.length;
        size--;

        return removed;
    }

    public int size() {return size;}

    public boolean isFull() {return size == queueArray.length;}

    public boolean isEmpty() {return size == 0;}
}
