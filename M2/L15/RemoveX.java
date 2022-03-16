package M2.L15;

public class RemoveX {

    private static String removex(String str) {
        if (str.length() == 0) {
            return str;
        }
        if (str.charAt(0) == 'x') {
            return removex(str.substring(1));
        }
        return str.charAt(0) + removex(str.substring(1));
    }

    public static void main(String[] args) {
        String str = "abxcdx";
        System.out.println("The String after removing Character 'x' is " + removex(str));
    }
}
