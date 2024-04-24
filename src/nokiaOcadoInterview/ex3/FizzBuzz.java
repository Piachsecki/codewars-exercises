package nokiaOcadoInterview.ex3;

public class FizzBuzz {
    public static void main(String[] args) {
        int num1 = 23;
        int num2 = 15;
        int num3 = 25;
        int num4 = 9;

        fizzBuzzMethod(num1);
        fizzBuzzMethod(num2);
        fizzBuzzMethod(num3);
        fizzBuzzMethod(num4);

    }

    private static void fizzBuzzMethod(int num) {
        if(num % 3 == 0 && num %5 ==0){
            System.out.println("FizzBuzz");
        } else if (num % 3 == 0 ) {
            System.out.println("Fizz");
        } else if (num %5 ==0) {
            System.out.println("Buzz");
        }
    }
}
