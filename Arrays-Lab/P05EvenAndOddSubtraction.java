package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class P05EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


         int[] numbersArr = Arrays
                 .stream(scanner.nextLine().split( " "))
                 .mapToInt(Integer::parseInt)
                 .toArray();


         int evenSum = 0;
         int oddSum = 0;
        for ( int item : numbersArr) {
            if (item % 2 == 0){
                evenSum += item;
            }else {
                oddSum += item;
            }
        }
//        for (int i = 0; i < numbersArr.length; i++) {
//            int currentElement = numbersArr[i];
//            if (currentElement % 2 == 0){
//                evenSum += currentElement;
//            }else {
//               oddSum += currentElement;
//            }
//        }
        int diff = evenSum - oddSum;
        System.out.println(diff);

    }
}
