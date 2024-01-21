package string_06_01_23;

public class Lab138 {
    public static void main(String[] args) {
        String s1 = "Uday";
        StringBuilder stringBuilder = new StringBuilder("Hadwale");
        String s3 = stringBuilder.toString();
        System.out.println(s3);

        String s4 = s3.replaceAll("Had","uday");
        System.out.println(s4);

    }
}
