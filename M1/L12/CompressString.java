package M1.L12;

public class CompressString {

    private static String getCompressedString(String str) {
        if (str == null) {
            return null;
        }

        if (str.length() == 0) {
            return "";
        }

        int si = 0;
        int ei = 0;
        String compressedString = "";

        while (si < str.length()) {
            while ((ei < str.length()) && (str.charAt(ei) == str.charAt(si))) {
                ei++;
            }

            int totalCharCount = ei - si;
            if (totalCharCount != 1) {
                compressedString += (str.charAt(si) + "" + totalCharCount);
            } else {
                compressedString += str.charAt(si);
            }
            si = ei;
        }
        return compressedString;
    }

    public static void main(String[] args) {
        String str = "aaaaabbbcccccccdde";
        System.out.println("The compressed String is " + getCompressedString(str));
        ;
    }
}
