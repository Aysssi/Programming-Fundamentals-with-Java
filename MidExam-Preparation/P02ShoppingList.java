package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> shoppingList = Arrays
                        .stream(scanner.nextLine().split("!"))
                        .collect(Collectors.toList());

         String input = scanner.nextLine();
         while (!input.equals("Go Shopping!")){
             String [] commandArr =input.split(" ");
             String command = commandArr[0];
             String product = commandArr[1];
             switch (command){
                 case "Urgent":
                  if (!shoppingList.contains(product)){
                      shoppingList.add(0,product);
                  }
                     break;
                 case "Unnecessary":
                      shoppingList.remove(product);

                     break;
                 case "Correct":
                 String newProduct = commandArr[2];
                 if (shoppingList.contains(product)){
                  int index = shoppingList.indexOf(product);
                     shoppingList.set(index,newProduct);
                 }
                     break;
                 case "Rearrange":
                  if (shoppingList.contains(product)){
                      shoppingList.remove(product);
                      shoppingList.add(product);
                  }
                     break;
             }

             input = scanner.nextLine();
         }
        for (String  item : shoppingList) {
            if (!item.equals(shoppingList.get(shoppingList.size() - 1))){
                System.out.print(item + ", ");
            }else {
                System.out.print(item);
            }
        }


    }
}
