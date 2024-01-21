package string_06_01_23;

import java.util.Scanner;

public class Lab137 {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String, I will check for Palindrome:-  ");
        String user_input = sc.next();
        boolean result = ispalindrome(user_input);
        if (result){
            System.out.println("Given string is palindrome");
        }
        else {
            System.out.println("Given string is not palindrome");
        }



    }

    static boolean ispalindrome(String userinput){
        String orig = userinput;
        StringBuilder sb = new StringBuilder(orig);
        String rev = sb.reverse().toString();
        return rev.equalsIgnoreCase(orig);
    }

}
