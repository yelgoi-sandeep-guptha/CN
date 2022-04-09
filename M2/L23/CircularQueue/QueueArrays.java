package M2.L23.CircularQueue;

import M2.L23.QueueUsingArrayException.QueueEmptyException;
import M2.L23.QueueUsingArrayException.QueueFullExcpetion;

public class QueueArrays {
    private int data[];
    private int front;
    private int rear;
    private int size;

    public QueueArrays(int capacity) {
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

    public void enqueue(int element) throws QueueFullExcpetion {
        if (size == data.length) {
            throw new QueueFullExcpetion();
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
        front++;
        if (front == data.length) {
            front = 0;
        }
        size--;
        if (size == 0) {
            front = -1;
            rear = -1;
        }
        return temp;
    }
}
