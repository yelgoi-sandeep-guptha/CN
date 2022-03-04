package M1.L2;

import java.util.Scanner;

public class TakeInput{
    public static void main(String[] args) {
        // try is used to remove memory leak exception in VSCODE
        try (Scanner s = new Scanner(System.in)) {
            int a = s.nextInt();
            int b = s.nextInt();  
            System.out.println("Sum of a and b : "+(a+b));

            String str1 = s.next();
            String str2 = s.next();
            System.out.println("Concatenation of two Strings"+(str1+str2));

            String strLine = s.nextLine();
            System.out.println(strLine);

            char c = s.next().charAt(0); // to read a single character
            System.out.println(c);
            
            /* 
            float f = s.nextFloat();
            Double d = s.nextDouble();
            Byte by = s.nextByte();
            Long l = s.nextLong();
            Boolean bo = s.nextBoolean();
            short sh = s.nextShort();
            */

            // If the input is not same as declared datatype "InputMismatch exception" will raise
        }

    }
}