package M1.Test3;

public class MinLengthWord {

    private static String minLengthWord(String str) {
        
        int minStart = -1;
        int minLength = Integer.MAX_VALUE;
        int currentStart = 0;
        int i = 0;

        for(;i<str.length();i++){
            if(str.charAt(i)==' '){
                int currentWordLength = i-currentStart;
                if(currentWordLength<minLength){
                    minStart = currentStart;
                    minLength = currentWordLength;
                }
                currentStart = i+1;
            }
        }
        if(minStart == -1){
            return str;
        }else{
            int currentWordLength = i - currentStart;
            if(currentWordLength < minLength){
                minStart = currentStart;
                minLength = currentWordLength;
            }
        }
        return str.substring(minStart, minStart +minLength);
    }
    public static void main(String[] args) {
        String str = "abc de ghihjk a uvw h j";
        System.out.print("The Minimum length word in the String is : "+minLengthWord(str));
    }
}
