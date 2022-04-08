package M2.L22.StackUsingLL;

public class StackUsingLL {
    private StackNode<Integer> head;
    private int size;

    public StackUsingLL() {
        head = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int element) {
        StackNode<Integer> newNode = new StackNode<Integer>(element);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public int pop() {
        if (head == null) {
            return -1;
        }
        int temp = head.data;
        head = head.next;
        size--;
        return temp;
    }

    public int top() {
        if (head == null) {
            return -1;
        }
        return head.data;
    }
}
