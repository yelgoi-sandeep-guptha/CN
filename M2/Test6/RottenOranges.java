package M2.Test6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RottenOranges {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        System.out.println("Enter number of rows and columns : ");
        int rows = s.nextInt();
        int cols = s.nextInt();

        System.out.println("Enter values of cells :");

        int arr[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int input = s.nextInt();
                if (input == 2) {
                    q.add(i);
                    q.add(j);
                }
                arr[i][j] = input;
            }
        }

        q.add(-1);
        q.add(-1);

        int time = 0;
        while (!q.isEmpty()) {
            int c1 = q.poll();
            int c2 = q.poll();

            if (c1 == -1 && c2 == -1) {
                if (!q.isEmpty()) {
                    time++;
                    q.add(-1);
                    q.add(-1);
                }
                continue;
            }

            if ((c1 + 1) < rows && c2 < cols && arr[c1 + 1][c2] == 1) {

                q.add(c1 + 1);
                q.add(c2);
                arr[c1 + 1][c2] = 2;
            }
            if ((c2 + 1) < cols && c1 < rows && arr[c1][c2 + 1] == 1) {

                q.add(c1);
                q.add(c2 + 1);
                arr[c1][c2 + 1] = 2;
            }
            if ((c1 - 1) >= 0 && c2 >= 0 && arr[c1 - 1][c2] == 1) {

                q.add(c1 - 1);
                q.add(c2);
                arr[c1 - 1][c2] = 2;
            }
            if ((c2 - 1) >= 0 && c1 >= 0 && arr[c1][c2 - 1] == 1) {
                q.add(c1);
                q.add(c2 - 1);
                arr[c1][c2 - 1] = 2;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == 1) {
                    time = 0;
                    break;
                }
            }
        }
        if (time > 0) {
            System.out.print(time);
        } else {
            System.out.print("-1");
        }
        s.close();
    }
}
