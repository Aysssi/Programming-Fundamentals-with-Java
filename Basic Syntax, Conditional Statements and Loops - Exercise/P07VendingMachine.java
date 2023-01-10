package ExerBasicSyntaxConditionStatementsAndLoop;

import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String input = scanner.nextLine();

        double sum = 0;
        while (!input.equals("Start")){
            double coins = Double.parseDouble(input);

            if (coins != 0.1 && coins != 0.2 && coins != 0.5 && coins != 1 && coins != 2  ){
                System.out.printf("Cannot accept %.2f%n", coins);
            }else {
                sum += coins;
            }

            input= scanner.nextLine();
        }
         input = scanner.nextLine();
        while (!input.equals("End")) {

            if (input.equals("Nuts")){
                if (sum >= 2.0){
                    sum -= 2.0;
                        System.out.printf("Purchased %s%n",input);
                    } else {
                    System.out.println("Sorry, not enough money");
                }

            } else if (input.equals("Water")) {
                if (sum >= 0.7){
                    sum -= 0.7;
                        System.out.printf("Purchased %s%n",input);
                    }else {
                    System.out.println("Sorry, not enough money");
                }

            } else if (input.equals("Crisps")) {
                if (sum >= 1.5){
                    sum -= 1.5;
                    System.out.printf("Purchased %s%n",input);
                }else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Soda")) {
                if (sum >= 0.8){
                    sum -= 0.8;
                    System.out.printf("Purchased %s%n",input);
                }else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Coke")) {
                if (sum >= 1.0){
                    sum -= 1.0;
                    System.out.printf("Purchased %s%n",input);
                }else {
                    System.out.println("Sorry, not enough money");
                }
            }else {
                System.out.println("Invalid product" );
            }


            input = scanner.nextLine();
        }
        if (sum >= 0) {
            System.out.printf("Change: %.2f",sum);
        }

    }
}
