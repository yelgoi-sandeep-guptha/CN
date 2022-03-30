package M2.Recursion_Assignment;

public class PairStar {

    private static String addStars(String str, int n) {
        if (n == 1 || n == 0) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return str.charAt(0) + "*" + addStars(str.substring(1), n - 1);
        }
        return str.charAt(0) + addStars(str.substring(1), n - 1);
    }

    public static void main(String[] args) {
        String str = "aaaa";
        // aaaa = a*a*a*a
        System.out.println("After adding stars between same consecutive characters : " + addStars(str, str.length()));
    }
}
