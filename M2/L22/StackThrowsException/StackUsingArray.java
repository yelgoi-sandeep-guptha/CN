package M2.L22.StackThrowsException;

public class StackUsingArray {
    private int[] data;
    private int topIndex; // Index of the topmost element of the stack

    public StackUsingArray() {
        data = new int[5];
        topIndex = -1;
    }

    public int size() {
        return topIndex + 1;
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }

    public void push(int element) throws StackFullException {
        if (topIndex == data.length - 1) {
            throw new StackFullException();
        }
        data[++topIndex] = element;
    }

    public int top() throws StackEmptyException {
        if (topIndex == -1) {
            throw new StackEmptyException();
        }
        return data[topIndex];
    }

    public int pop() throws StackEmptyException {
        if (topIndex == -1) {
            throw new StackEmptyException();
        }
        return data[topIndex--];
    }
}
