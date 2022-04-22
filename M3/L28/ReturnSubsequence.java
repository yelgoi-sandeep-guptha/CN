package M3.L28;

public class ReturnSubsequence {

    private static String[] subSequence(String input) {
        if (input.length() == 0) {
            String[] ans = new String[1];
            ans[0] = "";
            return ans;
        }

        String[] smallOutput = subSequence(input.substring(1));
        String[] output = new String[smallOutput.length * 2];
        int k = 0;
        for (int i = 0; i < smallOutput.length; i++) {
            output[k++] = smallOutput[i];
            output[k++] = input.charAt(0) + smallOutput[i];
        }
        return output;
    }

    public static void main(String[] args) {
        String str = "abc";
        String ans[] = subSequence(str);
        System.out.println("The Subsequence of String " + str);
        // System.out.println(ans.length);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
