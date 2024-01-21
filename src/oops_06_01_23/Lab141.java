package oops_06_01_23;

public class Lab141 {
    public static void main (String [] args){
        Person p = new Person();
        p.isMarried();

        p.sleep();
        p.phoneNumber= 99999999999l;
        System.out.println(p.phoneNumber);

        p.name= "Uday";
        System.out.println(p.name);
    }
}
