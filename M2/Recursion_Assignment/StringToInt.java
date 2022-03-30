package M2.Recursion_Assignment;

public class StringToInt {

    private static int convert(String str, int n) {
        if (n == 1) {
            return str.charAt(0) - '0';
        }
        return convert(str.substring(0, n - 1), n - 1) * 10 + str.charAt(n - 1) - '0';
    }

    public static void main(String[] args) {
        String str = "000000345";
        System.out.println("String to Integer " + convert(str, str.length()));
    }
}
