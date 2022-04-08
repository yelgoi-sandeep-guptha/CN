package M2.L22.StackThrowsException;

public class StackUsingArrayUse {
    public static void main(String[] args) throws StackFullException, StackEmptyException {
        StackUsingArray stack = new StackUsingArray();
        for (int i = 1; i < 4; i++) {
            stack.push(i * 2);
        }
        System.out.println("Top Element " + stack.top());
        System.out.println("Size : " + stack.size());
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
