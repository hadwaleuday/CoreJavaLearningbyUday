import java.util.Scanner;

public class Grade_Students_Uday_01 {

    public static void main (String [] args ){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total score of student:- ");
        int total_marks = sc.nextInt();
        sc.close();
        if (total_marks>=95){
            System.out.println("A+");
        }
        else if (total_marks>=85){
            System.out.println("A");
        }
        else if (total_marks>=75){
            System.out.println("B");
        }
        else if (total_marks>=65){
            System.out.println("C");
        }
        else if (total_marks>=55){
            System.out.println("D+");
        }
        else if (total_marks>=45){
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }


    }
}
