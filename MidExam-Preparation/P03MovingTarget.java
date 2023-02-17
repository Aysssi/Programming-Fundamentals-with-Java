package MidExamPreparation;

import java.util.*;
import java.util.stream.Collectors;

public class P03MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> targetList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String input = scanner.nextLine();

        while (!input.equals("End")){
            String [] commandArr = input.split(" ");
            String  command = commandArr[0];
            int index = Integer.parseInt(commandArr[1]);

            switch (command){
                case"Shoot":
                    //52 74 23 44 96 110
                    //Shoot 5  10
                   // "Shoot {index} {power}"
                   // Shoot the target at the index if it exists by reducing its value by the given power (integer value).
                   // Remove the target if it is shot. A target is considered shot when its value reaches 0.
                    int power = Integer.parseInt(commandArr[2]);

                    if (isValid (targetList,index)){
                        int currentNum = targetList.get(index);
                        currentNum = currentNum - power;
                        if (currentNum <= 0){
                            targetList.remove(index);
                        }else {
                            targetList.set(index,currentNum);
                        }
                    }


                    break;
                case "Add":
                    //•	"Add {index} {value}"
                    //o	Insert a target with the received value at the received index if it exists.
                    //o	If not, print: "Invalid placement!"
                    int value = Integer.parseInt(commandArr[2]);
                    if (isValid(targetList,index)){

                        targetList.add(index,value);
                    }else {
                        System.out.println("Invalid placement!");
                    }

                    break;
                case"Strike":
                    //•	"Strike {index} {radius}" //number
                    //o	Remove the target at the given index and the ones before and after it depending on the radius.
                    //o	If any of the indices in the range is invalid, print: "Strike missed!" and skip this command.
                    // Example:  "Strike 2 2"
                    int radius = Integer.parseInt(commandArr[2]);
                    boolean isValidIndexRadius = targetList.size() - 1 >= index && targetList.size() -1 >= index + radius && index - radius >= 0;
                    if (isValidIndexRadius){

                        int targetRadius = radius * 2 +1 ;
                        for (int i = 0; i < targetRadius ; i++) {
                            targetList.remove(index  - radius);
                        }

                    }else {
                        System.out.println("Strike missed!");
                    }

                    break;

            }

            input  = scanner.nextLine();
        }

        List<String> resultList = new ArrayList<>();
        for (int  target : targetList) {
            resultList.add(String.valueOf(target));
        }
        System.out.print(String.join("|",resultList));
    }

    private static boolean isValid(List<Integer> list, int index) {
        return index >= 0 && index <= list.size() - 1;
    }
}