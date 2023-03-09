package ExerTextProcessing;

import java.util.Scanner;

public class P08LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String  input = scanner.nextLine();
        String []  codesArr = input.split("\\s+"); //A12b s17G

        double totalSum = 0;
        for (String code : codesArr) {
            //A12b
            double modifiedNumber = getModifiedNumber (code);
            totalSum += modifiedNumber;
        }

        System.out.printf("%.2f",totalSum);
    }

    private static double getModifiedNumber(String code) {

        char fistLetter = code.charAt(0);
        char lastLetter = code.charAt(code.length() -1);
        double number = Double.parseDouble (code.replace(fistLetter,' ')
                .replace(lastLetter,' ')
                .trim());
        // double number = Double.parseDouble( code.substring(1,code.length() -1));

        if (Character.isUpperCase(fistLetter)){

            int positionUpperLetter = (int) fistLetter - 64;
            number = number / positionUpperLetter;

        } else if (Character.isLowerCase(fistLetter)) {

            int positionLowerLetter = (int) fistLetter  - 96;
            number = number * positionLowerLetter;
        }

        if (Character.isUpperCase(lastLetter)){

            int positionUpperLetter = (int) lastLetter - 64;
            number -=  positionUpperLetter;
            
        } else if (Character.isLowerCase(lastLetter)) {
            int positionLowerLetter = (int) lastLetter - 96;
            number += positionLowerLetter;
        }
        return number;
    }
}
