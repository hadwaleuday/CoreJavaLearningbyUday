import java.util.Scanner;

public class SumDigits_uday_01 {

    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        long number = s.nextLong();
        long sum = 0;
        long digit;
        s.close();
        while (number>0){

            digit = number%10;

            sum = sum +digit;

            number = number/10;

        }

        System.out.println("Sum of digits of entered number is: "+sum);


    }

}
