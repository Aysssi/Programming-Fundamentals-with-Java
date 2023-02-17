package LabLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbersList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String inputLine = scanner.nextLine();
        while (!inputLine.equals("end")){
            String [] commandArr = inputLine.split(" ");
            String command = commandArr[0];
            switch (command){
                case "Add":
                    int numToAdd = Integer.parseInt(commandArr[1]);
                    numbersList.add(numToAdd);
                    break;
                case "Remove":
                    int numToRemove = Integer.parseInt(commandArr[1]);
                    numbersList.remove(Integer.valueOf(numToRemove));
                    break;
                case "RemoveAt":
                    int numRemoveAt = Integer.parseInt(commandArr[1]);
                    numbersList.remove(numRemoveAt);
                    break;
                case"Insert":
                    int numToInsert = Integer.parseInt(commandArr[1]);
                    int indexToInsert = Integer.parseInt((commandArr[2]));
                    numbersList.add(indexToInsert,numToInsert);
                    break;
            }

            inputLine =scanner.nextLine();
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]",""));

    }
}
