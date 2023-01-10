package ExerBasicSyntaxConditionStatementsAndLoop;

import java.util.Scanner;

public class P08TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        // отпечатваме  n   на брой реда
        for (int row = 1; row <= n ; row++) {

            //искам да отпечатам колко ми е номера на реда
            for (int j = 1; j <= row ; j++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}

