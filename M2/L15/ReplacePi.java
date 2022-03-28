package M2.L15;

public class ReplacePi {

    private static String replacePi(String str) {
        if (str.length() <= 1) {
            return str;
        }
        String smallOutput;
        if (str.charAt(0) == 'p' && str.charAt(1) == 'i') {
            smallOutput = replacePi(str.substring(2));
            return "3.14" + smallOutput;
        }
        smallOutput = replacePi(str.substring(1));
        return str.charAt(0) + smallOutput;
    }

    public static void main(String[] args) {
        String str = "apibpipi";
        System.out.println("After replacing pi to 3.14 :" + replacePi(str));
    }
}
