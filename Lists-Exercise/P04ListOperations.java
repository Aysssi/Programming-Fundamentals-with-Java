package ExerLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //•	Add {number} - add number at the end
        //•	Insert {number} {index} - insert number at given index
        //•	Remove {index} - remove that index
        //•	Shift left {count} - first number becomes last 'count' times
        //•	Shift right {count} - last number becomes first 'count' times

        List<Integer> numbersList = Arrays
                        .stream(scanner.nextLine().split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")){

           if (command.contains("Add")){
             int number = Integer.parseInt(command.split("\\s+")[1]);
             numbersList.add(number);
           } else if (command.contains("Insert")) {
             int number = Integer.parseInt(command.split("\\s+")[1]);
             int index = Integer.parseInt(command.split("\\s+")[2]);
             if (!isValidIndex(index,numbersList)){
                 System.out.println("Invalid index");
             }else {
                 numbersList.add(index, number);
             }
           } else if (command.contains("Remove")) {
             int index = Integer.parseInt(command.split("\\s+")[1]);
               if (isValidIndex(index,numbersList)){
                   numbersList.remove(index);
               }else {
                   System.out.println("Invalid index");
               }

           } else if (command.contains("Shift left")) {
               int countLeft = Integer.parseInt(command.split("\\s+")[2]);
               for (int time = 1; time <= countLeft; time++) {
                   int firstNum = numbersList.get(0);
                   numbersList.remove(0);
                   numbersList.add(firstNum);
               }
           } else if (command.contains("Shift right")) {
               int countRight = Integer.parseInt(command.split("\\s+")[2]);
               for (int time = 1; time <= countRight; time++) {
                   int lastNum = numbersList.get(numbersList.size()-1);
                   numbersList.remove(numbersList.size()-1);
                   numbersList.add(0,lastNum);
               }

           }
            command = scanner.nextLine();

        }
        for (int number : numbersList) {
            System.out.print(number + " ");
        }
    }

    public static boolean isValidIndex (int index,List<Integer>numbers){
        return index >= 0 && index <= numbers.size()-1;
    }
}
