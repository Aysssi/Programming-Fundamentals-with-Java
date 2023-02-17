package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> inventoryList = Arrays
                .stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("Craft!")) {
            String[] commandLineArr = input.split(" - ");
            String command = commandLineArr[0];
            switch (command) {

                case "Collect":
                    String addItem = commandLineArr[1];
                    if (!inventoryList.contains(addItem))
                        inventoryList.add(addItem);
                    break;
                case "Drop":
                    String removeItem = commandLineArr[1];
                    inventoryList.remove(removeItem);

                    break;
                case "Combine Items":
                    //•"Combine Items - {old_item}:{new_item}" - you should check if the old item exists.
                    // If so, add the new item after the old one. Otherwise, ignore the command.

                    String[] items = commandLineArr[1].split(":");
                    String oldItem = items[0];
                    String newItem = items[1];

                    if (inventoryList.contains(oldItem)) {
                        int indexOldItem = inventoryList.indexOf(oldItem);
                        inventoryList.add(indexOldItem + 1, newItem);

                    }
                case "Renew":
                    String item = commandLineArr[1];
                    if (inventoryList.contains(item)) {
                        inventoryList.remove(item);
                        inventoryList.add(item);
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.print(String.join(", ", inventoryList));


    }
}