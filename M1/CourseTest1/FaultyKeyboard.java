package M1.CourseTest1;

public class FaultyKeyboard {

    private static boolean faultyKeyboard(String str1, String str2) {
        
        int s1len = str1.length();
        int s2len = str2.length();

        int i=0;
        int j=0;

        while(true){

            if(i == s1len && j == s2len){
                return true;
            }

            if(i == s1len || j == s2len){
                return false;
            }

            if(str1.charAt(i) != str2.charAt(j)){
                return false;
            }

            i++;
            j++;

            if(i != s1len){
                if(j!= s2len && str1.charAt(i) != str2.charAt(j)){
                    while(j!=s2len && str2.charAt(j) == str2.charAt(j-1)){
                        j++;
                    }
                }
            }else{
                while(j!=s2len && str2.charAt(j)==str2.charAt(j-1)){
                    j++;
                }
            }
        }
        
        // return true;
    }

    public static void main(String[] args) {
        String str1 = "codde";
        String str2 = "ccooodddeeee";

        System.out.println("The str2 is correct "+faultyKeyboard(str1,str2));
    }
    
}