package oops_07_01_23;

public class ATBPerson {

    String name;
    long phonenummber;
    String emailid;
    boolean isMarried;
    String coursename;

    ATBPerson(){
        System.out.println("Defualt constructor called");
        this.coursename = "ATB5XJAVA";
    }

    ATBPerson(String valuefromobjectref ){
    this.name = valuefromobjectref;
    }

    ATBPerson(String valuefromobjectref1, String valuefromobjectref2){
        this.name = valuefromobjectref1;
        this.coursename= valuefromobjectref2;
    }

    void printdetails(){
        System.out.println(this.name);
        System.out.println(this.coursename);
    }
}
