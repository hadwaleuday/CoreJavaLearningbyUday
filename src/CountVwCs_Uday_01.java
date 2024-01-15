import java.net.StandardSocketOptions;
import java.util.Locale;
import java.util.Scanner;

public class CountVwCs_Uday_01 {

    public static void main (String [] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string:- ");
        String str = s.nextLine();
        s.close();
        str = str.toLowerCase();
        int vwcount = 0,cscount = 0,spchar=0;
        for (int i =0 ; i < str.length() ; i++){
        if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
            vwcount++ ;
        } else if (str.charAt(i)>='a' && str.charAt(i)<='z') {
            cscount++;
        }
        else {
            spchar++;
        }
        }
        System.out.println("Number of vowels in given string are: "+vwcount);
        System.out.println("Number of consonants in given string are: "+cscount);
        System.out.println("Number of spaces or special characters in given string are: "+spchar);
    }
}
