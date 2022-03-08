package M1.CourseTest1;

public class PrintPattern {
    /**
     * 4444444
     * 4333334
     * 4322234
     * 4321234
     * 4322234
     * 4333334
     * 4444444
     */
    public static void main(String[] args) {

        int n = 4;
        int i, j;
        // Upper Part

        for (i = n; i >= 1; i--) {
            for (j = n; j > i; j--) {
                System.out.print(j);
            }
            for (j = 2 * i - 1; j > 0; j--) {
                System.out.print(i);
            }
            for (j = i; j < n; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }

        // Lower Part

        for (i = 2; i <= n; i++) {
            for (j = n; j > i; j--) {
                System.out.print(j);
            }
            for (j = 2 * i - 1; j > 0; j--) {
                System.out.print(i);
            }
            for (j = i; j < n; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }
}
