package string_06_01_23;

public class Lab132 {
    public static void main(String[] args) {

        String s1 = "Uday";
        String s2 = new String("uDay");
        String s3 = new String("UDAY");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));


        System.out.println(s1.equalsIgnoreCase(s3));
    }
}
