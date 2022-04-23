package M3.L28;

public class ReturnKeypad {

    private static String[] helper(int n) {

        if (n == 2) {
            String ans[] = { "a", "b", "c" };
            return ans;
        }
        if (n == 3) {
            String ans[] = { "d", "e", "f" };
            return ans;
        }
        if (n == 4) {
            String ans[] = { "g", "h", "i" };
            return ans;
        }
        if (n == 5) {
            String ans[] = { "j", "k", "l" };
            return ans;
        }
        if (n == 6) {
            String ans[] = { "m", "n", "o" };
            return ans;
        }
        if (n == 7) {
            String ans[] = { "p", "q", "r", "s" };
            return ans;
        }
        if (n == 8) {
            String ans[] = { "t", "u", "v" };
            return ans;
        }
        if (n == 9) {
            String[] ans = { "w", "x", "y", "z" };
            return ans;
        }
        String[] ans = { "" };
        return ans;
    }

    private static String[] keypad(int input) {
        if (input == 0) {
            String[] ans = new String[1];
            ans[0] = "";
            return ans;
        }

        String[] smallOutput = keypad(input / 10);
        String[] temp = helper(input % 10);
        String[] output = new String[smallOutput.length * temp.length];

        int k = 0;
        for (int i = 0; i < smallOutput.length; i++) {
            for (int j = 0; j < temp.length; j++) {
                output[k++] = smallOutput[i] + temp[j];
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int input = 19;
        String[] ans = keypad(input);
        for (String string : ans) {
            System.out.print(string + " ");
        }
    }
}
