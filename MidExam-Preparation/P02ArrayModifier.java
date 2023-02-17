package MidExamPreparation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numberList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {

            String[] commandArr = input.split(" ");
            String command = commandArr[0];
            if (command.equals("swap")) {
                int index1 = Integer.parseInt(commandArr[1]);
                int index2 = Integer.parseInt(commandArr[2]);
                Collections.swap(numberList, index1, index2);

            } else if (command.equals("multiply")) {
                int index1 = Integer.parseInt(commandArr[1]);
                int index2 = Integer.parseInt(commandArr[2]);
                int element1 = numberList.get(index1);
                int element2 = numberList.get(index2);

                int product = element1 * element2;
                numberList.set(index1, product);

            } else if (command.equals("decrease")) {
                for (int index = 0; index < numberList.size(); index++) {
                  int current =  numberList.get(index);
                  current -= 1;
                  numberList.set(index,current);
                }
            }

            input = scanner.nextLine();
        }
        for (int index = 0; index <= numberList.size() -1; index++) {
            int currentNumber = numberList.get(index);
            if (index != numberList.size() - 1) {

                System.out.print(currentNumber + ", ");
            } else {
                System.out.print(currentNumber);
            }
        }

    }
}
