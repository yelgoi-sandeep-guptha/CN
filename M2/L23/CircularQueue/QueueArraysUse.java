package M2.L23.CircularQueue;

import M2.L23.QueueUsingArrayException.QueueEmptyException;
import M2.L23.QueueUsingArrayException.QueueFullExcpetion;

public class QueueArraysUse {
    public static void main(String[] args) throws QueueEmptyException, QueueFullExcpetion {
        QueueArrays q = new QueueArrays(5);
        for (int i = 0; i < 5; i++) {
            q.enqueue(i);
        }
        System.out.println("The size of the queue : " + q.size());
        System.out.println("Is queue is Empty ? " + q.isEmpty());
        System.out.println("The front two elements are : ");
        for (int i = 0; i < 2; i++) {
            System.out.print(q.dequeue() + " ");
        }
        System.out.println("Enqueue next 5 elements :");
        for (int i = 0; i < 2; i++) {
            q.enqueue(10 + i);
        }
        System.out.print("The elements of the queue : ");
        while (!q.isEmpty()) {
            System.out.print(q.dequeue() + " ");
        }
    }
}
