package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pirateShip = Arrays
                .stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> warship = Arrays
                .stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxHealth = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        while (!input.equals("Retire")) {
            String[] commandArr = input.split(" ");
            String command = commandArr[0];
            switch (command) {
                case "Fire":
                    int indexFire = Integer.parseInt(commandArr[1]);
                    int damageFire = Integer.parseInt(commandArr[2]);
                    if (isValidIndexWarship(warship, indexFire)) {
                        int currentSection = warship.get(indexFire);
                        currentSection -= damageFire;

                        if (maxHealth <= 0) {
                            System.out.println("You won! The enemy ship has sunken.");
                            return;
                        } else {
                            warship.set(indexFire, currentSection);
                        }
                    }
                    break;
                case "Defend":
                    int startIndex = Integer.parseInt(commandArr[1]);
                    int endIndex = Integer.parseInt(commandArr[2]);
                    int damageDefend = Integer.parseInt(commandArr[3]);

                    if (isValidIndexPirateShipDefend(pirateShip, startIndex, endIndex)) {
                        for (int i = startIndex; i <= endIndex; i++) {
                            int currentSection = pirateShip.get(i);
                            currentSection -= damageDefend;

                            if (currentSection <= 0) {
                                System.out.println("You lost! The pirate ship has sunken.");
                                return;
                            } else {
                                pirateShip.set(i, currentSection);
                            }
                        }

                    }
                    break;
                case "Repair":
                    int indexRepair = Integer.parseInt(commandArr[1]);
                    int health = Integer.parseInt(commandArr[2]);
                 if (isValidIndexPirateShipRepair(pirateShip,indexRepair)){
                     int currentSection = pirateShip.get(indexRepair);

                     currentSection += health;
                     if (currentSection > maxHealth){
                         currentSection = maxHealth;
                     }
                     pirateShip.set(indexRepair,currentSection);

                }
                    break;
                case "Status":
                    int count = 0;
                    for (int section : pirateShip) {
                        if (section < 0.2 * maxHealth){
                            count++;
                        }

                    }
                    System.out.printf("%d sections need repair.%n",count);

                    break;
            }


            input = scanner.nextLine();
        }
        int sumPirateShip= 0;
        for (int section : pirateShip) {
            sumPirateShip += section;
        }
        int sumWarship = 0;
        for (int section : warship) {
            sumWarship += section;
        }
        System.out.printf("Pirate ship status: %d%n",sumPirateShip);
        System.out.printf("Warship status: %d",sumWarship);
    }

    private static boolean isValidIndexWarship(List<Integer> warship, int index) {
        if (index >= 0 && index < warship.size() ){
            return true;
        }
        return false;
    }

    private static boolean isValidIndexPirateShipDefend(List<Integer> pirateShip, int startIndex, int endIndex) {
        if (startIndex >= 0 && startIndex < pirateShip.size() && endIndex >= 0 && endIndex < pirateShip.size()) {
            return true;
        }
        return false;
    }

    private static boolean isValidIndexPirateShipRepair(List<Integer> pirateShip, int index) {
        if (index >= 0 && index < pirateShip.size()) {
            return true;
        }
        return false;

    }
}
