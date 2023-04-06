package FinalExamPreparation;

import com.sun.source.tree.IfTree;

import java.util.*;

public class P03NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String , List<Integer>> carsMap = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
           String [] dataArr = scanner.nextLine().split("\\|");
           String car = dataArr[0];
           int mileage = Integer.parseInt(dataArr[1]);
           int fuel = Integer.parseInt(dataArr[2]);

           carsMap.put(car,new ArrayList<>());
           carsMap.get(car).add(0,mileage);
           carsMap.get(car).add(1,fuel);

        }

         String  commandLine = scanner.nextLine();
        while (!commandLine.equals("Stop")){
            String [] commandArr = commandLine.split("\\s+:\\s+");
            String command = commandArr[0];
            String car = commandArr[1];

            List<Integer>  mileage = carsMap.get(car);
            int currentMileage = mileage.get(0);
            List<Integer> fuel = carsMap.get(car);
            int currentFuel = fuel.get(1);

            switch (command){
                case "Drive":
                int distance = Integer.parseInt(commandArr[2]);
                int driveFuel = Integer.parseInt(commandArr[3]);

                 if (driveFuel > currentFuel){
                     System.out.println("Not enough fuel to make that ride");

                 }else {
                     currentMileage += distance;
                     currentFuel -= driveFuel;
                     carsMap.get(car).set(0,currentMileage);
                     carsMap.get(car).set(1,currentFuel);
                     System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n",car,distance,driveFuel);

                 }
                 if (currentMileage >= 100000 ){
                     carsMap.remove(car);
                     System.out.printf("Time to sell the %s!%n",car);
                 }

                 break;
                case "Refuel":
                 int refuelFuel = Integer.parseInt(commandArr[2]);

                  int newFuel = currentFuel + refuelFuel;

                  int diff = 0;
                  if (newFuel > 75){
                      newFuel = 75;
                      diff = 75 - currentFuel;

                  }else {
                      diff = refuelFuel; //*
                  }

                  carsMap.get(car).set(1,newFuel);
               System.out.printf("%s refueled with %d liters%n",car,diff);

                    break;
                case"Revert":
                    int kilometers = Integer.parseInt( commandArr[2]);

                     currentMileage -= kilometers;
                     if (currentMileage < 10000){
                         currentMileage = 10000;
                     }else {
                         System.out.printf("%s mileage decreased by %d kilometers%n", car, kilometers);
                     }

                     carsMap.get(car).set(0,currentMileage);
                    break;

            }
            commandLine = scanner.nextLine();
        }

        for (Map.Entry<String, List<Integer>> stringListEntry : carsMap.entrySet()) {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",stringListEntry.getKey(),
                    stringListEntry.getValue().get(0),stringListEntry.getValue().get(1));

        }


    }
}

