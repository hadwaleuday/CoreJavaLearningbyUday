package string_06_01_23;

public class Lab134 {
    public static void main(String[] args) {

        // Immutable in nature (that can't changed)
        String password = "pass@123";

        // 1000 times I am going to change the password value
        // should I use the Sb, sb OR String

        // Mutable - that can be changed!!
        StringBuilder password2 = new StringBuilder("Uday");
        password2.append(" Hadwale");
        password2.replace(0,12,"New Pass");
        System.out.println(password2);
    }
}
