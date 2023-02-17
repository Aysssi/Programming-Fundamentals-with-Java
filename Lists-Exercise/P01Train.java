package ExerLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        List<Integer>trainList = Arrays
                        .stream(scanner.nextLine().split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("end")){
            String [] commandArr = inputLine.split("\\s+");
             String  command = commandArr[0];

            if (command.equals("Add")){
                int passengers = Integer.parseInt(commandArr[1]);
                trainList.add(passengers);
            }else {
                int passengersToAdd = Integer.parseInt(commandArr[0]);
               for (int index = 0; index < trainList.size(); index++) {
                   int passengers = trainList.get(index);
                   if (passengers + passengersToAdd <= maxCapacity){
                       trainList.set(index,passengers + passengersToAdd);
                      break;
                   }
                }
            }


            inputLine = scanner.nextLine();
        }
        System.out.print(trainList.toString().replaceAll("[\\[\\],]", ""));

    }
}
