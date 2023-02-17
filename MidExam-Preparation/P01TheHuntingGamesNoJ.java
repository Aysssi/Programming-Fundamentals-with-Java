package MidExamPreparation;

import java.util.Scanner;

public class P01TheHuntingGamesNoJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int adventureDays = Integer.parseInt(scanner.nextLine());
        int playerCount = Integer.parseInt(scanner.nextLine());
        double groupEnergy = Double.parseDouble(scanner.nextLine());
        double waterPerson = Double.parseDouble(scanner.nextLine());
        double foodPerson = Double.parseDouble(scanner.nextLine());

        double currentWater = waterPerson * adventureDays * playerCount;
        double currentFood = foodPerson * adventureDays * playerCount;


        boolean ready = true;
        for (int day = 1; day <= adventureDays ; day++) {
            double currentEnergyLoss = scanner.nextDouble();

            if (groupEnergy <= 0){
                ready = false;
                break;
            }
            groupEnergy -= currentEnergyLoss;


            if (day % 2 == 0){
                currentWater = currentWater  * 0.70;
                groupEnergy = groupEnergy * 1.05;

            }

            if (day % 3 == 0 ){
             currentFood =   currentFood /playerCount;
             groupEnergy = groupEnergy * 1.10;
            }

        }
        if (ready){
            System.out.printf("You are ready for the guest.Yo will be left with - %.2f energy!",groupEnergy);
        }else {
            System.out.printf("You will run out of energy .You will be left with %.2f food and %.2f water.",currentFood,currentWater);
        }
    }
}
