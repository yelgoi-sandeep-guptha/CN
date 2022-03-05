package M1.L12;

public class RemoveConsecutiveDuplicates {

    private static String removeConsecutiveDuplicates(String str) {

        String finalString = "" + str.charAt(0);
        
        for (int i = 1, j = 0; i < str.length(); i++) {
            if (str.charAt(i) != finalString.charAt(j)) {
                finalString += str.charAt(i);
                j++;
            }
        }
        return finalString;
    }

    public static void main(String[] args) {
        String str = "aaaaabbbbbcccdd";
        System.out.println(removeConsecutiveDuplicates(str));
    }
}
