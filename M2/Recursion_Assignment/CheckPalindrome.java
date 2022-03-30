package M2.Recursion_Assignment;

public class CheckPalindrome {

    private static boolean isPalindrome(String str, int n) {
        if (n == 0 || n == 1) {
            return true;
        }
        if (str.charAt(0) != str.charAt(n - 1)) {
            return false;
        }
        return isPalindrome(str.substring(1, n - 1), n - 2);
    }

    public static void main(String[] args) {
        String str = "";
        if (isPalindrome(str, str.length())) {
            System.out.println("The String is Palindrome !!!");
        } else {
            System.out.println("The String is not Palindrome !!!");
        }
    }
}
