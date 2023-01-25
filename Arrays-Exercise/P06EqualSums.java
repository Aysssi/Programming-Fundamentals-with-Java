package ExerArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isFound = false;
        for (int index = 0; index <= numbersArr.length -1 ; index++) {
            int currentNumber = numbersArr[index];

            int sumLeft = 0;
            int sumRight = 0;

            // лява сума -> всички елементи от индекс 0 до моя(не е вкл.)
            for (int leftIndex = 0; leftIndex < index ; leftIndex++) {
                sumLeft += numbersArr[leftIndex];
            }

            // дясна сума -> всички елементи моя индекс+1 до последния
            for (int rightIndex = index +1; rightIndex < numbersArr.length ; rightIndex++) {
                sumRight += numbersArr[rightIndex];
            }

            if (sumLeft == sumRight){
                System.out.println(index);
                isFound = true;
                break;
            }
        }
        if (!isFound){
            System.out.println("no");
        }

    }
}
