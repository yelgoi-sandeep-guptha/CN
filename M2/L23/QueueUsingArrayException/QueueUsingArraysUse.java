package M2.L23.QueueUsingArrayException;

public class QueueUsingArraysUse {
    public static void main(String[] args) throws QueueFullExcpetion, QueueEmptyException {
        QueueUsingArray q = new QueueUsingArray(3);
        for (int i = 0; i < 3; i++) {
            q.enqueue(i);
        }
        System.out.println("The size of the queue is : " + q.size());
        System.out.println("Is the queue is Empty ? " + q.isEmpty());
        System.out.println("The front element is the queue is : " + q.front());
        while (!q.isEmpty()) {
            System.out.print(q.dequeue() + " ");
        }
    }
}
