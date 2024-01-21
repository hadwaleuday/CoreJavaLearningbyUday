package string_06_01_23;

public class Lab133 {

    public static void main(String[] args) {

        // Immutable in nature (that can't changed)
        String s1 = "Uday";
        String s2 = new String("Uday");


        // Mutable - that can be changed!!

//        StringBuffer sbuf4 = new StringBuffer("Uday");


        StringBuilder sb3 = new StringBuilder("Uday");
        sb3.append(" Hadwale");
        System.out.println(sb3);


        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);
    }
}
