package M1.L12;

public class SubStrings {
    public static void main(String[] args) {
        String str = "Hello";
        for (int start = 0; start < str.length(); start++) {
            for(int end = start; end < str.length(); end++){
                System.out.println(str.substring(start, end+1));
            }
        }
    }
}
