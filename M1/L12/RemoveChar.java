package M1.L12;

public class RemoveChar {

    private static String removeAllOccurrencesOfChar(String str, char c) {
        int n = str.length();
        String ans = "";

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) != c) {
                ans += str.charAt(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "aabccbaa";
        char c = 'a';
        System.out.println("The final String after removing all occurences of " + c + " in " + str + " is "
                + removeAllOccurrencesOfChar(str, c));
    }
}
