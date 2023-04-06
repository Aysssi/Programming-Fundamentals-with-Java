package FinalExamPreparation;

import java.security.SecureRandom;
import java.util.*;

public class P03Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<Integer>> citiesMap = new LinkedHashMap<>();

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("Sail")){
            String [] inputArr = inputLine.split("\\|\\|");
            String city= inputArr[0];
            int population = Integer.parseInt(inputArr[1]);
            int gold = Integer.parseInt(inputArr[2]);


            if (!citiesMap.containsKey(city)){
                citiesMap.put(city,new ArrayList<>());
                citiesMap.get(city).add(0,population);
                citiesMap.get(city).add(1,gold);
            }else {
                int newPopulation = citiesMap.get(city).get(0) + population;
                citiesMap.get(city).set(0,newPopulation);
                int newGold = citiesMap.get(city).get(1) + gold;
                citiesMap.get(city).set(1,newGold);

            }

            inputLine = scanner.nextLine();
        }

        String commandLine = scanner.nextLine();
        while (!commandLine.equals("End")) {
            String[] commandArr = commandLine.split("=>");
            String command = commandArr[0];
            String town = commandArr[1];

            List<Integer> population = citiesMap.get(town);
            int currentPopulation = population.get(0);
            List<Integer> gold = citiesMap.get(town);
            int currentGold = gold.get(1);

            switch (command) {
                case "Plunder":
                    int people = Integer.parseInt(commandArr[2]);
                    int plunderGold = Integer.parseInt(commandArr[3]);


                        currentPopulation -= people;
                        currentGold -= plunderGold;

                        citiesMap.get(town).set(0, currentPopulation);
                        citiesMap.get(town).set(1, currentGold);
                        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, plunderGold, people);

                    if (currentPopulation <= 0 || currentGold <= 0) {
                        citiesMap.remove(town);
                        System.out.printf("%s has been wiped off the map!%n", town);
                    }

                    break;
                case "Prosper":
                    int prosperGold = Integer.parseInt(commandArr[2]);
                    if (prosperGold < 0) {
                        System.out.println("Gold added cannot be a negative number!");

                    } else {
                        currentGold += prosperGold;

                        citiesMap.get(town).set(1, currentGold);
                        System.out.printf("%s gold added to the city treasury. %s now has %d gold.%n", prosperGold, town, currentGold);
                    }
                    break;
            }
            commandLine = scanner.nextLine();

        }
        if (citiesMap.isEmpty()){
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }else {
        System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n",citiesMap.size()) ;
        for (Map.Entry<String, List<Integer>> stringListEntry : citiesMap.entrySet()) {
            System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", stringListEntry.getKey(),
                    stringListEntry.getValue().get(0),stringListEntry.getValue().get(1));
        }
    }
}

}