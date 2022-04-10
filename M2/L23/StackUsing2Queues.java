package M2.L23;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StackUsing2Queues {

    Queue<Integer> q1;
    Queue<Integer> q2;

    public StackUsing2Queues() {
        q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();
    }

    public int getSize() {
        return this.q1.size();
    }

    public boolean isEmpty() {
        return this.getSize() == 0;
    }

    public void push(int data) {
        this.q1.add(data);
    }

    public int pop() {
        if (this.q1.isEmpty()) {
            return -1;
        }

        while (this.q1.size() > 1) {
            this.q2.add(this.q2.poll());
        }
        int ans = this.q1.poll();

        Queue<Integer> temp = this.q2;
        this.q2 = this.q1;
        this.q1 = temp;
        return ans;
    }

    public int top() {
        if (this.q1.isEmpty()) {
            return -1;
        }

        while (this.q1.size() > 1) {
            this.q2.add(this.q2.poll());
        }
        int ans = this.q1.poll();
        this.q2.add(ans);
        Queue<Integer> temp = this.q2;
        this.q2 = this.q1;
        this.q1 = temp;
        return ans;
    }

    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        StackUsing2Queues stack = new StackUsing2Queues();
        System.out.println("Number of Operations ");
        int q = s.nextInt();

        while (q > 0) {
            System.out.println("Select one option : \n1.push \n2.pop \n3.top \n4.size \n5.Empty");
            int choice, input;
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter input data to push into stack : ");
                    input = s.nextInt();
                    stack.push(input);
                    break;

                case 2:
                    System.out.println(stack.pop());
                    break;

                case 3:
                    System.out.println(stack.top());
                    break;

                case 4:
                    System.out.println(stack.getSize());
                    break;

                default:
                    System.out.println((stack.isEmpty()) ? "true" : "false");
            }
            q -= 1;
        }
    }
}
