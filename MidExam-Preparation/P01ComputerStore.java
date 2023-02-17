package MidExamPreparation;

import java.util.Scanner;

public class P01ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalSumWithoutTaxi  = 0;
        String input = scanner.nextLine();
        while (!input.equals("special")  && !input.equals("regular")){
            double currentPrice = Double.parseDouble(input);

             if (currentPrice < 0){
                 System.out.println("Invalid price!");
                 input = scanner.nextLine();
                 continue;
             }
             totalSumWithoutTaxi += currentPrice;

            input = scanner.nextLine();
        }
        if (totalSumWithoutTaxi == 0){
            System.out.println("Invalid order!" );
        }else {

            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n",totalSumWithoutTaxi);
            double taxes = totalSumWithoutTaxi * 0.20;
            System.out.printf("Taxes: %.2f$%n",taxes);
            System.out.println("-----------");
            double totalPriceWithTaxi = taxes + totalSumWithoutTaxi;
            if (input.equals("special")){
                totalPriceWithTaxi = totalPriceWithTaxi * 0.90;
            }
            System.out.printf("Total price: %.2f$%n",totalPriceWithTaxi);
        }

    }
}
