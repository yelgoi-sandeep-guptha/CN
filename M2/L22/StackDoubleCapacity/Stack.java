package M2.L22.StackDoubleCapacity;

public class Stack {
    private int data[];
    private int topIndex;

    public Stack() {
        data = new int[5];
        topIndex = -1;
    }

    public int size() {
        return topIndex + 1;
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }

    private void doubleCapacity() {
        int temp[] = data;
        data = new int[2 * temp.length];
        for (int i = 0; i < temp.length; i++) {
            data[i] = temp[i];
        }
    }

    public void push(int element) {
        if (data.length - 1 == topIndex) {
            doubleCapacity();
        }
        data[++topIndex] = element;
    }

    public int pop() {
        if (topIndex == -1) {
            return -1;
        }
        return data[topIndex--];
    }

    public int top() {
        if (topIndex == -1) {
            return -1;
        }
        return data[topIndex];
    }
}
