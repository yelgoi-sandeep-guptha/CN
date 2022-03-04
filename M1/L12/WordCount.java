package M1.L12;

public class WordCount {
    public static void main(String[] args) {
        String str = "Java is platform independent";
        int spaces = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                spaces++;
            }
        }
        System.out.println("There are "+(spaces+1)+" words in the string");
    }
}
