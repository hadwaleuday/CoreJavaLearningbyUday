import java.util.Scanner;

public class PalindromeChecker_01 {

    public static void main (String [] args){

        System.out.print("Enter the string to be checked for palindrome:  ");
        Scanner sc = new Scanner(System.in);
        String Original = sc.next();

        System.out.println("Entered String is:-  "+Original);

        String rev = "";
        char [] news =Original.toCharArray();

        for (int i = news.length - 1 ; i >= 0 ; i--) {

            rev = rev + news[i] ;

        }

        System.out.println("Reversed Striing is : "+ rev);

        if (rev.equals(Original)){
            System.out.println("Entered String is Palindrome");
        }

        else {
            System.out.println("Entered String is not Palindrome");
        }
        sc.close();
    }
}
