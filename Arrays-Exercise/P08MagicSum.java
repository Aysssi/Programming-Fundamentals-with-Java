package ExerArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicSum = Integer.parseInt(scanner.nextLine());
        //1. взимам числото от масива -> обхождам всички числа след него

        for (int index = 0; index <= numbersArr.length - 1 ; index++) {
            int currentNum = numbersArr[index];

                //обхождам всички числа след него
            for (int inIndex = index  + 1; inIndex < numbersArr.length ; inIndex++) {
                int inNum = numbersArr [inIndex];

                if (currentNum + inNum == magicSum){
                    System.out.println(currentNum + " " + inNum);
            }

        }






        }

        }


    }

