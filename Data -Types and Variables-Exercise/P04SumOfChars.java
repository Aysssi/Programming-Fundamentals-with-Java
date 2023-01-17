package ExerDataTypesAndVariables;

import java.util.Scanner;

public class P04SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // n на брой символи
        // всеки символ -> прочитаме
        // ->сумираме int стойността  от Ascii codes

        int n = Integer.parseInt(scanner.nextLine());

        int sumSymbol = 0;
        for (int i = 1; i <= n ; i++) {
          char value = scanner.nextLine().charAt(0);
          sumSymbol += (int) value;
        }
        System.out.printf("The sum equals: %d",sumSymbol);
    }
}
