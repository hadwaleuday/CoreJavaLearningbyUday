public class FizzBuzz_Uday {

    public static void main (String [] args){

        for(int i =1 ; i<=100 ; i++){

            if (i%3==0 && i%5!=0){
                System.out.println("Number is : "+"FIZZ");
            }
            else if (i%3!=0 && i%5==0){
                System.out.println("Number is : "+"BUZZ");
            }

            else if  (i%3==0 && i%5==0){
                System.out.println("Number is : "+"FIZZ-BUZZ");
            }

            else {
                System.out.println("Number is : " + i);
            }
        }
    }
}
