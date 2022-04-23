package M3.L28;

public class PrintKeypad {

    private static String[] options = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    private static void printKeypad(int input, String output) {
        if (input == 0) {
            System.out.print(output + " ");
            return;
        }
        String temp = options[input % 10];
        for (int i = 0; i < temp.length(); i++) {
            printKeypad(input / 10, temp.charAt(i) + output);
        }
    }

    public static void main(String[] args) {
        int input = 23;
        printKeypad(input, "");
    }
}
