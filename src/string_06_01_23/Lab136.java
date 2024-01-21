package string_06_01_23;

public class Lab136 {
    public static void main(String[] args) {


        // If something is Thread Safe, we avoid!
        // StringBuffer vs StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Uday");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
