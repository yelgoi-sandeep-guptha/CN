package M1.L12;

public class ReverseStringWordWise {
    public static void main(String[] args) {
        String str = "abc def ghi";
        int end = str.length();
        String ans = "";
        int i = str.length() - 1;
        while (i >= 0) {
            if (str.charAt(i) == ' ') {
                ans = ans + str.substring(i + 1, end) + " ";
                end = i;
            }
            i--;
        }
        ans = ans + str.substring(i + 1, end);
        System.out.println("Reverse string word wise of \"" + str + "\" is " + ans);
    }
}