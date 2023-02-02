package ExerMethods;

import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         // входни данни
        // метод, който намира факториела (long) на дадено число и го връща
        // fact1 на първото число / fact2 на второто число

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        long factNumber1 = calculateFactorial(number1);
        long factNumber2 = calculateFactorial(number2);

        double divisionResult = factNumber1 * 1.0/ factNumber2;
        System.out.printf("%.2f",divisionResult);

    }
    public static long calculateFactorial(int number){

        long factorial = 1;
        for (int i = 1; i <= number ; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

}
