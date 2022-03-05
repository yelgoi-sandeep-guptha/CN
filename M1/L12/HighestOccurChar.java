package M1.L12;

public class HighestOccurChar {

    private static char highestOccuringChar(String str) {
        int n = str.length();
        int frequency[] = new int[256];

        for (int i = 0; i < n; i++) {
            frequency[str.charAt(i)]++;
        }

        int max = 0;
        int maxIndex = -1;
        for (int i = 0; i < frequency.length; i++) {
            if (max < frequency[i]) {
                max = frequency[i];
                maxIndex = i;
            }
        }
        return (char) maxIndex;
    }

    public static void main(String[] args) {
        String str = "abdefgbabfba";
        System.out.println("Highes occuring character in the " + str + " is " + highestOccuringChar(str));

    }
}
