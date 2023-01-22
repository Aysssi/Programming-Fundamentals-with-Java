package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class P03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

//        for (int i = 0; i < numbersArr.length; i++) {
//            int currentElement = numbersArr[i];
//            if (currentElement % 2 == 0){
//                sumEven +=currentElement;
//            }

        int sumEven = 0;
        for ( int item: numbersArr) {
            if (item % 2 == 0){
                sumEven += item;
            }

        }
        System.out.println(sumEven);




    }

}
