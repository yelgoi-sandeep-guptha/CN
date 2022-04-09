package M2.L23.QueueUsingArrayException;

public class QueueUsingArray {
    private int data[];
    private int front;
    private int rear;
    private int size;

    QueueUsingArray(int capacity) {
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

    public void enqueue(int elem) throws QueueFullExcpetion {
        if (data.length == size) {
            throw new QueueFullExcpetion();
        }
        if (size == 0) {
            front = 0;
        }
        rear++;
        size++;
        data[rear] = elem;
    }

    public int dequeue() throws QueueEmptyException {
        if (size == 0) {
            throw new QueueEmptyException();
        }
        int temp = data[front];
        front++;
        size--;
        if (size == 0) {
            front = -1;
            rear = -1;
        }
        return temp;
    }

    public int front() throws QueueEmptyException {
        if (size == 0) {
            throw new QueueEmptyException();
        }
        return data[front];
    }
}
