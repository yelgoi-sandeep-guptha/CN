package M2.L15;

public class ReplaceAToB {

    private static String replace(String str, char a, char b) {
        if (str.length() == 0) {
            return str;
        }
        String smallOutput = replace(str.substring(1), a, b);
        if (str.charAt(0) == a) {
            return b + smallOutput;
        }
        return str.charAt(0) + smallOutput;
    }

    public static void main(String[] args) {
        String str = "ababababa";
        char a = 'a';
        char b = 'b';
        System.out.println("The String \"" + str + "\" after Replacing " + a + " to " + b + " is " + replace(str, a, b));
    }
}
