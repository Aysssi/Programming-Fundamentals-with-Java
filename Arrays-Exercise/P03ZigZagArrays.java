package ExerArrays;

import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine()); // брой редове на числата
        String[] firstsArray = new String[rows];
        String[] secondArray = new String[rows];

        //четен ред (2, 4, 8,....)
        //-> първото число във втория масив , второто число отива в първия масив

        //нечетен ред (1, 3, 5,..)
        //-> първото число отива в първия масив, второто число отива във втори масив

        for (int i = 1; i <= rows; i++) {
            //получавам string "1 5".split(" ") --> ["1", "5"]
            String[] numbersArr = scanner.nextLine().split(" ");
            String firstNumber = numbersArr[0];
            String secondNumber = numbersArr[1];

            if (i % 2 == 0) {
                secondArray[i - 1] = firstNumber;
                firstsArray[i - 1] = secondNumber;
            } else {
                firstsArray[i - 1] = firstNumber;
                secondArray[i - 1] = secondNumber;
            }
        }
        System.out.println(String.join(" ", firstsArray));
        System.out.println(String.join(" ", secondArray));
    }
}