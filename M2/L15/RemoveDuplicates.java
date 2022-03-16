package M2.L15;

public class RemoveDuplicates {

    private static String removeDuplicates(String str){
        if(str.length() <= 1){
            return str;
        }

        if(str.charAt(0) == str.charAt(1)){
            return removeDuplicates(str.substring(1));
        }
        return str.charAt(0) + removeDuplicates(str.substring(1));
    }
    public static void main(String[] args) {
        String str = "aabbccbadd";
        System.out.println("String after removing consecutive duplicates "+removeDuplicates(str));
    }
}
