package ExerLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


         int countCommands = Integer.parseInt(scanner.nextLine());
        List<String> guestsName = new ArrayList<>();

        for (int i = 1 ; i <= countCommands ; i++) {
            String inputCommand = scanner.nextLine();
            List<String>commandParts = Arrays
                            .stream(inputCommand.split(" "))
                            .collect(Collectors.toList());

             String name = commandParts.get(0);
             if (commandParts.size() == 3) {

                  if (guestsName.contains(name)){
                      System.out.printf("%s is already in the list!%n",name );
                  }else {
                      guestsName.add(name);
                  }

             } else if (commandParts.size() == 4) {

                 if (guestsName.contains(name)){
                     guestsName.remove(name);
                 }else {
                     System.out.printf("%s is not in the list!%n",name);
                 }

             }

        }
        for (String  name : guestsName) {
            System.out.println(name);
        }


    }
}
