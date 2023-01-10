package ExerBasicSyntaxConditionStatementsAndLoop;

import java.util.Scanner;

public class P09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int orderCount = Integer.parseInt(scanner.nextLine());


        double totalPrice = 0;

        for (int i = 1; i <= orderCount; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int daysInMonth = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            double orderPrice = (daysInMonth * capsulesCount) * pricePerCapsule;
            totalPrice += orderPrice;
            System.out.printf("The price for the coffee is: $%.2f%n",orderPrice);
        }

        System.out.printf( "Total: $%.2f",totalPrice);
    }
}
