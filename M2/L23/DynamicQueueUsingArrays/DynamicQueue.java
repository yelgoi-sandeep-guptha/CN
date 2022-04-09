package M2.L23.DynamicQueueUsingArrays;

import M2.L23.QueueUsingArrayException.QueueEmptyException;

public class DynamicQueue {
    private int data[];
    private int front;
    private int rear;
    private int size;

    public DynamicQueue(int capacity) {
        data = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void doubleCapacity() {
        int temp[] = data;
        data = new int[temp.length * 2];

        int index = 0;
        for (int i = front; i < temp.length; i++) {
            data[index++] = temp[i];
        }
        for (int i = 0; i < front - 1; i++) {
            data[index++] = temp[i];
        }
        front = 0;
        rear = temp.length - 1;
    }

    public void enqueue(int element) {
        if (size == data.length) {
            doubleCapacity();
        }
        if (size == 0) {
            front = 0;
        }
        rear = (rear + 1) % data.length;
        data[rear] = element;
        size++;
    }

    public int dequeue() throws QueueEmptyException {
        if (size == 0) {
            throw new QueueEmptyException();
        }
        int temp = data[front];
        front = (front + 1) % data.length;
        size--;
        if (size == 0) {
            front = -1;
            rear = -1;
        }
        return temp;
    }
}
