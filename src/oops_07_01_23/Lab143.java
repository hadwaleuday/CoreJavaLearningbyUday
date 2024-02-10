package oops_07_01_23;

public class Lab143 {

    public static void main (String [] args){

        ATBPerson p1 = new ATBPerson();
        p1.name = "Rau";
        p1.printdetails();

        System.out.println("-------------------------------");
        ATBPerson p2 = new ATBPerson("Uday");
            p2.printdetails();

    }
}
