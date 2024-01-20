package string_06_01_23;

public class Lab131 {

    public static void main(String[] args) {

        String name = "Uday";
        System.out.println(name.concat(" Hadwale"));
        System.out.println(name + " Hadwale");
        System.out.println(name.contains("a"));
        System.out.println(name);


        String name2 = new String("Hadwale");


        String expected_result = "password@123";
        String actual_result = "Password@123";
        if (expected_result.equalsIgnoreCase(actual_result)) {
            System.out.println("Yes");
        }
    }
}
