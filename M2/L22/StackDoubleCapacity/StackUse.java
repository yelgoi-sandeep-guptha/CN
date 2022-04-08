package M2.L22.StackDoubleCapacity;

public class StackUse {
    public static void main(String[] args) {
        Stack s = new Stack();
        for (int i = 1; i <= 10; i++) {
            s.push(i);
        }
        System.out.println("The top Element : " + s.top());
        System.out.println("The stack size : " + s.size());
        System.out.println("Is the stack empty ? " + s.isEmpty());
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }
}
