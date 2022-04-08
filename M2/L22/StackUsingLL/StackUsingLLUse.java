package M2.L22.StackUsingLL;

public class StackUsingLLUse {
    public static void main(String[] args) {
        StackUsingLL stack = new StackUsingLL();
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
        }
        System.out.println("The Top Element : " + stack.top());
        System.out.println("The size of stack : " + stack.size());
        System.out.println("Is the stack Empty ? " + stack.isEmpty());
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
