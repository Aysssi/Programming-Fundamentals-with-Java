package Exam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02CoffeeLover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> coffeeList = Arrays
                        .stream(scanner.nextLine().split(" "))
                        .collect(Collectors.toList());

       int  countCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= countCommands ; i++) {

            String [] commandArr = scanner.nextLine().split(" ");
            String  command = commandArr[0];


            if ( command.equals("Include")){
                
                String coffee = commandArr [1];
                coffeeList.add(coffee);
                
            } else if (command.equals("Remove")) {

                String forRemove = commandArr [1];
                int numberOfCoffeesRemove  =  Integer.parseInt(commandArr [2]);

                if (forRemove.equals("first")){

                   if (numberOfCoffeesRemove < coffeeList.size()){

                       for (int j = 0; j < numberOfCoffeesRemove; j++) {
                           coffeeList.remove(0);
                       }
                   }
                } else if (forRemove.equals("last")) {

                    if (numberOfCoffeesRemove < coffeeList.size()){

                        for (int j = 0; j < numberOfCoffeesRemove; j++) {

                            coffeeList.remove(coffeeList.size() -1);
                        }
                    }


                }

            } else if (command.equals("Prefer")) {
                int coffeeIndexFist = Integer.parseInt(commandArr[1]);
                int coffeeIndexSecond = Integer.parseInt(commandArr[2]);

                if (isValidCoffeeIndex(coffeeList,coffeeIndexFist,coffeeIndexSecond)){

                    String firstElement  = coffeeList.get(coffeeIndexFist);
                    String secondElement = coffeeList.get(coffeeIndexSecond);

                    coffeeList.set(coffeeIndexFist,secondElement);
                    coffeeList.set(coffeeIndexSecond,firstElement);

                }

            } else if (command.equals("Reverse")) {

                Collections.reverse(coffeeList);


            }

        }

        System.out.println("Coffees:");
        System.out.println(String.join(" ",coffeeList));

    }

    private static boolean isValidCoffeeIndex(List<String> coffeeLoveList, int coffeeIndexFist, int coffeeIndexSecond) {

        return coffeeIndexFist >= 0 && coffeeIndexFist <= coffeeLoveList.size() && coffeeIndexSecond >= 0 && coffeeIndexSecond < coffeeLoveList.size();
    }
}
