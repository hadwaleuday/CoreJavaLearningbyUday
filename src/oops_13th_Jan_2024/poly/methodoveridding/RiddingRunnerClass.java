package oops_13th_Jan_2024.poly.methodoveridding;

public class RiddingRunnerClass {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();

        Hund h = new Hund();
        h.bark();

        Dog e = new Hund();
        e.bark();

    //    Hund f = new Dog(); // This is not possible
    //    f.bark();
    }
}
