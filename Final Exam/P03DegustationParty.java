package FinalExam;

import java.util.*;

public class P03DegustationParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, List<String>> dataMap = new LinkedHashMap<>();

        String commandData = scanner.nextLine();
        int unlikedMealsCount = 0;

        while (!commandData.equals("Stop")) {
            String[] commandArr = commandData.split("-");

            String command = commandArr[0];
            String guest = commandArr[1];
            String meal = commandArr[2];

            switch (command) {
                case "Like":
                    if (!dataMap.containsKey(guest)) {
                        dataMap.putIfAbsent(guest, new ArrayList<>());

                    }

                    if (!dataMap.get(guest).contains(meal)) {
                        dataMap.get(guest).add(meal);

                    }
                    break;
                case "Dislike":
                    if (!dataMap.containsKey(guest)) {

                        System.out.println(guest + " is not at the party.");

                    } else if (dataMap.containsKey(guest)) {
                        if (!dataMap.get(guest).contains(meal)) {

                            System.out.printf("%s doesn't have the %s in his/her collection.%n", guest, meal);

                        } else if (dataMap.get(guest).contains(meal)) {

                            dataMap.get(guest).remove(meal);
                            unlikedMealsCount++;
                            System.out.printf("%s doesn't like the %s.%n", guest, meal);

                        }
                    }
                    break;
            }
            commandData = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : dataMap.entrySet()) {
            System.out.printf("%s: %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }

        System.out.printf("Unliked meals: %d%n", unlikedMealsCount);




    }
}
