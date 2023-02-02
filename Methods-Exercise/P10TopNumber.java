package ExerMethods;

import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n ; number++) {
           if (isSumOfDigitsDivisibleBy8(number) && isContainsOddDigit(number)){
               System.out.println(number);
           }
        }
    }

    // проверка  дали е top число
    // метод,който проверява дали сумата на цифрите се дели на 8
    // метод, който проверява дали има поне едно нечетно число

    public static boolean isSumOfDigitsDivisibleBy8(int number) {

        int sumDigit = 0;
        while (number > 0) {

          int lastDigit = number % 10;
          sumDigit += lastDigit;
            number = number / 10;
        }
        return sumDigit % 8 == 0;
    }

    public static boolean isContainsOddDigit(int number) {
        while (number > 0) {

            int lastNumber = number % 10;
            if (lastNumber % 2 != 0) {
                return true;
            } else {
                number = number / 10;
            }

        }
        return false;
    }
}