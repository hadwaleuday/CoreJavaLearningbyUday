package string_06_01_23;

public class Lab130 {
    //Basic String and concat operators

    public static void main(String[] args) {

        String name = "Uday"; // String constant Pool
        String name2 = new String("Uday"); // Heap area

        name = "Hadwale";

        System.out.println(name);

        String str1 = "Hello";
        str1 = str1.concat("Uday");
        System.out.println(str1);

    }

}