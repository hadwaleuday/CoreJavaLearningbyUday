package oops_13th_Jan_2024;

//Static block called only once but at first position
//IIB- Instant initialisation block
//DC- Default constructor
//IIB and DC called each time with each object creation.
public class BlockClass {
    { // Instance Initialization Block
        System.out.println("I am IIB");
    }

    BlockClass(){
        System.out.println("I am DC");
    }

    static { // SIB Static Initialization Block
        System.out.println("I am SIB");
    }
}
