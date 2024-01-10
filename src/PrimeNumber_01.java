import java.util.Scanner;

public class PrimeNumber_01 {

    static int m;
    int n;
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        m = num/2;
        int count =0;
        if (num > 1){
            System.out.println("Number is eligible for prime number definition ");

            for (int i= 2; i<=m ; i++){

                if(num%i==0){
                    System.out.println("Number is not prime ");
                    count =1;
                    break;
                }
            }

            if (count==0){
                System.out.println("Number is prime ");
            }
        }

        else {
            System.out.println("Number is not eligible for prime number definition ");
        }

        sc.close();
    }
}
