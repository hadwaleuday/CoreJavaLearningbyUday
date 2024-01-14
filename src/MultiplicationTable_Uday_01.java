import java.util.Scanner;

public class MultiplicationTable_Uday_01 {

    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the table number:- ");
        int number = s.nextInt();

        System.out.println("Enter the range");
         int range = s.nextInt();
         s.close();

         for (int i = 1 ; i <= range ; i++){

             System.out.println(number+"  *  "+i+" ="+number*i);

         }

    }
}
