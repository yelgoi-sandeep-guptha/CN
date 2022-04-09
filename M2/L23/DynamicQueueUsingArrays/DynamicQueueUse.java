package M2.L23.DynamicQueueUsingArrays;

import M2.L23.QueueUsingArrayException.QueueEmptyException;

public class DynamicQueueUse {
    public static void main(String[] args) throws QueueEmptyException {
        DynamicQueue q = new DynamicQueue(3);
        for (int i = 0; i < 10; i++) {
            q.enqueue(i + 2);
        }
        System.out.println("The size of the queue : " + q.size());
        System.out.println("Is the queue empty ? " + q.isEmpty());
        while (!q.isEmpty()) {
            System.out.print(q.dequeue() + " ");
        }
    }
}
