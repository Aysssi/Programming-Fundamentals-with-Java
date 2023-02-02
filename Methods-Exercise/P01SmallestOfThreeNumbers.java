package ExerMethods;

import java.util.Scanner;

public class P01SmallestOfThreeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        printSmallestNumber(number1,number2,number3);
    }

    // метод, който отпечатва най-малкото от три цели числа
    public static void printSmallestNumber (int num1, int num2, int num3){

        if (num1 <= num2 && num1 <= num3){
            System.out.println(num1);

        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println(num2);

        }else {
            System.out.println(num3);
        }
    }

}
