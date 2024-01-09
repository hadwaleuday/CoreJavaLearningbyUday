public class FizzBuzz_Uday_01 {

   // int i=1;
    public static void main (String [] args){

        int i =1;
        while (i<=100){
            if (i%3==0 && i%5!=0){
                System.out.println("Number is : "+"FIZZ");
            }
            System.out.println("Number is : "+i);
            i++;
        }
    }
}
