package M2.Recursion_Assignment;

public class CheckAB {

    private static boolean check(String str) {
        if (str.length() == 0) {
            return true;
        }
        if (str.charAt(0) == 'a') {
            if (str.substring(1).length() > 1 && str.substring(1, 3).equals("bb")) {
                return check(str.substring(3));
            }
            return check(str.substring(1));
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "aabbabb";
        /*
         * a. The string begins with an 'a'
         * b. Each 'a' is followed by nothing or an 'a' or "bb"
         * c. Each "bb" is followed by nothing or an 'a'
         */
        if (check(str)) {
            System.out.println("The String obeys all conditions  !!!");
        } else {
            System.out.println("The String doesn't obeys all conditions  !!!");
        }
    }
}
