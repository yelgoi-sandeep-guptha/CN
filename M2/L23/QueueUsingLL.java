package M2.L23;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class QueueUsingLL {
    private Node head;
    private Node tail;
    private int size;

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void enqueue(int data) {
        this.size += 1;
        Node newNode = new Node(data);
        if (head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }

    public int dequeue() {
        if (this.isEmpty()) {
            return -1;
        }
        int ans = this.head.data;
        this.head = this.head.next;
        this.size -= 1;
        return ans;
    }

    public int front() {
        if (this.isEmpty()) {
            return -1;
        }
        return this.head.data;
    }

    public static void main(String[] args) {
        QueueUsingLL q = new QueueUsingLL();
        for (int i = 0; i < 3; i++) {
            q.enqueue(i + 10);
        }
        System.out.println("The size of the queue : " + q.getSize());
        System.out.println("Is the queue is empty ? " + q.isEmpty());
        while (!q.isEmpty()) {
            System.out.print(q.dequeue() + " ");
        }
    }
}
