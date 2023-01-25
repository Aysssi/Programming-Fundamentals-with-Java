package ExerArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. входни данни: масив от числа и брой ротациите
        int [] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rotations = Integer.parseInt(scanner.nextLine()); // бр. ротациите

        //rotation
        //1. Взимам 1-ви елемент от масива
        //2. премествам всички елементи с 1 -> на ляво
        // (т.н.  всички индекси от първия до пред последния(не вкл.)
        //3. слагам на последна позиция да е  първия взет елемент

        for (int rotation = 1; rotation <= rotations ; rotation++) {

            int fistElement = numbersArr[0];
            for (int index = 0; index < numbersArr.length -1 ; index++) {
                numbersArr[index] = numbersArr[ index + 1];
            }
            numbersArr[numbersArr.length - 1] = fistElement;
        }

        for (int numElement : numbersArr) {
            System.out.print(numElement + " ");

        }
         
    }
}
