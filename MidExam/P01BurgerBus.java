package Exam;

import java.util.Scanner;

public class P01BurgerBus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        double total = 0;

        for (int city = 1; city <= number; city ++) {

            String cityName = scanner.nextLine();
            double moneyByCity = Double.parseDouble(scanner.nextLine());
            double ownerExpenses = Double.parseDouble(scanner.nextLine());

            if ( city % 3 == 0 && city  % 5 !=0) {

                ownerExpenses = ownerExpenses * 1.50;
            }

            if (city % 5 == 0) {

                moneyByCity = moneyByCity * 0.90;
            }

            double cityProfit = moneyByCity - ownerExpenses;


            total += cityProfit;


            System.out.printf("In %s Burger Bus earned %.2f leva.%n", cityName, cityProfit);


        }


        System.out.printf("Burger Bus total profit: %.2f leva.", total);


    }
}
