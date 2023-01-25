package ExerArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //за всеки един елемент от масива -> дали е топ
        //обхождам всички индекси след моя
        // следващото число -> index + 1


       int [] numbersArr = Arrays
               .stream(scanner.nextLine().split(" "))
               .mapToInt(Integer::parseInt)
               .toArray();


        for (int index = 0; index <= numbersArr.length - 1 ; index++) {
            int currentNumber = numbersArr[index];

            // винаги елементът на последния индекс ни е топ
             if (index == numbersArr.length -1){
                 System.out.println(currentNumber);
                continue;
             }
            boolean isTop = false;
            for (int j = index + 1; j <= numbersArr.length -1  ; j++) {

                if (currentNumber > numbersArr[j]){
                    isTop = true;
                }else {
                    isTop = false;
                    break;
                }
            }
            if (isTop){
                System.out.print(currentNumber + " ");
            }
        }


    }
}
