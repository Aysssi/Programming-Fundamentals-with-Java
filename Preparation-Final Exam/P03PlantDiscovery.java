package FinalExamPreparation;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String,Integer > plantRarityMap = new LinkedHashMap<>();
        LinkedHashMap<String ,Double> ratingMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String [] dataArr = scanner.nextLine().split("<->");
            String plant = dataArr[0];
            int rarity = Integer.parseInt(dataArr[1]);

            plantRarityMap.put(plant,rarity);
            ratingMap.put(plant,0.0);

        }

        String commandLine =  scanner.nextLine();
        while (!commandLine.equals("Exhibition")){
            String [] commandArr  = commandLine.split("[: -]+");
            String command = commandArr [0];
            String plantName = commandArr[1];

            if (!plantRarityMap.containsKey(plantName)){
                System.out.println("error");
            }else {
                switch (command) {
                    case "Rate":
                        double rating = Double.parseDouble(commandArr[2]);

                        if (ratingMap.get(plantName) == 0.0){
                            ratingMap.put(plantName,rating);

                        }else {
                            double value = (ratingMap.get(plantName) + rating) / 2;
                            ratingMap.put(plantName, value);

                        }
                        break;
                    case "Update":
                        int  newRarity = Integer.parseInt(commandArr[2]);

                        plantRarityMap.put(plantName,newRarity);
                        break;
                    case "Reset":
                        ratingMap.replace(plantName, 0.0);

                        break;

                }
            }
            commandLine = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Integer> entry : plantRarityMap.entrySet()) {
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n",entry.getKey(),entry.getValue(),ratingMap.get(entry.getKey()));
        }

    }

}