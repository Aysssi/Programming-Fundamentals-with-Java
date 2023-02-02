package ExerMethods;

import java.util.Scanner;

public class P05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        int sumOfNumbers = getSum(number1,number2);
        int subtractOfNumbers = getSubtract(sumOfNumbers,number3);

        System.out.println(subtractOfNumbers);
    }
    public static int getSum (int num1, int num2){

        return num1 + num2;
    }

    public static int getSubtract (int num1,int num2){

        return num1 - num2;
    }
}
