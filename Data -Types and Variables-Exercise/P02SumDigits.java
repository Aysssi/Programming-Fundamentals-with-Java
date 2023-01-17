package ExerDataTypesAndVariables;

import java.util.Scanner;

public class P02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   //спирам да сумирам , когато няма цифри (число е =0 )
   //проодължавам --> число != 0
        // взимам последната цифра
        //добавям я към сумата
        // премахвам цифрата


        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        while (number > 0){
            int lastDigit = number % 10;
            sum += lastDigit;

            number = number / 10;
        }
        System.out.println(sum);
    }
}