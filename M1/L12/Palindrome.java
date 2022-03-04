package M1.L12;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abcddcba";
        int start = 0;
        int end = str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                System.out.println(str+" is not a palindrome ");
                return;
            }else{
                start++;
                end--;
            }
        }
        System.err.println(str+" is a plaindrome");
    }
}
