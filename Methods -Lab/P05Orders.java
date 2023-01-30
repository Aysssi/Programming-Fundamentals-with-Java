package LabMethods;

import java.util.Scanner;

public class P05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantityInput = Integer.parseInt(scanner.nextLine());
        switch (product){
            case "coffee":
                printCoffee(quantityInput);
                break;
            case "water":
                printWater(quantityInput);
                break;
            case "coke":
                printCoke(quantityInput);
                break;
            case "snacks":
                printSnacks(quantityInput);
                break;
        }
    }

    public static void printCoffee(int quantity) {
        double order = quantity * 1.50;
        System.out.printf("%.2f",order);
    }

    public static void printWater(int quantity) {
        double order = quantity * 1.00;
        System.out.printf("%.2f",order);
    }
    public static void printCoke ( int quantity){
        double order = quantity * 1.40;
        System.out.printf("%.2f",order);
    }

    public static void printSnacks ( int quantity){
        double order = quantity * 2.00;
        System.out.printf("%.2f",order);
    }
}