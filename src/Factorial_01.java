import java.util.Scanner;

public class Factorial_01 {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to calculate factorial");
        int num = sc.nextInt();
        int factorial= 1;

        for (int i = 1; i <= num; i++){

            factorial = factorial*(i);
        }

        System.out.println("Factorial of entered number is: "+factorial);

        sc.close();
    }
}
