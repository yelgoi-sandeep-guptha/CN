package M3.L28;

public class PrintSubSequence {

    private static void printSubsequence(String input, String output) {
        if (input.length() == 0) {
            System.out.print(output + " ");
            return;
        }
        String smallInput = input.substring(1);
        printSubsequence(smallInput, output);
        printSubsequence(smallInput, output + input.charAt(0));
    }

    public static void main(String[] args) {
        String input = "abcd";
        printSubsequence(input, "");
    }
}
