import java.util.Scanner;

public class SimpleInterest_Uday_01 {

    public static void main (String [] args){
        SimpleInterest_Uday_01 sc = new SimpleInterest_Uday_01();
        sc.SimpleInterestCalculator();




    }


    public void SimpleInterestCalculator() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Principal");
        double principal = scan.nextDouble();//accept principal

        System.out.println("Enter Rate");
        double rate = scan.nextDouble();//accept rate

        System.out.println("Enter Time");
        double time = scan.nextDouble();//accept time

        scan.close();//close the scanner

        //call method with parameters
        double simpleInterest = (principal*rate*time)/100;

        System.out.println("Calculated simple interest is: "+simpleInterest);


    }
}
