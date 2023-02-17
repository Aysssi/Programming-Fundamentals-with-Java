package LabLists;

import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02GaussTrick {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ///1 2 3 4 5
        List<Integer> numbersList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sizeList = numbersList.size();
        for (int index = 0; index < sizeList / 2; index++) {
            int firstNum = numbersList.get(index);
            int secondNum = numbersList.get(numbersList.size() - 1);

            numbersList.set(index, firstNum + secondNum);
            numbersList.remove(numbersList.size() - 1);
        }
        for (int item : numbersList) {
            System.out.print(item + " ");

        }
    }
}